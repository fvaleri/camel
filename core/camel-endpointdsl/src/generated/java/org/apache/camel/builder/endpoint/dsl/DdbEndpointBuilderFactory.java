/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Store and retrieve data from AWS DynamoDB service.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DdbEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS DynamoDB component.
     */
    public interface DdbEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedDdbEndpointBuilder advanced() {
            return (AdvancedDdbEndpointBuilder) this;
        }
        /**
         * To use the AmazonDynamoDB as the client.
         * 
         * The option is a:
         * <code>com.amazonaws.services.dynamodbv2.AmazonDynamoDB</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder amazonDDBClient(Object amazonDDBClient) {
            doSetProperty("amazonDDBClient", amazonDDBClient);
            return this;
        }
        /**
         * To use the AmazonDynamoDB as the client.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.dynamodbv2.AmazonDynamoDB</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder amazonDDBClient(String amazonDDBClient) {
            doSetProperty("amazonDDBClient", amazonDDBClient);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DdbEndpointBuilder consistentRead(boolean consistentRead) {
            doSetProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DdbEndpointBuilder consistentRead(String consistentRead) {
            doSetProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * Attribute name when creating table.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder keyAttributeName(String keyAttributeName) {
            doSetProperty("keyAttributeName", keyAttributeName);
            return this;
        }
        /**
         * Attribute type when creating table.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder keyAttributeType(String keyAttributeType) {
            doSetProperty("keyAttributeType", keyAttributeType);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DdbEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DdbEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.ddb.DdbOperations</code> type.
         * 
         * Default: PutItem
         * Group: producer
         */
        default DdbEndpointBuilder operation(DdbOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws.ddb.DdbOperations</code> type.
         * 
         * Default: PutItem
         * Group: producer
         */
        default DdbEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the DDB client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the DDB client. When using
         * this parameter, the configuration will expect the capitalized name of
         * the region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the DDB client. When using
         * this parameter, the configuration will expect the capitalized name of
         * the region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDB client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default DdbEndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDB client.
         * 
         * The option will be converted to a <code>com.amazonaws.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default DdbEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder readCapacity(Long readCapacity) {
            doSetProperty("readCapacity", readCapacity);
            return this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder readCapacity(String readCapacity) {
            doSetProperty("readCapacity", readCapacity);
            return this;
        }
        /**
         * The region in which DDB client needs to work.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder writeCapacity(Long writeCapacity) {
            doSetProperty("writeCapacity", writeCapacity);
            return this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default DdbEndpointBuilder writeCapacity(String writeCapacity) {
            doSetProperty("writeCapacity", writeCapacity);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default DdbEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default DdbEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS DynamoDB component.
     */
    public interface AdvancedDdbEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DdbEndpointBuilder basic() {
            return (DdbEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDdbEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDdbEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDdbEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDdbEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.ddb.DdbOperations</code> enum.
     */
    enum DdbOperations {
        BatchGetItems,
        DeleteItem,
        DeleteTable,
        DescribeTable,
        GetItem,
        PutItem,
        Query,
        Scan,
        UpdateItem,
        UpdateTable;
    }

    /**
     * Proxy enum for <code>com.amazonaws.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface DdbBuilders {
        /**
         * AWS DynamoDB (camel-aws-ddb)
         * Store and retrieve data from AWS DynamoDB service.
         * 
         * Category: cloud,database,nosql
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-aws-ddb
         * 
         * Syntax: <code>aws-ddb:tableName</code>
         * 
         * Path parameter: tableName (required)
         * The name of the table currently worked with.
         */
        default DdbEndpointBuilder awsDdb(String path) {
            return DdbEndpointBuilderFactory.awsDdb(path);
        }
    }
    /**
     * AWS DynamoDB (camel-aws-ddb)
     * Store and retrieve data from AWS DynamoDB service.
     * 
     * Category: cloud,database,nosql
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-aws-ddb
     * 
     * Syntax: <code>aws-ddb:tableName</code>
     * 
     * Path parameter: tableName (required)
     * The name of the table currently worked with.
     */
    static DdbEndpointBuilder awsDdb(String path) {
        class DdbEndpointBuilderImpl extends AbstractEndpointBuilder implements DdbEndpointBuilder, AdvancedDdbEndpointBuilder {
            public DdbEndpointBuilderImpl(String path) {
                super("aws-ddb", path);
            }
        }
        return new DdbEndpointBuilderImpl(path);
    }
}