package com;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author zhujianquan
 * @Date 2019/04/03 14:52
 */
public class MainTest {
//    HashSet

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        TreeMap<String,String> treeSet = new TreeMap<>();
        treeSet.put("asd","asd");
        treeSet.put("asdf","asd");
        treeSet.put("asdfg","asd");
        treeSet.put("asdfgh","asd");
//        Map.Entry
        String  a = "asdfgh";
        System.out.println(a.hashCode());
        Iterator iterator = treeSet.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(hashSet.size());
    }
}
