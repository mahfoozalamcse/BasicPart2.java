import  java.util.*;

public class Function {
//    public static void printHello(){
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("hello");
//    }

    // Syntax

    /*
    returnType name(type param1, type param2){
    // body
    return statement
    }
     */

//    public static void calculateSum(int a, int b){
//        int sum = a + b;
//        System.out.println("Sum is : " + sum);
//    }

//    public static int calculateSum(int a, int b){
//       int sum = a + b;
//      //  System.out.println("Sum is : " + sum);
//        return  sum;
//    }

    // what happened in memory know on page and pen
    // stack store understand

    // swap and understand call by value

//    public static void swap(int a, int b){
//        int temp = a;
//        a  = b;
//        b = temp;
//        System.out.println("after swap a : " + a);
//        System.out.println("after swap b : " + b);
//
//    }

    // call by value understand

//public static void swap(int a, int b){
//    int temp = a;
//    a  = b;
//    b = temp;
//
//    // here not swap because pass copy so work on always call by value pass in java
//    // when print in main than not swap
//
//}


    // product of a & b

    public static int product(int a, int b){
        int multiple = a * b;
        return  multiple;
    }

    // factorial of number

    public static int factorial(int n){
        int fact = 1;

        for(int i=1; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }

    // Binomial Coefficient
    // ncr
    // n!/ r!*(n-r)!

    public static int Binomial(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int BinomialCoff = n_fact/ (r_fact*nmr_fact);
        return BinomialCoff;
    }
    /*
    Method
    1. user defined by self write
    2. inbuilt method already exist
     */

    /*
     Function Overloading   diffrentiating factor 1.  type of parametre 2. Number of parametre change
     Multiple function with the same name but different parametre

     remember it not depend return type

     eg =>

     multiply(int a, int b);
     multiply(int a, int b, int c);
     multiply(float a, float b);

     */

    // parameter overloading

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c){
        int sum = a + b;
        return sum;
    }

    // Data type overloading

    public static float sum(float a, float b){
        float sum = a + b;
        return sum;
    }

    // check number is prime or not

// 1 is not prime and composite

    public static boolean prime(int n){
        boolean isPrime = true;
        if(n == 2){
            return true;

        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n %  i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    // scope
    /*
    1. Method scope
     public static float sum(float a, float b){   // method scope
        float sum = a + b;
        return sum;
    }

    2. Block scope
    {
    // block scope
    }

     3. class scope
     access modifier
     public
     privet
     protected
     */

    public static void main(String args[]){


 //       System.out.println(prime(11));

//        System.out.println(sum(4, 2));
//        System.out.println(sum(2, 3, 4));
//        System.out.println(sum(2.2f, 2.3f));


      //  System.out.println(Binomial(5, 2));

     //   System.out.println(factorial(5));


//    int multiple = product(23, 4);
//        System.out.println(multiple);


    // here not swap because pass copy so work on always call by value pass in java
//    int a = 3;
//    int b = 5;
//     swap(3, 5);
//        System.out.println("after swap a : " + a);
//        System.out.println("after swap b : " + b);


//       int sum =  calculateSum(23, 2);
//        System.out.println(sum);
       // calculateSum(34, 2);
      //  printHello();
    }
}
