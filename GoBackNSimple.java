// Aim: Write a program to implement Sliding Window Protocol for Go-Back-N.

import java.util.*;

class GoBackNSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total frames and window size
        System.out.print("Enter total number of frames: ");
        int totalFrames = sc.nextInt();

        System.out.print("Enter window size: ");
        int windowSize = sc.nextInt();

        int sent = 0;

        // Sliding Window Transmission
        while (sent < totalFrames) {
            // Send frames in the current window
            for (int i = 0; i < windowSize && sent < totalFrames; i++) {
                System.out.println("Sent frame: " + (sent + 1));
                sent++;
            }

            // Simulate ACK reception
            System.out.print("Enter last ACK received (-1 for error): ");
            int ack = sc.nextInt();

            if (ack == -1) {
                // Error: resend from last sent frame
                System.out.println("Error: Resending from frame " + sent);
            } else {
                // Move window forward
                sent = ack;
            }
        }

        System.out.println("All frames sent successfully.");
        sc.close();
    }
}