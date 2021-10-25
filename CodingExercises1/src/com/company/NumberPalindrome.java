package com.company;

public class NumberPalindrome {

  public static boolean isPalindrome(int number) {
    // I would use a hashmap in reality here and cross reference the corresponding digit was we iter
    int reverse = 0;
    int saveNum = number;
    while (number != 0) {
      int lastDigit = number % 10;
      reverse *= 10;
      reverse += lastDigit;
      number /= 10;
    }

    return reverse == saveNum;

  }

}
