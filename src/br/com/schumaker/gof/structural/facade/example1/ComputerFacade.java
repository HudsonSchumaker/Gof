package br.com.schumaker.gof.structural.facade.example1;

/**
 *
 * @author hudsonschumaker
 */
/* Facade */
public class ComputerFacade {
    
    
    private static final long BOOT_ADDRESS = 0L;
    private static final long BOOT_SECTOR = 1L;
    private static final int SECTOR_SIZE = 100;
    
    private Cpu processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new Cpu();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
