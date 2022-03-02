package com.home_works.HomeWork4.Skazka;

import com.home_works.HomeWork4.Skazka.classes.Animal;
import com.home_works.HomeWork4.Skazka.classes.Human;

public class Fairytale {
    public static void main(String args[]){
        Human grandfather = new Human("Starik", "male", 85);
        Human grandmother = new Human("Staruha","female", 85);
        Animal fish = new Animal("Fish");
        fish.say(1);
        System.out.println();
        grandfather.say(1, grandfather.getName());
        System.out.println();
        grandfather.say(2, grandfather.getName());
        System.out.println();
        grandmother.say(3, grandmother.getName());
        System.out.println();
        fish.say(2);
        System.out.println();
        grandfather.say(4, grandfather.getName());
        System.out.println();
        fish.say(3);
        System.out.println();
        grandmother.say(5, grandmother.getName());
        System.out.println();
        fish.say(2);
        System.out.println();
        grandfather.say(6, grandfather.getName());
        System.out.println();
        fish.say(4);
        System.out.println();
        grandmother.say(7, grandmother.getName());
        System.out.println();
        fish.say(2);
        System.out.println();
        grandfather.say(8, grandfather.getName());
        System.out.println();
        fish.say(5);
        System.out.println();
        grandfather.say(9, grandfather.getName());
        System.out.println();
        grandmother.say(10, grandmother.getName());
        System.out.println();
        grandfather.say(11, grandfather.getName());
        System.out.println();
        grandmother.say(12, grandmother.getName());
        System.out.println();
        fish.say(2);
        System.out.println();
        grandfather.say(13, grandfather.getName());
        System.out.println();
        fish.say(6);
        System.out.println();
        grandfather.say(14, grandfather.getName());
        System.out.println();
        grandmother.say(15, grandmother.getName());
        System.out.println();
        fish.say(2);
        System.out.println();
        grandfather.say(16, grandfather.getName());
        System.out.println();
        System.out.println("Ничего не сказала рыбка,\n" +
                "Лишь хвостом по воде плеснула\n" +
                "И ушла в глубокое море.\n" +
                "Долго у моря ждал он ответа,\n" +
                "Не дождался, к старухе воротился —\n" +
                "Глядь: опять перед ним землянка;\n" +
                "На пороге сидит его старуха,\n" +
                "А пред нею разбитое корыто.");
    }
}
