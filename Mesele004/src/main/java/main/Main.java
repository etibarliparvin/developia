package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int max1;
        int max2 = 0;
        for(int i = 0; i < sentence.length(); i++) { // cumlenin butun simvollarini tek tek gezir
            max1 = 0; // her dovr bitdikde max1 sifirlayiriq
            for (int j = 0; j < sentence.length(); j++) { //
                if(sentence.charAt(i) == sentence.charAt(j)) { // burada ilk simvolla qalan diger simvollari muqayise edir
                    max1++; // eger beraberdirse toplayir
                }
            }
            if(max1 > max2) max2 = max1; // burada ise muqayise prosesi gedir. en cox olan simvolu tapir
        }
        System.out.println(max2);
        // sozum acigi aglima gelen ilk metod bu oldu. Inaniramki daha effektiv metod var. Cunki ic ice dovrler hecde suretli yontem hesab olunmur
    }
}
