package com.company;

public class PerfectNumber {

  /**
   * Determines if a number is a perfect number
   * @param number int -- the number to check if it is perfect
   * @return a bool true if number is perfect
   */
  public static boolean isPerfectNumber(int number) {
    if (number < 1) return false;
    int sum = 0;
    for (int i = 1; i <= number/2; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum == number;
  }

}
