package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator emptyTester = new OddNumbersExterminator();
        //When
        boolean result =  emptyTester.exterminate(emptyList).isEmpty();
        System.out.println("Testing: if it's empty: " + result);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> theList = new ArrayList<>();

        for(int x = 0; x < 50 ;x++ ){
            theList.add(x);
        }

        OddNumbersExterminator theListTester = new OddNumbersExterminator();
        //When

        int result = theListTester.exterminate(theList).get(1);
        System.out.println("Testing: if contains odd and even numbers");
        //Then
        Assert.assertEquals(2, result);
    }

}
