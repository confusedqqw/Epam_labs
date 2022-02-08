public class task4 {
    public static void main(String[] args){
        System.out.println("Enter x: ");
        int x = InputScanner.enterIntFromConsole();
        System.out.println("Enter y: ");
        int y = InputScanner.enterIntFromConsole();
        if(x>=-2 && x<=2 && y>=0 && y<=4 || x>=-4 && x<=4 && y<=0 && y>=-3)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
