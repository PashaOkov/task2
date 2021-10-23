package com.company.animals;

public class Rabbit extends Animals {

    public Rabbit(String name){
        if((name != null) && (!name.equals("")))
        this.name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println("Кролики не подают голос");
    }
}
