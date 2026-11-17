import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class practice_conditional {
    public static void main(String[] args){
        System.out.println("enter age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=0 ) {
            System.out.println("valid age");
            if (age >= 18) {
                System.out.println("adult ticket");}
                else{
                    System.out.println("child ticket");

                }
            }


        else{
        System.out.println("invalid age");
    }

        }}








































//import java.util.Scanner;
//
//public class practice_conditional {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks :");
//
//        int marks = sc.nextInt();
//        if (marks <= 100 && marks >= 40) {
//            System.out.println("Valid marks");
//            System.out.println("pass");}
//        else if (marks < 40 && marks>0) {
//            System.out.println("valid marks");
//            System.out.println("fail");
//        }
//        else if (marks<0||marks>100) {
//            System.out.println("invalid marks");
//
//        }
//    }
//
//        }
//
//
//
//
