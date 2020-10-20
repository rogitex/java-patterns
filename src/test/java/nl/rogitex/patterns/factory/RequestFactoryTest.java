package nl.rogitex.patterns.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RequestFactoryTest {

    @Test
    public void requestFactoryTest() {
        Request getRequest = RequestFactory.create(RequestType.GET);
        assertEquals("Do a GET request!", getRequest.doRequest());
        System.out.println(getRequest.doRequest());

        Request putRequest = RequestFactory.create(RequestType.PUT);
        assertEquals("Do a PUT request!", putRequest.doRequest());
        System.out.println(putRequest.doRequest());

        Request postRequest = RequestFactory.create(RequestType.POST);
        assertEquals("Do a POST request!", postRequest.doRequest());
        System.out.println(postRequest.doRequest());

        Request deleteRequest = RequestFactory.create(RequestType.DELETE);
        assertEquals("Do a DELETE request!", deleteRequest.doRequest());
        System.out.println(deleteRequest.doRequest());
    }

}
