package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Car,Cars> cars = new HashMap<Car,Cars>();
        cars.put(new Car(12,23),
                new Cars("Camry",2013,"white",1300000));

               cars.put(new Car(11,20),
                       new Cars("Mercedes",2019,"Black",1500005));

               cars.put(new Car(01,12),
                       new Cars("Volga",1999,"White",1800000));
        //System.out.print(cars+"\n");
        System.out.print(cars.entrySet());
    }
}
