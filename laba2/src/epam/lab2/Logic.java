package epam.lab2;

public class Logic {

    public boolean task1(int number){
        int sum1 = (number/1000) + (number/100 % 10);
        int sum2 = (number/10 %10) + (number%10);
        if (sum1 == sum2) {
            return true;
        }
        else {
            return false;
        }
    }

    public double task2(double a,double b,double c){
        return (((b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)) - (Math.pow(a,3)*c + Math.pow(b,-2)));
    }

    public double trianglePerimeter(double a,double b){
        return (a+b+Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    }

    public double triangleSquare(double a,double b){
        return (a*b)/2;
    }

    public boolean task4(int x,int y)
    {
        if(x>=-2 && x<=2 && y>=0 && y<=4 || x>=-4 && x<=4 && y<=0 && y>=-3){
           return true;
        }
        else {
            return false;
        }
    }
}
