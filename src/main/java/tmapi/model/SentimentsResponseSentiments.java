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
import tmapi.model.SentimentsResponseAttributes;
import tmapi.model.SentimentsResponsePositions;

/**
 * SentimentsResponseSentiments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-20T13:29:48.384+03:00[Europe/Moscow]")
public class SentimentsResponseSentiments {
  /**
   * Sentiment type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    POSITIVE("Positive"),
    
    NEGATIVE("Negative");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private SentimentsResponseAttributes attributes = null;

  public static final String SERIALIZED_NAME_POSITIONS = "positions";
  @SerializedName(SERIALIZED_NAME_POSITIONS)
  private List<SentimentsResponsePositions> positions = null;

  public SentimentsResponseSentiments type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Sentiment type
   * @return type
  **/
  @ApiModelProperty(example = "Positive", value = "Sentiment type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SentimentsResponseSentiments attributes(SentimentsResponseAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public SentimentsResponseAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SentimentsResponseAttributes attributes) {
    this.attributes = attributes;
  }

  public SentimentsResponseSentiments positions(List<SentimentsResponsePositions> positions) {
    this.positions = positions;
    return this;
  }

  public SentimentsResponseSentiments addPositionsItem(SentimentsResponsePositions positionsItem) {
    if (this.positions == null) {
      this.positions = new ArrayList<SentimentsResponsePositions>();
    }
    this.positions.add(positionsItem);
    return this;
  }

   /**
   * Sentiment positions in text
   * @return positions
  **/
  @ApiModelProperty(value = "Sentiment positions in text")
  public List<SentimentsResponsePositions> getPositions() {
    return positions;
  }

  public void setPositions(List<SentimentsResponsePositions> positions) {
    this.positions = positions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentimentsResponseSentiments sentimentsResponseSentiments = (SentimentsResponseSentiments) o;
    return Objects.equals(this.type, sentimentsResponseSentiments.type) &&
        Objects.equals(this.attributes, sentimentsResponseSentiments.attributes) &&
        Objects.equals(this.positions, sentimentsResponseSentiments.positions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes, positions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentsResponseSentiments {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
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

