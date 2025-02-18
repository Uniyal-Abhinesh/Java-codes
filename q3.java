import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("Enter your university roll no. : ");
        int ur=sc.nextInt();
        System.out.println("Enter your course : ");
        String course=sc.nextLine();
        System.out.println("Enter your semester : ");
        int semester=sc.nextInt();
        System.out.println("name of the student"+name);
        System.out.println(" roll no of the student"+ur);
        System.out.println("course of the student :"+course);
        System.out.println("semester of the student"+semester);
    }
    
}
