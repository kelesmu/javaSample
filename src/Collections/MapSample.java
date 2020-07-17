package Collections;

import java.util.HashMap;
import java.util.Map;

public final class MapSample {

    public static void main(String[] args) {
        System.out.println(ornek());

    }


    public static Map<String, String> ornek() {
        Map<String, String> map = new HashMap<>();

        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");

        //String value = "";

        if (map.containsKey("a") && map.containsKey("b") &&
                map.get("a").length() != map.get("b").length()&&
                map.get("a").length() > map.get("b").length()) {
            map.put("c", map.get("a"));
        } else if (map.containsKey("a") && map.containsKey("b") &&
                map.get("b").length() > map.get("a").length()&&
        map.get("a").length() != map.get("b").length()){
           map.put("c",map.get("b"));
            System.out.println(map.get("c"));
        } else if (map.containsKey("a") && map.containsKey("b") &&
                map.get("a").length() == map.get("b").length()) {
            map.put("a", "");
            map.put("b", "");
        }

        System.out.println(map);
        return map;

    }

}

