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

/**
 * ServerInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-20T13:29:48.384+03:00[Europe/Moscow]")
public class ServerInfo {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<String> languages = null;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<String> operations = null;

  public ServerInfo version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Server version
   * @return version
  **/
  @ApiModelProperty(example = "1.0", value = "Server version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ServerInfo languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ServerInfo addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of supported languages
   * @return languages
  **/
  @ApiModelProperty(example = "[\"Arabic\",\"Chinese\",\"Chinese-Traditional\",\"Dutch\",\"English\",\"French\",\"German\",\"Greek\",\"Italian\",\"Japanese\",\"Korean\",\"Polish\",\"Portuguese\",\"Russian\",\"Spanish\",\"Thai\",\"Turkish\"]", value = "List of supported languages")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ServerInfo operations(List<String> operations) {
    this.operations = operations;
    return this;
  }

  public ServerInfo addOperationsItem(String operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<String>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * List of supported operations
   * @return operations
  **/
  @ApiModelProperty(example = "[\"languages\",\"tokens\",\"keywords\",\"entities\",\"sentiments\",\"facts\"]", value = "List of supported operations")
  public List<String> getOperations() {
    return operations;
  }

  public void setOperations(List<String> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerInfo serverInfo = (ServerInfo) o;
    return Objects.equals(this.version, serverInfo.version) &&
        Objects.equals(this.languages, serverInfo.languages) &&
        Objects.equals(this.operations, serverInfo.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, languages, operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerInfo {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
