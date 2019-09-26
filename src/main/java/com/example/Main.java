package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Nothing to go here
        // No need to put any code in this method
    }

    public String condition(String item) {
        if (item == null) {
            return "One";
        } else {
            if (item.equals("Number")) {
                return "Two";
            } else if (item.equals("Another")) {
                return "Three";
            } else if (item.isEmpty()) {
                return "Four";
            } else {
                return "Five";
            }
        }
    }

    public List<String> lists(String... items) {
        List<String> newList;
        if(items == null) {
            return Collections.EMPTY_LIST;
        } else {
                newList = Arrays.asList(items);
                return newList;
        }
    }

    public Map<String, String> maps(String key, String item) {
        Map<String, String> myMap = new HashMap<>();
        if (item == null || key == null) {
            return Collections.EMPTY_MAP;
        } else {
            myMap.put(key, item);
            return myMap;
        }
    }

    public Map<String, List<String>> complexMaps(String key, String... items) {
        return null;
    }
}
