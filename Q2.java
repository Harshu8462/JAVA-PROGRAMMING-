//code for user input
import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        System.out.println("Taking user input");
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number:-");
        int a = s.nextInt();
        System.out.println("enter second number:-");
        int b = s.nextInt();
        int sum = a + b ;
        System.out.print("The sum of these number is :-");
        System.out.println(sum);


    }
}