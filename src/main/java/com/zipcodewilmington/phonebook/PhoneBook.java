package com.zipcodewilmington.phonebook;
import java.util.Map;
import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {


    //TreeMap<String, String> map = new TreeMap<String, String>();
    //List<String> list = new ArrayList<String>(map.values());

  TreeMap<String,List<String>> map=new TreeMap<String, List<String>>();

//     private String name;
//     private String number;

//
//    public PhoneBook(String name, String number) {
//        this.name = name;
//        this.number = number;
//
//    }


     public void add(String name, List<String> numbers){
       map.put(name, numbers);

    }


    public void remove(String name){

        map.remove(name);

    }

    public List<String> lookup(String name) {



        // String phonelook = map.get(name).toString();

       List<String> returnphoneNumbers;


        if (map.containsKey(name)) {
           returnphoneNumbers = map.get(name);
        } else {
            returnphoneNumbers = new ArrayList<String>();
        }

            return returnphoneNumbers;

        //return phonelook;

    }


    public String reverselookup(String phonenumber){
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(phonenumber)) {
                return entry.getKey();

            }
        }
        return null;
    }

    public String display(String name){

        for(Map.Entry<String,List<String>> entry :map.entrySet())
        {
            System.out.println( (entry.getKey() + " " + entry.getValue()));



        }
        return name;


    }


    public TreeMap<String, List<String>> getMap() {
        return map;
    }

    public void setMap(TreeMap<String, List<String>> map) {
        this.map = map;
    }

    public int size() {
        return map.size();
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (!(obj instanceof PhoneBook))
//            return false;
//        PhoneBook other = (PhoneBook) obj;
//        if (name != other.name)
//            return false;
//        return true;
//    }




}








