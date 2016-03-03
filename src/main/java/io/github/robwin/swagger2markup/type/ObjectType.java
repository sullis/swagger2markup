/*
 * Copyright 2016 Robert Winkler
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

package io.github.robwin.swagger2markup.type;

import io.github.robwin.markup.builder.MarkupDocBuilder;
import io.swagger.models.properties.Property;
import org.apache.commons.collections.MapUtils;

import java.util.Map;

/**
 * Complex object abstraction
 */
public class ObjectType extends Type {

    protected Map<String, Property> properties;

    public ObjectType(String name, Map<String, Property> properties) {
        super(name == null ? "object" : name);
        this.properties = properties;
    }

    @Override
    public String displaySchema(MarkupDocBuilder docBuilder) {
        if (MapUtils.isEmpty(properties))
            return "empty object";
        else
            return "object";
    }

    public Map<String, Property> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Property> properties) {
        this.properties = properties;
    }
}