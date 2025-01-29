import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            System.out.println();

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    mulTest(sc);
                    break;
                case 2:
                    divide(4, 7);
                    divide(7, 7);
                    divide(25, 7);
                    System.out.println();
                    break;

                case 3:
                    modulus(4, 7);
                    modulus(7, 7);
                    modulus(25, 7);
                    System.out.println();
                    break;

                case 4:
                    countDigits(-12);
                    countDigits(123);
                    countDigits(121456);
                    System.out.println();
                    break;

                case 5: /* add position() call */
                    break;
                case 6: /* add extractOddDigits() call */
                    break;
                case 7:
                    System.out.println("Program terminating…");

            }
        } while (choice < 7);

        sc.close();

    }

    public static void mulTest(Scanner sc) {

        int correctCount = 0;

        for (int x = 0; x < 5; x++) {

            double ran1 = Math.random();
            double ran2 = Math.random();

            long ranLong1 = Math.round(ran1 * 10);
            long ranLong2 = Math.round(ran2 * 10);

            long expected = ranLong1 * ranLong2;

            System.out.printf("How much is %d times %d? ", ranLong1, ranLong2);
            long ans = sc.nextInt();

            if (expected == ans) {

                correctCount++;

            }

        }

        System.out.printf("\n%d out of 5 are correct\n\n", correctCount);

    }

    public static void divide(int m, int n) {

        int x = m;
        int count = 0;

        do {

            x -= n;

            if (x >= 0)
                count++;

        } while (x > 0);

        System.out.printf("%d/%d = %d\n", m, n, count);

    }

    public static void modulus(int m, int n) {

        int x = m;

        while (x - n >= 0) {
            x -= n;
        }

        System.out.printf("%d %% %d: %d\n", m, n, x);

    }

    public static void countDigits(int n) {

    }

}