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
import org.killbill.billing.client.model.gen.Plan;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Product extends KillBillObject {

    private String type = null;

    private String name = null;

    private String prettyName = null;

    private List<Plan> plans = null;

    private List<String> included = null;

    private List<String> available = null;


    public Product() {
    }

    public Product(final String type,
                     final String name,
                     final String prettyName,
                     final List<Plan> plans,
                     final List<String> included,
                     final List<String> available) {
        this.type = type;
        this.name = name;
        this.prettyName = prettyName;
        this.plans = plans;
        this.included = included;
        this.available = available;
    }

    public Product setType(final String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    public Product setName(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setPrettyName(final String prettyName) {
        this.prettyName = prettyName;
        return this;
    }

    public String getPrettyName() {
        return prettyName;
    }

    public Product setPlans(final List<Plan> plans) {
        this.plans = plans;
        return this;
    }

    public Product addPlansItem(final Plan plansItem) {
        if (this.plans == null) {
            this.plans = new ArrayList<Plan>();
        }
        this.plans.add(plansItem);
        return this;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public Product setIncluded(final List<String> included) {
        this.included = included;
        return this;
    }

    public Product addIncludedItem(final String includedItem) {
        if (this.included == null) {
            this.included = new ArrayList<String>();
        }
        this.included.add(includedItem);
        return this;
    }

    public List<String> getIncluded() {
        return included;
    }

    public Product setAvailable(final List<String> available) {
        this.available = available;
        return this;
    }

    public Product addAvailableItem(final String availableItem) {
        if (this.available == null) {
            this.available = new ArrayList<String>();
        }
        this.available.add(availableItem);
        return this;
    }

    public List<String> getAvailable() {
        return available;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(this.type, product.type) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.prettyName, product.prettyName) &&
        Objects.equals(this.plans, product.plans) &&
        Objects.equals(this.included, product.included) &&
        Objects.equals(this.available, product.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
                            name,
                            prettyName,
                            plans,
                            included,
                            available);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Product {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prettyName: ").append(toIndentedString(prettyName)).append("\n");
        sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
        sb.append("    included: ").append(toIndentedString(included)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

