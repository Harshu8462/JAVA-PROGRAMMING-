
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int first = sc.nextInt();
        System.out.println("enter second number:");
        int second = sc.nextInt();
        System.out.println("enter operator:");
        char operator = sc.next().charAt(0);
        if(operator=='+'){
            System.out.println(first+second);
        }
        else if (operator=='-') {
            System.out.println(first - second);
        }
        else if (operator=='*') {
            System.out.println(first*second);
        }
        else if (operator=='/') {
            if(second!=0){
            System.out.println(first/second);}
            else {
                System.out.println("cannot divide by 0");
            }
        }
        else{
            System.out.println("invalid operator");
        }


            }
        }


