
# TokensResponseTokens

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**word** | **String** | Word as in text |  [optional]
**lemma** | **String** | A dictionary form of a word, e.g. given verb forms \&quot;run\&quot;, \&quot;ran\&quot; and \&quot;runs\&quot;, \&quot;run\&quot; is the lemma |  [optional]
**partOfSpeech** | [**PartOfSpeechEnum**](#PartOfSpeechEnum) | Assigns a word to a morphological category according to each syntactic functions. |  [optional]
**modifier** | [**Object**](.md) | One of the grammatical categories of a word, e.g. person for verbs or number for nouns. Each part of speech has its own set of modifiers.  The detailed list of parameters can be found in Help to TM API Server.  |  [optional]
**isExtension** | [**IsExtensionEnum**](#IsExtensionEnum) | Indicates a way of writing a token with the previous one. It returns \&quot;1\&quot;, if tokens are written as a single token. It returns \&quot;0\&quot;, if tokens are written separately.  |  [optional]
**position** | [**TokensResponsePosition**](TokensResponsePosition.md) |  |  [optional]


<a name="PartOfSpeechEnum"></a>
## Enum: PartOfSpeechEnum
Name | Value
---- | -----
NOUN | &quot;Noun&quot;
VERB | &quot;Verb&quot;
ADVERB | &quot;Adverb&quot;
ADJECTIVE | &quot;Adjective&quot;
PARTICLE | &quot;Particle&quot;
PRONOUN | &quot;Pronoun&quot;
NUMERAL | &quot;Numeral&quot;
SPECIAL | &quot;Special&quot;
PUNCTUATION | &quot;Punctuation&quot;


<a name="IsExtensionEnum"></a>
## Enum: IsExtensionEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1



