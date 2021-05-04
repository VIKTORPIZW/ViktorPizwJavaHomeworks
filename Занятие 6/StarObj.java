package com.pvt;

public class StarObj implements PlanetInfo{
    private int id;
   private int number;
    protected StarObj (int id, int number) {
        this.id=id;
        this.number=number;
    }
    public void printIdAndNumber (){
        System.out.println("Star obj ID:"+id+" Number:"+ number);
    }


    @Override
    public void printInfo() {
        System.out.println("Planet info by Star Obj");
    }
}




