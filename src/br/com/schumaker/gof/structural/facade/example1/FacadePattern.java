package br.com.schumaker.gof.structural.facade.example1;

/**
 *
 * @author hudsonschumaker
 */
public class FacadePattern {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
