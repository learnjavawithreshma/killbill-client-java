/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2020 Groupon, Inc
 * Copyright 2020-2020 Equinix, Inc
 * Copyright 2014-2020 The Billing Project, LLC
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
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.killbill.billing.ObjectType;
import org.killbill.billing.client.model.gen.AuditLog;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class TagDefinition extends KillBillObject {

    private UUID id = null;

    private Boolean isControlTag = null;

    private String name = null;

    private String description = null;

    private List<ObjectType> applicableObjectTypes = null;



    public TagDefinition() {
    }

    public TagDefinition(final UUID id,
                     final Boolean isControlTag,
                     final String name,
                     final String description,
                     final List<ObjectType> applicableObjectTypes,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.id = id;
        this.isControlTag = isControlTag;
        this.name = name;
        this.description = description;
        this.applicableObjectTypes = applicableObjectTypes;

    }


    public TagDefinition setId(final UUID id) {
        this.id = id;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public TagDefinition setIsControlTag(final Boolean isControlTag) {
        this.isControlTag = isControlTag;
        return this;
    }

    @JsonProperty(value="isControlTag")
    public Boolean isControlTag() {
        return isControlTag;
    }

    public TagDefinition setName(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public TagDefinition setDescription(final String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TagDefinition setApplicableObjectTypes(final List<ObjectType> applicableObjectTypes) {
        this.applicableObjectTypes = applicableObjectTypes;
        return this;
    }

    public TagDefinition addApplicableObjectTypesItem(final ObjectType applicableObjectTypesItem) {
        if (this.applicableObjectTypes == null) {
            this.applicableObjectTypes = new ArrayList<ObjectType>();
        }
        this.applicableObjectTypes.add(applicableObjectTypesItem);
        return this;
    }

    public List<ObjectType> getApplicableObjectTypes() {
        return applicableObjectTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagDefinition tagDefinition = (TagDefinition) o;
        return Objects.equals(this.id, tagDefinition.id) &&
        Objects.equals(this.isControlTag, tagDefinition.isControlTag) &&
        Objects.equals(this.name, tagDefinition.name) &&
        Objects.equals(this.description, tagDefinition.description) &&
        Objects.equals(this.applicableObjectTypes, tagDefinition.applicableObjectTypes) &&
        Objects.equals(this.auditLogs, tagDefinition.auditLogs);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                            isControlTag,
                            name,
                            description,
                            applicableObjectTypes,
                            auditLogs, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagDefinition {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isControlTag: ").append(toIndentedString(isControlTag)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    applicableObjectTypes: ").append(toIndentedString(applicableObjectTypes)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
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

