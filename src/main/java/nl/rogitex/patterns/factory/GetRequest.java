package nl.rogitex.patterns.factory;

public class GetRequest implements Request {

    @Override
    public String doRequest() {
        return "Do a GET request!";
    }
}
