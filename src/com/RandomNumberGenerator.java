package com;

public class RandomNumberGenerator {
    public long generateRandomNumber(long randomNumbersRightBorder, long randomNumbersLeftBorder){
       long randomNumber = (long)(Math.random()*((randomNumbersRightBorder-randomNumbersLeftBorder)+1))+randomNumbersLeftBorder;
        return randomNumber;
    }
}
