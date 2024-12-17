public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,4,23,43,12,19};

        int result = linearSearch(arr, 11);
        if(result == -1){
            System.out.println("The element is not present in this array");
        }
    }

    static int linearSearch(int [] arr, int n){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                System.out.println("This element exists inside this array in the position " + (i+1));
            }
            
        }
        return -1;
    }
}
