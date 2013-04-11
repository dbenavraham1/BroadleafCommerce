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

package org.broadleafcommerce.openadmin.server.service.persistence.module.provider;

import org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata;
import org.broadleafcommerce.openadmin.client.dto.Entity;
import org.broadleafcommerce.openadmin.client.dto.FieldMetadata;
import org.broadleafcommerce.openadmin.client.dto.Property;
import org.broadleafcommerce.openadmin.server.service.persistence.PersistenceException;
import org.broadleafcommerce.openadmin.server.service.persistence.module.provider.request.AddFilterPropertiesRequest;
import org.broadleafcommerce.openadmin.server.service.persistence.module.provider.request.AddSearchMappingRequest;
import org.broadleafcommerce.openadmin.server.service.persistence.module.provider.request.ExtractValueRequest;
import org.broadleafcommerce.openadmin.server.service.persistence.module.provider.request.PopulateValueRequest;

import java.util.Map;

/**
 * @author Jeff Fischer
 */
public class PersistenceProviderAdapter extends AbstractPersistenceProvider {

    @Override
    public void addSearchMapping(AddSearchMappingRequest addSearchMappingRequest) {
        //do nothing
    }

    @Override
    public void populateValue(PopulateValueRequest populateValueRequest) throws PersistenceException {
        //do nothing
    }

    @Override
    public void extractValue(ExtractValueRequest extractValueRequest) throws PersistenceException {
        //do nothing
    }

    @Override
    public boolean canHandlePersistence(Object instance, Property property, BasicFieldMetadata metadata) {
        return false;
    }

    @Override
    public boolean canHandleSearchMapping(BasicFieldMetadata metadata) {
        return false;
    }

    @Override
    public boolean canHandlePropertyFiltering(Entity entity, Map<String, FieldMetadata> unfilteredProperties) {
        return false;
    }

    @Override
    public void filterProperties(AddFilterPropertiesRequest addFilterPropertiesRequest) {
        //do nothing
    }
}