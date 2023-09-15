package task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Box<Apple> boxApples1 = new Box<>(new ArrayList<>());
        Box<Apple> boxApples2 = new Box<>(new ArrayList<>());
        Box<Orange> boxOranges1 = new Box<>(new ArrayList<>());
        Box<Orange> boxOranges2 = new Box<>(new ArrayList<>());

        boxApples1.addFruitsBox(new Apple()); // добавляем фрукт в коробку
        boxApples1.addFruitsBox(new Apple()); // добавляем фрукт в коробку
        boxApples1.addFruitsBox(new Apple()); // добавляем фрукт в коробку

        for (int i = 0; i < 5; i++) {
            boxOranges2.addFruitsBox(new Orange());  // добавляем фрукты в коробку
        }

        for (int i = 0; i < 2; i++) {
            boxOranges1.addFruitsBox(new Orange()); // добавляем фрукты в коробку
        }

        System.out.println(boxApples1.getWeightBox()); // вывожу вес коробок
        System.out.println(boxApples2.getWeightBox()); // вывожу вес коробок
        System.out.println(boxOranges1.getWeightBox()); // вывожу вес коробок
        System.out.println(boxOranges2.getWeightBox()); // вывожу вес коробок

        System.out.println(boxApples1.compare(boxOranges1)); // сравниваю вес коробок
        System.out.println(boxOranges1.compare(boxOranges2)); // сравниваю вес коробок

        boxApples1.moveFruit(boxApples2); // переложил фрукты из одной коробки в другую

        System.out.println(boxApples1.getWeightBox());
        System.out.println(boxApples2.getWeightBox());
    }
}
