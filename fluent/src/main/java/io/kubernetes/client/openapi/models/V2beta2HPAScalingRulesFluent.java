package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta2HPAScalingRulesFluent<A extends io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToPolicies(java.lang.Integer index,io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item);
  public A setToPolicies(java.lang.Integer index,io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item);
  public A addToPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... items);
  public A addAllToPolicies(java.util.Collection<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> items);
  public A removeFromPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... items);
  public A removeAllFromPolicies(java.util.Collection<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> items);
  public A removeMatchingFromPolicies(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildPolicies instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> getPolicies();
  public java.util.List<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> buildPolicies();
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy buildPolicy(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy buildFirstPolicy();
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy buildLastPolicy();
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy buildMatchingPolicy(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder> predicate);
  public java.lang.Boolean hasMatchingPolicy(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder> predicate);
  public A withPolicies(java.util.List<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy> policies);
  public A withPolicies(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy... policies);
  public java.lang.Boolean hasPolicies();
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicy();
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A> addNewPolicyLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item);
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A> setNewPolicyLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicy item);
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A> editPolicy(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A> editFirstPolicy();
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A> editLastPolicy();
  public io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<A> editMatchingPolicy(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyBuilder> predicate);
  public java.lang.String getSelectPolicy();
  public A withSelectPolicy(java.lang.String selectPolicy);
  public java.lang.Boolean hasSelectPolicy();
  
  /**
   * Method is deprecated. use withSelectPolicy instead.
   */
  @java.lang.Deprecated
  public A withNewSelectPolicy(java.lang.String arg0);
  public java.lang.Integer getStabilizationWindowSeconds();
  public A withStabilizationWindowSeconds(java.lang.Integer stabilizationWindowSeconds);
  public java.lang.Boolean hasStabilizationWindowSeconds();
  public interface PoliciesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2HPAScalingPolicyFluent<io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent.PoliciesNested<N>>{
    public N and();
    public N endPolicy();
    
  }
  
}