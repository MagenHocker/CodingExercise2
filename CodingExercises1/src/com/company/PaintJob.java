package com.company;

public class PaintJob {

  /**
   * This method determines how many buckets of paint a painter has to buy given the area (m^2) and
   * the amount of buckets the painter already has at home
   * @param width a double representing the width of the wall they are painting
   * @param height a double representing the height of the wall they are painting
   * @param areaPerBucket a double representing the area that
   *                      can be covered with one bucket of paint
   * @param extraBucket an int representing the number of buckets the painter has at home
   * @return an int of how many buckets of paint the painter must buy
   */
  public static int getBucketCount(double width, double height,
      double areaPerBucket, int extraBucket) {

    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) return -1;

    double totalArea = width * height; // total area needed to be painted
    double bucketsNeeded = totalArea / areaPerBucket; // total number of buckets needed

    return (int) Math.ceil(bucketsNeeded - extraBucket);

  }

  /**
   * Ditto ^^^^ but w/o a reserve of paint
   * @param width
   * @param height
   * @param areaPerBucket
   * @return
   */
  public static int getBucketCount(double width, double height,
      double areaPerBucket) {

    if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

    double totalArea = width * height; // total area needed to be painted
    double bucketsNeeded = totalArea / areaPerBucket; // total number of buckets needed

    return (int) Math.ceil(bucketsNeeded);

  }

  /**
   * Determines the amount of buckets of paint needed for a given area
   * @param area a double representing the area needing to be covered
   * @param areaPerBucket a double representing the area 1 bucket can cover
   * @return the number of buckets needed for that area
   */
  public static int getBucketCount(double area, double areaPerBucket) {
    if (area <= 0 || areaPerBucket <= 0) return -1;

    return (int) Math.ceil(area/areaPerBucket);
  }

}
