package com.practice.Practice.cache;
import java.util.*;
public class CACHE {

    private LinkedList<Object> keys;
    private Map<Object,Object> map;
    private int capacity;
    public CACHE(int capisity){
        keys=new LinkedList<>();
        this.capacity=capisity;
        map=new HashMap<>(capacity);
    }
    public void updateKey(Object key){
        keys.remove(key);
        keys.addFirst(key);
    }
    private void remove(){
        Object leastUsed=keys.getLast();
        map.remove(leastUsed);
        keys.remove(leastUsed);
    }

    public void put(Object key,Object value){
        if(map.containsKey(key)){
            updateKey(key);
            map.put(key,value);
            return;
        }
        if(map.size()==capacity){
            remove();
            map.put(key,value);
            keys.addFirst(key);
        }else{
            map.put(key,value);
            keys.addFirst(key);
        }
    }

    public Object get(Object key){

        if(!map.containsKey(key)){
            return null;
        }
        updateKey(key);
        return map.get(key);
    }




}
