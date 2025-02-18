//calculating average of a student by taking input from the user  
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student : ");
        String name=sc.nextLine();
        System.out.println("Enter the marks of the student in subject 1 : ");
        float m1=sc.nextFloat();
        System.out.println("Enter the marks of the student in subject 2 : ");
        float m2=sc.nextFloat();
        System.out.println("Enter the marks of the student in subject 3 : ");
        float m3=sc.nextFloat();
        System.out.println("Enter the marks of the student in subject 4 : ");
        float m4=sc.nextFloat();
        System.out.println("Enter the marks of the student in subject 5 : ");
        float m5=sc.nextFloat();
        float average=(m1+m2+m3+m4+m5)/5;
        System.out.println(average);
    }
    
}
