package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

 /**
  * Generated
  */
public interface V1beta3NonResourcePolicyRuleFluent<A extends V1beta3NonResourcePolicyRuleFluent<A>> extends Fluent<A>{
  public A addToNonResourceURLs(int index,String item);
  public A setToNonResourceURLs(int index,String item);
  public A addToNonResourceURLs(java.lang.String... items);
  public A addAllToNonResourceURLs(Collection<String> items);
  public A removeFromNonResourceURLs(java.lang.String... items);
  public A removeAllFromNonResourceURLs(Collection<String> items);
  public List<String> getNonResourceURLs();
  public String getNonResourceURL(int index);
  public String getFirstNonResourceURL();
  public String getLastNonResourceURL();
  public String getMatchingNonResourceURL(Predicate<String> predicate);
  public Boolean hasMatchingNonResourceURL(Predicate<String> predicate);
  public A withNonResourceURLs(List<String> nonResourceURLs);
  public A withNonResourceURLs(java.lang.String... nonResourceURLs);
  public Boolean hasNonResourceURLs();
  public A addToVerbs(int index,String item);
  public A setToVerbs(int index,String item);
  public A addToVerbs(java.lang.String... items);
  public A addAllToVerbs(Collection<String> items);
  public A removeFromVerbs(java.lang.String... items);
  public A removeAllFromVerbs(Collection<String> items);
  public List<String> getVerbs();
  public String getVerb(int index);
  public String getFirstVerb();
  public String getLastVerb();
  public String getMatchingVerb(Predicate<String> predicate);
  public Boolean hasMatchingVerb(Predicate<String> predicate);
  public A withVerbs(List<String> verbs);
  public A withVerbs(java.lang.String... verbs);
  public Boolean hasVerbs();
  
}