//package com.example.kodillacollections.arrays.homework;
//
//import com.example.kodillacollections.interfaces.homework.Car;
//import com.example.kodillacollections.interfaces.homework.Ford;
//import com.example.kodillacollections.interfaces.homework.Opel;
//import com.example.kodillacollections.interfaces.homework.Mazda;
//
//import java.util.Random;
//
//public class CarsApplication{
//    private static final Random RANDOM = new Random();
//
//        public static void main(String[] args) {
//            Random random = new Random();
//            int n;
//            Car[] cars = new Car[random.nextDouble(15) + 1];
//            for (n = 0; n < cars.length; n++) ;
//            cars[n] = drawCar();
//            for (Car car : cars)
//                CarUtils.describeCar(car);
//        }
//private static Car drawCar(){
//            Random random = new Random();
//            int drawCarKind = random.nextInt();
//            double a = getRandomSpeed(random);
//            if (drawCarKind == 0)
//                return new Mazda(a);
//            else if (drawCarKind == 1)
//            return new Opel(a);
//            else {
//                double b = getRandomSpeed(random);
//                double c = getRandomSpeed(random);
//                return new Ford(a);
//
//            }
//}
//            private static double getRandomSpeed(Random random){
//                return random.nextDouble() * 100 + 1;
//    }
//
//}
