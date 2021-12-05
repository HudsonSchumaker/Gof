package br.com.schumaker.concurrencypatterns.activeobject;

/**
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        
        OriginalClass originalClass = new OriginalClass();
        for (int k = 0; k < 1000000; k++) {
            originalClass.doSomething();
        }

        for (int k = 0; k < 1000000; k++) {
            originalClass.doSomethingElse();
        }
    }
}
