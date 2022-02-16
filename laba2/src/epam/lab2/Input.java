package epam.lab2;

import java.util.Scanner;

public class Input {

    public double enterDouble(String mess) {
        System.out.println(mess);
        Scanner sc = new Scanner(System.in);
        double input = 0.0;
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. double is required: ");
            sc.next();
        }
        input = sc.nextDouble();

        return input;
    }

    public int enterInt(String mess) {
        System.out.println(mess);
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. int is required: ");
            sc.next();
        }
        input = sc.nextInt();

        return input;
    }

    public int fourDigitCheck(String mess){
        int input = enterInt(mess);
        do{
            System.out.println("Invalid input. 4 digit value is required");
            input = enterInt(mess);
        }while(input<1000 || input>9999);
        return input;
    }
    
    public double positiveValue(String mes){
        double input;
        do{
            input = enterDouble(mes);
        }while(input<0);
        return input;
    }


}
