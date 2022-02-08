public class task3 {
    public static void main(String[] args){
        System.out.println("Enter a: ");
        int a = InputScanner.enterIntFromConsole();
        System.out.println("Enter b: ");
        int b = InputScanner.enterIntFromConsole();
        System.out.println("Square: " + (a*b)/2);
        System.out.println("Perimeter: " + (a+b+Math.sqrt(Math.pow(a,2) + Math.pow(b,2))));
    }
}
