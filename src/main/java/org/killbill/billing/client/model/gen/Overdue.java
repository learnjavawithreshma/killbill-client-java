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
import org.killbill.billing.client.model.gen.OverdueStateConfig;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Overdue extends KillBillObject {

    private Integer initialReevaluationInterval = null;

    private List<OverdueStateConfig> overdueStates = null;


    public Overdue() {
    }

    public Overdue(final Integer initialReevaluationInterval,
                     final List<OverdueStateConfig> overdueStates) {
        this.initialReevaluationInterval = initialReevaluationInterval;
        this.overdueStates = overdueStates;
    }

    public Overdue setInitialReevaluationInterval(final Integer initialReevaluationInterval) {
        this.initialReevaluationInterval = initialReevaluationInterval;
        return this;
    }

    public Integer getInitialReevaluationInterval() {
        return initialReevaluationInterval;
    }

    public Overdue setOverdueStates(final List<OverdueStateConfig> overdueStates) {
        this.overdueStates = overdueStates;
        return this;
    }

    public Overdue addOverdueStatesItem(final OverdueStateConfig overdueStatesItem) {
        if (this.overdueStates == null) {
            this.overdueStates = new ArrayList<OverdueStateConfig>();
        }
        this.overdueStates.add(overdueStatesItem);
        return this;
    }

    public List<OverdueStateConfig> getOverdueStates() {
        return overdueStates;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Overdue overdue = (Overdue) o;
        return Objects.equals(this.initialReevaluationInterval, overdue.initialReevaluationInterval) &&
        Objects.equals(this.overdueStates, overdue.overdueStates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialReevaluationInterval,
                            overdueStates);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overdue {\n");
        
        sb.append("    initialReevaluationInterval: ").append(toIndentedString(initialReevaluationInterval)).append("\n");
        sb.append("    overdueStates: ").append(toIndentedString(overdueStates)).append("\n");
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

