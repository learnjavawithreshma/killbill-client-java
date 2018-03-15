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
import java.util.UUID;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Tenant extends KillBillObject {

    private UUID tenantId = null;

    private String externalKey = null;

    private String apiKey = null;

    private String apiSecret = null;


    public Tenant() {
    }

    public Tenant(final UUID tenantId,
                     final String externalKey,
                     final String apiKey,
                     final String apiSecret) {
        this.tenantId = tenantId;
        this.externalKey = externalKey;
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    public Tenant setTenantId(final UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public UUID getTenantId() {
        return tenantId;
    }

    public Tenant setExternalKey(final String externalKey) {
        this.externalKey = externalKey;
        return this;
    }

    public String getExternalKey() {
        return externalKey;
    }

    public Tenant setApiKey(final String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public String getApiKey() {
        return apiKey;
    }

    public Tenant setApiSecret(final String apiSecret) {
        this.apiSecret = apiSecret;
        return this;
    }

    public String getApiSecret() {
        return apiSecret;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tenant tenant = (Tenant) o;
        return Objects.equals(this.tenantId, tenant.tenantId) &&
        Objects.equals(this.externalKey, tenant.externalKey) &&
        Objects.equals(this.apiKey, tenant.apiKey) &&
        Objects.equals(this.apiSecret, tenant.apiSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId,
                            externalKey,
                            apiKey,
                            apiSecret);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tenant {\n");
        
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    externalKey: ").append(toIndentedString(externalKey)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
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

