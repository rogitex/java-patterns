package nl.rogitex.patterns.factory;

public class PutRequest implements Request {

    @Override
    public String doRequest() {
        return "Do a PUT request!";
    }
}
