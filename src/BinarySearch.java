public class BinarySearch {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,5,7,8,14,16,21,25,28,32};
        int target = 29;

        binary(arr, target);
    }

    // return the index

    static void binary (int [] arr, int target){

        int start = 0;
        int end = arr.length -1;

        while(start <= end){

            int mid = (start + end)/2;
            if (arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] == target){
                System.out.println("Your target element " + target + " is present in position " + (mid+1));
                break;
            }
            mid = (start+end)/2;
        }

        if(start > end){
            System.out.println("Your target element is not present in this array");
    }
}
}
