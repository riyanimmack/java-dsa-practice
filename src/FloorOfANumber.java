public class FloorOfANumber {
    public static void main(String[] args) {
        
        int [] arr = {2,3,5,9,14,16,18};
        int target = 11;

        floorNum(arr, target);
    }

    public static void floorNum(int [] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = (start+end) / 2;

            if(arr[mid] < target){
                start = mid + 1;
            }

            else if(arr[mid] > target){
                end = mid - 1;
            }
        }

        if(start>end){
            System.out.println("Your floor number for your target element " + target + " is " + arr[end]);
        }
    }
}
