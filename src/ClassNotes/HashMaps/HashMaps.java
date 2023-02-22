package ClassNotes.HashMaps;

import java.util.HashMap;
import java.util.Map;
public class HashMaps {

    public static void main(String[] args) {


        // create Hash MAps(Alphabetizes by itself)

        Map<String, Integer> userAge = new HashMap<>();

        userAge.put("John", 70);
        userAge.put("Alex", 85);
        userAge.put("C-Los", 100);
        System.out.println(userAge);//returns {Alex=85, C-Los=100, John=70}

        System.out.println();

        Map<String, String> usernames = new HashMap<>();
        usernames.put("Mike", "michaelcevallos94@yahoo.com");
        usernames.put("Justin", "Jreich@gmail.com");
        System.out.println(usernames);

        System.out.println();

        Map<Integer, Integer> numbers = new HashMap<>();


        //.get
        System.out.println(usernames.get("Mike"));// returns my email michaelcevallos94@yahoo.com

        System.out.println();

        //.getOrDefault - if you dont want null return value
        System.out.println(usernames.getOrDefault("Fred", "Sorry that's not a choice!"));

        //.putIfAbsent- only set a key-value pair if it does not exist
        usernames.putIfAbsent("Zach", "Zgulde");
    }
}
