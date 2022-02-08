public class task6 {
    public static void main(String [] args){
        System.out.println("Enter a: ");
        int a = InputScanner.enterIntFromConsole();
        System.out.println("Enter b: ");
        int b = InputScanner.enterIntFromConsole();
        System.out.println("Enter c: ");
        int c = InputScanner.enterIntFromConsole();

        int result = Math.max(a, Math.max(b, c)) + Math.min(a, Math.min(b, c));
        System.out.println(result);
    }
}

