package com.home_works.HomeWork5.Tom_Jerry_Spike;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void eat(Animal goal){

        System.out.println(getName() + " может съесть " + goal.getName());
    }
    public void move(Animal goal){

        System.out.println(getName() + " может догнать " + goal.getName());
    }
}
