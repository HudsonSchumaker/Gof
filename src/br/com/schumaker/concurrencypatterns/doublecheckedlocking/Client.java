package br.com.schumaker.concurrencypatterns.doublecheckedlocking;

/**
 * @author Hudson Schumaker
 * @since 18/09/2014
 */
public class Client {

    private SimpleClass simpleClass = null;

    public SimpleClass getSimpleClass() {
        if (simpleClass == null) {
            simpleClass = new SimpleClass();
        }
        return simpleClass;
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.getSimpleClass();
    }
}
