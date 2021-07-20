package com.platzi.javatests.Reto2;

public class Reto2 {
    public String fizzBuzz(int i) {

        String num ="";
        if ((i%3==0)&&(i%5==0)){
            return "FizzBuzz";
        }

        if(i%3==0){
            return "Fizz";
        }
        if (i%5==0){
            return "Buzz";
        }

        num =String.valueOf(i);
        return num;
    }
}
