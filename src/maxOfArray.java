public class maxOfArray {
    public static int maxOfArray(){
        int[] arr= {2,5,8,4,6,10};
        int ans=0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]> ans){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxOfArray());
    }
}
