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

public class V1beta2ServiceAccountSubjectBuilder
    extends V1beta2ServiceAccountSubjectFluentImpl<V1beta2ServiceAccountSubjectBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject,
        io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder> {
  public V1beta2ServiceAccountSubjectBuilder() {
    this(false);
  }

  public V1beta2ServiceAccountSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta2ServiceAccountSubject(), validationEnabled);
  }

  public V1beta2ServiceAccountSubjectBuilder(V1beta2ServiceAccountSubjectFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta2ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2ServiceAccountSubject(), validationEnabled);
  }

  public V1beta2ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject instance) {
    this(fluent, instance, false);
  }

  public V1beta2ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled;
  }

  public V1beta2ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject instance) {
    this(instance, false);
  }

  public V1beta2ServiceAccountSubjectBuilder(
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject build() {
    V1beta2ServiceAccountSubject buildable = new V1beta2ServiceAccountSubject();
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
}
