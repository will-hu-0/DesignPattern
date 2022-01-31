package org.example.AbstractFactoryPattern;

/**
 * Created by will on 7/20/16.
 */
public class LaptopFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public LaptopFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(ram, hdd, cpu);
    }
}
