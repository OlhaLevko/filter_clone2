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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Account;
import io.swagger.client.model.AccountDetailsDto;
import io.swagger.client.model.PageOfAccountSearchModel;
import io.swagger.client.model.ResponseIdModel;

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest{

     @Autowired
    private  AccountsApi api;

    
    /**
     * Create a new account.
     *
     * A resource is created by using its code. The filed \&quot;uuid\&quot; is not accepted in the payload. The \&quot;uuid\&quot; value will be generated automatically by the system if the resource is successfully created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsingPOST1Test() throws ApiException {
        Account accountCreateDto = null;
        ResponseIdModel response = api.createUsingPOST1(accountCreateDto);

        // TODO: test validations
    }
    
    /**
     * Delete a specific account identified by a code.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteByCodeUsingDELETE1Test() throws ApiException {
        String code = null;
        ResponseIdModel response = api.deleteByCodeUsingDELETE1(code);

        // TODO: test validations
    }
    
    /**
     * Delete a specific account identified by a uuid.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsingDELETE1Test() throws ApiException {
        UUID uuid = null;
        ResponseIdModel response = api.deleteUsingDELETE1(uuid);

        // TODO: test validations
    }
    
    /**
     * Get details about a specific Account identified by a code.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAccountUsingGET1Test() throws ApiException {
        String code = null;
        PageOfAccountSearchModel response = api.readAccountUsingGET1(code);

        // TODO: test validations
    }
    
    /**
     * Get details about a specific Account identified by a uuid.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAccountUsingGET3Test() throws ApiException {
        UUID uuid = null;
        AccountDetailsDto response = api.readAccountUsingGET3(uuid);

        // TODO: test validations
    }
    
    /**
     * List accounts (all accounts or a selection of accounts).
     *
     * An empty list is returned if no accounts are available. The following fields can be used for filter and sort: - **code** - **uuid** - **description** - **company.uuid** - **company.code** - **branch.uuid** - **branch.code** - **bank.uuid** - **bank.code** - **currency.uuid** - **currency.code** - **country.code** - **accountType** available values &#x3D; {BANK_ACCOUNT,INTERCOMPANY_ACCOUNT,OTHER_ACCOUNT,SHARED_ACCOUNT} - **banCode** - **creationDate** - **updateDate** - **closingDate** - **activeStatus** available values &#x3D; {OPENED,CLOSED} - **statementIdentifier**  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAccountsUsingGET1Test() throws ApiException {
        String activeStatus = null;
        String filter = null;
        Integer pageLimit = null;
        Integer pageOffset = null;
        List<String> sort = null;
        PageOfAccountSearchModel response = api.readAccountsUsingGET1(activeStatus, filter, pageLimit, pageOffset, sort);

        // TODO: test validations
    }
    
    /**
     * Update a specific account identified by a code.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPUT1Test() throws ApiException {
        Account accountDto = null;
        String code = null;
        ResponseIdModel response = api.updateUsingPUT1(accountDto, code);

        // TODO: test validations
    }
    
    /**
     * Update a specific account identified by a uuid.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPUT3Test() throws ApiException {
        Account accountDto = null;
        UUID uuid = null;
        ResponseIdModel response = api.updateUsingPUT3(accountDto, uuid);

        // TODO: test validations
    }
    
}
