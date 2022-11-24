package com.collections.lists.homework;

import com.collections.arrays.homework.CarUtils;
import com.collections.interfaces.homework.Car;
import com.collections.interfaces.homework.Ford;
import com.collections.interfaces.homework.Mazda;
import com.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel(45));
        cars.add(new Mazda(20));
        cars.add(new Ford(17));

        cars.remove(2);
        cars mazda = new Mazda(20));
        cars.remove(mazda);


        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
