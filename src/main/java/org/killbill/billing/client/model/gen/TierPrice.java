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
import java.util.ArrayList;
import java.util.List;
import org.killbill.billing.client.model.gen.BlockPrice;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class TierPrice {

    private List<BlockPrice> blockPrices = null;


    public TierPrice() {
    }

    public TierPrice(final List<BlockPrice> blockPrices) {
        this.blockPrices = blockPrices;

    }


    public TierPrice setBlockPrices(final List<BlockPrice> blockPrices) {
        this.blockPrices = blockPrices;
        return this;
    }

    public TierPrice addBlockPricesItem(final BlockPrice blockPricesItem) {
        if (this.blockPrices == null) {
            this.blockPrices = new ArrayList<BlockPrice>();
        }
        this.blockPrices.add(blockPricesItem);
        return this;
    }

    public List<BlockPrice> getBlockPrices() {
        return blockPrices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TierPrice tierPrice = (TierPrice) o;
        return Objects.equals(this.blockPrices, tierPrice.blockPrices);

    }

    @Override
    public int hashCode() {
        return Objects.hash(blockPrices);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TierPrice {\n");
        
        sb.append("    blockPrices: ").append(toIndentedString(blockPrices)).append("\n");
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

