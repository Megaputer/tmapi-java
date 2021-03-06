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
 * TotalLimitPeriodic2Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-20T13:29:48.384+03:00[Europe/Moscow]")
public class TotalLimitPeriodic2Response {
  /**
   * A period when limitations apply
   */
  @JsonAdapter(NtUPeriod2Enum.Adapter.class)
  public enum NtUPeriod2Enum {
    SECOND("Second"),
    
    MINUTE("Minute"),
    
    HOUR("Hour"),
    
    DAY("Day"),
    
    MONTH("Month");

    private String value;

    NtUPeriod2Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NtUPeriod2Enum fromValue(String text) {
      for (NtUPeriod2Enum b : NtUPeriod2Enum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<NtUPeriod2Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NtUPeriod2Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NtUPeriod2Enum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NtUPeriod2Enum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_NT_U_PERIOD2 = "NTUPeriod2";
  @SerializedName(SERIALIZED_NAME_NT_U_PERIOD2)
  private NtUPeriod2Enum ntUPeriod2;

  public static final String SERIALIZED_NAME_NT_U_IN_PERIOD2_LIMIT = "NTUInPeriod2Limit";
  @SerializedName(SERIALIZED_NAME_NT_U_IN_PERIOD2_LIMIT)
  private Integer ntUInPeriod2Limit;

  public static final String SERIALIZED_NAME_NT_U_IN_PERIOD2 = "NTUInPeriod2";
  @SerializedName(SERIALIZED_NAME_NT_U_IN_PERIOD2)
  private Integer ntUInPeriod2;

  public TotalLimitPeriodic2Response ntUPeriod2(NtUPeriod2Enum ntUPeriod2) {
    this.ntUPeriod2 = ntUPeriod2;
    return this;
  }

   /**
   * A period when limitations apply
   * @return ntUPeriod2
  **/
  @ApiModelProperty(value = "A period when limitations apply")
  public NtUPeriod2Enum getNtUPeriod2() {
    return ntUPeriod2;
  }

  public void setNtUPeriod2(NtUPeriod2Enum ntUPeriod2) {
    this.ntUPeriod2 = ntUPeriod2;
  }

  public TotalLimitPeriodic2Response ntUInPeriod2Limit(Integer ntUInPeriod2Limit) {
    this.ntUInPeriod2Limit = ntUInPeriod2Limit;
    return this;
  }

   /**
   * A maximum number of requests in the specified period
   * @return ntUInPeriod2Limit
  **/
  @ApiModelProperty(value = "A maximum number of requests in the specified period")
  public Integer getNtUInPeriod2Limit() {
    return ntUInPeriod2Limit;
  }

  public void setNtUInPeriod2Limit(Integer ntUInPeriod2Limit) {
    this.ntUInPeriod2Limit = ntUInPeriod2Limit;
  }

  public TotalLimitPeriodic2Response ntUInPeriod2(Integer ntUInPeriod2) {
    this.ntUInPeriod2 = ntUInPeriod2;
    return this;
  }

   /**
   * A number of requests that have already been processed
   * @return ntUInPeriod2
  **/
  @ApiModelProperty(value = "A number of requests that have already been processed")
  public Integer getNtUInPeriod2() {
    return ntUInPeriod2;
  }

  public void setNtUInPeriod2(Integer ntUInPeriod2) {
    this.ntUInPeriod2 = ntUInPeriod2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalLimitPeriodic2Response totalLimitPeriodic2Response = (TotalLimitPeriodic2Response) o;
    return Objects.equals(this.ntUPeriod2, totalLimitPeriodic2Response.ntUPeriod2) &&
        Objects.equals(this.ntUInPeriod2Limit, totalLimitPeriodic2Response.ntUInPeriod2Limit) &&
        Objects.equals(this.ntUInPeriod2, totalLimitPeriodic2Response.ntUInPeriod2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ntUPeriod2, ntUInPeriod2Limit, ntUInPeriod2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalLimitPeriodic2Response {\n");
    
    sb.append("    ntUPeriod2: ").append(toIndentedString(ntUPeriod2)).append("\n");
    sb.append("    ntUInPeriod2Limit: ").append(toIndentedString(ntUInPeriod2Limit)).append("\n");
    sb.append("    ntUInPeriod2: ").append(toIndentedString(ntUInPeriod2)).append("\n");
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

