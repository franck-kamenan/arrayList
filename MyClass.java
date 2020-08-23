package be.intecbrussel.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyClass
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("VW");
        cars.add("Audi");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(0));
        cars.set(2, "Opel");
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }
        for (String i: cars)
        {
            System.out.println(i);
        }
        cars.clear();
        System.out.println(cars);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        for (Integer i: numbers)
        {
            System.out.println(i);
        }
    }
}
