import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int [] arr = {7,2,9,4,3,1,0,2,3,3};

        bubbleSort(arr);
    }

    public static void bubbleSort(int [] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = 0;  
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
      

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
