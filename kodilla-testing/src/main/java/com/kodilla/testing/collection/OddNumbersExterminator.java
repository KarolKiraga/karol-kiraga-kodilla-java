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




}
