
# TaskInfoTasks

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | An identifier of the task, which this element shows information about |  [optional]
**created** | **String** | UTC time of the task creation (not starting time, since starting time may be delayed) |  [optional]
**modified** | **String** | UTC time when the task data were changed. Typically it is the time when the value in the done parameter were changed. If done&#x3D; 100, then modified stores the time when the task is completed  |  [optional]
**lastAccessed** | **String** | UTC time when the task execution results were last requested. Initially this value is the time of task creation (created) |  [optional]
**done** | **Integer** | Progress percentage of the task performance. When it is 100, then the task is completed. Check this parameter to find out if the task is completed or not  |  [optional]
**error** | **String** | A task execution error. If done &#x3D; 100 and this parameter is not empty, then the task has ended with an error and it cannot provide any results  |  [optional]



