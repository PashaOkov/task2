package com.company.animals;

public class Dog extends Animals {

    public Dog(String name){
        if((name != null) && (!name.equals("")))
        this.name = name;
    }
    @Override
    public void makeNoise() {
        if(!this.isSleep)
            System.out.println("Собака " + this.name + " гавкнула");
        else
            System.out.println("Собака " + this.name + " спит");
    }
}
