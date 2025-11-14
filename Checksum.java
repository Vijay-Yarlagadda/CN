
// Aim: Write a program to implement Checksum
import java.util.*;

public class Checksum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two 8-bit binary numbers:");
        String b1 = sc.next();
        String b2 = sc.next();

        int sum = Integer.parseInt(b1, 2) + Integer.parseInt(b2, 2);

        sum = (sum & 0xFF) + (sum >> 8);

        int checksum = ~sum & 0xFF;

        String checksumBin = String.format("%8s", Integer.toBinaryString(checksum)).replace(' ', '0');

        System.out.println("CheckSum: " + checksumBin);
        sc.close();

    }
}
