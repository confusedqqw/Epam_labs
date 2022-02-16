package epam.lab2;


public class Output {

    public void showBoolean(boolean value) {
        System.out.println(value);
    }

    public void outputDouble(double value) {
        System.out.println(value);
    }

    public void triangleOutput(double per, double square) {
        System.out.println("perimeter = " + per + ", square = " + square);
    }

    public void showInt(String message, int value) {
        System.out.println(message + value);
    }
}
