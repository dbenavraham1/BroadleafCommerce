/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.openadmin.dto;

import java.io.Serializable;
import java.util.Arrays;

public class PersistencePackage implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected String ceilingEntityFullyQualifiedClassname;
    protected String sectionEntityClassname;
    protected String sectionEntityIdValue;
    protected String sectionEntityField;
    protected String fetchTypeFullyQualifiedClassname;
    protected PersistencePerspective persistencePerspective;
    protected String[] customCriteria;
    protected Entity entity;
    protected String csrfToken;
    protected Integer batchId;
    
    public PersistencePackage(String ceilingEntityFullyQualifiedClassname, Entity entity, PersistencePerspective persistencePerspective, String[] customCriteria, String csrfToken) {
        this(ceilingEntityFullyQualifiedClassname, null, entity, persistencePerspective, customCriteria, csrfToken);
    }
    
    public PersistencePackage(String ceilingEntityFullyQualifiedClassname, String fetchTypeFullyQualifiedClassname, Entity entity, PersistencePerspective persistencePerspective, String[] customCriteria, String csrfToken) {
        this.ceilingEntityFullyQualifiedClassname = ceilingEntityFullyQualifiedClassname;
        this.fetchTypeFullyQualifiedClassname = fetchTypeFullyQualifiedClassname;
        this.persistencePerspective = persistencePerspective;
        this.entity = entity;
        this.customCriteria = customCriteria;
        this.csrfToken = csrfToken;
    }
    
    public PersistencePackage() {
        //do nothing
    }
    
    public String getCeilingEntityFullyQualifiedClassname() {
        return ceilingEntityFullyQualifiedClassname;
    }
    
    public void setCeilingEntityFullyQualifiedClassname(
            String ceilingEntityFullyQualifiedClassname) {
        this.ceilingEntityFullyQualifiedClassname = ceilingEntityFullyQualifiedClassname;
    }
    
    public PersistencePerspective getPersistencePerspective() {
        return persistencePerspective;
    }
    
    public void setPersistencePerspective(
            PersistencePerspective persistencePerspective) {
        this.persistencePerspective = persistencePerspective;
    }
    
    public String[] getCustomCriteria() {
        return customCriteria;
    }
    
    public void setCustomCriteria(String[] customCriteria) {
        this.customCriteria = customCriteria;
    }
    
    public Entity getEntity() {
        return entity;
    }
    
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public String getCsrfToken() {
        return csrfToken;
    }

    public void setCsrfToken(String csrfToken) {
        this.csrfToken = csrfToken;
    }

    public String getFetchTypeFullyQualifiedClassname() {
        return fetchTypeFullyQualifiedClassname;
    }

    public void setFetchTypeFullyQualifiedClassname(String fetchTypeFullyQualifiedClassname) {
        this.fetchTypeFullyQualifiedClassname = fetchTypeFullyQualifiedClassname;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getSectionEntityClassname() {
        return sectionEntityClassname;
    }

    public void setSectionEntityClassname(String sectionEntityClassname) {
        this.sectionEntityClassname = sectionEntityClassname;
    }

    public String getSectionEntityIdValue() {
        return sectionEntityIdValue;
    }

    public void setSectionEntityIdValue(String sectionEntityIdValue) {
        this.sectionEntityIdValue = sectionEntityIdValue;
    }

    public String getSectionEntityField() {
        return sectionEntityField;
    }

    public void setSectionEntityField(String sectionEntityField) {
        this.sectionEntityField = sectionEntityField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersistencePackage)) return false;

        PersistencePackage that = (PersistencePackage) o;

        if (batchId != null ? !batchId.equals(that.batchId) : that.batchId != null) return false;
        if (ceilingEntityFullyQualifiedClassname != null ? !ceilingEntityFullyQualifiedClassname.equals(that
                .ceilingEntityFullyQualifiedClassname) : that.ceilingEntityFullyQualifiedClassname != null)
            return false;
        if (csrfToken != null ? !csrfToken.equals(that.csrfToken) : that.csrfToken != null) return false;
        if (!Arrays.equals(customCriteria, that.customCriteria)) return false;
        if (entity != null ? !entity.equals(that.entity) : that.entity != null) return false;
        if (fetchTypeFullyQualifiedClassname != null ? !fetchTypeFullyQualifiedClassname.equals(that
                .fetchTypeFullyQualifiedClassname) : that.fetchTypeFullyQualifiedClassname != null)
            return false;
        if (persistencePerspective != null ? !persistencePerspective.equals(that.persistencePerspective) : that
                .persistencePerspective != null)
            return false;
        if (sectionEntityClassname != null ? !sectionEntityClassname.equals(that.sectionEntityClassname) : that
                .sectionEntityClassname != null)
            return false;
        if (sectionEntityField != null ? !sectionEntityField.equals(that.sectionEntityField) : that
                .sectionEntityField != null)
            return false;
        if (sectionEntityIdValue != null ? !sectionEntityIdValue.equals(that.sectionEntityIdValue) : that
                .sectionEntityIdValue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ceilingEntityFullyQualifiedClassname != null ? ceilingEntityFullyQualifiedClassname.hashCode() : 0;
        result = 31 * result + (sectionEntityClassname != null ? sectionEntityClassname.hashCode() : 0);
        result = 31 * result + (sectionEntityIdValue != null ? sectionEntityIdValue.hashCode() : 0);
        result = 31 * result + (sectionEntityField != null ? sectionEntityField.hashCode() : 0);
        result = 31 * result + (fetchTypeFullyQualifiedClassname != null ? fetchTypeFullyQualifiedClassname.hashCode
                () : 0);
        result = 31 * result + (persistencePerspective != null ? persistencePerspective.hashCode() : 0);
        result = 31 * result + (customCriteria != null ? Arrays.hashCode(customCriteria) : 0);
        result = 31 * result + (entity != null ? entity.hashCode() : 0);
        result = 31 * result + (csrfToken != null ? csrfToken.hashCode() : 0);
        result = 31 * result + (batchId != null ? batchId.hashCode() : 0);
        return result;
    }
}
