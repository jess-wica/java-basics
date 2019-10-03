package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Nothing to go here
        // No need to put any code in this method
    }

    public String condition(String item) {
        //Improved answer after review
        if (item == null) {
            return "One";
        }
        if (item.isEmpty()) {
            return "Four";
        }
        switch (item) {
            case "Number":
                return "Two";
            case "Another":
                return "Three";
            default:
                return "Five";

//        Previous answer
//        if (item == null) {
//            return "One";
//        } else {
//            if (item.equals("Number")) {
//                return "Two";
//            } else if (item.equals("Another")) {
//                return "Three";
//            } else if (item.isEmpty()) {
//                return "Four";
//            } else {
//                return "Five";
//            }
        }
    }

    public List<String> lists(String... items) {
        List<String> newList = new ArrayList<>();
        if(items != null) {
            newList = Arrays.asList(items);
        }
        return newList;
    }

    public Map<String, String> maps(String key, String item) {
        Map<String, String> myMap = new HashMap<>();
        if (key != null && item != null) {
            myMap.put(key, item);
        }
        return myMap;
    }

    public Map<String, List<String>> complexMaps(String key, String... items) {
        Map<String, List<String>> newComplexMap = new HashMap<>();
        if (key != null && items != null) {
            List<String> changeItems = Arrays.asList(items);
            newComplexMap.put(key, changeItems);
        }
        return newComplexMap;
    }
}
