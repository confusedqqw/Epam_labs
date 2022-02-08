public class task8 {
    public static void main(String [] args){
        System.out.println("Enter array size: ");
        int N = InputScanner.enterIntFromConsole();
        System.out.println("Enter K: ");
        int K = InputScanner.enterIntFromConsole();
        int array [] = new int[N];
        System.out.println("Enter array elements: ");
        for (int i =0;i<N;i++){
            do {
                array[i] = InputScanner.enterIntFromConsole();
            }while(array[i]<=0);
        }
        int sum=0;
        System.out.print("multiples elements of K: ");
        for (int i =0;i<N;i++) {
            if (array[i] % K == 0) {
                System.out.print(array[i]+" ");
                sum += array[i];
            }
        }
        System.out.print("\nSum: " + sum);
    }
}
