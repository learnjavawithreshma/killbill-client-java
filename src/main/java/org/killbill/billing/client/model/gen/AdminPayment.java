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

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class AdminPayment {

    private String lastSuccessPaymentState = null;

    private String currentPaymentStateName = null;

    private String transactionStatus = null;


    public AdminPayment() {
    }

    public AdminPayment(final String lastSuccessPaymentState,
                     final String currentPaymentStateName,
                     final String transactionStatus) {
        this.lastSuccessPaymentState = lastSuccessPaymentState;
        this.currentPaymentStateName = currentPaymentStateName;
        this.transactionStatus = transactionStatus;

    }


    public AdminPayment setLastSuccessPaymentState(final String lastSuccessPaymentState) {
        this.lastSuccessPaymentState = lastSuccessPaymentState;
        return this;
    }

    public String getLastSuccessPaymentState() {
        return lastSuccessPaymentState;
    }

    public AdminPayment setCurrentPaymentStateName(final String currentPaymentStateName) {
        this.currentPaymentStateName = currentPaymentStateName;
        return this;
    }

    public String getCurrentPaymentStateName() {
        return currentPaymentStateName;
    }

    public AdminPayment setTransactionStatus(final String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdminPayment adminPayment = (AdminPayment) o;
        return Objects.equals(this.lastSuccessPaymentState, adminPayment.lastSuccessPaymentState) &&
        Objects.equals(this.currentPaymentStateName, adminPayment.currentPaymentStateName) &&
        Objects.equals(this.transactionStatus, adminPayment.transactionStatus);

    }

    @Override
    public int hashCode() {
        return Objects.hash(lastSuccessPaymentState,
                            currentPaymentStateName,
                            transactionStatus);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdminPayment {\n");
        
        sb.append("    lastSuccessPaymentState: ").append(toIndentedString(lastSuccessPaymentState)).append("\n");
        sb.append("    currentPaymentStateName: ").append(toIndentedString(currentPaymentStateName)).append("\n");
        sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

