/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import io.kubernetes.client.openapi.models.V1PriorityClass;
import io.kubernetes.client.openapi.models.V1PriorityClassList;
import io.kubernetes.client.openapi.models.V1Status;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchedulingV1Api
 */
@Ignore
public class SchedulingV1ApiTest {

    private final SchedulingV1Api api = new SchedulingV1Api();

    
    /**
     * 
     *
     * create a PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPriorityClassTest() throws ApiException {
        V1PriorityClass body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1PriorityClass response = api.createPriorityClass(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionPriorityClassTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteCollectionPriorityClass(pretty, allowWatchBookmarks, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePriorityClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1DeleteOptions body = null;
        V1Status response = api.deletePriorityClass(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPriorityClassTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1PriorityClassList response = api.listPriorityClass(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPriorityClassTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        V1PriorityClass response = api.patchPriorityClass(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPriorityClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1PriorityClass response = api.readPriorityClass(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified PriorityClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replacePriorityClassTest() throws ApiException {
        String name = null;
        V1PriorityClass body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1PriorityClass response = api.replacePriorityClass(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}