
# PerOperationLimitPeriodic1Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ntUPeriod1** | [**NtUPeriod1Enum**](#NtUPeriod1Enum) | A period when limitations apply |  [optional]
**ntUInPeriod1Limit** | **Integer** | A maximum number of requests in the specified period |  [optional]
**ntUInPeriod1Tokens** | **Integer** | A number of requests that have already been processed for operation Text parsing |  [optional]
**ntUInPeriod1Keywords** | **Integer** | A number of requests that have already been processed for operation Keywords extraction |  [optional]
**ntUInPeriod1Entities** | **Integer** | A number of requests that have already been processed for operation Entities extraction |  [optional]
**ntUInPeriod1Languages** | **Integer** | A number of requests that have already been processed for operation Language detection |  [optional]
**ntUInPeriod1Sentiments** | **Integer** | A number of requests that have already been processed for operation Sentiments analysis |  [optional]
**ntUInPeriod1Facts** | **Integer** | A number of requests that have already been processed for operation Facts extraction |  [optional]


<a name="NtUPeriod1Enum"></a>
## Enum: NtUPeriod1Enum
Name | Value
---- | -----
SECOND | &quot;Second&quot;
MINUTE | &quot;Minute&quot;
HOUR | &quot;Hour&quot;
DAY | &quot;Day&quot;
MONTH | &quot;Month&quot;



