// Aim: Write a program to implement Character Stuffing.

import java.util.*;

class CharacterStuffing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = sc.next();

        System.out.println("Original data: " + input);

        StringBuilder stuffedData = new StringBuilder();
        char ESC = (char) 0x7D;
        char FLAG = (char) 0x7E;

        for (char ch : input.toCharArray()) {
            if (ch == FLAG) {
                stuffedData.append(ESC);
                stuffedData.append((char) (ch ^ 0x20));
            } else {
                stuffedData.append(ch);
            }
        }

        System.out.println("Stuffed Data: " + stuffedData.toString());
        sc.close();
    }
}