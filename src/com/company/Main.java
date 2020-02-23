package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(canWalking(15, 25));
        System.out.println(canWalking(30, 50));
        System.out.println(canWalking(22, -10));
        System.out.println(canWalking(95, -15));
        System.out.println(canWalking(100, 100));

        int r = generateRandomAge();
        System.out.println(r);


    }

    public static String canWalking(int ageMan, int temperature) {
        if (ageMan > 20 && ageMan < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (ageMan < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (ageMan > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random rand = new Random();
        int i = rand.nextInt(50)+1;
        return i;

    }
}

