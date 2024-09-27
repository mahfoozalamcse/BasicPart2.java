import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Conditional statement
        // if else

//        int age = 17;
//        if(age >= 18) {
//            System.out.println("adult : drive");
//        }
//        if(age > 12 && age < 18){
//            System.out.println("teenager");
//        }else {
//            System.out.println("not adult");
//        }

        // print largest of two number

//        int a =12;
//        int b =13;
//        if(a >= b){
//            System.out.println("A is Largest");
//        }else {
//            System.out.println("B is Largest");
//        }

        // Print Even and Odd

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if(a % 2 == 0){
//            System.out.println("Number is even " + a);
//        }else{
//            System.out.println("Number is odd " + a);
//        }

        // else if Statement

//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age <= 18){
//            System.out.println("teenager");
//        } else if (age <= 30) {
//            System.out.println("adult");
//        }else {
//            System.out.println("older");
//        }

        // Income Tax Calculator

//        Scanner sc = new Scanner(System.in);
//        int income = sc.nextInt();
//        float tax = 0;
//        if(income < 5){
//            tax = 0;
//        } else if (income >= 5 && income < 10) {
//            tax =(float) (income*0.2);
//        }else {
//            tax = (float) (income*0.3);
//        }
//        System.out.println("Your Tax is " + tax);

        // Print Largest in 3 number

//        int a = 2, b = 23, c = 1;
//        if((a >= b) && (a >= c)){
//            System.out.println("A is Largest");
//
//        } else if (b>=c) {
//            System.out.println("B is Largest");
//
//        }else {
//            System.out.println("C is Largest");
//        }

        // Ternary Operator

        // variable = condition ? statement1 : statement2

//        int number =20;
//        String type =  ((number%2) == 0) ? "even" : "Odd";
//        System.out.println(type);

        // check Student pass or Fail

//        int marks = 67;
//        String report = marks >= 33 ? "pass" : "fail";
//        System.out.println(report);

        // Switch Statement
        /*
        switch(variable){
        case1:
        case2:
        case3:
        case4:
        default:
        }
         */

//        int number = 7;
//        switch (number){
//            case 1 :
//                System.out.println("Samosa");
//                break;
//            case 2 :
//                System.out.println("Burger");
//                break;
//
//                default :
//                System.out.println("Wee realize in dream");
//        }

        // Make  Calculator

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter b : ");
//        int b = sc.nextInt();
//        System.out.println("Enter Operator : ");
//        char operator = sc.next().charAt(0);
//
//        switch (operator){
//            case '+' :
//                System.out.println(a+b);
//                break;
//            case '-' :
//                System.out.println(a-b);
//                break;
//            case '/' :
//                System.out.println(a/b);
//                break;
//            case '*' :
//                System.out.println(a*b);
//                break;
//            case '%' :
//                System.out.println(a %b);
//                break;
//            default:
//                System.out.println("please give  write input");

 //   }




        // Chapter LOOPS

//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");

        // similar problem occure multiple time than use loops

        // 1. While Loop

        /*
        while(condition){
        // do something
        }
         */

        // print hello world use while loop

//        int count = 0;
//        while (count<=10){
//            System.out.println("Hello World");
//            count++;
//        }
//
//        // print 1 to 10
//        int counter = 1;
//        while (counter <= 10){
//            System.out.println(counter);
//            counter++;
//        }

        // print 1 to n

//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int count = 1;
//        while (count <= number){
//            System.out.print(count + " ");
//            count++;
//        }

//        // print sum n natural number
//        Scanner sc  = new Scanner(System.in);
//        int number = sc.nextInt();
//        int sum = 0;
//        int counter = 1;
//
//        while (counter <= number){
//            sum += counter;
//          //  System.out.println(sum+" ");
//            counter++;
//
//        }
//        System.out.println(sum);
//
//        // dry run code clarity

        // for Loops

        /*
        for(initialization ; condition; updation){
          // do something
          }
         */

//        // print 1 to 10 use for loop
//        int n=10;
//        for(int i=1; i<=n; i++){
//            System.out.println(i);
//        }

        // print square pattern

//        int n = 4;
//        for(int i=0; i<n; i++){
//            System.out.println("****");
//        }

        // print reverse of the number


    }
}