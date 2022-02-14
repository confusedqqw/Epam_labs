package lab2;

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


}
