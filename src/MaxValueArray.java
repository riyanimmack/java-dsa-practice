public class MaxValueArray {
    public static void main(String[] args) {
        
        int arr [] = {3,6,4,12,7,9,19};
        System.out.println(max(arr));
    }

    static int max (int[] arr){

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            
            }
        }
        return max;
    }
}
