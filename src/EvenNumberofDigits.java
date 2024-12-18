// Given an array of integers, return how many of them contain an even numebr of digits.

public class EvenNumberofDigits {
    public static void main(String[] args) {
        
        int [] arr = {123, 4567, 23, 78905, 6754,87906543,7865490};

        evendig(arr);
    }

    static void evendig(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int numDigits = String.valueOf(arr[i]).length();
            if((numDigits % 2) == 0 ){
                System.out.println("This element " + arr[i] + " has even number of digits.");
            }
        }
    }
}
