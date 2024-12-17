import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) {

    int [] arr = {1,2,3,4,5,6,7};
    swapArr(arr, 1, 5);

}

    static void swapArr(int [] arr, int index1, int index2)
    {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    System.out.println(Arrays.toString(arr));
    }

}