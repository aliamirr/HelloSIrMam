import java.util.Scanner;
public class HelloPerson{
    public static void main(String args[]){

        Scanner Nam = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Name = Nam.nextLine();
        System.out.println("Hello " + Name);

    }
}