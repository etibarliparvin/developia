package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        String regex = "\\,+|\\.+|\\s+"; // regexdir ve bir veya bir nece vergul noqte ve boqluqlara gore cumleni bolecek
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] elements = sentence.split(regex);
        for (int i = 0; i < elements.length; i++) {
            if (!elements[i].trim().isEmpty()) { // ilk once qalan bowluqlari kesir sonra ise bow olub olmadigini yoxlayir (! iware ise eksi bildirir)
                count++;
            }
        }
        System.out.println(count);

//        Scanner input = new Scanner(System.in);
//        String sentence = input.nextLine();
//        Pattern pattern = Pattern.compile("[\\w-]+");
//        Matcher matcher = pattern.matcher(sentence);
//        int count = 0;
//        while (matcher.find())
//            count++;
//        System.out.println(count);

        // commentlenmiw hisse arawdirmadan sonra aglima geldi ve yazdim
    }
}
