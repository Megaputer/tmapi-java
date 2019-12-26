# ServerApi

All URIs are relative to *https://localhost:7008/tmapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](ServerApi.md#changePassword) | **POST** /change-password | Change password
[**getServerInfo**](ServerApi.md#getServerInfo) | **GET** /server | Server information


<a name="changePassword"></a>
# **changePassword**
> changePassword(changePasswordRequest)

Change password

Use this request to change the password.

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest(); // ChangePasswordRequest | Change password request
try {
    apiInstance.changePassword(changePasswordRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)| Change password request |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getServerInfo"></a>
# **getServerInfo**
> ServerInfo getServerInfo()

Server information

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.ServerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ServerApi apiInstance = new ServerApi();
try {
    ServerInfo result = apiInstance.getServerInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerApi#getServerInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerInfo**](ServerInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

