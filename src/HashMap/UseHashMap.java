package HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("NETWORK", "Canada");
        hashMap.put("Germany", "England");
        hashMap.put("Lahore", "Pakistan");
        hashMap.put("Florida", "California");

        for (Map.Entry<String, String> entry:hashMap.entrySet() ){
            System.out.println(entry.getKey()+ "---->"+entry.getValue());

        }
            System.out.println(hashMap.size());
        }

    }

