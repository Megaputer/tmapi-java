/*
 * Megaputer Text Mining API
 * Megaputer Text Mining API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package tmapi.api;

import tmapi.ApiCallback;
import tmapi.ApiClient;
import tmapi.ApiException;
import tmapi.ApiResponse;
import tmapi.Configuration;
import tmapi.Pair;
import tmapi.ProgressRequestBody;
import tmapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import tmapi.model.AuthenticationError;
import tmapi.model.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LimitsApi {
    private ApiClient apiClient;

    public LimitsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LimitsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getLimits
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLimitsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/limits";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "BasicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLimitsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getLimitsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Limits information
     * To check current limitations, send the relevant request. Responses may be different depending on the type of the license acquired: - **Total limit for all operations.** The license establishes limits on the total number of requests for text unit processing. If the total number of text units is equal to or exceeds the limits, then all operations will be blocked.            - **Limit for each operation.** The license establishes limits on requests for text unit processing per each operation separately. If a number of text units NTU of any operation is equal to or exceeds the NTULimit, then this operation will be blocked. Other operations will be available until their NTU counters reach the maximum threshold.  - **Total limit on number of calls.** The license establishes limits on the total number of requests for text unit processing for a definite period. If the total number of text units is equal to or exceeds the number of requests specified for a certain period, then all operations will be blocked till the end of this period. The maximum number of periods - 2. The counter resets when a new period comes, for example, a new day or a new month. Users can send requests again until the maximum number of text units is reached in the specified period.  - **Limit on number of calls for each operation.** The license establishes limits on requests for text unit processing per each operation separately for definite period. If the number of processed text units for a single operation equals to or exceeds the number of requests specified for a certain period, then this operation will be blocked until the end of the specified period. Other operations will be available until their NTU counters reach a maximum threshold. 
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object getLimits() throws ApiException {
        ApiResponse<Object> resp = getLimitsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Limits information
     * To check current limitations, send the relevant request. Responses may be different depending on the type of the license acquired: - **Total limit for all operations.** The license establishes limits on the total number of requests for text unit processing. If the total number of text units is equal to or exceeds the limits, then all operations will be blocked.            - **Limit for each operation.** The license establishes limits on requests for text unit processing per each operation separately. If a number of text units NTU of any operation is equal to or exceeds the NTULimit, then this operation will be blocked. Other operations will be available until their NTU counters reach the maximum threshold.  - **Total limit on number of calls.** The license establishes limits on the total number of requests for text unit processing for a definite period. If the total number of text units is equal to or exceeds the number of requests specified for a certain period, then all operations will be blocked till the end of this period. The maximum number of periods - 2. The counter resets when a new period comes, for example, a new day or a new month. Users can send requests again until the maximum number of text units is reached in the specified period.  - **Limit on number of calls for each operation.** The license establishes limits on requests for text unit processing per each operation separately for definite period. If the number of processed text units for a single operation equals to or exceeds the number of requests specified for a certain period, then this operation will be blocked until the end of the specified period. Other operations will be available until their NTU counters reach a maximum threshold. 
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> getLimitsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLimitsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Limits information (asynchronously)
     * To check current limitations, send the relevant request. Responses may be different depending on the type of the license acquired: - **Total limit for all operations.** The license establishes limits on the total number of requests for text unit processing. If the total number of text units is equal to or exceeds the limits, then all operations will be blocked.            - **Limit for each operation.** The license establishes limits on requests for text unit processing per each operation separately. If a number of text units NTU of any operation is equal to or exceeds the NTULimit, then this operation will be blocked. Other operations will be available until their NTU counters reach the maximum threshold.  - **Total limit on number of calls.** The license establishes limits on the total number of requests for text unit processing for a definite period. If the total number of text units is equal to or exceeds the number of requests specified for a certain period, then all operations will be blocked till the end of this period. The maximum number of periods - 2. The counter resets when a new period comes, for example, a new day or a new month. Users can send requests again until the maximum number of text units is reached in the specified period.  - **Limit on number of calls for each operation.** The license establishes limits on requests for text unit processing per each operation separately for definite period. If the number of processed text units for a single operation equals to or exceeds the number of requests specified for a certain period, then this operation will be blocked until the end of the specified period. Other operations will be available until their NTU counters reach a maximum threshold. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLimitsAsync(final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLimitsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}