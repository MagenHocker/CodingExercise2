package com.company;
import java.util.Scanner;

public class InputCalculator {

  /**
   * The user enters a series of numbers that are averaged and summed, the program returns those
   * averages and sums when the user enters something other than a number
   */
  public static void inputThenPrintSumAndAverage() {

    double mean = 0;
    int sum = 0;
    int count = 0;

    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a number: ");
      boolean hasNextInt = scan.hasNextInt();

      if (hasNextInt) {
        int i = scan.nextInt();
        count++;
        sum += i;
        mean = (double) sum / count;
      }
      else {
        System.out.println("SUM = " + sum + " AVG = " + Math.round(mean));
        break;
      }
    }
  }
}
