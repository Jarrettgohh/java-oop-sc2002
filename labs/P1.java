/*
Write a program that reads a character from the user and then uses a switch statement to achieve what
the following if statement does.
 if ((choice == ‘A’) || (choice == ‘a’))
 printf(“Action movie fan\n”);
 else if ((choice == ‘C’) || (choice == ‘c’))
 printf(“Comedy movie fan\n”);
 else if ((choice == ‘D’) || (choice == ‘d’))
 printf(“Drama movie fan\n”);
 else
 printf(“Invalid choice\n”); 
*/

import java.util.Scanner;

public class P1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter character: ");

    char character = sc.next().charAt(0);

    switch (character) {
      case 'A', 'a':
        System.out.println("Action movie fan\n");
        break;

      case 'C', 'c':
        System.out.println("Comedy movie fan\n");
        break;

      case 'D', 'd':
        System.out.println("Drama movie fan\n");
        break;

      default:
        System.out.println("Invalid choice\n");
        break;
    }

    sc.close();

  }
}