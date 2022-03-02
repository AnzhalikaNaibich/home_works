package com.home_works.HomeWork4.Skazka.classes;

public  class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void say(int j){
         switch (j) {
             case 1:
                 System.out.println(name + ": " + "Отпусти ты, старче, меня в море,\n" +
                         "Дорогой за себя дам откуп:\n" +
                         "Откуплюсь чем только пожелаешь");
                 break;
             case 2:
                 System.out.println(name + ": " + "Чего тебе надобно, старче?");
                 break;
             case 3:
                 System.out.println(name + ": " + "Не печалься, ступай себе с богом,\n" +
                         "Будет вам новое корыто");
                 break;
             case 4:
                 System.out.println(name + ": " + "Не печалься, ступай себе с богом,\n" +
                         "Так и быть: изба вам уж будет");
                 break;
             case 5:
                 System.out.println(name + ": " + "Не печалься, ступай себе с богом");
                 break;
             case 6:
                 System.out.println(name + ": " + "Не печалься, ступай себе с богом!\n" +
                         "Добро! будет старуха царицей!");
                 break;

         }

     }
}
