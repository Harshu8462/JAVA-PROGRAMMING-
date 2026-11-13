import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(str.toUpperCase());
    }
}