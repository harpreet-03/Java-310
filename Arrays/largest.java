public class largest {
    public static void main(String[] args) {
        int arr[] = {1,5,9,8,6,7,5};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max ) {
                max = arr[i];
            }
        }
    
        System.out.println("The largest element is " + max);

    }
}
