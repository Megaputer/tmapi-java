# LimitsApi

All URIs are relative to *https://localhost:7008/tmapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLimits**](LimitsApi.md#getLimits) | **GET** /limits | Limits information


<a name="getLimits"></a>
# **getLimits**
> Object getLimits()

Limits information

To check current limitations, send the relevant request. Responses may be different depending on the type of the license acquired: - **Total limit for all operations.** The license establishes limits on the total number of requests for text unit processing. If the total number of text units is equal to or exceeds the limits, then all operations will be blocked.            - **Limit for each operation.** The license establishes limits on requests for text unit processing per each operation separately. If a number of text units NTU of any operation is equal to or exceeds the NTULimit, then this operation will be blocked. Other operations will be available until their NTU counters reach the maximum threshold.  - **Total limit on number of calls.** The license establishes limits on the total number of requests for text unit processing for a definite period. If the total number of text units is equal to or exceeds the number of requests specified for a certain period, then all operations will be blocked till the end of this period. The maximum number of periods - 2. The counter resets when a new period comes, for example, a new day or a new month. Users can send requests again until the maximum number of text units is reached in the specified period.  - **Limit on number of calls for each operation.** The license establishes limits on requests for text unit processing per each operation separately for definite period. If the number of processed text units for a single operation equals to or exceeds the number of requests specified for a certain period, then this operation will be blocked until the end of the specified period. Other operations will be available until their NTU counters reach a maximum threshold. 

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.LimitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

LimitsApi apiInstance = new LimitsApi();
try {
    Object result = apiInstance.getLimits();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LimitsApi#getLimits");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

