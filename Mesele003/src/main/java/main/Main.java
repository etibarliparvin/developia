package main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        int[] numbers = new int[101];
        int[] arrays = new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(max - min) + min;
            arrays[i] = randomNumber;
            numbers[randomNumber]++;
        }

        for(int i = 1; i < 101; i++) {
            System.out.println(i + " -ededinden " + numbers[i] + " ededdir");
        }
    }
}
