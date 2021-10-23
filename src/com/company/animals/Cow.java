package com.company.animals;

public class Cow extends Animals {

    public Cow(String name){
        if((name != null) && (!name.equals("")))
        this.name = name;
    }
    @Override
    public void makeNoise() {
        if(!this.isSleep)
            System.out.println("Корова " + this.name + " мычит");
        else
            System.out.println("Корова " + this.name + " спит");
    }
    @Override
    public void sleep(){
        this.isSleep = true;
        System.out.println(this.name + " уснула");
    }
    @Override
    public void eat(){
        this.isSleep = false;
        System.out.println(this.name + " проснулась и пошла кушать");
    }
}
