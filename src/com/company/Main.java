package com.company;

import com.company.animals.*;

public class Main {

    public static void main(String[] args) {
	Animals animal = new Dog();
	animal.Voice();
	animal.sleep();
	animal.Voice();
	animal.eat();
	animal.Voice();

	animal = new Cow();
	animal.Voice();
	animal.sleep();
	animal.Voice();
	animal.eat();
	animal.Voice();

	animal = new Rabbit();
	animal.Voice();
	animal.sleep();
	animal.Voice();
	animal.eat();
	animal.Voice();
    }
}
