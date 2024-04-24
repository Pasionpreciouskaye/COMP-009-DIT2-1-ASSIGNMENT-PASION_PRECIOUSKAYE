package Mp3;
import java.util.Scanner;

public class MP3Player {

    public void play(String filePath) {
        System.out.println("Playing MP3: " + filePath);
    }

    public static void main(String[] args) {
        MP3Player player = new MP3Player();
        Scanner scanner = new Scanner(System.in);

        String[] mp3Files = {
            "song1.mp3",
            "song2.mp3",
            "song3.mp3"
        };

        System.out.println("Choose an MP3 to play:");
        for (int i = 0; i < mp3Files.length; i++) {
            System.out.println((i + 1) + ". " + mp3Files[i]);
        }

        System.out.print("Enter the number corresponding to the MP3 you want to play: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= mp3Files.length) {
            player.play(mp3Files[choice - 1]);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
