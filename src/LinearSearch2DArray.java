public class LinearSearch2DArray {
    public static void main(String[] args) {
        
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        int result = searcharray(arr, 10);
        if(result == -1){
            System.out.println("Your target element is not present in this 2D array.");
        }
    }

    static int searcharray(int [][] arr, int n){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == n){
                    System.out.println("Your target element is present in row: " + (i+1) + " and column: " + (j+1));
                    return 1;
                }
            }
        }

        return -1;
    }
}
