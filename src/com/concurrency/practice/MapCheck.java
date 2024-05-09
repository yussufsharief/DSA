package com.concurrency.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCheck {
    public static void main(String[] args) {
        List<Map<String, String>> maplist = new ArrayList<>();

        Map<String,String> map = new HashMap<>();
        map.put("1","a");
        maplist.add(map);


        if(maplist.stream().findFirst().isEmpty()) {
            System.out.println("print");
        }

       Map<String, String> map1  = maplist.get(0);
//        if(map1.){
//            System.out.println("print2");
//        }
    }
}
