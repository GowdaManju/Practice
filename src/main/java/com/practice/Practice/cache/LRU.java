package com.practice.Practice.cache;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


class LRUCache{

    int capacity;
    public LinkedList<Object> keys;
    public Map<Object,Object> map;

    public LRUCache(int capacity){
        this.capacity=capacity;
        keys=new LinkedList<>();
        map=new HashMap<>(capacity);
    }


    public void recentlyUsed(Object key){
        keys.remove(key);
        System.out.println("Removed Key "+keys);
        keys.addFirst(key);
        System.out.println("Added Key in front "+keys);
    }


    public Object get(Object key){
        if(!map.containsKey(key))
            return -1;
        recentlyUsed(key);
        return map.get(key);
    }

    public void del(){
//      System.out.println("Before Deleting ");
//      System.out.println(map);
//      System.out.println(keys);
      map.remove(keys.getLast());
      keys.removeLast();
        System.out.println("After Deleting ");
        System.out.println(map);
        System.out.println(keys);
    }

    public void put(Object key,Object value){
//        System.out.println("Before Adding ");
//        System.out.println(keys);
//        System.out.println(map);
        if(map.containsKey(key)){
            recentlyUsed(key);
            map.put(key,value);
        }else{
            if(keys.size()==capacity){
                del();
                keys.addFirst(key);
                map.put(key,value);
            }else {
                keys.addFirst(key);
                map.put(key, value);
            }

        }
        System.out.println("After Adding ");
        System.out.println(keys);
        System.out.println(map);

    }
}


public class LRU {

    public static void main(String args[]){

        LRUCache lc=new LRUCache(2);
        lc.put("name","Manju");
        lc.put("age",28);
        lc.get("name");
        lc.put("location","Banglore");






    }


}
