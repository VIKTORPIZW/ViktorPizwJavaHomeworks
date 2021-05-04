package com.pvt;

public class Computer {
    private static Computer computer;
    private int id;
    private String name;
    private String OS;
    private String proc;

    private Computer(int id,String name,String OS,String proc) {
        this.id = id;
        this.name =name;
        this.OS = OS;
        this.proc=proc;

    }

    public static Computer getComputer() {
        return computer;
    }

    public static void setComputer(Computer computer) {
        Computer.computer = computer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public static Computer getInstance() {
        if (computer==null){
            computer = new Computer(123456," Витя","Winda","Intel CORE i7");
        }
        return computer;
    }



}
