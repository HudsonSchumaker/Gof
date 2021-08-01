package br.com.schumaker.concurrencypatterns.balking;

/**
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Job job = new Job();
        job.execute();
        job.execute();
    }
}
