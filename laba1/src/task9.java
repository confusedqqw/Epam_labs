public class task9 {
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = new int[]{10, 20, 30, 5, 50, 65, 60, 15, 35};
        System.out.println("Enter k: ");
        int k = InputScanner.enterIntFromConsole();
        int n = 0;
        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {
            if (i >= k && n < arr2.length) {
                arr3[i] = arr2[i - k];
                n++;
            } else {
                arr3[i] = arr1[i - n];
            }
        }

        for (int j =0;j<arr3.length;j++){
            System.out.print(arr3[j] + " ");
        }
    }
}
