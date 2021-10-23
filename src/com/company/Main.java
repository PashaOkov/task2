package com.company;

import com.company.animals.*;

public class Main {

    public static void main(String[] args) {
	Animals animal = new Dog("Шарик");
	animal.makeNoise();
	animal.sleep();
	animal.makeNoise();
	animal.eat();
	animal.setName("Цезарь");
	animal.makeNoise();
	System.out.println();

	animal = new Cow("Капелька");
	animal.makeNoise();
	animal.sleep();
	animal.makeNoise();
	animal.eat();
	animal.makeNoise();
	System.out.println();

	animal = new Rabbit("Тоша");
	animal.makeNoise();
	animal.sleep();
	animal.makeNoise();
	animal.eat();
	animal.makeNoise();
	System.out.println();
    }
}
