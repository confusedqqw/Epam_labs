public class task6 {
    public static void main(String [] args){
        System.out.println("Enter a: ");
        int a = InputScanner.enterIntFromConsole();
        System.out.println("Enter b: ");
        int b = InputScanner.enterIntFromConsole();
        System.out.println("Enter c: ");
        int c = InputScanner.enterIntFromConsole();
        int min=0;
        int max;
        if(a > b) {
            max = a;
            min = b;
        }else {
            max = b;
            min = a;
        }
        if(c > max) {
            max = c;
        }
        if(c<a || c<b)
            min = c;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
