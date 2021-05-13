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
 * Full contact.
 */
@ApiModel(description = "Full contact.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:35:10.236Z")
public class ContactModel {
  @SerializedName("name")
  private String name = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("faxNumber")
  private String faxNumber = null;

  @SerializedName("email")
  private String email = null;

  public ContactModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Contact name
   * @return name
  **/
  @ApiModelProperty(example = "Swiss Bankers Association", value = "Contact name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactModel department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Contact department.
   * @return department
  **/
  @ApiModelProperty(example = "Cash", value = "Contact department.")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public ContactModel phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Contact phone.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+41 (0) 61 295 93 93", value = "Contact phone.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ContactModel faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Contact fax.
   * @return faxNumber
  **/
  @ApiModelProperty(example = "+41 (0) 56 496 93 88", value = "Contact fax.")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public ContactModel email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact e-mail.
   * @return email
  **/
  @ApiModelProperty(example = "office@sba.ch", value = "Contact e-mail.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactModel contactModel = (ContactModel) o;
    return Objects.equals(this.name, contactModel.name) &&
        Objects.equals(this.department, contactModel.department) &&
        Objects.equals(this.phoneNumber, contactModel.phoneNumber) &&
        Objects.equals(this.faxNumber, contactModel.faxNumber) &&
        Objects.equals(this.email, contactModel.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, department, phoneNumber, faxNumber, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

