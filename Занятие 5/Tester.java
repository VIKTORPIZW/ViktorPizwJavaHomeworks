package com.pvt;

public class Tester {
    public String name;
    public String surname;
    private int salary;
    protected int experienceInYears;
    int englishLevel;

    public Tester (String name, String surname) {
        this.name = name;
        this.surname = surname;

     }
     public Tester (  int experienceInYears , int englishLevel, int salary) {
        this.salary = salary;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
     }
     public Tester (String name , String surname, int experienceInYears , int englishLevel, int salary) {
        this.salary = salary;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.name = name;
        this.surname = surname;
     }
    protected String getName () {
        return name;
    }
    protected String getSurname () {
        return surname;
    }
    protected int getSalary () {
        return salary;
    }
    protected int getExperienceInYears() {
        return  experienceInYears;
    }
    protected int getEnglishLevel() {
        return englishLevel;
    }
    protected void setName() {
        this.name=name;
    }
    protected void setSurname () {
        this.surname=surname;
    }
    protected void setExperienceInYears () {
        this.experienceInYears = experienceInYears;
    }
    protected void setEnglishLevel() {
        this.englishLevel = englishLevel;
    }
    protected void setSalary () {
        this.salary = salary;
    }
    private void showSalary (){
        System.out.println(salary*2);
    }
    void experienceInMonth () {
        System.out.println(experienceInYears*12);
    }
    protected void printNameAndSurname () {
        System.out.println("Name:"+name+" Surname:"+surname);
    }
    public void printAllInfo () {
        System.out.println("Name:"+name+" Surname:"+surname + " Salary:"+ salary+" Experience" + experienceInYears + " English Level"+ englishLevel);
    }




}


