package in.kgcoding.challenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Division Calculator \n");
        System.out.println("please enter your number");
        int first=input.nextInt();
        System.out.println("please enter your number");
        int second=input.nextInt();
        try {
         int Result = first/second;
          System.out.printf("Result is %d" , Result);
           }
          catch(ArithmeticException exception){
         if (exception.getMessage().equals("/ by zero")){
            System.out.println("Divide by zero occurred");
         } else {
            throw exception;
              }
           }
    
       } 
    }
