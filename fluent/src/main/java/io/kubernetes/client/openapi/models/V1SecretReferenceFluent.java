package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SecretReferenceFluent<A extends V1SecretReferenceFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  
}