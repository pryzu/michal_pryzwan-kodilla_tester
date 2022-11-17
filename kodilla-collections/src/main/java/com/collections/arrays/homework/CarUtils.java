//package com.example.kodillacollections.arrays.homework;
//
//import com.example.kodillacollections.interfaces.homework.Car;
//import com.example.kodillacollections.interfaces.homework.Ford;
//import com.example.kodillacollections.interfaces.homework.Opel;
//import com.example.kodillacollections.interfaces.homework.Mazda;
//
//public class CarUtils {
//    private static com.example.kodillacollections.interfaces.homework.Car Car;
//
//    public static void describeCar(Car car) {
//        System.out.println("--------------------");
//        System.out.println("Car kind: " + getCarName(Car));
//        System.out.println("Car Speed: " + car.getSpeed());
//        System.out.println("Car increaseSpeed: " + car.getIncreaseSpeed());
//        System.out.println("Car decreaseSpeed: " + car.getDecreaseSpeed());
//    }
//    public static String getCarName (Car car){
//        if (car instanceof Mazda)
//            return "Mazda";
//        else if (car instanceof Ford)
//            return "Ford";
//        else if (car instanceof Opel)
//                    return "Opel";
//        else
//            return "Unknown Car name";
//
//        }
//
//    }
