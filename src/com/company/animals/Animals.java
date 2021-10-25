package com.company.animals;

public abstract class Animals {
    protected Boolean isSleep = false;

    public void sleep(){
        isSleep = true;
    }

    public void eat(){
        isSleep = false;
    }

    public void Voice(){
        if(!isSleep){
            output();
        }
    }

    public  abstract void output();

}
