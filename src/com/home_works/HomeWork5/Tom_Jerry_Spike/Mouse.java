package com.home_works.HomeWork5.Tom_Jerry_Spike;

public class Mouse extends Animal{

    public Mouse(String name) {
        super(name);
    }

    public void beingeaten(Animal goal) {
        System.out.println(getName() + " может быть съеден " + goal.getName());
    }
    public void run(Animal goal) {
        System.out.println(getName() + " может убегать от " + goal.getName());
    }
}
