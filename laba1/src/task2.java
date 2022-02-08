import java.util.Scanner;

public class task2 {
     public static void main(String[] args){
        System.out.println("Enter a: ");
        double a = InputScanner.enterDoubleFromConsole();
        System.out.println("Enter b: ");
        double b = InputScanner.enterDoubleFromConsole();
        System.out.println("Enter c: ");
        double c = InputScanner.enterDoubleFromConsole();
        System.out.println("Result: " + (((b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)) - (Math.pow(a,3)*c + Math.pow(b,-2))));
    }

}




