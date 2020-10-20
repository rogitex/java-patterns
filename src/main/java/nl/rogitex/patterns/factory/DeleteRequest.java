package nl.rogitex.patterns.factory;

public class DeleteRequest implements Request {

    @Override
    public String doRequest() {
        return "Do a DELETE request!";
    }
}
