package Lesson_5;
import java.util.HashMap;


public class test_2 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("note", "code"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("bar", "foo"));
    }

    private static boolean isIsomorphic(String str1, String str2) {
        HashMap<Character, Character> map = new HashMap<>();
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (!map.containsKey(str1.charAt(i))) {
                if (map.containsValue(str2.charAt(i))) {
                    return false;
                }
                map.put(str1.charAt(i), str2.charAt(i));
            } else {
                if (map.get(str1.charAt(i)) != str2.charAt(i)) {
                    return false;
                }
            }
        }

        return true;

        }
    }  

