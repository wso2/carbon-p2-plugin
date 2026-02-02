/*
 * Copyright (c) 2026, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.maven.p2.generate.feature;

import org.apache.maven.plugins.annotations.Parameter;

import java.util.ArrayList;

public class AdviceFile {

    /**
     * define properties
     */
    @Parameter(name = "properties")
    private ArrayList properties;

    public void setProperties(ArrayList properties) {
        this.properties = properties;
    }

    public ArrayList getProperties() {
        return properties;
    }
}
