package com.company.animals;

public abstract class Animals {
    protected Boolean isSleep = false;
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if((name != null) && (!name.equals("")))
        this.name = name;
    }

    public void sleep(){
        isSleep = true;
        System.out.println(this.name + " уснул");
    }

    public void eat(){
        isSleep = false;
        System.out.println(this.name + " проснулся и пошёл кушать");
    }

    public  abstract void makeNoise();

}
