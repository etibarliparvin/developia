package main;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 7 == 0) { // yeddiye qaliqsiz bolmeni yoxlyir. % iware umumiyyetle bolunme zamani qaligi qaytarir
                System.out.print(i + " ");
            }
        }
    }
}
