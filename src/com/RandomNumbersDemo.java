package com;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbersDemo {
    public static void main(String[] args) {
        System.out.println("Please input random numbers left border (integer number): ");
        Scanner scanner = new Scanner(System.in);
        int randomNumbersLeftBorder = scanner.nextInt();
        System.out.println("Please input random numbers right border (integer number): ");
        int randomNumbersRightBorder = scanner.nextInt();

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        long firstRandomNumber = randomNumberGenerator.generateRandomNumber(randomNumbersRightBorder, randomNumbersLeftBorder);
        long secondRandomNumber = randomNumberGenerator.generateRandomNumber(randomNumbersRightBorder, randomNumbersLeftBorder);
        long thirdRandomNumber = randomNumberGenerator.generateRandomNumber(randomNumbersRightBorder, randomNumbersLeftBorder);
        System.out.println("Random numbers: " + firstRandomNumber + "; " + secondRandomNumber + "; " + thirdRandomNumber);

        Calculator calculator = new Calculator();
        long sumResult = calculator.sumThreeNumbers(firstRandomNumber, secondRandomNumber, thirdRandomNumber);
        System.out.println("Random numbers Sum: " + sumResult);
    }
}
