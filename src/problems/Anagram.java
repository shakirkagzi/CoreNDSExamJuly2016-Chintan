package problems;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by Shakir on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        System.out.print("Enter String1 :");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print("Enter String2 :");
        String str2 = sc.nextLine();

        if(isAnagram(str1,str2)==true)
        {
            System.out.println("Input String is Anagram..!!");
        }
        else
        {
            System.out.println("Input String is NOT Anagram..!!");
        }
    }

    private static boolean isAnagram(String a, String b){

         if(a==b){
            return true;
        }

        if(a==null || b==null)
            return false;

         if(a.length()!=b.length())
            return false;

        char[] aArr = a.toLowerCase().toCharArray();
        char[] bArr = b.toLowerCase().toCharArray();

        int[] counts = new int[26];

        for (int i = 0; i < aArr.length; i++){
            counts[aArr[i]-97]++;
            counts[bArr[i]-97]--;
        }

         for (int i = 0; i<26; i++){
            if (counts[i] != 0)
                return false;
        }

        return true;
    }
}

