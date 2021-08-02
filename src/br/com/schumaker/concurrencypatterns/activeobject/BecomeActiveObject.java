package br.com.schumaker.concurrencypatterns.activeobject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Hudson Schumaker
 */
public class BecomeActiveObject {
    
    private double val = 0.0;
    private boolean isRunning;
    private final BlockingQueue<Runnable> dispatchQueue;

    public BecomeActiveObject() {
        dispatchQueue = new LinkedBlockingQueue<>();
    }

    public void start() {
        isRunning = true;
        new Thread(() -> {while (isRunning) {
            try {
                dispatchQueue.take().run();
            } catch (InterruptedException e) {}
        }}).start();
    }

    public void stop() {
        if (dispatchQueue.isEmpty()) {
            isRunning = false;
        } else {
            System.out.println("Queue not empty");
        }
    }
    
    public void abort() {
        isRunning = false;
    }

    public void doSomething() {
        try {
            dispatchQueue.put((Runnable) () -> {
                val = 1.0;
                System.out.println("Value: " + val + " Queue: " + dispatchQueue.size());
            });
        } catch (InterruptedException ex) {}
    }

    public void doSomethingElse() {
        try {
            dispatchQueue.put((Runnable) () -> {
                val = 2.0;
                System.out.println("Value: " + val + " Queue: " + dispatchQueue.size());
            });
        } catch (InterruptedException ex) {}
    }
}
