package problems;

/**
 * Created by Shakir on 4/9/16.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        String string = "ABC";
        int number = string.length();
        permute(string.toCharArray(), 0, number-1);
    }

    public static void permute(char[] string, int l, int r){
        if(l==r){
            System.out.println(string);
        }

        for(int i=l;i<=r;i++){
            swap(string, l, i);
            permute(string, l+1, r);
            swap(string, l, i);
        }
    }

    public static void swap(char[] string, int i, int j){
        char temp = string[i];
        string[i] = string[j];
        string[j] = temp;
    }
}