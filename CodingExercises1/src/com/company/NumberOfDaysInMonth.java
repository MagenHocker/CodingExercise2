package com.company;

public class NumberOfDaysInMonth {

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999 )
    {
      return false;
    }

    return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

  }

  public static int getDaysInMonth(int month, int year) {
    if (month <= 0 || month > 12 || year < 1 || year > 9999) {
      return -1;
    }

    // 31 - jan, march, may, july, aug, oct, dec
    // 30 - feb, april, june, sept, nov
    // 29 - Leap year and Feb

    if (!isLeapYear(year) || isLeapYear(year) && month != 2) {
      switch(month) {
        case 2:
          return 28;
        case 4: case 6: case 9: case 11:
          return 30;
        default:
          return 31;
      }
    }
    else {
      return 29;
    }

  }
}
