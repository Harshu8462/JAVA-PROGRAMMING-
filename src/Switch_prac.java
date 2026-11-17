import java.util.Scanner;
public class Switch_prac {
    public static void main(String[] args) {
        System.out.println("enter first number :");
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case ('+'):
                System.out.println(a+b);
                break;
            case ('-'):
                System.out.println(a-b);
                break;
            case ('/'):
                if(b==0){
                    System.out.println("not divisbile by 0");
                }
                else{
                System.out.println(a/b);}
                break;
            case ('*'):
                System.out.println(a*b);
                break;
//            case (5):
//                System.out.println("friday");
//                break;
//            case (6):
//                System.out.println("saturday");
//                break;
//            case (7):
//                System.out.println("sunday");
//                break;
            default:
                System.out.println("invalid operation");
        }
    }
}
