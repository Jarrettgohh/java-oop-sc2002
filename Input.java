import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Waiting for input...");
        System.out.print(sc.next().charAt(1));

        sc.close();
    }
}
