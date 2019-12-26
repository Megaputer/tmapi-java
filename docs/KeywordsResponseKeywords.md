
# KeywordsResponseKeywords

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | **String** | Normalized keyword |  [optional]
**negated** | **Boolean** | Indicates negation in the semantics of the word and returns the boolean values |  [optional]
**partOfSpeech** | [**PartOfSpeechEnum**](#PartOfSpeechEnum) | Part of speech of the keyword |  [optional]
**significance** | [**BigDecimal**](BigDecimal.md) | How distinct a particular keyword is for the explored text. Significance is calculated on a scale of 0,00 to 100,00. The greater the significance, the greater the chance that the concepts in the investigated data revolve around such a word.  |  [optional]
**support** | **Integer** | The number of different records containing the keyword |  [optional]
**frequency** | **Integer** | The number of times the keyword appears in the data |  [optional]
**positions** | [**List&lt;KeywordsResponsePositions&gt;**](KeywordsResponsePositions.md) | Keyword positions in text |  [optional]


<a name="PartOfSpeechEnum"></a>
## Enum: PartOfSpeechEnum
Name | Value
---- | -----
NOUN | &quot;Noun&quot;
VERB | &quot;Verb&quot;
ADVERB | &quot;Adverb&quot;
ADJECTIVE | &quot;Adjective&quot;



