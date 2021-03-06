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

/**
 * PerOperationLimitConstantResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-20T13:29:48.384+03:00[Europe/Moscow]")
public class PerOperationLimitConstantResponse {
  public static final String SERIALIZED_NAME_NT_U_LIMIT = "NTULimit";
  @SerializedName(SERIALIZED_NAME_NT_U_LIMIT)
  private Integer ntULimit;

  public static final String SERIALIZED_NAME_NT_U_TOKENS = "NTUTokens";
  @SerializedName(SERIALIZED_NAME_NT_U_TOKENS)
  private Integer ntUTokens;

  public static final String SERIALIZED_NAME_NT_U_KEYWORDS = "NTUKeywords";
  @SerializedName(SERIALIZED_NAME_NT_U_KEYWORDS)
  private Integer ntUKeywords;

  public static final String SERIALIZED_NAME_NT_U_ENTITIES = "NTUEntities";
  @SerializedName(SERIALIZED_NAME_NT_U_ENTITIES)
  private Integer ntUEntities;

  public static final String SERIALIZED_NAME_NT_U_LANGUAGES = "NTULanguages";
  @SerializedName(SERIALIZED_NAME_NT_U_LANGUAGES)
  private Integer ntULanguages;

  public static final String SERIALIZED_NAME_NT_U_SENTIMENTS = "NTUSentiments";
  @SerializedName(SERIALIZED_NAME_NT_U_SENTIMENTS)
  private Integer ntUSentiments;

  public static final String SERIALIZED_NAME_NT_U_FACTS = "NTUFacts";
  @SerializedName(SERIALIZED_NAME_NT_U_FACTS)
  private Integer ntUFacts;

  public PerOperationLimitConstantResponse ntULimit(Integer ntULimit) {
    this.ntULimit = ntULimit;
    return this;
  }

   /**
   * The maximum number of text units that can be processed in all time
   * @return ntULimit
  **/
  @ApiModelProperty(example = "250000", value = "The maximum number of text units that can be processed in all time")
  public Integer getNtULimit() {
    return ntULimit;
  }

  public void setNtULimit(Integer ntULimit) {
    this.ntULimit = ntULimit;
  }

  public PerOperationLimitConstantResponse ntUTokens(Integer ntUTokens) {
    this.ntUTokens = ntUTokens;
    return this;
  }

   /**
   * Counter of text units that have been already processed for operation Text parsing
   * @return ntUTokens
  **/
  @ApiModelProperty(value = "Counter of text units that have been already processed for operation Text parsing")
  public Integer getNtUTokens() {
    return ntUTokens;
  }

  public void setNtUTokens(Integer ntUTokens) {
    this.ntUTokens = ntUTokens;
  }

  public PerOperationLimitConstantResponse ntUKeywords(Integer ntUKeywords) {
    this.ntUKeywords = ntUKeywords;
    return this;
  }

   /**
   * Counter of text units that have been already processed for operation Keywords extraction
   * @return ntUKeywords
  **/
  @ApiModelProperty(value = "Counter of text units that have been already processed for operation Keywords extraction")
  public Integer getNtUKeywords() {
    return ntUKeywords;
  }

  public void setNtUKeywords(Integer ntUKeywords) {
    this.ntUKeywords = ntUKeywords;
  }

  public PerOperationLimitConstantResponse ntUEntities(Integer ntUEntities) {
    this.ntUEntities = ntUEntities;
    return this;
  }

   /**
   * Counter of text units that have been already processed for operation Entities extraction
   * @return ntUEntities
  **/
  @ApiModelProperty(value = "Counter of text units that have been already processed for operation Entities extraction")
  public Integer getNtUEntities() {
    return ntUEntities;
  }

  public void setNtUEntities(Integer ntUEntities) {
    this.ntUEntities = ntUEntities;
  }

  public PerOperationLimitConstantResponse ntULanguages(Integer ntULanguages) {
    this.ntULanguages = ntULanguages;
    return this;
  }

   /**
   * Counter of text units that have been already processed for operation Language detection
   * @return ntULanguages
  **/
  @ApiModelProperty(value = "Counter of text units that have been already processed for operation Language detection")
  public Integer getNtULanguages() {
    return ntULanguages;
  }

  public void setNtULanguages(Integer ntULanguages) {
    this.ntULanguages = ntULanguages;
  }

  public PerOperationLimitConstantResponse ntUSentiments(Integer ntUSentiments) {
    this.ntUSentiments = ntUSentiments;
    return this;
  }

   /**
   * Counter of text units that have been already processed for operation Sentiments analysis
   * @return ntUSentiments
  **/
  @ApiModelProperty(value = "Counter of text units that have been already processed for operation Sentiments analysis")
  public Integer getNtUSentiments() {
    return ntUSentiments;
  }

  public void setNtUSentiments(Integer ntUSentiments) {
    this.ntUSentiments = ntUSentiments;
  }

  public PerOperationLimitConstantResponse ntUFacts(Integer ntUFacts) {
    this.ntUFacts = ntUFacts;
    return this;
  }

   /**
   * Counter of text units that have been already processed for operation Facts extraction
   * @return ntUFacts
  **/
  @ApiModelProperty(value = "Counter of text units that have been already processed for operation Facts extraction")
  public Integer getNtUFacts() {
    return ntUFacts;
  }

  public void setNtUFacts(Integer ntUFacts) {
    this.ntUFacts = ntUFacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerOperationLimitConstantResponse perOperationLimitConstantResponse = (PerOperationLimitConstantResponse) o;
    return Objects.equals(this.ntULimit, perOperationLimitConstantResponse.ntULimit) &&
        Objects.equals(this.ntUTokens, perOperationLimitConstantResponse.ntUTokens) &&
        Objects.equals(this.ntUKeywords, perOperationLimitConstantResponse.ntUKeywords) &&
        Objects.equals(this.ntUEntities, perOperationLimitConstantResponse.ntUEntities) &&
        Objects.equals(this.ntULanguages, perOperationLimitConstantResponse.ntULanguages) &&
        Objects.equals(this.ntUSentiments, perOperationLimitConstantResponse.ntUSentiments) &&
        Objects.equals(this.ntUFacts, perOperationLimitConstantResponse.ntUFacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ntULimit, ntUTokens, ntUKeywords, ntUEntities, ntULanguages, ntUSentiments, ntUFacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerOperationLimitConstantResponse {\n");
    
    sb.append("    ntULimit: ").append(toIndentedString(ntULimit)).append("\n");
    sb.append("    ntUTokens: ").append(toIndentedString(ntUTokens)).append("\n");
    sb.append("    ntUKeywords: ").append(toIndentedString(ntUKeywords)).append("\n");
    sb.append("    ntUEntities: ").append(toIndentedString(ntUEntities)).append("\n");
    sb.append("    ntULanguages: ").append(toIndentedString(ntULanguages)).append("\n");
    sb.append("    ntUSentiments: ").append(toIndentedString(ntUSentiments)).append("\n");
    sb.append("    ntUFacts: ").append(toIndentedString(ntUFacts)).append("\n");
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

