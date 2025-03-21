public class secondLargest {
    static int secondLargest(int[]a){
        int largest= a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]> largest){
                largest=a[i];
            }
        }
        int secondLargest = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]> secondLargest && a[i]!= largest){
                secondLargest= a[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] a = {10,15,5,20,25};
        System.out.println("Second largest element is "+ secondLargest(a));
    }
}
