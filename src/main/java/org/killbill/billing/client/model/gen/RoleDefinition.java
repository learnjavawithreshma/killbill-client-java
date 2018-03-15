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
import java.util.ArrayList;
import java.util.List;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class RoleDefinition extends KillBillObject {

    private String role = null;

    private List<String> permissions = new ArrayList<String>();


    public RoleDefinition() {
    }

    public RoleDefinition(final String role,
                     final List<String> permissions) {
        this.role = role;
        this.permissions = permissions;
    }

    public RoleDefinition setRole(final String role) {
        this.role = role;
        return this;
    }

    public String getRole() {
        return role;
    }

    public RoleDefinition setPermissions(final List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public RoleDefinition addPermissionsItem(final String permissionsItem) {
        this.permissions.add(permissionsItem);
        return this;
    }

    public List<String> getPermissions() {
        return permissions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoleDefinition roleDefinition = (RoleDefinition) o;
        return Objects.equals(this.role, roleDefinition.role) &&
        Objects.equals(this.permissions, roleDefinition.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role,
                            permissions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleDefinition {\n");
        
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

