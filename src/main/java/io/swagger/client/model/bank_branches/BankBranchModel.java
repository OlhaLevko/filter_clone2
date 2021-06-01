/*
 * Bank branches
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.bank_branches;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContactModel;
import io.swagger.client.model.OtherIdentifierCommonModel;
import io.swagger.client.model.ReferenceModel;
import io.swagger.client.model.UserZones;

import java.util.Objects;

/**
 * Bank branch
 */
@ApiModel(description = "Bank branch")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-28T20:08:11.883Z")
public class BankBranchModel {
  @SerializedName("intercompany")
  private Boolean intercompany = null;

  @SerializedName("intermediary")
  private Boolean intermediary = null;

  @SerializedName("mainCountryBranch")
  private Boolean mainCountryBranch = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("interfaceCode")
  private String interfaceCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("description2")
  private String description2 = null;

  @SerializedName("bank")
  private ReferenceModel bank = null;

  @SerializedName("accountLocation")
  private String accountLocation = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("corpIDCode")
  private String corpIDCode = null;

  @SerializedName("otherIdentifier")
  private OtherIdentifierCommonModel otherIdentifier = null;

  @SerializedName("address")
  private AddressModel address = null;

  @SerializedName("contact")
  private ContactModel contact = null;

  @SerializedName("calendar")
  private ReferenceModel calendar = null;

  @SerializedName("timeZone")
  private String timeZone = null;

  @SerializedName("cutOffTime")
  private String cutOffTime = null;

  @SerializedName("responderCode")
  private String responderCode = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("userZone")
  private UserZones userZone = null;

  public BankBranchModel intercompany(Boolean intercompany) {
    this.intercompany = intercompany;
    return this;
  }

   /**
   * Get intercompany
   * @return intercompany
  **/
  @ApiModelProperty(value = "")
  public Boolean isIntercompany() {
    return intercompany;
  }

  public void setIntercompany(Boolean intercompany) {
    this.intercompany = intercompany;
  }

  public BankBranchModel intermediary(Boolean intermediary) {
    this.intermediary = intermediary;
    return this;
  }

   /**
   * Get intermediary
   * @return intermediary
  **/
  @ApiModelProperty(value = "")
  public Boolean isIntermediary() {
    return intermediary;
  }

  public void setIntermediary(Boolean intermediary) {
    this.intermediary = intermediary;
  }

  public BankBranchModel mainCountryBranch(Boolean mainCountryBranch) {
    this.mainCountryBranch = mainCountryBranch;
    return this;
  }

   /**
   * Get mainCountryBranch
   * @return mainCountryBranch
  **/
  @ApiModelProperty(value = "")
  public Boolean isMainCountryBranch() {
    return mainCountryBranch;
  }

  public void setMainCountryBranch(Boolean mainCountryBranch) {
    this.mainCountryBranch = mainCountryBranch;
  }

  public BankBranchModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Bank branch&#39;s code.
   * @return code
  **/
  @ApiModelProperty(example = "CODE01", required = true, value = "Bank branch's code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BankBranchModel interfaceCode(String interfaceCode) {
    this.interfaceCode = interfaceCode;
    return this;
  }

   /**
   * Bank branch&#39;s interface code.
   * @return interfaceCode
  **/
  @ApiModelProperty(example = "CODE01", required = true, value = "Bank branch's interface code.")
  public String getInterfaceCode() {
    return interfaceCode;
  }

  public void setInterfaceCode(String interfaceCode) {
    this.interfaceCode = interfaceCode;
  }

  public BankBranchModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Bank branch&#39;s description.
   * @return description
  **/
  @ApiModelProperty(example = "Bank branch's description.", value = "Bank branch's description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BankBranchModel description2(String description2) {
    this.description2 = description2;
    return this;
  }

   /**
   * The second Bank branch&#39;s description.
   * @return description2
  **/
  @ApiModelProperty(example = "Bank branch's description.", value = "The second Bank branch's description.")
  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public BankBranchModel bank(ReferenceModel bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Bank.
   * @return bank
  **/
  @ApiModelProperty(required = true, value = "Bank.")
  public ReferenceModel getBank() {
    return bank;
  }

  public void setBank(ReferenceModel bank) {
    this.bank = bank;
  }

  public BankBranchModel accountLocation(String accountLocation) {
    this.accountLocation = accountLocation;
    return this;
  }

   /**
   * Account location.
   * @return accountLocation
  **/
  @ApiModelProperty(example = "France", value = "Account location.")
  public String getAccountLocation() {
    return accountLocation;
  }

  public void setAccountLocation(String accountLocation) {
    this.accountLocation = accountLocation;
  }

  public BankBranchModel bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * BIC value.
   * @return bic
  **/
  @ApiModelProperty(example = "BATMFRXX", value = "BIC value.")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public BankBranchModel corpIDCode(String corpIDCode) {
    this.corpIDCode = corpIDCode;
    return this;
  }

   /**
   * Corporate ID code.
   * @return corpIDCode
  **/
  @ApiModelProperty(example = "Corp.BB-FR1", value = "Corporate ID code.")
  public String getCorpIDCode() {
    return corpIDCode;
  }

  public void setCorpIDCode(String corpIDCode) {
    this.corpIDCode = corpIDCode;
  }

  public BankBranchModel otherIdentifier(OtherIdentifierCommonModel otherIdentifier) {
    this.otherIdentifier = otherIdentifier;
    return this;
  }

   /**
   * Other identifier.
   * @return otherIdentifier
  **/
  @ApiModelProperty(value = "Other identifier.")
  public OtherIdentifierCommonModel getOtherIdentifier() {
    return otherIdentifier;
  }

  public void setOtherIdentifier(OtherIdentifierCommonModel otherIdentifier) {
    this.otherIdentifier = otherIdentifier;
  }

  public BankBranchModel address(AddressModel address) {
    this.address = address;
    return this;
  }

   /**
   * Bank branch&#39;s address.
   * @return address
  **/
  @ApiModelProperty(required = true, value = "Bank branch's address.")
  public AddressModel getAddress() {
    return address;
  }

  public void setAddress(AddressModel address) {
    this.address = address;
  }

  public BankBranchModel contact(ContactModel contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Bank branch&#39;s contact information.
   * @return contact
  **/
  @ApiModelProperty(value = "Bank branch's contact information.")
  public ContactModel getContact() {
    return contact;
  }

  public void setContact(ContactModel contact) {
    this.contact = contact;
  }

  public BankBranchModel calendar(ReferenceModel calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Bank branch&#39;s calendar.
   * @return calendar
  **/
  @ApiModelProperty(required = true, value = "Bank branch's calendar.")
  public ReferenceModel getCalendar() {
    return calendar;
  }

  public void setCalendar(ReferenceModel calendar) {
    this.calendar = calendar;
  }

  public BankBranchModel timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Bank branch&#39;s time zone.
   * @return timeZone
  **/
  @ApiModelProperty(required = true, value = "Bank branch's time zone.")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public BankBranchModel cutOffTime(String cutOffTime) {
    this.cutOffTime = cutOffTime;
    return this;
  }

   /**
   * Bank branch&#39;s intraday connectivity cut-off time.
   * @return cutOffTime
  **/
  @ApiModelProperty(example = "20:00:00", value = "Bank branch's intraday connectivity cut-off time.")
  public String getCutOffTime() {
    return cutOffTime;
  }

  public void setCutOffTime(String cutOffTime) {
    this.cutOffTime = cutOffTime;
  }

  public BankBranchModel responderCode(String responderCode) {
    this.responderCode = responderCode;
    return this;
  }

   /**
   * Bank branch&#39;s swiftnet responder code.
   * @return responderCode
  **/
  @ApiModelProperty(value = "Bank branch's swiftnet responder code.")
  public String getResponderCode() {
    return responderCode;
  }

  public void setResponderCode(String responderCode) {
    this.responderCode = responderCode;
  }

  public BankBranchModel serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Bank branch&#39;s swiftnet service name.
   * @return serviceName
  **/
  @ApiModelProperty(value = "Bank branch's swiftnet service name.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public BankBranchModel memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Bank branch&#39;s memo
   * @return memo
  **/
  @ApiModelProperty(value = "Bank branch's memo")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public BankBranchModel userZone(UserZones userZone) {
    this.userZone = userZone;
    return this;
  }

   /**
   * User zones of the bank branch.
   * @return userZone
  **/
  @ApiModelProperty(value = "User zones of the bank branch.")
  public UserZones getUserZone() {
    return userZone;
  }

  public void setUserZone(UserZones userZone) {
    this.userZone = userZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankBranchModel bankBranchModel = (BankBranchModel) o;
    return Objects.equals(this.intercompany, bankBranchModel.intercompany) &&
        Objects.equals(this.intermediary, bankBranchModel.intermediary) &&
        Objects.equals(this.mainCountryBranch, bankBranchModel.mainCountryBranch) &&
        Objects.equals(this.code, bankBranchModel.code) &&
        Objects.equals(this.interfaceCode, bankBranchModel.interfaceCode) &&
        Objects.equals(this.description, bankBranchModel.description) &&
        Objects.equals(this.description2, bankBranchModel.description2) &&
        Objects.equals(this.bank, bankBranchModel.bank) &&
        Objects.equals(this.accountLocation, bankBranchModel.accountLocation) &&
        Objects.equals(this.bic, bankBranchModel.bic) &&
        Objects.equals(this.corpIDCode, bankBranchModel.corpIDCode) &&
        Objects.equals(this.otherIdentifier, bankBranchModel.otherIdentifier) &&
        Objects.equals(this.address, bankBranchModel.address) &&
        Objects.equals(this.contact, bankBranchModel.contact) &&
        Objects.equals(this.calendar, bankBranchModel.calendar) &&
        Objects.equals(this.timeZone, bankBranchModel.timeZone) &&
        Objects.equals(this.cutOffTime, bankBranchModel.cutOffTime) &&
        Objects.equals(this.responderCode, bankBranchModel.responderCode) &&
        Objects.equals(this.serviceName, bankBranchModel.serviceName) &&
        Objects.equals(this.memo, bankBranchModel.memo) &&
        Objects.equals(this.userZone, bankBranchModel.userZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intercompany, intermediary, mainCountryBranch, code, interfaceCode, description, description2, bank, accountLocation, bic, corpIDCode, otherIdentifier, address, contact, calendar, timeZone, cutOffTime, responderCode, serviceName, memo, userZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankBranchModel {\n");

    sb.append("    intercompany: ").append(toIndentedString(intercompany)).append("\n");
    sb.append("    intermediary: ").append(toIndentedString(intermediary)).append("\n");
    sb.append("    mainCountryBranch: ").append(toIndentedString(mainCountryBranch)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    interfaceCode: ").append(toIndentedString(interfaceCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    accountLocation: ").append(toIndentedString(accountLocation)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    corpIDCode: ").append(toIndentedString(corpIDCode)).append("\n");
    sb.append("    otherIdentifier: ").append(toIndentedString(otherIdentifier)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    cutOffTime: ").append(toIndentedString(cutOffTime)).append("\n");
    sb.append("    responderCode: ").append(toIndentedString(responderCode)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    userZone: ").append(toIndentedString(userZone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
