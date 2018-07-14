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
        long randomNumber1 = randomNumberGenerator.generateRandomNumber(randomNumbersRightBorder, randomNumbersLeftBorder);
        long randomNumber2 = randomNumberGenerator.generateRandomNumber(randomNumbersRightBorder, randomNumbersLeftBorder);
        long randomNumber3 = randomNumberGenerator.generateRandomNumber(randomNumbersRightBorder, randomNumbersLeftBorder);
        System.out.println("Random numbers: " + randomNumber1 + "; " + randomNumber2 + "; " + randomNumber3);

        Calculator calculator = new Calculator();
        long sumResult = calculator.sumThreeNumbers(randomNumber1, randomNumber2, randomNumber3);
        System.out.println("Random numbers Sum: " + sumResult);
    }
}
