public class task5 {
    public static void main(String[] args){
        System.out.println("Enter a: ");
        double a = InputScanner.enterDoubleFromConsole();
        System.out.println("Enter b: ");
        double b = InputScanner.enterDoubleFromConsole();
        System.out.println("Enter c: ");
        double c = InputScanner.enterDoubleFromConsole();
        if (a>0)
            System.out.println("a: " + Math.pow(a,2));
        else
            System.out.println("a: " + Math.pow(a,4));
        if (b>0)
            System.out.println("b: " + Math.pow(b,2));
        else
            System.out.println("b: " + Math.pow(b,4));
        if (c>0)
            System.out.println("c: " + Math.pow(c,2));
        else
            System.out.println("c: " + Math.pow(c,4));
    }
}
