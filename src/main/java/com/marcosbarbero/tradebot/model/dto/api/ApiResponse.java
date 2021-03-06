/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.marcosbarbero.tradebot.model.dto.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.marcosbarbero.tradebot.model.dto.Action;

import lombok.Data;

/**
 * POJO representation for the successful API responses.
 *
 * @author Marcos Barbero
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {

    private String id;
    private String positionId;
    private int leverage;
    private Action direction;
    private Type type;
    private long dateCreated;
    private Money investingAmount;
    private Money price;
    private Money profitAndLoss;
    private Product product;

    @Data
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Product {
        private String securityId;
        private String symbol;
        private String displayName;
    }
}