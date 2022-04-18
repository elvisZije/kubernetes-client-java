/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1beta1AllowedHostPathBuilder
    extends V1beta1AllowedHostPathFluentImpl<V1beta1AllowedHostPathBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1AllowedHostPath, V1beta1AllowedHostPathBuilder> {
  public V1beta1AllowedHostPathBuilder() {
    this(false);
  }

  public V1beta1AllowedHostPathBuilder(Boolean validationEnabled) {
    this(new V1beta1AllowedHostPath(), validationEnabled);
  }

  public V1beta1AllowedHostPathBuilder(V1beta1AllowedHostPathFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1AllowedHostPathBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1AllowedHostPath(), validationEnabled);
  }

  public V1beta1AllowedHostPathBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance) {
    this(fluent, instance, false);
  }

  public V1beta1AllowedHostPathBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPathPrefix(instance.getPathPrefix());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1AllowedHostPathBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance) {
    this(instance, false);
  }

  public V1beta1AllowedHostPathBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPathPrefix(instance.getPathPrefix());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath build() {
    V1beta1AllowedHostPath buildable = new V1beta1AllowedHostPath();
    buildable.setPathPrefix(fluent.getPathPrefix());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
}
