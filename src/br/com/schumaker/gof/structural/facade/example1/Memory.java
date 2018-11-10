package br.com.schumaker.gof.structural.facade.example1;

/**
 *
 * @author hudsonschumaker
 */
/* Complex parts */
public class Memory {
     public void load(long position, byte[] data) {
         System.out.println("loading memory...");
     }
}
