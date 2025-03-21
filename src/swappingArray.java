public class swappingArray {
    static void swappingArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    static void reverseArray(int[] arr){
        int i=0, j= arr.length-1;
        while(i<j){
            swappingArray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
    }
}
