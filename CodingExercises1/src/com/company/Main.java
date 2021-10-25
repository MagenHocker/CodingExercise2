package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------Number Palindrome Test---------------");
        System.out.println(NumberPalindrome.isPalindrome(11));

        System.out.println("\n---------------First Last Digit Sum Test---------------");
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-5));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(121));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(2002));

        System.out.println("\n--------------- Shared Digit ---------------");
        System.out.println(SharedDigit.hasSharedDigit(12, 23)); //true
        System.out.println(SharedDigit.hasSharedDigit(4000, 1004)); //true
        System.out.println(SharedDigit.hasSharedDigit(30, 21)); //false
        System.out.println(SharedDigit.hasSharedDigit(-1, 23)); //false
        System.out.println(SharedDigit.hasSharedDigit(12, 100)); //false

        System.out.println("\n--------------- Number to Words ---------------");
        NumberToWords.numberToWords(10);
        NumberToWords.numberToWords(100);
        NumberToWords.numberToWords(123);

        System.out.println("\n--------------- Flour Packer ---------------");
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));

        System.out.println("\n--------------- Diagonal Star ---------------");
        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);



    }
}
