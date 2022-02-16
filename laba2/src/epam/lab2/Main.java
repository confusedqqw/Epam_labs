package epam.lab2;

public class Main {
    public static void main(String [] args){
        Input input = new Input();
        Logic logic = new Logic();
        Output output = new Output();

        int number = input.fourDigitCheck("Enter 4 digit value");
        boolean task1 = logic.task1(number);
        output.showBoolean(task1);

        double a = input.enterDouble("Enter a:");
        double b = input.enterDouble("Enter b:");
        double c = input.enterDouble("Enter c:");
        double res = logic.task2(a,b,c);
        output.outputDouble(res);

        double val1 = input.enterDouble("Enter a:");
        double val2 = input.enterDouble("Enter b:");
        double result = logic.trianglePerimeter(val1,val2);
        double result2 = logic.triangleSquare(a,b);
        output.triangleOutput(result,result2);

        int x = input.enterInt("Enter x: ");
        int y = input.enterInt("Enter y: ");
        boolean r = logic.task4(x,y);
        output.showBoolean(r);
    }
}
