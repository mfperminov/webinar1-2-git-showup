import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getStringInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public int getIntInput(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public double getDoubleInput(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }
}
