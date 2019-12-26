# TasksApi

All URIs are relative to *https://localhost:7008/tmapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTask**](TasksApi.md#createTask) | **POST** /tasks | Create task
[**deleteTasks**](TasksApi.md#deleteTasks) | **DELETE** /tasks | Delete tasks
[**getTaskResult**](TasksApi.md#getTaskResult) | **GET** /tasks/result | Task result
[**getTasksInfo**](TasksApi.md#getTasksInfo) | **GET** /tasks | Tasks information


<a name="createTask"></a>
# **createTask**
> Object createTask(operations, documents, async, positions)

Create task

To create a task for performing several operations with text documents, specify required operations in the \&quot;operations\&quot; attribute in the request body. Tasks should be separated by a comma. The list of operations supported with the server could be retrieved via the request \&quot;server\&quot;.  Created tasks are available to users until they are deleted by the DELETE method or the server is restarted. After restarting the server it is not possible to get information, to delete, or to get the result of the created tasks. The tasks will cease to exist as if they were deleted by the DELETE method. 

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
List<String> operations = Arrays.asList(); // List<String> | List of operations (languages, tokens, keywords, entities, sentiments, facts)
Documents documents = {"files":[{"content":"VGhlIFNlbmF0ZSBBZ3JpY3VsdHVyZSBDb21taXR0ZWUgd2FzIGV4cGVjdGVkIHRvIGNvbnNpZGVyIHByb3Bvc2FscyB0aGF0IHdvdWxkIGxpbWl0IGFkanVzdG1lbnRzIGluIGNvdW50eSBsb2FuIHJhdGUgZGlmZmVyZW50aWFscyB3aGljaCB0cmlnZ2VyIGxhcmdlciBjb3JuIGFuZCB3aGVhdCBhY3JlYWdlIHJlZHVjdGlvbiByZXF1aXJlbWVudHMu","extension":"txt"}]}; // Documents | Documents to process
Integer async = 56; // Integer | Asynchorous execution flag: * `0` - Block execution until result is ready (**default**) * `1` - Return GUID of newly created task and run task asynchronously 
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    Object result = apiInstance.createTask(operations, documents, async, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#createTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operations** | [**List&lt;String&gt;**](String.md)| List of operations (languages, tokens, keywords, entities, sentiments, facts) | [enum: languages, tokens, keywords, entities, sentiments, facts]
 **documents** | [**Documents**](Documents.md)| Documents to process |
 **async** | **Integer**| Asynchorous execution flag: * &#x60;0&#x60; - Block execution until result is ready (**default**) * &#x60;1&#x60; - Return GUID of newly created task and run task asynchronously  | [optional] [enum: 0, 1]
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTasks"></a>
# **deleteTasks**
> Object deleteTasks(ids)

Delete tasks

The operation allows to delete current user’s tasks specified in the ids parameter. Deleting tasks saves the server disk space. 

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
List<String> ids = Arrays.asList(); // List<String> | List of task identifiers
try {
    Object result = apiInstance.deleteTasks(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#deleteTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;String&gt;**](String.md)| List of task identifiers |

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTaskResult"></a>
# **getTaskResult**
> Object getTaskResult(id, operations, positions)

Task result

The operation allows to get the result of the specified task. The task GUID and relevant operations are required.  Before getting results of the task execution, first ensure that the task is completed (the done paremeter is 100, the error parameter is empty). 

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
String id = "id_example"; // String | Task identifier
List<String> operations = Arrays.asList(); // List<String> | List of operations (languages, tokens, keywords, entities, sentiments, facts)
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    Object result = apiInstance.getTaskResult(id, operations, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTaskResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Task identifier |
 **operations** | [**List&lt;String&gt;**](String.md)| List of operations (languages, tokens, keywords, entities, sentiments, facts) | [enum: languages, tokens, keywords, entities, sentiments, facts]
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

**Object**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTasksInfo"></a>
# **getTasksInfo**
> TaskInfo getTasksInfo(ids)

Tasks information

The operation allows to receive information about the specified tasks. A task unique identifier (GIUD) is required, which is returned when creating new asynchronous task. If the identifiers list is empty, the server will return information about all tasks of the current user. 

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
List<String> ids = Arrays.asList(); // List<String> | List of task identifiers
try {
    TaskInfo result = apiInstance.getTasksInfo(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTasksInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;String&gt;**](String.md)| List of task identifiers |

### Return type

[**TaskInfo**](TaskInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

