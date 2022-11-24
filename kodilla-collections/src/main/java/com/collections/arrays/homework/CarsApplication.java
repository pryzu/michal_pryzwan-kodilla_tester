package com.collections.arrays.homework;

import com.collections.interfaces.homework.Car;
import com.collections.interfaces.homework.Ford;
import com.collections.interfaces.homework.Opel;
import com.collections.interfaces.homework.Mazda;

import java.util.Random;

public class CarsApplication{
    private static final Random RANDOM = new Random();

        public static void main(String[] args) {
            Random random = new Random();
            int n;
            Car[] cars = new Car[random.nextInt(15) + 1];
            for (n = 0; n < cars.length; n++){
            cars[n] = drawCar();}
            for (Car car : cars){
                CarUtils.describeCar(car);}
        }
private static Car drawCar(){
            Random random = new Random();
            int drawCarKind = random.nextInt();
            int a = getRandomSpeed(random);
            if (drawCarKind == 0)
                return new Mazda(a);
            else if (drawCarKind == 1)
            return new Opel(a);
            else{
                return new Ford(a);

            }
}
            private static int getRandomSpeed(Random random){
                return (int) (random.nextDouble() * 100+1);
    }

}
