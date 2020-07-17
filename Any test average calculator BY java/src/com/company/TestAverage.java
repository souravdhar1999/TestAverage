package com.company;
import java.util.Scanner;
public class TestAverage{
    public static void main(String[] args) {
        System.out.println("                                This program will calculate your final test average                 ");
        Scanner scanner= new Scanner(System.in);
        System.out.println(" How many test you took:- ");
        int numsize= scanner.nextInt();
        int array[]=new int[numsize];

        int g= 1;
        for(int i =0; i< array.length; i++){
            System.out.println(" Type the number " + g++ + " test");
            array[i]=scanner.nextInt();

        }
        System.out.println(" All your test score is ");


        int k=1;
        int sum=0;

        for(int j =0; j<array.length;j++){
            System.out.println(" Your " + k+++ " test score is :" + array[j] );
            sum= sum+array[j];
        }

        System.out.println(" THe sum of your test score is " + sum);
        System.out.println(" ");
        int average= sum/numsize;
        System.out.println(" The average of your test is " + average);
        System.out.println(" ");

        if(average>=90){
            System.out.println(" Congrats your average is A. ");
        }

        else if(average<90 && average>=80){
            System.out.println(" Welldone your average is B ");

        }

        else if(average<80 && average>=70){
            System.out.println("  Your average is c ");
             System.out.println("  Your average is c ");
            

        }


        else if(average<70 && average>=60){
            System.out.println(" Your average is D ");

        }

        else{
            System.out.println(" Sorry you failed");
        }






    }
}
