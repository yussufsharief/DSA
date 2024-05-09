package com.streams.realtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Demo {
    public void show()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        Iterator itr = list.iterator();
        Collections.sort(list);
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}


public class RemoveAllOcc {

    public static void main(String[] args) {
        String str = "abcdABCDabcdABCD";

        String s = str.replaceAll("a","");
        System.out.println(s);
        // Your code goes here
//        final int x = 10;
//        int y = x++;
//        System.out.println(y);
        Demo demo = new Demo();
        demo.show();

    }
}
