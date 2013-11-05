package org.broadleafcommerce.core.catalog.service;

import org.broadleafcommerce.common.sitemap.exception.SiteMapException;
import org.broadleafcommerce.common.sitemap.service.SiteMapGeneratorTest;
import org.broadleafcommerce.common.sitemap.service.type.SiteMapChangeFreqType;
import org.broadleafcommerce.common.sitemap.service.type.SiteMapGeneratorType;
import org.broadleafcommerce.common.sitemap.service.type.SiteMapPriorityType;
import org.broadleafcommerce.core.catalog.dao.CategoryDao;
import org.broadleafcommerce.core.catalog.domain.Category;
import org.broadleafcommerce.core.catalog.domain.CategoryImpl;
import org.broadleafcommerce.core.catalog.domain.CategorySiteMapGeneratorConfiguration;
import org.broadleafcommerce.core.catalog.domain.CategorySiteMapGeneratorConfigurationImpl;
import org.easymock.EasyMock;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Category site map generator tests
 * 
 * @author Joshua Skorton (jskorton)
 */
public class CategorySiteMapGeneratorTest extends SiteMapGeneratorTest {

    @Test
    public void testProductSiteMapGenerator() throws SiteMapException, IOException {

        Category rootCategory = new CategoryImpl();
        Category c1 = new CategoryImpl();
        c1.setUrl("/");
        c1.setDefaultParentCategory(rootCategory);
        Category c2 = new CategoryImpl();
        c2.setUrl("/hot-sauces");
        c2.setDefaultParentCategory(rootCategory);
        Category c3 = new CategoryImpl();
        c3.setUrl("/merchandise");
        c3.setDefaultParentCategory(rootCategory);
        Category c4 = new CategoryImpl();
        c4.setUrl("/clearance");
        c4.setDefaultParentCategory(rootCategory);

        List<Category> categories = new ArrayList<Category>();
        categories.add(c1);
        categories.add(c2);
        categories.add(c3);
        categories.add(c4);

        CategoryDao categoryDao = EasyMock.createMock(CategoryDao.class);
        EasyMock.expect(categoryDao.readActiveSubCategoriesByCategory(rootCategory, 5, 0)).andReturn(categories);
        EasyMock.replay(categoryDao);

        CategorySiteMapGenerator csmg = new CategorySiteMapGenerator();
        csmg.setCategoryDao(categoryDao);
        csmg.setRowLimit(5);

        CategorySiteMapGeneratorConfiguration smgc = new CategorySiteMapGeneratorConfigurationImpl();
        smgc.setDisabled(false);
        smgc.setSiteMapGeneratorType(SiteMapGeneratorType.CATEGORY);
        smgc.setSiteMapChangeFreq(SiteMapChangeFreqType.HOURLY);
        smgc.setSiteMapPriority(SiteMapPriorityType.POINT5);
        smgc.setRootCategory(rootCategory);
        smgc.setStartingDepth(1);
        smgc.setEndingDepth(1);

        testGenerator(smgc, csmg);

        compareFiles(siteMapService.getTempDirectory() + "sitemap_index.xml", "src/test/resources/org/broadleafcommerce/sitemap/category/sitemap_index.xml");
        compareFiles(siteMapService.getTempDirectory() + "sitemap.xml", "src/test/resources/org/broadleafcommerce/sitemap/category/sitemap.xml");
        compareFiles(siteMapService.getTempDirectory() + "sitemap1.xml", "src/test/resources/org/broadleafcommerce/sitemap/category/sitemap1.xml");

    }

}