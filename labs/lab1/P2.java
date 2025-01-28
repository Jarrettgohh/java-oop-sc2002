/*
 The salary scheme for a company is given as follows:
Salary range for grade A: $700 - $899
Salary range for grade B: $600 - $799
Salary range for grade C: $500 - $649

A person whose salary is between $600 and $649 is in grade C if his merit points are below 10,
otherwise he is in grade B. A person whose salary is between $700 and $799 is in grade B if his merit
points are below 20, otherwise, he is in grade A. Write a program to read in a person’s salary and his
merit points, and displays his grade.
 */

import java.util.Scanner;

public class P2 {
 public static void main(String[] args) {
  // declare Scanner object used by the next two inputs
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter salary: ");
  int salary = sc.nextInt();

  System.out.print("Enter merit points: ");
  int merit = sc.nextInt();

  // default grade 'A'
  char grade = 'A';

  if (600 <= salary && salary <= 649) {

   grade = merit < 10 ? 'C' : 'B';

  } else if (700 <= salary && salary <= 799) {

   grade = merit < 20 ? 'B' : 'A';
  }

  sc.close();

  System.out.printf("Grade %c", grade);

 }

}
