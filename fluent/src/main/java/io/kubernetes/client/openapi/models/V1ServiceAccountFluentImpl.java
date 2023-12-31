package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ServiceAccountFluentImpl<A extends V1ServiceAccountFluent<A>> extends BaseFluent<A> implements V1ServiceAccountFluent<A>{
  public V1ServiceAccountFluentImpl() {
  }
  public V1ServiceAccountFluentImpl(V1ServiceAccount instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());
      this.withImagePullSecrets(instance.getImagePullSecrets());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSecrets(instance.getSecrets());
    }
  }
  private String apiVersion;
  private Boolean automountServiceAccountToken;
  private ArrayList<V1LocalObjectReferenceBuilder> imagePullSecrets;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private ArrayList<V1ObjectReferenceBuilder> secrets;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public Boolean getAutomountServiceAccountToken() {
    return this.automountServiceAccountToken;
  }
  public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken=automountServiceAccountToken; return (A) this;
  }
  public Boolean hasAutomountServiceAccountToken() {
    return this.automountServiceAccountToken != null;
  }
  public A addToImagePullSecrets(int index,V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= imagePullSecrets.size()) { _visitables.get("imagePullSecrets").add(builder); imagePullSecrets.add(builder); } else { _visitables.get("imagePullSecrets").add(index, builder); imagePullSecrets.add(index, builder);}
    return (A)this;
  }
  public A setToImagePullSecrets(int index,V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= imagePullSecrets.size()) { _visitables.get("imagePullSecrets").add(builder); imagePullSecrets.add(builder); } else { _visitables.get("imagePullSecrets").set(index, builder); imagePullSecrets.set(index, builder);}
    return (A)this;
  }
  public A addToImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").add(builder);this.imagePullSecrets.add(builder);} return (A)this;
  }
  public A addAllToImagePullSecrets(Collection<V1LocalObjectReference> items) {
    if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<V1LocalObjectReferenceBuilder>();}
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").add(builder);this.imagePullSecrets.add(builder);} return (A)this;
  }
  public A removeFromImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").remove(builder);if (this.imagePullSecrets != null) {this.imagePullSecrets.remove(builder);}} return (A)this;
  }
  public A removeAllFromImagePullSecrets(Collection<V1LocalObjectReference> items) {
    for (V1LocalObjectReference item : items) {V1LocalObjectReferenceBuilder builder = new V1LocalObjectReferenceBuilder(item);_visitables.get("imagePullSecrets").remove(builder);if (this.imagePullSecrets != null) {this.imagePullSecrets.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromImagePullSecrets(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    if (imagePullSecrets == null) return (A) this;
    final Iterator<V1LocalObjectReferenceBuilder> each = imagePullSecrets.iterator();
    final List visitables = _visitables.get("imagePullSecrets");
    while (each.hasNext()) {
      V1LocalObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildImagePullSecrets instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets != null ? build(imagePullSecrets) : null;
  }
  public List<V1LocalObjectReference> buildImagePullSecrets() {
    return imagePullSecrets != null ? build(imagePullSecrets) : null;
  }
  public V1LocalObjectReference buildImagePullSecret(int index) {
    return this.imagePullSecrets.get(index).build();
  }
  public V1LocalObjectReference buildFirstImagePullSecret() {
    return this.imagePullSecrets.get(0).build();
  }
  public V1LocalObjectReference buildLastImagePullSecret() {
    return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
  }
  public V1LocalObjectReference buildMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    for (V1LocalObjectReferenceBuilder item: imagePullSecrets) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    for (V1LocalObjectReferenceBuilder item: imagePullSecrets) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    if (this.imagePullSecrets != null) { _visitables.get("imagePullSecrets").clear();}
    if (imagePullSecrets != null) {this.imagePullSecrets = new ArrayList(); for (V1LocalObjectReference item : imagePullSecrets){this.addToImagePullSecrets(item);}} else { this.imagePullSecrets = null;} return (A) this;
  }
  public A withImagePullSecrets(io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets) {
    if (this.imagePullSecrets != null) {this.imagePullSecrets.clear(); _visitables.remove("imagePullSecrets"); }
    if (imagePullSecrets != null) {for (V1LocalObjectReference item :imagePullSecrets){ this.addToImagePullSecrets(item);}} return (A) this;
  }
  public Boolean hasImagePullSecrets() {
    return imagePullSecrets != null && !imagePullSecrets.isEmpty();
  }
  public V1ServiceAccountFluentImpl.ImagePullSecretsNested<A> addNewImagePullSecret() {
    return new V1ServiceAccountFluentImpl.ImagePullSecretsNestedImpl();
  }
  public V1ServiceAccountFluentImpl.ImagePullSecretsNested<A> addNewImagePullSecretLike(V1LocalObjectReference item) {
    return new V1ServiceAccountFluentImpl.ImagePullSecretsNestedImpl(-1, item);
  }
  public V1ServiceAccountFluentImpl.ImagePullSecretsNested<A> setNewImagePullSecretLike(int index,V1LocalObjectReference item) {
    return new V1ServiceAccountFluentImpl.ImagePullSecretsNestedImpl(index, item);
  }
  public V1ServiceAccountFluentImpl.ImagePullSecretsNested<A> editImagePullSecret(int index) {
    if (imagePullSecrets.size() <= index) throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  public V1ServiceAccountFluentImpl.ImagePullSecretsNested<A> editFirstImagePullSecret() {
    if (imagePullSecrets.size() == 0) throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(0, buildImagePullSecret(0));
  }
  public V1ServiceAccountFluentImpl.ImagePullSecretsNested<A> editLastImagePullSecret() {
    int index = imagePullSecrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  public V1ServiceAccountFluentImpl.ImagePullSecretsNested<A> editMatchingImagePullSecret(Predicate<V1LocalObjectReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<imagePullSecrets.size();i++) { 
    if (predicate.test(imagePullSecrets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1ServiceAccountFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1ServiceAccountFluentImpl.MetadataNestedImpl();
  }
  public V1ServiceAccountFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1ServiceAccountFluentImpl.MetadataNestedImpl(item);
  }
  public V1ServiceAccountFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1ServiceAccountFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1ServiceAccountFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public A addToSecrets(int index,V1ObjectReference item) {
    if (this.secrets == null) {this.secrets = new ArrayList<V1ObjectReferenceBuilder>();}
    V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= secrets.size()) { _visitables.get("secrets").add(builder); secrets.add(builder); } else { _visitables.get("secrets").add(index, builder); secrets.add(index, builder);}
    return (A)this;
  }
  public A setToSecrets(int index,V1ObjectReference item) {
    if (this.secrets == null) {this.secrets = new ArrayList<V1ObjectReferenceBuilder>();}
    V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= secrets.size()) { _visitables.get("secrets").add(builder); secrets.add(builder); } else { _visitables.get("secrets").set(index, builder); secrets.set(index, builder);}
    return (A)this;
  }
  public A addToSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    if (this.secrets == null) {this.secrets = new ArrayList<V1ObjectReferenceBuilder>();}
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("secrets").add(builder);this.secrets.add(builder);} return (A)this;
  }
  public A addAllToSecrets(Collection<V1ObjectReference> items) {
    if (this.secrets == null) {this.secrets = new ArrayList<V1ObjectReferenceBuilder>();}
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("secrets").add(builder);this.secrets.add(builder);} return (A)this;
  }
  public A removeFromSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("secrets").remove(builder);if (this.secrets != null) {this.secrets.remove(builder);}} return (A)this;
  }
  public A removeAllFromSecrets(Collection<V1ObjectReference> items) {
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("secrets").remove(builder);if (this.secrets != null) {this.secrets.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromSecrets(Predicate<V1ObjectReferenceBuilder> predicate) {
    if (secrets == null) return (A) this;
    final Iterator<V1ObjectReferenceBuilder> each = secrets.iterator();
    final List visitables = _visitables.get("secrets");
    while (each.hasNext()) {
      V1ObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildSecrets instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ObjectReference> getSecrets() {
    return secrets != null ? build(secrets) : null;
  }
  public List<V1ObjectReference> buildSecrets() {
    return secrets != null ? build(secrets) : null;
  }
  public V1ObjectReference buildSecret(int index) {
    return this.secrets.get(index).build();
  }
  public V1ObjectReference buildFirstSecret() {
    return this.secrets.get(0).build();
  }
  public V1ObjectReference buildLastSecret() {
    return this.secrets.get(secrets.size() - 1).build();
  }
  public V1ObjectReference buildMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate) {
    for (V1ObjectReferenceBuilder item: secrets) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate) {
    for (V1ObjectReferenceBuilder item: secrets) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withSecrets(List<V1ObjectReference> secrets) {
    if (this.secrets != null) { _visitables.get("secrets").clear();}
    if (secrets != null) {this.secrets = new ArrayList(); for (V1ObjectReference item : secrets){this.addToSecrets(item);}} else { this.secrets = null;} return (A) this;
  }
  public A withSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... secrets) {
    if (this.secrets != null) {this.secrets.clear(); _visitables.remove("secrets"); }
    if (secrets != null) {for (V1ObjectReference item :secrets){ this.addToSecrets(item);}} return (A) this;
  }
  public Boolean hasSecrets() {
    return secrets != null && !secrets.isEmpty();
  }
  public V1ServiceAccountFluentImpl.SecretsNested<A> addNewSecret() {
    return new V1ServiceAccountFluentImpl.SecretsNestedImpl();
  }
  public V1ServiceAccountFluentImpl.SecretsNested<A> addNewSecretLike(V1ObjectReference item) {
    return new V1ServiceAccountFluentImpl.SecretsNestedImpl(-1, item);
  }
  public V1ServiceAccountFluentImpl.SecretsNested<A> setNewSecretLike(int index,V1ObjectReference item) {
    return new V1ServiceAccountFluentImpl.SecretsNestedImpl(index, item);
  }
  public V1ServiceAccountFluentImpl.SecretsNested<A> editSecret(int index) {
    if (secrets.size() <= index) throw new RuntimeException("Can't edit secrets. Index exceeds size.");
    return setNewSecretLike(index, buildSecret(index));
  }
  public V1ServiceAccountFluentImpl.SecretsNested<A> editFirstSecret() {
    if (secrets.size() == 0) throw new RuntimeException("Can't edit first secrets. The list is empty.");
    return setNewSecretLike(0, buildSecret(0));
  }
  public V1ServiceAccountFluentImpl.SecretsNested<A> editLastSecret() {
    int index = secrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last secrets. The list is empty.");
    return setNewSecretLike(index, buildSecret(index));
  }
  public V1ServiceAccountFluentImpl.SecretsNested<A> editMatchingSecret(Predicate<V1ObjectReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<secrets.size();i++) { 
    if (predicate.test(secrets.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching secrets. No match found.");
    return setNewSecretLike(index, buildSecret(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServiceAccountFluentImpl that = (V1ServiceAccountFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(automountServiceAccountToken, that.automountServiceAccountToken)) return false;

    if (!java.util.Objects.equals(imagePullSecrets, that.imagePullSecrets)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(secrets, that.secrets)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  automountServiceAccountToken,  imagePullSecrets,  kind,  metadata,  secrets,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (automountServiceAccountToken != null) { sb.append("automountServiceAccountToken:"); sb.append(automountServiceAccountToken + ","); }
    if (imagePullSecrets != null) { sb.append("imagePullSecrets:"); sb.append(imagePullSecrets + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (secrets != null) { sb.append("secrets:"); sb.append(secrets); }
    sb.append("}");
    return sb.toString();
  }
  public A withAutomountServiceAccountToken() {
    return withAutomountServiceAccountToken(true);
  }
  class ImagePullSecretsNestedImpl<N> extends V1LocalObjectReferenceFluentImpl<V1ServiceAccountFluentImpl.ImagePullSecretsNested<N>> implements V1ServiceAccountFluentImpl.ImagePullSecretsNested<N>,Nested<N>{
    ImagePullSecretsNestedImpl(int index,V1LocalObjectReference item) {
      this.index = index;
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    ImagePullSecretsNestedImpl() {
      this.index = -1;
      this.builder = new V1LocalObjectReferenceBuilder(this);
    }
    V1LocalObjectReferenceBuilder builder;
    int index;
    public N and() {
      return (N) V1ServiceAccountFluentImpl.this.setToImagePullSecrets(index,builder.build());
    }
    public N endImagePullSecret() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1ServiceAccountFluentImpl.MetadataNested<N>> implements V1ServiceAccountFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1ServiceAccountFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SecretsNestedImpl<N> extends V1ObjectReferenceFluentImpl<V1ServiceAccountFluentImpl.SecretsNested<N>> implements V1ServiceAccountFluentImpl.SecretsNested<N>,Nested<N>{
    SecretsNestedImpl(int index,V1ObjectReference item) {
      this.index = index;
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    SecretsNestedImpl() {
      this.index = -1;
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    int index;
    public N and() {
      return (N) V1ServiceAccountFluentImpl.this.setToSecrets(index,builder.build());
    }
    public N endSecret() {
      return and();
    }
    
  }
  
}