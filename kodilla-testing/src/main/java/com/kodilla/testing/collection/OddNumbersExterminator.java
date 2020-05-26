package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();



        for(int i=0;i < numbers.size(); i++) {

            if(numbers.get(i)%2 == 0){
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }

   /* public static void main(String[] args) {
        ArrayList<Integer> givenList = new ArrayList<>();
        int number = 0;
        for(int i = 0; i < 10; i++){

            givenList.add(i,number);
            number = number + 2;


        }
        ArrayList<Integer> theList = new ArrayList<>();

        for(int x = 0; x < 50 ;x++ ){
            theList.add(x);
        }
        System.out.println(theList);
        System.out.println(givenList);


    }*/


}
