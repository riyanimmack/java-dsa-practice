public class LinearSearchString {
    public static void main(String [] args){
        String name = "bruce";

        int result = searchChar(name, 'f');
        if(result == -1){
            System.out.println("The character is not present inside the String");
        }
    }

    static int searchChar(String name, char c){
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == c){
                System.out.println("The character you are searching for is present in the string");
                return i;
            }
        }
        return -1;
    }
}

