//public class Conditional {
//    public static void main(String []args){
//        int age = 60;
//        if(age>18) {
//            System.out.println("you can drive");
//        }
//        else{
//            System.out.println("you cannot drive yet");
//            }
//        }
//    }

//practice

import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("Enter first num:");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Enter second num:");
        int b = sc.nextInt();

        System.out.println("Enter third num:");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Highest num is a:" + a);
        } else if (b >= a && b >= c) {
            System.out.println("Highest num is b:" + b);

        } else {
            System.out.println("Highest num is c:" + c);
        }
    }
}
