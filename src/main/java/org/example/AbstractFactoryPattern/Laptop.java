package org.example.AbstractFactoryPattern;

/**
 * Created by will on 7/20/16.
 */
public class Laptop extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Laptop(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }


    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
