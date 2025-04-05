import java.util.Scanner;

public class PrefixSumOfRange {
    static int[] PrefixSUmRange(int[] arr){
        for(int i = 1; i< arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        System.out.println("Enter " + n + " Elements :");
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] prefSum = PrefixSUmRange(arr);
        System.out.println("Enter number of queries");
        int t = sc.nextInt();

        while(t-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum "+ ans);
        }
    }
}
