package com.pvt;

public class Planet extends StarObj implements PlanetInfo{
     private String type;
    private String name;

    public Planet() {
        super(121,123);

    }
    public void setName (String a){
        name=a;
    }
    public void setType (String b) {
        type = b;
    }
    public void printNameAndType (){
        System.out.println("Planet:"+name+" Star obj type:"+type);
    }

    @Override
    public void printInfo() {
        System.out.println("Planet info by Planet");
    }
}


