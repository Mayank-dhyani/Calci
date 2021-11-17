
import java.util.Scanner;

public class SimpleCalci{
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        float a= sc.nextFloat();
        System.out.print("enter + / - * ");
        String n=sc.next();
        System.out.print("enter the Number");
        float b= sc.nextFloat();

        switch (n){

                case "+":
                    System.out.println(a + b);
                    break;
                case "/":

                        System.out.println(a / b);
                        break;

                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;

        }

    }
}
