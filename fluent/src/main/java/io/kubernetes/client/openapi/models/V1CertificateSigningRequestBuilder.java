package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CertificateSigningRequestBuilder extends V1CertificateSigningRequestFluentImpl<V1CertificateSigningRequestBuilder> implements VisitableBuilder<V1CertificateSigningRequest,V1CertificateSigningRequestBuilder>{
  public V1CertificateSigningRequestBuilder() {
    this(false);
  }
  public V1CertificateSigningRequestBuilder(Boolean validationEnabled) {
    this(new V1CertificateSigningRequest(), validationEnabled);
  }
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequestFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequestFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequest(), validationEnabled);
  }
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequestFluent<?> fluent,V1CertificateSigningRequest instance) {
    this(fluent, instance, false);
  }
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequestFluent<?> fluent,V1CertificateSigningRequest instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
      fluent.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequest instance) {
    this(instance,false);
  }
  public V1CertificateSigningRequestBuilder(V1CertificateSigningRequest instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1CertificateSigningRequestFluent<?> fluent;
  Boolean validationEnabled;
  public V1CertificateSigningRequest build() {
    V1CertificateSigningRequest buildable = new V1CertificateSigningRequest();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}