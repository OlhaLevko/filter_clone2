/*
 * Accounts
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
 * OtherIdentifierCommonModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:35:10.236Z")
public class OtherIdentifierCommonModel {
  @SerializedName("otherIdentifierType")
  private Long otherIdentifierType = null;

  @SerializedName("otherIdentifierValue")
  private String otherIdentifierValue = null;

  public OtherIdentifierCommonModel otherIdentifierType(Long otherIdentifierType) {
    this.otherIdentifierType = otherIdentifierType;
    return this;
  }

   /**
   * Id assigned by another institution.
   * @return otherIdentifierType
  **/
  @ApiModelProperty(example = "1", required = true, value = "Id assigned by another institution.")
  public Long getOtherIdentifierType() {
    return otherIdentifierType;
  }

  public void setOtherIdentifierType(Long otherIdentifierType) {
    this.otherIdentifierType = otherIdentifierType;
  }

  public OtherIdentifierCommonModel otherIdentifierValue(String otherIdentifierValue) {
    this.otherIdentifierValue = otherIdentifierValue;
    return this;
  }

   /**
   * Value of the identifier that corresponds to the selected otherIdentifierType.
   * @return otherIdentifierValue
  **/
  @ApiModelProperty(example = "20-1234567", value = "Value of the identifier that corresponds to the selected otherIdentifierType.")
  public String getOtherIdentifierValue() {
    return otherIdentifierValue;
  }

  public void setOtherIdentifierValue(String otherIdentifierValue) {
    this.otherIdentifierValue = otherIdentifierValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherIdentifierCommonModel otherIdentifierCommonModel = (OtherIdentifierCommonModel) o;
    return Objects.equals(this.otherIdentifierType, otherIdentifierCommonModel.otherIdentifierType) &&
        Objects.equals(this.otherIdentifierValue, otherIdentifierCommonModel.otherIdentifierValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherIdentifierType, otherIdentifierValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherIdentifierCommonModel {\n");
    
    sb.append("    otherIdentifierType: ").append(toIndentedString(otherIdentifierType)).append("\n");
    sb.append("    otherIdentifierValue: ").append(toIndentedString(otherIdentifierValue)).append("\n");
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

