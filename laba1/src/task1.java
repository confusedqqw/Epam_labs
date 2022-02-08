
public class task1 {
    public static void main(String[] args){
        int number;
        number = InputScanner.enterIntFromConsole();
        if (number<1000 || number > 9999)
            System.out.println("Invalid number");
        int sum1 = (number/1000) + (number/100 % 10);
        int sum2 = (number/10 %10) + (number%10);
        if (sum1 == sum2)
            System.out.println("true");
        else
            System.out.println("false");
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
