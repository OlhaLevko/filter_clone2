# swagger-java-client

Accounts
- API version: v1.0.0
  - Build date: 2021-05-13T11:35:10.236Z

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountsApi;

import java.io.File;
import java.util.*;

public class AccountsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
        OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
        OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

        AccountsApi apiInstance = new AccountsApi();
        Account accountCreateDto = new Account(); // Account | Account
        try {
            ResponseIdModel result = apiInstance.createUsingPOST1(accountCreateDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountsApi#createUsingPOST1");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://demo.kyriba.com/gateway/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**createUsingPOST1**](docs/AccountsApi.md#createUsingPOST1) | **POST** /v1/accounts | Create a new account.
*AccountsApi* | [**deleteByCodeUsingDELETE1**](docs/AccountsApi.md#deleteByCodeUsingDELETE1) | **DELETE** /v1/accounts/code&#x3D;{code} | Delete a specific account identified by a code.
*AccountsApi* | [**deleteUsingDELETE1**](docs/AccountsApi.md#deleteUsingDELETE1) | **DELETE** /v1/accounts/{uuid} | Delete a specific account identified by a uuid.
*AccountsApi* | [**readAccountUsingGET1**](docs/AccountsApi.md#readAccountUsingGET1) | **GET** /v1/accounts/code&#x3D;{code} | Get details about a specific Account identified by a code.
*AccountsApi* | [**readAccountUsingGET3**](docs/AccountsApi.md#readAccountUsingGET3) | **GET** /v1/accounts/{uuid} | Get details about a specific Account identified by a uuid.
*AccountsApi* | [**readAccountsUsingGET1**](docs/AccountsApi.md#readAccountsUsingGET1) | **GET** /v1/accounts | List accounts (all accounts or a selection of accounts).
*AccountsApi* | [**updateUsingPUT1**](docs/AccountsApi.md#updateUsingPUT1) | **PUT** /v1/accounts/code&#x3D;{code} | Update a specific account identified by a code.
*AccountsApi* | [**updateUsingPUT3**](docs/AccountsApi.md#updateUsingPUT3) | **PUT** /v1/accounts/{uuid} | Update a specific account identified by a uuid.


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountCorrespondent](docs/AccountCorrespondent.md)
 - [AccountDetailsDto](docs/AccountDetailsDto.md)
 - [AccountIdModel](docs/AccountIdModel.md)
 - [AccountPaymentInstructions](docs/AccountPaymentInstructions.md)
 - [AccountSearchModel](docs/AccountSearchModel.md)
 - [AddressModel_](docs/AddressModel_.md)
 - [AmountModel_](docs/AmountModel_.md)
 - [ContactModel](docs/ContactModel.md)
 - [EstablishmentModel](docs/EstablishmentModel.md)
 - [InnerError](docs/InnerError.md)
 - [Links](docs/Links.md)
 - [Metadata](docs/Metadata.md)
 - [OtherIdentifierCommonModel](docs/OtherIdentifierCommonModel.md)
 - [PageOfAccountSearchModel](docs/PageOfAccountSearchModel.md)
 - [PaymentReconciliationOptionsModel](docs/PaymentReconciliationOptionsModel.md)
 - [ReferenceModel](docs/ReferenceModel.md)
 - [ResponseIdModel](docs/ResponseIdModel.md)
 - [RestApiError](docs/RestApiError.md)
 - [RestApiErrorResponse](docs/RestApiErrorResponse.md)
 - [UserZones](docs/UserZones.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2ClientCredentials

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


