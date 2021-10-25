package com.company;

public class FlourPacker {

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) return false; // values are neg
    if(bigCount*5 + smallCount < goal) return false; // Supply is greater than demand

    return (goal%5 <= smallCount);
  }

}
