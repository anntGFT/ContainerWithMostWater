package com.example;

import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    int result;
    int[] height;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void noHeight(){

        result = 0;
        height = new int[] {0,0};

        assertEquals(result, solution.maxArea(height));
    }

    @Test
    public void TwoNumbersInHeight(){

        result = 3;
        height = new int[] {4,3};

        assertEquals(result, solution.maxArea(height));
    }

    @Test
    public void NineNumbersInHeight(){

        result = 49;
        height = new int[] {1,8,6,2,5,4,8,3,7};

        assertEquals(result, solution.maxArea(height));
    }
}
