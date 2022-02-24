package com.home_works.HomeWork5.Tom_Jerry_Spike;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    public void eat(Animal goal){

        System.out.println(getName() + " может съесть " + goal.getName());
    }
    public void move(Animal goal){

        System.out.println(getName() + " может догнать " + goal.getName());
    }
    public void beingeaten(Animal goal){

        System.out.println(getName() + " может быть съеден " + goal.getName());
    }
    public void run(Animal goal){

        System.out.println(getName() + " может убегать от " + goal.getName());
    }
}
