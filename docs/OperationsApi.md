# OperationsApi

All URIs are relative to *https://localhost:7008/tmapi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractDocumentsEntities**](OperationsApi.md#extractDocumentsEntities) | **POST** /operations/entities | Entities extraction
[**extractDocumentsFacts**](OperationsApi.md#extractDocumentsFacts) | **POST** /operations/facts | Facts extraction
[**extractDocumentsKeywords**](OperationsApi.md#extractDocumentsKeywords) | **POST** /operations/keywords | Keywords extraction
[**extractDocumentsSentiments**](OperationsApi.md#extractDocumentsSentiments) | **POST** /operations/sentiments | Sentiments analysis
[**extractDocumentsTokens**](OperationsApi.md#extractDocumentsTokens) | **POST** /operations/tokens | Text parsing
[**extractEntities**](OperationsApi.md#extractEntities) | **GET** /operations/entities | Entities extraction
[**extractFacts**](OperationsApi.md#extractFacts) | **GET** /operations/facts | Facts extraction
[**extractKeywords**](OperationsApi.md#extractKeywords) | **GET** /operations/keywords | Keywords extraction
[**extractSentiments**](OperationsApi.md#extractSentiments) | **GET** /operations/sentiments | Sentiments analysis
[**extractTokens**](OperationsApi.md#extractTokens) | **GET** /operations/tokens | Text parsing
[**getDocumentsLanguages**](OperationsApi.md#getDocumentsLanguages) | **POST** /operations/languages | Language detection
[**getLanguages**](OperationsApi.md#getLanguages) | **GET** /operations/languages | Language detection


<a name="extractDocumentsEntities"></a>
# **extractDocumentsEntities**
> EntitiesResponse extractDocumentsEntities(documents, positions)

Entities extraction

The operation extracts entities from each file.

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
Documents documents = {"files":[{"content":"RWx2aXMgUHJlc2xleSB3YXMgYm9ybiBpbiBUdXBlbG8sIE1pc3Npc3NpcHBp","extension":"txt"}]}; // Documents | Documents to process
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    EntitiesResponse result = apiInstance.extractDocumentsEntities(documents, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractDocumentsEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documents** | [**Documents**](Documents.md)| Documents to process |
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

[**EntitiesResponse**](EntitiesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractDocumentsFacts"></a>
# **extractDocumentsFacts**
> FactsResponse extractDocumentsFacts(documents, positions)

Facts extraction

The operation extracts facts from each file. The term \&quot;fact\&quot; is used to denote phenomena, events, notions and relations between them which may be of interest to users.  

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
Documents documents = {"files":[{"content":"RWx2aXMgUHJlc2xleSB3YXMgYW4gQW1lcmljYW4gc2luZ2Vy","extension":"txt"}]}; // Documents | Documents to process
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    FactsResponse result = apiInstance.extractDocumentsFacts(documents, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractDocumentsFacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documents** | [**Documents**](Documents.md)| Documents to process |
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

[**FactsResponse**](FactsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractDocumentsKeywords"></a>
# **extractDocumentsKeywords**
> KeywordsResponse extractDocumentsKeywords(documents, positions)

Keywords extraction

The operation explores often mentioned terms in each file. The response returns keywords and other statistics extracted from each file.

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
Documents documents = {"files":[{"content":"VGhlIFNlbmF0ZSBBZ3JpY3VsdHVyZSBDb21taXR0ZWUgd2FzIGV4cGVjdGVkIHRvIGNvbnNpZGVyIHByb3Bvc2FscyB0aGF0IHdvdWxkIGxpbWl0IGFkanVzdG1lbnRzIGluIGNvdW50eSBsb2FuIHJhdGUgZGlmZmVyZW50aWFscyB3aGljaCB0cmlnZ2VyIGxhcmdlciBjb3JuIGFuZCB3aGVhdCBhY3JlYWdlIHJlZHVjdGlvbiByZXF1aXJlbWVudHMu","extension":"txt"}]}; // Documents | Documents to process
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    KeywordsResponse result = apiInstance.extractDocumentsKeywords(documents, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractDocumentsKeywords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documents** | [**Documents**](Documents.md)| Documents to process |
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

[**KeywordsResponse**](KeywordsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractDocumentsSentiments"></a>
# **extractDocumentsSentiments**
> SentimentsResponse extractDocumentsSentiments(documents, positions)

Sentiments analysis

The operation extracts opinions and emotions related to something, identifies the subject, the object of evaluation and the evaluation itself in each file.  

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
Documents documents = {"files":[{"content":"VGhlIGJ1cmdlciB3YXMgZ3JlYXQsIGJ1dCB0aGUgd2FpdGVyIHdhcyB2ZXJ5IHJ1ZGUu","extension":"txt"}]}; // Documents | Documents to process
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    SentimentsResponse result = apiInstance.extractDocumentsSentiments(documents, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractDocumentsSentiments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documents** | [**Documents**](Documents.md)| Documents to process |
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

[**SentimentsResponse**](SentimentsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractDocumentsTokens"></a>
# **extractDocumentsTokens**
> TokensResponse extractDocumentsTokens(documents)

Text parsing

Parse text in each file. The response returns the text which is divided into tokens and sentences, conducts morphological analysis, determines parts of speech, lemmas, etc. 

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
Documents documents = {"files":[{"content":"RWx2aXMgUHJlc2xleSB3YXMgYm9ybiBpbiBUdXBlbG8sIE1pc3Npc3NpcHBp","extension":"txt"}]}; // Documents | Documents to process
try {
    TokensResponse result = apiInstance.extractDocumentsTokens(documents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractDocumentsTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documents** | [**Documents**](Documents.md)| Documents to process |

### Return type

[**TokensResponse**](TokensResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="extractEntities"></a>
# **extractEntities**
> EntitiesResponse extractEntities(text, positions)

Entities extraction

The operation extracts entities from the text document. For example, an entity may represent a person’s name, a name of an organization, an e-mail address, a phone number, or a geographical location.  

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
String text = "Elvis Presley was born in Tupelo, Mississippi"; // String | Document text to process
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    EntitiesResponse result = apiInstance.extractEntities(text, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractEntities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Document text to process |
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

[**EntitiesResponse**](EntitiesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractFacts"></a>
# **extractFacts**
> FactsResponse extractFacts(text, positions)

Facts extraction

The operation extracts facts from the text. The term \&quot;fact\&quot; is used to denote phenomena, events, notions and relations between them which may be of interest to users.

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
String text = "Elvis Presley was an American singer"; // String | Document text to process
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    FactsResponse result = apiInstance.extractFacts(text, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractFacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Document text to process |
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

[**FactsResponse**](FactsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractKeywords"></a>
# **extractKeywords**
> KeywordsResponse extractKeywords(text, positions)

Keywords extraction

The operation explores often mentioned terms in the text. The response returns keywords and other statistics extracted from the text.

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
String text = "The Senate Agriculture Committee was expected to consider proposals that would limit adjustments in county loan rate differentials which trigger larger corn and wheat acreage reduction requirements."; // String | Document text to process
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    KeywordsResponse result = apiInstance.extractKeywords(text, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractKeywords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Document text to process |
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

[**KeywordsResponse**](KeywordsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractSentiments"></a>
# **extractSentiments**
> SentimentsResponse extractSentiments(text, positions)

Sentiments analysis

Extract sentiments from document

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
String text = "The burger was great, but the waiter was very rude."; // String | Document text to process
String positions = "none"; // String | Positions format to be returned from server: - `none` - Don't return positions (**default**) - `symbol` - Symbol positions - `token` - Token positions 
try {
    SentimentsResponse result = apiInstance.extractSentiments(text, positions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractSentiments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Document text to process |
 **positions** | **String**| Positions format to be returned from server: - &#x60;none&#x60; - Don&#39;t return positions (**default**) - &#x60;symbol&#x60; - Symbol positions - &#x60;token&#x60; - Token positions  | [optional] [enum: none, symbol, token]

### Return type

[**SentimentsResponse**](SentimentsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractTokens"></a>
# **extractTokens**
> TokensResponse extractTokens(text)

Text parsing

Parse document text. The response returns the text which is divided into tokens and sentences, conducts morphological analysis, determines parts of speech, lemmas, etc. 

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
String text = "Elvis Presley was born in Tupelo, Mississippi"; // String | Document text to process
try {
    TokensResponse result = apiInstance.extractTokens(text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#extractTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Document text to process |

### Return type

[**TokensResponse**](TokensResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocumentsLanguages"></a>
# **getDocumentsLanguages**
> LanguagesResponse getDocumentsLanguages(documents)

Language detection

Automatically determine the language of each file.  The text encoding format of source files with the .txt extension must be strictly UTF-8. Otherwise, requests will not be executed. 

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
Documents documents = {"files":[{"content":"RWx2aXMgUHJlc2xleSB3YXMgYm9ybiBpbiBUdXBlbG8sIE1pc3Npc3NpcHBp","extension":"txt"}]}; // Documents | Documents to process
try {
    LanguagesResponse result = apiInstance.getDocumentsLanguages(documents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#getDocumentsLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documents** | [**Documents**](Documents.md)| Documents to process |

### Return type

[**LanguagesResponse**](LanguagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLanguages"></a>
# **getLanguages**
> LanguagesResponse getLanguages(text)

Language detection

Detect the language of text documents

### Example
```java
// Import classes:
//import tmapi.ApiClient;
//import tmapi.ApiException;
//import tmapi.Configuration;
//import tmapi.auth.*;
//import tmapi.api.OperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

OperationsApi apiInstance = new OperationsApi();
String text = "Elvis Presley was born in Tupelo, Mississippi"; // String | Document text to process
try {
    LanguagesResponse result = apiInstance.getLanguages(text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#getLanguages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Document text to process |

### Return type

[**LanguagesResponse**](LanguagesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

