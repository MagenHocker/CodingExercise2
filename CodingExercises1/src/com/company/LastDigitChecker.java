package com.company;

public class LastDigitChecker {

  /**
   * Determines if at least one int within the range [10-1000] has a common ones place digit
   * @param i int 1
   * @param j int 2
   * @param k int 3
   * @return a bool true if there is a common ones place digit amongst at least 2 of the ints
   */
  public static boolean hasSameLastDigit(int i, int j, int k) {
    if (i < 10 || i > 1000) return false;
    if (j < 10 || j > 1000) return false;
    if (k < 10 || k > 1000) return false;

    return (i%10 == j%10 || i%10 == k%10 || j%10 == k%10);

  }

  public static boolean isValid(int i) {
    return i >= 10 && i <= 1000;
  }
}
