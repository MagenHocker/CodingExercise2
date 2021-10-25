package com.company;

public class DiagonalStar {

  public static void printSquareStar(int number) {
    if (number < 5) {
      System.out.println("Invalid Value");

    } else {
      for (int row = number; row > 0; row--) {
        for (int column = number; column > 0; column--) {
          if (row == 1 || row == number) {
            System.out.print("*");
          } else if (column == 1 || column == number) {
            System.out.print("*");
          } else if (row == column) {
            System.out.print("*");
          } else if (column == (number - row) + 1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }

  }

}
