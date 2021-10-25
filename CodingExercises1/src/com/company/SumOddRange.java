package com.company;

public class SumOddRange {

  /**
   * Determines if a number is odd and non negative
   * @param number the number to be checked
   * @return a boolean true if it is odd
   */
  public static boolean isOdd(int number) {
    return number >= 0 && number % 2 != 0;
  }

  /**
   * Sums all of the odd numbers on a given range
   * @param start an int that represents inclusively the left side of the range
   * @param end an int that represents inclusively the right side of the range
   * @return an int represent the sum of all the odds
   */
  public static int sumOdd(int start, int end) {

    if ((!(end >= start)) || (start == 0 && end == 0) || start < 0) {
      return -1;
    }

    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (isOdd(i)) {
        sum += i;
      }
    }
    return sum;
  }

}
