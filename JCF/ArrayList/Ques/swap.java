import java.util.ArrayList;

public class swap {
    public static void main(String[] args) {
        // write a java program that swaps two elements in an ArrayList.
    ArrayList<String> list = new ArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");
        list.add("Delta");

        // Print the original list
        System.out.println("Original arrayList: " + list);

        // Call swap method to swap elements at index 1 and 3
        swapElements(list, 1, 3);

        // Print the list after swapping
        System.out.println("after swapping: " + list);
    
    }

    public static void swapElements(ArrayList<String> list, int index1, int index2) {
       
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

}
