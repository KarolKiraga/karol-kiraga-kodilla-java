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
        OddNumbersExterminator theListTester = new OddNumbersExterminator();

        for(int x = 0; x < 20 ;x++ ){
            theList.add(x);
        }

        ArrayList<Integer> givenList = new ArrayList<>();
        givenList.add(0);
        givenList.add(2);
        givenList.add(4);
        givenList.add(6);
        givenList.add(8);
        givenList.add(10);
        givenList.add(12);
        givenList.add(14);
        givenList.add(16);
        givenList.add(18);


        //When
        ArrayList<Integer> result = theListTester.exterminate(theList);
        System.out.println("Testing: if contains odd and even numbers");
        //Then
        Assert.assertEquals(givenList, result);
    }

}
