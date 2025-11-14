import java.util.Scanner;

public class StopAndWait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int frames;
        System.out.print("Enter number of frames to send: ");
        frames = sc.nextInt();

        for (int i = 1; i <= frames; i++) {
            System.out.println("Sender: Sending frame " + i);

            // Simulating acknowledgment
            System.out.println("Receiver: Frame " + i + " received");
            System.out.println("Receiver: Sending ACK for frame " + i);
            System.out.println("Sender: ACK for frame " + i + " received\n");
        }

        System.out.println("All frames sent successfully!");
        sc.close();
    }
}