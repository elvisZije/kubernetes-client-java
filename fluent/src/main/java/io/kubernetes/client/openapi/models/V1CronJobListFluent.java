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
public interface V1CronJobListFluent<A extends io.kubernetes.client.openapi.models.V1CronJobListFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public A addToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1CronJob item);
  public A setToItems(java.lang.Integer index,io.kubernetes.client.openapi.models.V1CronJob item);
  public A addToItems(io.kubernetes.client.openapi.models.V1CronJob... items);
  public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1CronJob> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1CronJob... items);
  public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1CronJob> items);
  public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CronJobBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1CronJob> getItems();
  public java.util.List<io.kubernetes.client.openapi.models.V1CronJob> buildItems();
  public io.kubernetes.client.openapi.models.V1CronJob buildItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1CronJob buildFirstItem();
  public io.kubernetes.client.openapi.models.V1CronJob buildLastItem();
  public io.kubernetes.client.openapi.models.V1CronJob buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CronJobBuilder> predicate);
  public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CronJobBuilder> predicate);
  public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1CronJob> items);
  public A withItems(io.kubernetes.client.openapi.models.V1CronJob... items);
  public java.lang.Boolean hasItems();
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.ItemsNested<A> addNewItem();
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1CronJob item);
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.ItemsNested<A> setNewItemLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1CronJob item);
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.ItemsNested<A> editItem(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.ItemsNested<A> editFirstItem();
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.ItemsNested<A> editLastItem();
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CronJobBuilder> predicate);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ListMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1CronJobListFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
  public interface ItemsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1CronJobFluent<io.kubernetes.client.openapi.models.V1CronJobListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ListMetaFluent<io.kubernetes.client.openapi.models.V1CronJobListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}