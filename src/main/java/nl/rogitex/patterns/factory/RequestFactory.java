package nl.rogitex.patterns.factory;

public class RequestFactory {

    private RequestFactory() {}

    public static Request create(RequestType requestType) {
        Request request = null;

        switch (requestType) {
            case GET:
                request = new GetRequest();
                break;
            case PUT:
                request = new PutRequest();
                break;
            case POST:
                request = new PostRequest();
                break;
            case DELETE:
                request = new DeleteRequest();
                break;
        }

        return request;
    }

}
