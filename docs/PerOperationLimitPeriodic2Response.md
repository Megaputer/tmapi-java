
# PerOperationLimitPeriodic2Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ntUPeriod2** | [**NtUPeriod2Enum**](#NtUPeriod2Enum) | A period when limitations apply |  [optional]
**ntUInPeriod2Limit** | **Integer** | A maximum number of requests in the specified period |  [optional]
**ntUInPeriod2Tokens** | **Integer** | A number of requests that have already been processed for operation Text parsing |  [optional]
**ntUInPeriod2Keywords** | **Integer** | A number of requests that have already been processed for operation Keywords extraction |  [optional]
**ntUInPeriod2Entities** | **Integer** | A number of requests that have already been processed for operation Entities extraction |  [optional]
**ntUInPeriod2Languages** | **Integer** | A number of requests that have already been processed for operation Language detection |  [optional]
**ntUInPeriod2Sentiments** | **Integer** | A number of requests that have already been processed for operation Sentiments analysis |  [optional]
**ntUInPeriod2Facts** | **Integer** | A number of requests that have already been processed for operation Facts extraction |  [optional]


<a name="NtUPeriod2Enum"></a>
## Enum: NtUPeriod2Enum
Name | Value
---- | -----
SECOND | &quot;Second&quot;
MINUTE | &quot;Minute&quot;
HOUR | &quot;Hour&quot;
DAY | &quot;Day&quot;
MONTH | &quot;Month&quot;



