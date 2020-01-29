package com.example.java;

import java.util.Scanner;

/**
 * Created by Yuqi Zhou on
 **/
public class Assignment {
    public void getPollution() {
        int currentPopulation = 312032486;
        int secondForYrs = 365 * 24 * 60 * 60;

        int birthPollution = 7;
        int deathPollution = 13;
        int immigrantPollution = 45;

        int birthPollutionForYr = secondForYrs / birthPollution;
        int deathPollutionForYr = secondForYrs / deathPollution;
        int immigrantPollutionForYr = secondForYrs / immigrantPollution;

        int incrementalbirthPollution = currentPopulation;
        int incrementaldeathPollution = currentPopulation;
        int incrementalimmigrantPollution = currentPopulation;

        for (int i = 1; i < 6; i++) {
            incrementalbirthPollution += birthPollutionForYr;
            incrementaldeathPollution += deathPollutionForYr;
            incrementalimmigrantPollution += immigrantPollutionForYr;

            System.out.println(i + " year birth pollution " + incrementalbirthPollution);
            System.out.println(i + " year death pollution " + incrementaldeathPollution);
            System.out.println(i + " year immigrant pollution " + incrementalimmigrantPollution);
        }
    }

    public void addTwoNums(int num1, int num2) {
        System.out.println("The sum of 2 numbers is " + (num1 + num2));
    }

    public void temperatureConversion() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        int c = in.nextInt();
        double f = (9.0 / 5) * c + 32;
        System.out.println(c + " Celsius is " + f + " Fahrenheit");
    }
}
