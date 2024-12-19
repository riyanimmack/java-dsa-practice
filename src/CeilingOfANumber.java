// Q - Find the number that is greater than or equal to the target number.

public class CeilingOfANumber {
    public static void main(String[] args) {
        
        int [] arr = {2,3,5,9,14,16,18};
        int target = 19;

        ceiling(arr, target);

    }

    public static void ceiling(int [] arr, int target){

        int start = 0;
        int end = arr.length -1;

        while(start <= end){

            int mid = (start + end)/2;

            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }

        }

        if(start>end){
            System.out.println("Your ceiling number for " + target + " is " + arr[start]);
        }

    }
}
