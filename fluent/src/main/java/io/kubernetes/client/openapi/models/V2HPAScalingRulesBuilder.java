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

public class V2HPAScalingRulesBuilder extends V2HPAScalingRulesFluentImpl<V2HPAScalingRulesBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V2HPAScalingRules, V2HPAScalingRulesBuilder> {
  public V2HPAScalingRulesBuilder() {
    this(false);
  }

  public V2HPAScalingRulesBuilder(Boolean validationEnabled) {
    this(new V2HPAScalingRules(), validationEnabled);
  }

  public V2HPAScalingRulesBuilder(V2HPAScalingRulesFluent<?> fluent) {
    this(fluent, false);
  }

  public V2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2HPAScalingRules(), validationEnabled);
  }

  public V2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2HPAScalingRules instance) {
    this(fluent, instance, false);
  }

  public V2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2HPAScalingRules instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPolicies(instance.getPolicies());

    fluent.withSelectPolicy(instance.getSelectPolicy());

    fluent.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

    this.validationEnabled = validationEnabled;
  }

  public V2HPAScalingRulesBuilder(io.kubernetes.client.openapi.models.V2HPAScalingRules instance) {
    this(instance, false);
  }

  public V2HPAScalingRulesBuilder(
      io.kubernetes.client.openapi.models.V2HPAScalingRules instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withPolicies(instance.getPolicies());

    this.withSelectPolicy(instance.getSelectPolicy());

    this.withStabilizationWindowSeconds(instance.getStabilizationWindowSeconds());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2HPAScalingRules build() {
    V2HPAScalingRules buildable = new V2HPAScalingRules();
    buildable.setPolicies(fluent.getPolicies());
    buildable.setSelectPolicy(fluent.getSelectPolicy());
    buildable.setStabilizationWindowSeconds(fluent.getStabilizationWindowSeconds());
    return buildable;
  }
}
