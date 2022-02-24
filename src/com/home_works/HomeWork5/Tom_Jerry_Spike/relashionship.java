package com.home_works.HomeWork5.Tom_Jerry_Spike;

public class relashionship {
    public static void main(String[] args) {
        Dog dog = new Dog("Спайк");
        Cat cat = new Cat("Том");
        Mouse mouse = new Mouse("Джерри");

        mouse.run(cat);
        mouse.beingeaten(cat);

        cat.move(mouse);
        cat.eat(mouse);
        cat.run(dog);
        cat.beingeaten(dog);

        dog.move(cat);
        dog.eat(cat);

    }
}
