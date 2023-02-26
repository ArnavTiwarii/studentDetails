import java.util.Scanner;

public class studentdetail {
    public static void main (String args[])
    {
        student student =new student();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name");
        student.setName(scan.nextLine());

        System.out.println("Enter your Address");
        student.setAddress(scan.nextLine());

        System.out.println("Enter your RollNo");
        student.setRollNo(scan.nextLine());

        System.out.println("Enter your Email");
        student.setEmail(scan.nextLine());

        System.out.println("Name    : "+student.getName());
        System.out.println("Address : "+student.getAddress());
        System.out.println("RollNo  : "+student.getRollNo());
        System.out.println("Email   : "+student.getEmail());


    }
}
