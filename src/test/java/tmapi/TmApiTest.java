package tmapi;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

import tmapi.*;
import tmapi.auth.*;
import tmapi.model.*;
import tmapi.api.LimitsApi;
import tmapi.api.ServerApi;
import tmapi.api.OperationsApi;
import tmapi.api.TasksApi;
import tmapi.model.AsyncTaskResponse;
import tmapi.model.TokensResponse;

import com.google.gson.*;

public class TmApiTest {
    private static final String[] texts = {
            "Elvis Presley was born in Tupelo, Mississippi.",
            "Elvis Presley was an American singer"
    };

    private static Documents getDocuments() {
        Documents documents = new Documents();
        Document doc1 = new Document();
        doc1.setContent(Base64.getEncoder().encodeToString(texts[0].getBytes()));
        Document doc2 = new Document();
        doc2.setContent(Base64.getEncoder().encodeToString(texts[1].getBytes()));
        documents.addFilesItem(doc1);
        documents.addFilesItem(doc2);
        return documents;
    }

    public TmApiTest() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setVerifyingSsl(false);
        //defaultClient.setBasePath("http://localhost:7007/tmapi/v1");

        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        Basic.setUsername("user");
        Basic.setPassword("");
    }

    // server info
    @Test
    public void testServerInfo() throws ApiException {
        ServerApi apiInstance = new ServerApi();
        ServerInfo info = apiInstance.getServerInfo();
        assertTrue(info.getLanguages().size() > 0);
        assertTrue(info.getOperations().size() > 0);
    }

    // limits
    @Test
    public void testServerLimits() throws ApiException {
        LimitsApi apiInstance = new LimitsApi();
        Object obj = apiInstance.getLimits();
        assertTrue(obj != null);
    }

    // language detection
    @Test
    public void testLanguageDetection() throws ApiException {
        OperationsApi apiInstance = new OperationsApi();
        LanguagesResponse result = apiInstance.getLanguages(texts[0]);
        assertTrue(result.getDocuments().size() == 1);
        assertTrue(result.getDocuments().get(0).getLanguage().equals("English"));
    }

    @Test
    public void testDocumentsLanguageDetection() throws ApiException {
        Documents documents = getDocuments();
        OperationsApi apiInstance = new OperationsApi();
        LanguagesResponse result = apiInstance.getDocumentsLanguages(documents);
        assertTrue(result.getDocuments().size() == documents.getFiles().size());
        assertTrue(result.getDocuments().get(0).getLanguage().equals("English"));
        assertTrue(result.getDocuments().get(1).getLanguage().equals("English"));
    }

    // test tokens
    @Test
    public void testTokens() throws ApiException {
        OperationsApi apiInstance = new OperationsApi();
        TokensResponse result = apiInstance.extractTokens(texts[0]);
        assertTrue(result.getDocuments().size() == 1);
        assertTrue(result.getDocuments().get(0).getSentences().size() == 1);
        assertTrue(result.getDocuments().get(0).getSentences().get(0).getTokens().size() > 0);
    }

    @Test
    public void testDocumentsTokens() throws ApiException {
        Documents documents = getDocuments();
        OperationsApi apiInstance = new OperationsApi();
        TokensResponse result = apiInstance.extractDocumentsTokens(documents);
        assertTrue(result.getDocuments().size() == documents.getFiles().size());
        assertTrue(result.getDocuments().get(0).getSentences().get(0).getTokens().size() > 0);
        assertTrue(result.getDocuments().get(1).getSentences().get(0).getTokens().size() > 0);
    }

    // test keywords
    @Test
    public void testKeywords() throws ApiException {
        OperationsApi apiInstance = new OperationsApi();
        KeywordsResponse result = apiInstance.extractKeywords(texts[0], "token");
        assertTrue(result.getDocuments().size() == 1);
        assertTrue(result.getDocuments().get(0).getKeywords().size() > 0);
        assertTrue(result.getDocuments().get(0).getKeywords().get(0).getPositions().size() > 0);
    }

    @Test
    public void testDocumentsKeywords() throws ApiException {
        Documents documents = getDocuments();
        OperationsApi apiInstance = new OperationsApi();
        KeywordsResponse result = apiInstance.extractDocumentsKeywords(documents, "token");
        assertTrue(result.getDocuments().size() == documents.getFiles().size());
        assertTrue(result.getDocuments().get(0).getKeywords().size() > 0);
        assertTrue(result.getDocuments().get(0).getKeywords().get(0).getPositions().size() > 0);
    }

    // test entities
    @Test
    public void testEntities() throws ApiException {
        OperationsApi apiInstance = new OperationsApi();
        EntitiesResponse result = apiInstance.extractEntities(texts[0], "token");
        assertTrue(result.getDocuments().size() == 1);
        List<EntitiesResponseEntities> entities = result.getDocuments().get(0).getEntities();
        assertTrue(entities.size() > 0);
        for (EntitiesResponseEntities entity : entities) {
            assertTrue(entity.getPositions().size() > 0);
            assertTrue( entity.getAttributes().containsKey("Name"));
            assertTrue( entity.getAttributes().containsKey("Confidence"));
        }
    }

    @Test
    public void testDocumentsEntities() throws ApiException {
        Documents documents = getDocuments();
        OperationsApi apiInstance = new OperationsApi();
        EntitiesResponse result = apiInstance.extractDocumentsEntities(documents, "token");
        assertTrue(result.getDocuments().size() == documents.getFiles().size());
        List<EntitiesResponseEntities> entities = result.getDocuments().get(0).getEntities();
        assertTrue(entities.size() > 0);
        for (EntitiesResponseEntities entity : entities) {
            assertTrue(entity.getPositions().size() > 0);
            assertTrue(entity.getAttributes().containsKey("Name"));
            assertTrue(entity.getAttributes().containsKey("Confidence"));
        }
    }

    // test sentiments
    @Test
    public void testSentiments() throws ApiException {
        OperationsApi apiInstance = new OperationsApi();
        SentimentsResponse result = apiInstance.extractSentiments("New menu is good but the place in Toronto is dirty.", "token");
        assertTrue(result.getDocuments().size() == 1);
        List<SentimentsResponseSentiments> sentiments = result.getDocuments().get(0).getSentiments();
        assertTrue(sentiments.size() > 0);
        for (SentimentsResponseSentiments sentiment : sentiments) {
            assertTrue(sentiment.getPositions().size() > 0);
            assertTrue(sentiment.getAttributes().getObject() != "");
            assertTrue(sentiment.getAttributes().getHeadObject() != "");
        }
    }

    @Test
    public void testDocumentsSentiments() throws ApiException {
        Documents documents = new Documents();
        Document doc = new Document();
        String text = "New menu is good but the place in Toronto is dirty.";
        doc.setContent(Base64.getEncoder().encodeToString(text.getBytes()));
        documents.addFilesItem(doc);

        OperationsApi apiInstance = new OperationsApi();
        SentimentsResponse result = apiInstance.extractDocumentsSentiments(documents, "token");
        assertTrue(result.getDocuments().size() == documents.getFiles().size());
        List<SentimentsResponseSentiments> sentiments = result.getDocuments().get(0).getSentiments();
        assertTrue(sentiments.size() > 0);
        for (SentimentsResponseSentiments sentiment : sentiments) {
            assertTrue(sentiment.getPositions().size() > 0);
            assertTrue(sentiment.getAttributes().getObject() != "");
            assertTrue(sentiment.getAttributes().getHeadObject() != "");
        }
    }

    // test facts
    @Test
    public void testFacts() throws ApiException {
        OperationsApi apiInstance = new OperationsApi();
        FactsResponse result = apiInstance.extractFacts(texts[0], "token");
        assertTrue(result.getDocuments().size() == 1);
        List<FactsResponseFacts> facts = result.getDocuments().get(0).getFacts();
        assertTrue(facts.size() > 0);
        for (FactsResponseFacts fact : facts) {
            assertTrue(fact.getPositions().size() > 0);
            assertTrue( fact.getAttributes().containsKey("Person"));
            assertTrue( fact.getAttributes().containsKey("Confidence"));
        }
    }

    @Test
    public void testDocumentsFacts() throws ApiException {
        Documents documents = getDocuments();
        OperationsApi apiInstance = new OperationsApi();
        FactsResponse result = apiInstance.extractDocumentsFacts(documents, "token");
        assertTrue(result.getDocuments().size() == documents.getFiles().size());
        List<FactsResponseFacts> facts = result.getDocuments().get(0).getFacts();
        assertTrue(facts.size() > 0);
        for (FactsResponseFacts fact : facts) {
            assertTrue(fact.getPositions().size() > 0);
            assertTrue( fact.getAttributes().containsKey("Person"));
            assertTrue( fact.getAttributes().containsKey("Confidence"));
        }
    }

    //tasks
    @Test
    public void testTaskInfo() throws ApiException {
        TasksApi tasks = new TasksApi();
        Object res = tasks.createTask(Arrays.asList("tokens"), getDocuments(), 1, "none");
        Gson gson = new Gson();
        AsyncTaskResponse ares = gson.fromJson(gson.toJsonTree(res).getAsJsonObject(), AsyncTaskResponse.class);
        String taskId = ares.getTaskId();
        // find task in all tasks
        TaskInfo allTasksInfo = tasks.getTasksInfo(Collections.<String>emptyList());
        assertTrue(allTasksInfo.getTasks().size() > 0);
        boolean bfind = false;
        for (TaskInfoTasks task : allTasksInfo.getTasks()) {
            if (task.getId().equals(taskId)) {
                bfind = true;
                break;
            }
        }
        assertTrue(bfind);;
        // get concrete task
        TaskInfo info = tasks.getTasksInfo(Arrays.asList(taskId));
        assertEquals(taskId, info.getTasks().get(0).getId());
    }

    @Test
    public void testDeleteTask() throws ApiException {
        TasksApi tasks = new TasksApi();
        Object res = tasks.createTask(Arrays.asList("tokens"), getDocuments(), 1, "none");
        Gson gson = new Gson();
        AsyncTaskResponse ares = gson.fromJson(gson.toJsonTree(res).getAsJsonObject(), AsyncTaskResponse.class);
        String taskId = ares.getTaskId();
        // check task exists
        List<String> ids = Arrays.asList(taskId);
        TaskInfo info = tasks.getTasksInfo(ids);
        assertEquals(taskId, info.getTasks().get(0).getId());
        // delete task
        tasks.deleteTasks(ids);
        // check task deleted
        info = tasks.getTasksInfo(ids);
        assertEquals(info.getTasks(), null);
    }

    @Test
    public void testSyncTask() throws ApiException {
        TasksApi tasks = new TasksApi();
        Object res = tasks.createTask(Arrays.asList("entities"), getDocuments(),0, "none");
        Gson gson = new Gson();
        EntitiesResponse entities = gson.fromJson(gson.toJsonTree(res).getAsJsonObject(), EntitiesResponse.class);
        assertEquals(entities.getDocuments().size(), getDocuments().getFiles().size());
        assertTrue(entities.getDocuments().get(0).getEntities().size() > 0);
    }

    @Test
    public void testMultipleTask() throws ApiException, InterruptedException {
        TasksApi tasks = new TasksApi();
        Gson gson = new Gson();
        List<String> operations = Arrays.asList("tokens", "keywords");
        List<String> taskIds = new ArrayList<String>();
        // create tasks
        for (String operation : operations) {
            Object res = tasks.createTask(Arrays.asList(operation), getDocuments(), 1, "none");
            AsyncTaskResponse ares = gson.fromJson(gson.toJsonTree(res).getAsJsonObject(), AsyncTaskResponse.class);
            taskIds.add(ares.getTaskId());
        }
        // wait till finished
        while (true) {
            TaskInfo info = tasks.getTasksInfo(taskIds);
            assertEquals(info.getTasks().size(), taskIds.size());
            boolean allFinished = true;
            for (TaskInfoTasks task : info.getTasks()) {
                if (task.getDone() < 100) {
                    allFinished = false;
                    break;
                }
            }
            if (allFinished)
                break;
            TimeUnit.SECONDS.sleep(1);
        }
        // check results
        Object tokensRes = tasks.getTaskResult(taskIds.get(0), Arrays.asList(operations.get(0)), "none");
        TokensResponse tokens = gson.fromJson(gson.toJsonTree(tokensRes).getAsJsonObject(), TokensResponse.class);
        assertTrue(tokens.getDocuments().size() > 0);
        Object keywordsRes = tasks.getTaskResult(taskIds.get(1), Arrays.asList(operations.get(1)), "none");
        KeywordsResponse keywords = gson.fromJson(gson.toJsonTree(tokensRes).getAsJsonObject(), KeywordsResponse.class);
        assertTrue(keywords.getDocuments().size() > 0);
        // delete tasks
        tasks.deleteTasks(taskIds);
        TaskInfo info = tasks.getTasksInfo(taskIds);
        assertEquals(info.getTasks(), null);
    }

    @Test
    public void testAsyncTask() throws ApiException, InterruptedException {
        TasksApi tasks = new TasksApi();
        // create task
        Object res = tasks.createTask(Arrays.asList("tokens", "entities"), getDocuments(), 1, "none");
        Gson gson = new Gson();
        AsyncTaskResponse ares = gson.fromJson(gson.toJsonTree(res).getAsJsonObject(), AsyncTaskResponse.class);
        String taskId = ares.getTaskId();
        // wait till finished
        //TimeUnit.SECONDS.sleep(5);
        while (true) {
            TaskInfo info = tasks.getTasksInfo(Arrays.asList(taskId));
            if (info.getTasks().get(0).getDone() == 100)
                break;
            TimeUnit.SECONDS.sleep(1);
        }
        // check results
        // tokens
        Object tokensRes = tasks.getTaskResult(taskId, Arrays.asList("tokens"), "none");
        TokensResponse tokens = gson.fromJson(gson.toJsonTree(tokensRes).getAsJsonObject(), TokensResponse.class);
        assertEquals(tokens.getDocuments().size(), getDocuments().getFiles().size());
        assertTrue(tokens.getDocuments().get(0).getSentences().get(0).getTokens().size() > 0);
        // entities
        Object entitiesRes = tasks.getTaskResult(taskId, Arrays.asList("entities"), "none");
        EntitiesResponse entities = gson.fromJson(gson.toJsonTree(entitiesRes).getAsJsonObject(), EntitiesResponse.class);
        assertEquals(entities.getDocuments().size(), getDocuments().getFiles().size());
        assertTrue(entities.getDocuments().get(0).getEntities().size() > 0);
    }

    // for debugging
    public static void main(String[] args) throws ApiException {
        TmApiTest obj = new TmApiTest();
        obj.testTaskInfo();
    }
}