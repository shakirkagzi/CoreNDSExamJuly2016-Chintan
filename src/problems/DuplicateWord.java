package problems;

import java.util.*;

/**
 * Created by Shakir on 8/16/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String stm = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (String str : "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language".split(" ")) {
            if (map.get(str) == null)
                map.put(str, 1);
            else
                map.put(str, map.get(str) + 1);
        }
        String str2 = join(map.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(map.values());

        System.out.println("Outcome = " + str2);
        System.out.println("Values = " + value);

        int average = 0;
        int count = 0;
        for (String word : stm.split("\\s+")) {
            average += stm.length();
            count++;
        }
        average = stm.length() / count;


        System.out.println("Average Length of the Statement is = " + average);
    }

    public static String join(Collection<String> s, String delimiter) {
        StringBuffer bf = new StringBuffer();
        Iterator<String> IT = s.iterator();
        while (IT.hasNext()) {
            bf.append(IT.next());
            if (IT.hasNext()) {
                bf.append(delimiter);
            }
        }
        return bf.toString();
    }
}