package com.kodilla.testing;

        import com.kodilla.testing.calculator.Calculator;
        import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test Calculator");

        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();


        int sumTest = calculator.add(3,2) - 2;
        int subtractTest = calculator.subtract(8,4) + 4;

        if (sumTest == 3){

            System.out.println("Correct add operation");
        }
        else{

            System.out.println("Incorrect add operation");
        }

        if (subtractTest == 8){

            System.out.println("Correct subtract operation");
        }
        else{

            System.out.println("Incorrect subtract operation");
        }
    }
}