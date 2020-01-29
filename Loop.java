package com.example.java;

/**
 * Created by Joe on
 **/
public class Loop {
    public static void main(String args[]) {
        /*
        * 1
          2 2
          3 3 3
          4 4 4 4
          5 5 5 5 5
        * */
        int[][] board = new int[6][6];

        for (int row = 1; row < 6; row++) {
            for (int col = 1; col < row + 1; col++) {
                board[row][col] = row;
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }
        // second version
        System.out.println();
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
        * 5 4 3 2 1
          4 3 2 1
          3 2 1
          2 1
          1
        * */
        System.out.println();
        int[][] board2 = new int[6][6];
        for (int row = 5; row > 0; row--) {
            for (int col = row; col > 0; col--) {
                board2[row][col] = col;
                System.out.print(board2[row][col] + "\t");
            }
            System.out.println();
        }

        /* Second Version */
        System.out.println();
        for (int i = 1; i < 6; i++) {
            for (int j = 6-i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        *
              *
             * *
            * * *
           * * * *
          * * * * *

        */
        System.out.println();
        for (int i = 0; i < 5; i++) {

            for (int j = 5-i; j > 1; j--) {

                System.out.print(" ");

            }

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }

        /*
        * 1. Write a Java program by using three for loops to
        *   print the following pattern:
            1******
            12*****
            123****
            1234***
            12345**
            123456*
            1234567
        * */
        System.out.println();
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 8; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* 2. */
        System.out.println();
        Loop l = new Loop();
        l.CheckOddEven(4);

        // 3.
        System.out.println();
        l.PrintNumberInWord(6);

        // 4.
        System.out.println();
        l.SumAndAverage();

        // 5.
        System.out.println();
        l.SumOddNumber();
        l.SumCertainNumber();
        l.SumSquareNumber();

        // 6.
        System.out.println();
        System.out.println(l.Product1ToN(10));
        System.out.println(l.Product1ToN(11));
        System.out.println(l.Product1ToN2(10));

        // 7.
        System.out.println();
        l.PrintPattern();

    }

    public void CheckOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE!");
    }

    public void PrintNumberInWord(int number) {
        // nested if
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }

    public void SumAndAverage(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum/100);
    }

    public void SumOddNumber(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum/100);
    }

    public void SumCertainNumber(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum/100);
    }

    public void SumSquareNumber(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int square = i * i;
            sum += square;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum/100);
    }

    public int Product1ToN(int N){
        int mul = 1;
        for (int i = 1; i <= N; i++) {
            mul = mul * i;
        }
        return mul;
    }

    public int Product1ToN2(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N * Product1ToN2(N-1);
        }
    }

    public void PrintPattern() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

}
