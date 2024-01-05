package Lesson_5;

import java.util.HashMap;
import java.util.Map;

public class test_1 {
    Map<String,String> userData = new HashMap<>();

    void addData(String numpass,String name){
          userData.put(numpass,name);
    }
    String sortName (String username){
        StringBuilder sb = new StringBuilder();
        for(String key : userData.keySet()){
            if(username.equals(userData.get(key))){
                sb.append(key).append(": ").append(userData.get(key));
                sb.append("\n");
            }
        }
    return sb.toString();
    }
}
