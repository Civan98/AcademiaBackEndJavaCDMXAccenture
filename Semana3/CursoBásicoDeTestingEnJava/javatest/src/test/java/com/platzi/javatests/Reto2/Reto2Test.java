package com.platzi.javatests.Reto2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Reto2Test {
    @Test
    public void if_number_is_divisible_by_3_return_fizz() {
        Reto2 fizzbuzz = new Reto2();
        assertThat(fizzbuzz.fizzBuzz(6), is("Fizz"));
    }
    @Test
    public void if_number_is_divisible_by_5_return_buzz() {
        Reto2 fizzbuzz = new Reto2();
        assertThat(fizzbuzz.fizzBuzz(25), is("Buzz"));
    }
    @Test
    public void if_number_is_divisible_by_3_and_5_return_fizzbuzz() {
        Reto2 fizzbuzz = new Reto2();
        assertThat(fizzbuzz.fizzBuzz(30), is("FizzBuzz"));
    }
    @Test
    public void if_number_is_not_divisible_by_3_or_5_return_same_number() {
        Reto2 fizzbuzz = new Reto2();
        assertThat(fizzbuzz.fizzBuzz(11), is("11"));
    }

}