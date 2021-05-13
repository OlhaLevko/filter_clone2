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
import io.swagger.client.model.ReferenceModel;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * Account search
 */
@ApiModel(description = "Account search")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:35:10.236Z")
public class AccountSearchModel {
  @SerializedName("accountCategory1")
  private ReferenceModel accountCategory1 = null;

  @SerializedName("accountCategory2")
  private ReferenceModel accountCategory2 = null;

  @SerializedName("accountCategory3")
  private ReferenceModel accountCategory3 = null;

  @SerializedName("accountCategory4")
  private ReferenceModel accountCategory4 = null;

  @SerializedName("accountCategory5")
  private ReferenceModel accountCategory5 = null;

  @SerializedName("accountCategory6")
  private ReferenceModel accountCategory6 = null;

  @SerializedName("accountCategory7")
  private ReferenceModel accountCategory7 = null;

  @SerializedName("accountCategory8")
  private ReferenceModel accountCategory8 = null;

  @SerializedName("accountCategory9")
  private ReferenceModel accountCategory9 = null;

  @SerializedName("accountCategory10")
  private ReferenceModel accountCategory10 = null;

  /**
   * Account type
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    BANK_ACCOUNT("BANK_ACCOUNT"),
    
    INTERCOMPANY_ACCOUNT("INTERCOMPANY_ACCOUNT"),
    
    OTHER_ACCOUNT("OTHER_ACCOUNT"),
    
    SHARED_ACCOUNT("SHARED_ACCOUNT");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accountType")
  private AccountTypeEnum accountType = null;

  /**
   * Account status.
   */
  @JsonAdapter(ActiveStatusEnum.Adapter.class)
  public enum ActiveStatusEnum {
    OPENED("OPENED"),
    
    CLOSED("CLOSED");

    private String value;

    ActiveStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActiveStatusEnum fromValue(String text) {
      for (ActiveStatusEnum b : ActiveStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActiveStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActiveStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActiveStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActiveStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("activeStatus")
  private ActiveStatusEnum activeStatus = null;

  @SerializedName("attachments")
  private Boolean attachments = null;

  @SerializedName("banCode")
  private String banCode = null;

  @SerializedName("bank")
  private ReferenceModel bank = null;

  @SerializedName("branch")
  private ReferenceModel branch = null;

  @SerializedName("branchDescription")
  private String branchDescription = null;

  @SerializedName("calendar")
  private ReferenceModel calendar = null;

  @SerializedName("closedAccount")
  private Boolean closedAccount = null;

  @SerializedName("closingDate")
  private LocalDate closingDate = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("company")
  private ReferenceModel company = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("creationDate")
  private LocalDate creationDate = null;

  @SerializedName("currency")
  private ReferenceModel currency = null;

  @SerializedName("defaultGroup")
  private ReferenceModel defaultGroup = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("description2")
  private String description2 = null;

  @SerializedName("documents")
  private Boolean documents = null;

  @SerializedName("glAccount")
  private ReferenceModel glAccount = null;

  @SerializedName("ibanCode")
  private String ibanCode = null;

  @SerializedName("internalAccountCode")
  private String internalAccountCode = null;

  @SerializedName("marker1")
  private Boolean marker1 = null;

  @SerializedName("marker2")
  private Boolean marker2 = null;

  @SerializedName("marker3")
  private Boolean marker3 = null;

  @SerializedName("signatoryUsers")
  private Long signatoryUsers = null;

  @SerializedName("statementIdentifier")
  private String statementIdentifier = null;

  /**
   * Account status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    STANDARD("STANDARD"),
    
    CREATION_TO_VALIDATE("CREATION_TO_VALIDATE"),
    
    CREATION_VALIDATED("CREATION_VALIDATED"),
    
    AVAILABLE_FOR_BANK_INTEGRATION("AVAILABLE_FOR_BANK_INTEGRATION"),
    
    CLOSURE_REQUESTED("CLOSURE_REQUESTED"),
    
    CLOSURE_VALIDATE("CLOSURE_VALIDATE"),
    
    BANK_CONTRACT_TO_INACTIVATE("BANK_CONTRACT_TO_INACTIVATE"),
    
    CLOSED("CLOSED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("updateDate")
  private LocalDate updateDate = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("zbaIdentifier")
  private String zbaIdentifier = null;

  public AccountSearchModel accountCategory1(ReferenceModel accountCategory1) {
    this.accountCategory1 = accountCategory1;
    return this;
  }

   /**
   * Account category1.
   * @return accountCategory1
  **/
  @ApiModelProperty(value = "Account category1.")
  public ReferenceModel getAccountCategory1() {
    return accountCategory1;
  }

  public void setAccountCategory1(ReferenceModel accountCategory1) {
    this.accountCategory1 = accountCategory1;
  }

  public AccountSearchModel accountCategory2(ReferenceModel accountCategory2) {
    this.accountCategory2 = accountCategory2;
    return this;
  }

   /**
   * Account category2.
   * @return accountCategory2
  **/
  @ApiModelProperty(value = "Account category2.")
  public ReferenceModel getAccountCategory2() {
    return accountCategory2;
  }

  public void setAccountCategory2(ReferenceModel accountCategory2) {
    this.accountCategory2 = accountCategory2;
  }

  public AccountSearchModel accountCategory3(ReferenceModel accountCategory3) {
    this.accountCategory3 = accountCategory3;
    return this;
  }

   /**
   * Account category3.
   * @return accountCategory3
  **/
  @ApiModelProperty(value = "Account category3.")
  public ReferenceModel getAccountCategory3() {
    return accountCategory3;
  }

  public void setAccountCategory3(ReferenceModel accountCategory3) {
    this.accountCategory3 = accountCategory3;
  }

  public AccountSearchModel accountCategory4(ReferenceModel accountCategory4) {
    this.accountCategory4 = accountCategory4;
    return this;
  }

   /**
   * Account category4.
   * @return accountCategory4
  **/
  @ApiModelProperty(value = "Account category4.")
  public ReferenceModel getAccountCategory4() {
    return accountCategory4;
  }

  public void setAccountCategory4(ReferenceModel accountCategory4) {
    this.accountCategory4 = accountCategory4;
  }

  public AccountSearchModel accountCategory5(ReferenceModel accountCategory5) {
    this.accountCategory5 = accountCategory5;
    return this;
  }

   /**
   * Account category5.
   * @return accountCategory5
  **/
  @ApiModelProperty(value = "Account category5.")
  public ReferenceModel getAccountCategory5() {
    return accountCategory5;
  }

  public void setAccountCategory5(ReferenceModel accountCategory5) {
    this.accountCategory5 = accountCategory5;
  }

  public AccountSearchModel accountCategory6(ReferenceModel accountCategory6) {
    this.accountCategory6 = accountCategory6;
    return this;
  }

   /**
   * Account category6.
   * @return accountCategory6
  **/
  @ApiModelProperty(value = "Account category6.")
  public ReferenceModel getAccountCategory6() {
    return accountCategory6;
  }

  public void setAccountCategory6(ReferenceModel accountCategory6) {
    this.accountCategory6 = accountCategory6;
  }

  public AccountSearchModel accountCategory7(ReferenceModel accountCategory7) {
    this.accountCategory7 = accountCategory7;
    return this;
  }

   /**
   * Account category7.
   * @return accountCategory7
  **/
  @ApiModelProperty(value = "Account category7.")
  public ReferenceModel getAccountCategory7() {
    return accountCategory7;
  }

  public void setAccountCategory7(ReferenceModel accountCategory7) {
    this.accountCategory7 = accountCategory7;
  }

  public AccountSearchModel accountCategory8(ReferenceModel accountCategory8) {
    this.accountCategory8 = accountCategory8;
    return this;
  }

   /**
   * Account category8.
   * @return accountCategory8
  **/
  @ApiModelProperty(value = "Account category8.")
  public ReferenceModel getAccountCategory8() {
    return accountCategory8;
  }

  public void setAccountCategory8(ReferenceModel accountCategory8) {
    this.accountCategory8 = accountCategory8;
  }

  public AccountSearchModel accountCategory9(ReferenceModel accountCategory9) {
    this.accountCategory9 = accountCategory9;
    return this;
  }

   /**
   * Account category9.
   * @return accountCategory9
  **/
  @ApiModelProperty(value = "Account category9.")
  public ReferenceModel getAccountCategory9() {
    return accountCategory9;
  }

  public void setAccountCategory9(ReferenceModel accountCategory9) {
    this.accountCategory9 = accountCategory9;
  }

  public AccountSearchModel accountCategory10(ReferenceModel accountCategory10) {
    this.accountCategory10 = accountCategory10;
    return this;
  }

   /**
   * Account category10.
   * @return accountCategory10
  **/
  @ApiModelProperty(value = "Account category10.")
  public ReferenceModel getAccountCategory10() {
    return accountCategory10;
  }

  public void setAccountCategory10(ReferenceModel accountCategory10) {
    this.accountCategory10 = accountCategory10;
  }

  public AccountSearchModel accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Account type
   * @return accountType
  **/
  @ApiModelProperty(example = "BANK_ACCOUNT", value = "Account type")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public AccountSearchModel activeStatus(ActiveStatusEnum activeStatus) {
    this.activeStatus = activeStatus;
    return this;
  }

   /**
   * Account status.
   * @return activeStatus
  **/
  @ApiModelProperty(example = "OPENED", value = "Account status.")
  public ActiveStatusEnum getActiveStatus() {
    return activeStatus;
  }

  public void setActiveStatus(ActiveStatusEnum activeStatus) {
    this.activeStatus = activeStatus;
  }

  public AccountSearchModel attachments(Boolean attachments) {
    this.attachments = attachments;
    return this;
  }

   /**
   * Attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments")
  public Boolean isAttachments() {
    return attachments;
  }

  public void setAttachments(Boolean attachments) {
    this.attachments = attachments;
  }

  public AccountSearchModel banCode(String banCode) {
    this.banCode = banCode;
    return this;
  }

   /**
   * Account BAN code
   * @return banCode
  **/
  @ApiModelProperty(value = "Account BAN code")
  public String getBanCode() {
    return banCode;
  }

  public void setBanCode(String banCode) {
    this.banCode = banCode;
  }

  public AccountSearchModel bank(ReferenceModel bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Account bank
   * @return bank
  **/
  @ApiModelProperty(required = true, value = "Account bank")
  public ReferenceModel getBank() {
    return bank;
  }

  public void setBank(ReferenceModel bank) {
    this.bank = bank;
  }

  public AccountSearchModel branch(ReferenceModel branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Account branch
   * @return branch
  **/
  @ApiModelProperty(required = true, value = "Account branch")
  public ReferenceModel getBranch() {
    return branch;
  }

  public void setBranch(ReferenceModel branch) {
    this.branch = branch;
  }

  public AccountSearchModel branchDescription(String branchDescription) {
    this.branchDescription = branchDescription;
    return this;
  }

   /**
   * Account branch description
   * @return branchDescription
  **/
  @ApiModelProperty(value = "Account branch description")
  public String getBranchDescription() {
    return branchDescription;
  }

  public void setBranchDescription(String branchDescription) {
    this.branchDescription = branchDescription;
  }

  public AccountSearchModel calendar(ReferenceModel calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Account calendar
   * @return calendar
  **/
  @ApiModelProperty(required = true, value = "Account calendar")
  public ReferenceModel getCalendar() {
    return calendar;
  }

  public void setCalendar(ReferenceModel calendar) {
    this.calendar = calendar;
  }

  public AccountSearchModel closedAccount(Boolean closedAccount) {
    this.closedAccount = closedAccount;
    return this;
  }

   /**
   * Is account closed. Default value false
   * @return closedAccount
  **/
  @ApiModelProperty(example = "false", value = "Is account closed. Default value false")
  public Boolean isClosedAccount() {
    return closedAccount;
  }

  public void setClosedAccount(Boolean closedAccount) {
    this.closedAccount = closedAccount;
  }

  public AccountSearchModel closingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
    return this;
  }

   /**
   * Closing date
   * @return closingDate
  **/
  @ApiModelProperty(example = "2020-06-23", value = "Closing date")
  public LocalDate getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(LocalDate closingDate) {
    this.closingDate = closingDate;
  }

  public AccountSearchModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Account code.
   * @return code
  **/
  @ApiModelProperty(example = "COMPANYCODE", required = true, value = "Account code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AccountSearchModel company(ReferenceModel company) {
    this.company = company;
    return this;
  }

   /**
   * Account company
   * @return company
  **/
  @ApiModelProperty(required = true, value = "Account company")
  public ReferenceModel getCompany() {
    return company;
  }

  public void setCompany(ReferenceModel company) {
    this.company = company;
  }

  public AccountSearchModel countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Account country code
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "Account country code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AccountSearchModel creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Creation date
   * @return creationDate
  **/
  @ApiModelProperty(example = "2020-06-21", value = "Creation date")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public AccountSearchModel currency(ReferenceModel currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Account currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Account currency")
  public ReferenceModel getCurrency() {
    return currency;
  }

  public void setCurrency(ReferenceModel currency) {
    this.currency = currency;
  }

  public AccountSearchModel defaultGroup(ReferenceModel defaultGroup) {
    this.defaultGroup = defaultGroup;
    return this;
  }

   /**
   * Default group.
   * @return defaultGroup
  **/
  @ApiModelProperty(value = "Default group.")
  public ReferenceModel getDefaultGroup() {
    return defaultGroup;
  }

  public void setDefaultGroup(ReferenceModel defaultGroup) {
    this.defaultGroup = defaultGroup;
  }

  public AccountSearchModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Account description.
   * @return description
  **/
  @ApiModelProperty(example = "Some description", value = "Account description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountSearchModel description2(String description2) {
    this.description2 = description2;
    return this;
  }

   /**
   * Account description2.
   * @return description2
  **/
  @ApiModelProperty(example = "Some description2", value = "Account description2.")
  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public AccountSearchModel documents(Boolean documents) {
    this.documents = documents;
    return this;
  }

   /**
   * Documents.
   * @return documents
  **/
  @ApiModelProperty(value = "Documents.")
  public Boolean isDocuments() {
    return documents;
  }

  public void setDocuments(Boolean documents) {
    this.documents = documents;
  }

  public AccountSearchModel glAccount(ReferenceModel glAccount) {
    this.glAccount = glAccount;
    return this;
  }

   /**
   * Account GL
   * @return glAccount
  **/
  @ApiModelProperty(value = "Account GL")
  public ReferenceModel getGlAccount() {
    return glAccount;
  }

  public void setGlAccount(ReferenceModel glAccount) {
    this.glAccount = glAccount;
  }

  public AccountSearchModel ibanCode(String ibanCode) {
    this.ibanCode = ibanCode;
    return this;
  }

   /**
   * Account IBAN code
   * @return ibanCode
  **/
  @ApiModelProperty(value = "Account IBAN code")
  public String getIbanCode() {
    return ibanCode;
  }

  public void setIbanCode(String ibanCode) {
    this.ibanCode = ibanCode;
  }

  public AccountSearchModel internalAccountCode(String internalAccountCode) {
    this.internalAccountCode = internalAccountCode;
    return this;
  }

   /**
   * Internal account code
   * @return internalAccountCode
  **/
  @ApiModelProperty(value = "Internal account code")
  public String getInternalAccountCode() {
    return internalAccountCode;
  }

  public void setInternalAccountCode(String internalAccountCode) {
    this.internalAccountCode = internalAccountCode;
  }

  public AccountSearchModel marker1(Boolean marker1) {
    this.marker1 = marker1;
    return this;
  }

   /**
   * Marker1.
   * @return marker1
  **/
  @ApiModelProperty(example = "false", value = "Marker1.")
  public Boolean isMarker1() {
    return marker1;
  }

  public void setMarker1(Boolean marker1) {
    this.marker1 = marker1;
  }

  public AccountSearchModel marker2(Boolean marker2) {
    this.marker2 = marker2;
    return this;
  }

   /**
   * Marker2.
   * @return marker2
  **/
  @ApiModelProperty(example = "false", value = "Marker2.")
  public Boolean isMarker2() {
    return marker2;
  }

  public void setMarker2(Boolean marker2) {
    this.marker2 = marker2;
  }

  public AccountSearchModel marker3(Boolean marker3) {
    this.marker3 = marker3;
    return this;
  }

   /**
   * Marker3.
   * @return marker3
  **/
  @ApiModelProperty(example = "false", value = "Marker3.")
  public Boolean isMarker3() {
    return marker3;
  }

  public void setMarker3(Boolean marker3) {
    this.marker3 = marker3;
  }

  public AccountSearchModel signatoryUsers(Long signatoryUsers) {
    this.signatoryUsers = signatoryUsers;
    return this;
  }

   /**
   * Signatory users.
   * @return signatoryUsers
  **/
  @ApiModelProperty(value = "Signatory users.")
  public Long getSignatoryUsers() {
    return signatoryUsers;
  }

  public void setSignatoryUsers(Long signatoryUsers) {
    this.signatoryUsers = signatoryUsers;
  }

  public AccountSearchModel statementIdentifier(String statementIdentifier) {
    this.statementIdentifier = statementIdentifier;
    return this;
  }

   /**
   * Account statement identifier
   * @return statementIdentifier
  **/
  @ApiModelProperty(value = "Account statement identifier")
  public String getStatementIdentifier() {
    return statementIdentifier;
  }

  public void setStatementIdentifier(String statementIdentifier) {
    this.statementIdentifier = statementIdentifier;
  }

  public AccountSearchModel status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Account status
   * @return status
  **/
  @ApiModelProperty(example = "CREATION_TO_VALIDATE", value = "Account status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AccountSearchModel updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Update date
   * @return updateDate
  **/
  @ApiModelProperty(example = "2020-06-22", value = "Update date")
  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

  public AccountSearchModel uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of the account.
   * @return uuid
  **/
  @ApiModelProperty(example = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", required = true, value = "UUID of the account.")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public AccountSearchModel zbaIdentifier(String zbaIdentifier) {
    this.zbaIdentifier = zbaIdentifier;
    return this;
  }

   /**
   * Account ZBA identifier
   * @return zbaIdentifier
  **/
  @ApiModelProperty(value = "Account ZBA identifier")
  public String getZbaIdentifier() {
    return zbaIdentifier;
  }

  public void setZbaIdentifier(String zbaIdentifier) {
    this.zbaIdentifier = zbaIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSearchModel accountSearchModel = (AccountSearchModel) o;
    return Objects.equals(this.accountCategory1, accountSearchModel.accountCategory1) &&
        Objects.equals(this.accountCategory2, accountSearchModel.accountCategory2) &&
        Objects.equals(this.accountCategory3, accountSearchModel.accountCategory3) &&
        Objects.equals(this.accountCategory4, accountSearchModel.accountCategory4) &&
        Objects.equals(this.accountCategory5, accountSearchModel.accountCategory5) &&
        Objects.equals(this.accountCategory6, accountSearchModel.accountCategory6) &&
        Objects.equals(this.accountCategory7, accountSearchModel.accountCategory7) &&
        Objects.equals(this.accountCategory8, accountSearchModel.accountCategory8) &&
        Objects.equals(this.accountCategory9, accountSearchModel.accountCategory9) &&
        Objects.equals(this.accountCategory10, accountSearchModel.accountCategory10) &&
        Objects.equals(this.accountType, accountSearchModel.accountType) &&
        Objects.equals(this.activeStatus, accountSearchModel.activeStatus) &&
        Objects.equals(this.attachments, accountSearchModel.attachments) &&
        Objects.equals(this.banCode, accountSearchModel.banCode) &&
        Objects.equals(this.bank, accountSearchModel.bank) &&
        Objects.equals(this.branch, accountSearchModel.branch) &&
        Objects.equals(this.branchDescription, accountSearchModel.branchDescription) &&
        Objects.equals(this.calendar, accountSearchModel.calendar) &&
        Objects.equals(this.closedAccount, accountSearchModel.closedAccount) &&
        Objects.equals(this.closingDate, accountSearchModel.closingDate) &&
        Objects.equals(this.code, accountSearchModel.code) &&
        Objects.equals(this.company, accountSearchModel.company) &&
        Objects.equals(this.countryCode, accountSearchModel.countryCode) &&
        Objects.equals(this.creationDate, accountSearchModel.creationDate) &&
        Objects.equals(this.currency, accountSearchModel.currency) &&
        Objects.equals(this.defaultGroup, accountSearchModel.defaultGroup) &&
        Objects.equals(this.description, accountSearchModel.description) &&
        Objects.equals(this.description2, accountSearchModel.description2) &&
        Objects.equals(this.documents, accountSearchModel.documents) &&
        Objects.equals(this.glAccount, accountSearchModel.glAccount) &&
        Objects.equals(this.ibanCode, accountSearchModel.ibanCode) &&
        Objects.equals(this.internalAccountCode, accountSearchModel.internalAccountCode) &&
        Objects.equals(this.marker1, accountSearchModel.marker1) &&
        Objects.equals(this.marker2, accountSearchModel.marker2) &&
        Objects.equals(this.marker3, accountSearchModel.marker3) &&
        Objects.equals(this.signatoryUsers, accountSearchModel.signatoryUsers) &&
        Objects.equals(this.statementIdentifier, accountSearchModel.statementIdentifier) &&
        Objects.equals(this.status, accountSearchModel.status) &&
        Objects.equals(this.updateDate, accountSearchModel.updateDate) &&
        Objects.equals(this.uuid, accountSearchModel.uuid) &&
        Objects.equals(this.zbaIdentifier, accountSearchModel.zbaIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategory1, accountCategory2, accountCategory3, accountCategory4, accountCategory5, accountCategory6, accountCategory7, accountCategory8, accountCategory9, accountCategory10, accountType, activeStatus, attachments, banCode, bank, branch, branchDescription, calendar, closedAccount, closingDate, code, company, countryCode, creationDate, currency, defaultGroup, description, description2, documents, glAccount, ibanCode, internalAccountCode, marker1, marker2, marker3, signatoryUsers, statementIdentifier, status, updateDate, uuid, zbaIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSearchModel {\n");
    
    sb.append("    accountCategory1: ").append(toIndentedString(accountCategory1)).append("\n");
    sb.append("    accountCategory2: ").append(toIndentedString(accountCategory2)).append("\n");
    sb.append("    accountCategory3: ").append(toIndentedString(accountCategory3)).append("\n");
    sb.append("    accountCategory4: ").append(toIndentedString(accountCategory4)).append("\n");
    sb.append("    accountCategory5: ").append(toIndentedString(accountCategory5)).append("\n");
    sb.append("    accountCategory6: ").append(toIndentedString(accountCategory6)).append("\n");
    sb.append("    accountCategory7: ").append(toIndentedString(accountCategory7)).append("\n");
    sb.append("    accountCategory8: ").append(toIndentedString(accountCategory8)).append("\n");
    sb.append("    accountCategory9: ").append(toIndentedString(accountCategory9)).append("\n");
    sb.append("    accountCategory10: ").append(toIndentedString(accountCategory10)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    banCode: ").append(toIndentedString(banCode)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    branchDescription: ").append(toIndentedString(branchDescription)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    closedAccount: ").append(toIndentedString(closedAccount)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    defaultGroup: ").append(toIndentedString(defaultGroup)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    glAccount: ").append(toIndentedString(glAccount)).append("\n");
    sb.append("    ibanCode: ").append(toIndentedString(ibanCode)).append("\n");
    sb.append("    internalAccountCode: ").append(toIndentedString(internalAccountCode)).append("\n");
    sb.append("    marker1: ").append(toIndentedString(marker1)).append("\n");
    sb.append("    marker2: ").append(toIndentedString(marker2)).append("\n");
    sb.append("    marker3: ").append(toIndentedString(marker3)).append("\n");
    sb.append("    signatoryUsers: ").append(toIndentedString(signatoryUsers)).append("\n");
    sb.append("    statementIdentifier: ").append(toIndentedString(statementIdentifier)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    zbaIdentifier: ").append(toIndentedString(zbaIdentifier)).append("\n");
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

