/*
 * Copyright 2018 Confluent Inc.
 *
 * Licensed under the Confluent Community License; you may not use this file
 * except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafka.schemaregistry.exceptions;

/**
 * Indicates the schema is incompatible with the registered schema
 */
public class IncompatibleSchemaException extends SchemaRegistryException {

  public IncompatibleSchemaException(String message, Throwable cause) {
    super(message, cause);
  }

  public IncompatibleSchemaException(String message) {
    super(message);
  }

  public IncompatibleSchemaException(Throwable cause) {
    super(cause);
  }

  public IncompatibleSchemaException() {
    super();
  }
}
