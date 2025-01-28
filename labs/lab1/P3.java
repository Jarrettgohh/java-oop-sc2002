/*
 Expected outputs:
(1) starting : 1, ending : 5, increment : 1;
US$    S$
--------------
1     1.82
2     3.64
3     5.46
4     7.28
5     9.1
 */

import java.util.Scanner;

public class P3 {
 public static void main(String[] args) {
  double rate = 1.82;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter starting: ");
  int starting = sc.nextInt();

  System.out.print("Enter ending: ");
  int ending = sc.nextInt();

  System.out.print("Enter increment: ");
  int increment = sc.nextInt();

  sc.close();

  if (starting > ending || (ending - starting) % increment != 0) {

   System.out.println("Error input!");
   System.exit(1);
  }

  System.out.println("US$     S$");
  System.out.println("--------------");

  System.out.println("FOR LOOP");
  for (int i = starting; i <= ending; i += increment) {
   double conv = i * rate;
   System.out.printf("%d      %.3g\n", i, conv);
  }
  System.out.println();

  System.out.println("WHILE LOOP");

  int i = starting;

  while (i <= ending) {
   double conv = i * rate;
   System.out.printf("%d      %.3g\n", i, conv);

   i += increment;
  }
  System.out.println();

  System.out.println("DO/WHILE LOOP");

  int x = starting;

  do {
   double conv = x * rate;
   System.out.printf("%d      %.3g\n", x, conv);

   x += increment;
  } while (x <= ending);
  System.out.println();

 }

}
