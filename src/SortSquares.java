import java.util.Scanner;

public class SortSquares {

    public static void printArray(int[]arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void swapVariables(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            swapVariables(arr, i, j);
            i++;
            j++;
        }
    }

    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k = 0;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter "+n+" Elements :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
        int[] ans = sortSquares(arr);
        System.out.println("Sorted array");
        printArray(ans);

    }

}
