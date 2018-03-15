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

public class RolledUpUnit extends KillBillObject {

    private String unitType = null;

    private Long amount = null;


    public RolledUpUnit() {
    }

    public RolledUpUnit(final String unitType,
                     final Long amount) {
        this.unitType = unitType;
        this.amount = amount;
    }

    public RolledUpUnit setUnitType(final String unitType) {
        this.unitType = unitType;
        return this;
    }

    public String getUnitType() {
        return unitType;
    }

    public RolledUpUnit setAmount(final Long amount) {
        this.amount = amount;
        return this;
    }

    public Long getAmount() {
        return amount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolledUpUnit rolledUpUnit = (RolledUpUnit) o;
        return Objects.equals(this.unitType, rolledUpUnit.unitType) &&
        Objects.equals(this.amount, rolledUpUnit.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitType,
                            amount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolledUpUnit {\n");
        
        sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

