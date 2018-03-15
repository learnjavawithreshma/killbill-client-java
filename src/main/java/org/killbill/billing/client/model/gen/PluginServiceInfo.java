/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class PluginServiceInfo extends KillBillObject {

    private String serviceTypeName = null;

    private String registrationName = null;


    public PluginServiceInfo() {
    }

    public PluginServiceInfo(final String serviceTypeName,
                     final String registrationName) {
        this.serviceTypeName = serviceTypeName;
        this.registrationName = registrationName;
    }

    public PluginServiceInfo setServiceTypeName(final String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public PluginServiceInfo setRegistrationName(final String registrationName) {
        this.registrationName = registrationName;
        return this;
    }

    public String getRegistrationName() {
        return registrationName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PluginServiceInfo pluginServiceInfo = (PluginServiceInfo) o;
        return Objects.equals(this.serviceTypeName, pluginServiceInfo.serviceTypeName) &&
        Objects.equals(this.registrationName, pluginServiceInfo.registrationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceTypeName,
                            registrationName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginServiceInfo {\n");
        
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    registrationName: ").append(toIndentedString(registrationName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

