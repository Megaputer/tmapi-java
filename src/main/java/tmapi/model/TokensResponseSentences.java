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
import tmapi.model.TokensResponseTokens;

/**
 * TokensResponseSentences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-20T13:29:48.384+03:00[Europe/Moscow]")
public class TokensResponseSentences {
  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private List<TokensResponseTokens> tokens = null;

  public TokensResponseSentences tokens(List<TokensResponseTokens> tokens) {
    this.tokens = tokens;
    return this;
  }

  public TokensResponseSentences addTokensItem(TokensResponseTokens tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<TokensResponseTokens>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Sentence tokens
   * @return tokens
  **/
  @ApiModelProperty(value = "Sentence tokens")
  public List<TokensResponseTokens> getTokens() {
    return tokens;
  }

  public void setTokens(List<TokensResponseTokens> tokens) {
    this.tokens = tokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokensResponseSentences tokensResponseSentences = (TokensResponseSentences) o;
    return Objects.equals(this.tokens, tokensResponseSentences.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokensResponseSentences {\n");
    
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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

