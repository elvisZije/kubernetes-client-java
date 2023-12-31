package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta3FlowSchemaListFluent<A extends V1beta3FlowSchemaListFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public A addToItems(int index,V1beta3FlowSchema item);
  public A setToItems(int index,V1beta3FlowSchema item);
  public A addToItems(io.kubernetes.client.openapi.models.V1beta3FlowSchema... items);
  public A addAllToItems(Collection<V1beta3FlowSchema> items);
  public A removeFromItems(io.kubernetes.client.openapi.models.V1beta3FlowSchema... items);
  public A removeAllFromItems(Collection<V1beta3FlowSchema> items);
  public A removeMatchingFromItems(Predicate<V1beta3FlowSchemaBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1beta3FlowSchema> getItems();
  public List<V1beta3FlowSchema> buildItems();
  public V1beta3FlowSchema buildItem(int index);
  public V1beta3FlowSchema buildFirstItem();
  public V1beta3FlowSchema buildLastItem();
  public V1beta3FlowSchema buildMatchingItem(Predicate<V1beta3FlowSchemaBuilder> predicate);
  public Boolean hasMatchingItem(Predicate<V1beta3FlowSchemaBuilder> predicate);
  public A withItems(List<V1beta3FlowSchema> items);
  public A withItems(io.kubernetes.client.openapi.models.V1beta3FlowSchema... items);
  public Boolean hasItems();
  public V1beta3FlowSchemaListFluent.ItemsNested<A> addNewItem();
  public V1beta3FlowSchemaListFluent.ItemsNested<A> addNewItemLike(V1beta3FlowSchema item);
  public V1beta3FlowSchemaListFluent.ItemsNested<A> setNewItemLike(int index,V1beta3FlowSchema item);
  public V1beta3FlowSchemaListFluent.ItemsNested<A> editItem(int index);
  public V1beta3FlowSchemaListFluent.ItemsNested<A> editFirstItem();
  public V1beta3FlowSchemaListFluent.ItemsNested<A> editLastItem();
  public V1beta3FlowSchemaListFluent.ItemsNested<A> editMatchingItem(Predicate<V1beta3FlowSchemaBuilder> predicate);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata();
  public V1ListMeta buildMetadata();
  public A withMetadata(V1ListMeta metadata);
  public Boolean hasMetadata();
  public V1beta3FlowSchemaListFluent.MetadataNested<A> withNewMetadata();
  public V1beta3FlowSchemaListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);
  public V1beta3FlowSchemaListFluent.MetadataNested<A> editMetadata();
  public V1beta3FlowSchemaListFluent.MetadataNested<A> editOrNewMetadata();
  public V1beta3FlowSchemaListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);
  public interface ItemsNested<N> extends Nested<N>,V1beta3FlowSchemaFluent<V1beta3FlowSchemaListFluent.ItemsNested<N>>{
    public N and();
    public N endItem();
    
  }
  public interface MetadataNested<N> extends Nested<N>,V1ListMetaFluent<V1beta3FlowSchemaListFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  
}