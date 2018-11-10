package br.com.schumaker.gof.structural.facade.example1;

/**
 *
 * @author hudsonschumaker
 */
/* Complex parts */
public class HardDrive {
    public byte[] read(long lba, int size) {
        byte[] b = new byte[size];
        return b;
    }
}
