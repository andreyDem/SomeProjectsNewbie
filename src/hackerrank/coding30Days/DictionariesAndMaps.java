package hackerrank.coding30Days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionariesAndMaps {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Set<Map.Entry<String, Integer>> map = phoneBook.entrySet();
            for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
                if (entry.getKey().equals(s))
                    System.out.println(entry.getKey() + "=" + entry.getValue());
                else
                    System.out.println("Not found");
            }
        }
        in.close();
    }
}
