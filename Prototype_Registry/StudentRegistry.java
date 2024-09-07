package DesignPattern.Prototype_Registry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    Map<String,Student> map = new HashMap<>();

    public void setMap(String key,Student student){
        map.put(key,student);
    }

    public Student getMap(String key){

        return map.get(key);

    }

}
