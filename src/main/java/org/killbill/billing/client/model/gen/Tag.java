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
import org.killbill.billing.ObjectType;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Tag extends KillBillObject {

    private UUID tagId = null;

    private ObjectType objectType = null;

    private UUID objectId = null;

    private UUID tagDefinitionId = null;

    private String tagDefinitionName = null;


    public Tag() {
    }

    public Tag(final UUID tagId,
                     final ObjectType objectType,
                     final UUID objectId,
                     final UUID tagDefinitionId,
                     final String tagDefinitionName) {
        this.tagId = tagId;
        this.objectType = objectType;
        this.objectId = objectId;
        this.tagDefinitionId = tagDefinitionId;
        this.tagDefinitionName = tagDefinitionName;
    }

    public Tag setTagId(final UUID tagId) {
        this.tagId = tagId;
        return this;
    }

    public UUID getTagId() {
        return tagId;
    }

    public Tag setObjectType(final ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public Tag setObjectId(final UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    public UUID getObjectId() {
        return objectId;
    }

    public Tag setTagDefinitionId(final UUID tagDefinitionId) {
        this.tagDefinitionId = tagDefinitionId;
        return this;
    }

    public UUID getTagDefinitionId() {
        return tagDefinitionId;
    }

    public Tag setTagDefinitionName(final String tagDefinitionName) {
        this.tagDefinitionName = tagDefinitionName;
        return this;
    }

    public String getTagDefinitionName() {
        return tagDefinitionName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tag tag = (Tag) o;
        return Objects.equals(this.tagId, tag.tagId) &&
        Objects.equals(this.objectType, tag.objectType) &&
        Objects.equals(this.objectId, tag.objectId) &&
        Objects.equals(this.tagDefinitionId, tag.tagDefinitionId) &&
        Objects.equals(this.tagDefinitionName, tag.tagDefinitionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId,
                            objectType,
                            objectId,
                            tagDefinitionId,
                            tagDefinitionName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");
        
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    tagDefinitionId: ").append(toIndentedString(tagDefinitionId)).append("\n");
        sb.append("    tagDefinitionName: ").append(toIndentedString(tagDefinitionName)).append("\n");
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

