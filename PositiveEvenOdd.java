import java.util.Scanner;
public class PositiveEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num>0 && num%2==0){
            System.out.println("Positive even");
        }
        else if (num>0 && num%2!=0) {
            System.out.println("positive odd");

        } else {
            System.out.println("Not Positive");
        }

    }
}