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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V2beta2PodsMetricStatusFluentImpl<A extends V2beta2PodsMetricStatusFluent<A>>
    extends BaseFluent<A> implements V2beta2PodsMetricStatusFluent<A> {
  public V2beta2PodsMetricStatusFluentImpl() {}

  public V2beta2PodsMetricStatusFluentImpl(
      io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus instance) {
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());
  }

  private V2beta2MetricValueStatusBuilder current;
  private V2beta2MetricIdentifierBuilder metric;

  /**
   * This method has been deprecated, please use method buildCurrent instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricValueStatus getCurrent() {
    return this.current != null ? this.current.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent() {
    return this.current != null ? this.current.build() : null;
  }

  public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current) {
    _visitables.get("current").remove(this.current);
    if (current != null) {
      this.current =
          new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(current);
      _visitables.get("current").add(this.current);
    }
    return (A) this;
  }

  public Boolean hasCurrent() {
    return this.current != null;
  }

  public V2beta2PodsMetricStatusFluent.CurrentNested<A> withNewCurrent() {
    return new V2beta2PodsMetricStatusFluentImpl.CurrentNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
    return new V2beta2PodsMetricStatusFluentImpl.CurrentNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      editCurrent() {
    return withNewCurrentLike(getCurrent());
  }

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      editOrNewCurrent() {
    return withNewCurrentLike(
        getCurrent() != null
            ? getCurrent()
            : new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<A>
      editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
    return withNewCurrentLike(getCurrent() != null ? getCurrent() : item);
  }

  /**
   * This method has been deprecated, please use method buildMetric instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V2beta2MetricIdentifier getMetric() {
    return this.metric != null ? this.metric.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier buildMetric() {
    return this.metric != null ? this.metric.build() : null;
  }

  public A withMetric(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier metric) {
    _visitables.get("metric").remove(this.metric);
    if (metric != null) {
      this.metric = new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder(metric);
      _visitables.get("metric").add(this.metric);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetric() {
    return this.metric != null;
  }

  public V2beta2PodsMetricStatusFluent.MetricNested<A> withNewMetric() {
    return new V2beta2PodsMetricStatusFluentImpl.MetricNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      withNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item) {
    return new io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluentImpl
        .MetricNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      editMetric() {
    return withNewMetricLike(getMetric());
  }

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      editOrNewMetric() {
    return withNewMetricLike(
        getMetric() != null
            ? getMetric()
            : new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<A>
      editOrNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item) {
    return withNewMetricLike(getMetric() != null ? getMetric() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2PodsMetricStatusFluentImpl that = (V2beta2PodsMetricStatusFluentImpl) o;
    if (current != null ? !current.equals(that.current) : that.current != null) return false;
    if (metric != null ? !metric.equals(that.metric) : that.metric != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(current, metric, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (current != null) {
      sb.append("current:");
      sb.append(current + ",");
    }
    if (metric != null) {
      sb.append("metric:");
      sb.append(metric);
    }
    sb.append("}");
    return sb.toString();
  }

  class CurrentNestedImpl<N>
      extends V2beta2MetricValueStatusFluentImpl<V2beta2PodsMetricStatusFluent.CurrentNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.CurrentNested<N>,
          Nested<N> {
    CurrentNestedImpl(V2beta2MetricValueStatus item) {
      this.builder = new V2beta2MetricValueStatusBuilder(this, item);
    }

    CurrentNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder builder;

    public N and() {
      return (N) V2beta2PodsMetricStatusFluentImpl.this.withCurrent(builder.build());
    }

    public N endCurrent() {
      return and();
    }
  }

  class MetricNestedImpl<N>
      extends V2beta2MetricIdentifierFluentImpl<V2beta2PodsMetricStatusFluent.MetricNested<N>>
      implements io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluent.MetricNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetricNestedImpl(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item) {
      this.builder = new V2beta2MetricIdentifierBuilder(this, item);
    }

    MetricNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder builder;

    public N and() {
      return (N) V2beta2PodsMetricStatusFluentImpl.this.withMetric(builder.build());
    }

    public N endMetric() {
      return and();
    }
  }
}
