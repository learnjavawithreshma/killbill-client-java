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


package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.Credit;
import java.util.UUID;

import com.google.common.collect.Multimap;
import com.google.common.base.Preconditions;
import com.google.common.base.MoreObjects;
import com.google.common.collect.HashMultimap;

import org.killbill.billing.client.KillBillClientException;
import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;
import org.killbill.billing.client.RequestOptions.RequestOptionsBuilder;


/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
public class CreditApi {

    private final KillBillHttpClient httpClient;

    public CreditApi() {
        this(new KillBillHttpClient());
    }

    public CreditApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Credit createCredit(final Credit body,  final RequestOptions inputOptions) throws KillBillClientException {
        return createCredit(body, Boolean.valueOf(false), inputOptions);
    }

    public Credit createCredit(final Credit body, final Boolean autoCommit,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCredit");

        final String uri = "/1.0/kb/credits";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        if (autoCommit != null) {
            queryParams.put("autoCommit", String.valueOf(autoCommit));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, body, Credit.class, requestOptions);
    }

    public Credit getCredit(final UUID creditId,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(creditId, "Missing the required parameter 'creditId' when calling getCredit");

        final String uri = "/1.0/kb/credits/{creditId}"
          .replaceAll("\\{" + "creditId" + "\\}", creditId.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, Credit.class, requestOptions);
    }

}
