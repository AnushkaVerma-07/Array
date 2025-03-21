import java.util.ArrayList;

public class arrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();

        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i
        System.out.println(l1.get(1));

        //print with for loop
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
        }
        System.out.println();

        //printing the array list directly
        System.out.println(l1);

        //adding element at some index i
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println();
    }
}
