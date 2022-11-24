package com.collections.arrays.homework;

import com.collections.interfaces.homework.Car;
import com.collections.interfaces.homework.Ford;
import com.collections.interfaces.homework.Opel;
import com.collections.interfaces.homework.Mazda;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("--------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car Speed: " + car.getSpeed());
    }
    public static String getCarName (Car car){
        if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
                    return "Opel";
        else
            return "Unknown Car name";

        }

    }
