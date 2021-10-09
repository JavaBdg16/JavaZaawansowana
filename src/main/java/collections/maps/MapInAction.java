package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapInAction {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.get("A");
        map.containsKey("A");

        // gorsze
        if (map.containsKey("A")) {
            var a = map.get("A");
            // TODO
        }

        // lepsze
        var a2 = map.get("A");
        if (a2 != null) {

        }

    }
}
