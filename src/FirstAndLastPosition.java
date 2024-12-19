public class FirstAndLastPosition {
    public static void main(String[] args) {
        
        int [] arr = {1,3,3,5,6,7,7,8,10};
        int target = 19;
        int [] result = firstLast(arr, target);

        if(result != null){
        System.out.println("The first and last element are in position " + result[0] + " and " + result[1]);
        }
        else{
            System.out.println("Target not found");
        }
    }

    public static int[] firstLast(int [] arr, int target){

        int [] result = {-1,-1};

        //Find first position

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
             int mid = (start + end) / 2;

             if(arr[mid] < target){
                start = mid + 1;
             }

             else if(arr[mid] > target){
                end = mid - 1;
             }

             else {
                result[0] = mid;
                end = mid - 1;
             }
        }

        // to find last position

        start = 0;
        end = arr.length - 1;

        while (start <= end){
            
            int mid = (start+end)/2;
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                result[1] = mid;
                start = mid + 1;
            }
        }

        return result;
    }
}
