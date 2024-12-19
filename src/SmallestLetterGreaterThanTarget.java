public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        
        char [] letters = {'b', 'd', 'e', 'f', 'h', 'i', 'm', 'r'};
        char target = 'a';
        ceilLetter(letters, target);
    
    }

    public static void ceilLetter (char [] letters, char target){

        int start = 0;
        int end = letters.length - 1;

        while (start <= end){

            int mid = (start + end) / 2;

            if(letters[mid] <= target){
                start = mid + 1;
            }

            else if(letters[mid] > target){
                end = mid - 1;
            }
        }

        if (start > end){
            System.out.println("The smallest character in the array that is larger than " 
            + target + " is " + letters[start % letters.length]);
        }
    }
}
