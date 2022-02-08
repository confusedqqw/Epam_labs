public class task7 {
    public static void main(String[] args) {
        double a, b, h;

        System.out.print("Enter a: ");
        a = InputScanner.enterDoubleFromConsole();
        System.out.print("Enter b: ");
        b = InputScanner.enterDoubleFromConsole();
        System.out.print("Enter h: ");
        do{
            h = InputScanner.enterDoubleFromConsole();
        }while(h<=0);
        double result;
        double x = a;
        while(x<=b){
            result = Math.pow(Math.sin(x),2) - Math.cos(x);
            System.out.printf("\n%.3f", x);
            System.out.printf("   %.3f", result);
            x+=h;
        }
    }

}
