/*
 * Megaputer Text Mining API
 * Megaputer Text Mining API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package tmapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tmapi.model.EntitiesResponseEntities;

/**
 * EntitiesResponseDocuments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-20T13:29:48.384+03:00[Europe/Moscow]")
public class EntitiesResponseDocuments {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private List<EntitiesResponseEntities> entities = null;

  public EntitiesResponseDocuments id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Index of document in input documents array
   * @return id
  **/
  @ApiModelProperty(value = "Index of document in input documents array")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EntitiesResponseDocuments entities(List<EntitiesResponseEntities> entities) {
    this.entities = entities;
    return this;
  }

  public EntitiesResponseDocuments addEntitiesItem(EntitiesResponseEntities entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<EntitiesResponseEntities>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * Result of entities operation
   * @return entities
  **/
  @ApiModelProperty(value = "Result of entities operation")
  public List<EntitiesResponseEntities> getEntities() {
    return entities;
  }

  public void setEntities(List<EntitiesResponseEntities> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitiesResponseDocuments entitiesResponseDocuments = (EntitiesResponseDocuments) o;
    return Objects.equals(this.id, entitiesResponseDocuments.id) &&
        Objects.equals(this.entities, entitiesResponseDocuments.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitiesResponseDocuments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

