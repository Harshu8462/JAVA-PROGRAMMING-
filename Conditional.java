
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        System.out.println("Enter unit:");
        Scanner sc = new Scanner(System.in);

        int unit = sc.nextInt();

        if (unit <= 100) {
            System.out.println("5 ruppe per unit");
        }
        else if (unit > 100 && unit <= 200) {
            System.out.println("7 ruppe per unit");
        }
        else {
            System.out.println("10 ruppe per unit");
        }

    }
}