import java.util.Scanner;

public class P4 {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter height: ");
  int height = sc.nextInt();
  sc.close();

  if (height == 0) {
   System.out.println("Error input!");
   System.exit(1);
  }

  char[] letters = { 'A', 'B' };

  for (int i = 0; i < height; i++) {

   for (int x = 0; x < (i + 1); x++) {
    char letter = letters[(x + i) % 2];

    System.out.printf("%c%c", letter, letter);

   }

   System.out.println();

  }
 }
}
