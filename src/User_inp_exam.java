import java.util.Scanner;
public class User_inp_exam{
    public static void main(String[] args){
        System.out.println("student name:-");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("age:-");
        byte age = s.nextByte();
        s.nextLine();
        System.out.println("College Nmae:-");
        String str2 = s.nextLine();

        System.out.println("CGPA:-");
        float percent = s.nextFloat();

    }
}

