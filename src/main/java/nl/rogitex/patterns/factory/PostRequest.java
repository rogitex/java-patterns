package nl.rogitex.patterns.factory;

public class PostRequest implements Request {

    @Override
    public String doRequest() {
        return "Do a POST request!";
    }
}
