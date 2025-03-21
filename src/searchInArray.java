public class searchInArray {
    public static int searchInArray(){
        int[] arr={2,4,6,1,9,5};
        int x = 1;
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        System.out.println("Found "+ x + " at index "+ ans);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(searchInArray());
    }
}
