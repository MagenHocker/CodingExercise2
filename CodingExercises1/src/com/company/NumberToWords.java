package com.company;

public class NumberToWords {

  public static void numberToWords(int number) {
    int saveNum = number;
    number = reverse(number);
    int count = getDigitCount(saveNum);

    if (number < 0) System.out.println("Invalid Value");

    while (number != 0 ) {
      switch (number % 10) {
        case 0:
          System.out.println("Zero");
          break;
        case 1:
          System.out.println("One");
          break;
        case 2:
          System.out.println("Two");
          break;
        case 3:
          System.out.println("Three");
          break;
        case 4:
          System.out.println("Four");
          break;
        case 5:
          System.out.println("Five");
          break;
        case 6:
          System.out.println("Six");
          break;
        case 7:
          System.out.println("Seven");
          break;
        case 8:
          System.out.println("Eight");
          break;
        case 9:
          System.out.println("Nine");
          break;
      }
      number /= 10;
      count--;
    }

    if (count > 0) {
      while (count != 0) {
        System.out.println("Zero");
        count--;
      }
    }

  }

  public static int reverse(int number) {
    int revNum = 0;
    while (number != 0) {
      int remainder = number % 10;
      revNum = (revNum * 10) + remainder;
      number /= 10;
    }
    return revNum;
  }

  public static int getDigitCount(int number) {
    if (number < 0) return -1;
    if (number == 0) return 1;

    int count = 0;
    while(number != 0) {
      number /= 10;
      ++count;
    }
    return count;

  }

}
