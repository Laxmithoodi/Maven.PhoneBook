package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class PhoneBookTest {
//    TreeMap<String, String> map = new TreeMap<String, String>();
//   List<String> list = new ArrayList<String>(map.values());

    TreeMap<String,List<String>> map=new TreeMap<String, List<String>>();
    @Test
    public void addTest() {

//        String expName = ("Laxmi");
//        String expNumber = ("009");

        // PhoneBook phoneBook1 = new PhoneBook(expName, expNumber);
        // map.put(expName, expNumber);
//
//        phoneBook1.add(expName,expNumber);
//        String actualName = phoneBook1.getName();
//      System.out.println(actualName);
//      String actualNumber = phoneBook1.getNumber();
//        System.out.println(actualNumber);
//        Assert.assertEquals(1, phoneBook1.map.size());
//    }

      //  String expResult = "laxmi: 232-454-6778";
        String expName = "Laxmi";

        List<String> phoneNumbers = new ArrayList<String>();
        phoneNumbers.add("232-454-6778");
        //phoneNumbers.remove("232-454-6778");

        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.add(expName, phoneNumbers);
        //String actualName = phoneBook1.getMap();

      //  System.out.println(actualName);
        Assert.assertEquals(1, phoneBook1.size());
    }

//    @Test
//    public void remove(){
//
//        String expName = ("Laxmi");
//        String expNumber = ("009");
//        PhoneBook phoneBook1 = new PhoneBook(expName, expNumber);
//      //  map.put(expName, expNumber);
//
//
//        phoneBook1.add(expName,expNumber);
//        phoneBook1.remove(expName, expNumber);
//
//        phoneBook1.remove(expName, expNumber);
//        String actualName1 = phoneBook1.getNumber();
//      //  String actualNumber1 = phoneBook1.getName();
//        System.out.println("removed name" + "=" + actualName1);
//
//        Assert.assertEquals(0, phoneBook1.map.size());


    @Test
    public void removeTest(){
        String expName = "Laxmi";


        List<String> phoneNumbers1 = new ArrayList<String>();

        phoneNumbers1.add("232-454-6778");

      //  phoneNumbers1.remove("232-454-6778");
        PhoneBook phoneBook1 = new PhoneBook();

        phoneBook1.add(expName, phoneNumbers1);
        phoneBook1.remove(expName);
       // phoneBook1.remove(expName, phoneNumbers1);
        Assert.assertEquals(0, phoneBook1.map.size());
    }

@Test
    public void lookUpTest(){
    String name = "Laxmi";
  String number = "232-454-6778";

    List<String> phoneNumbers = new ArrayList<String>();

    phoneNumbers.add(number);
    PhoneBook phoneBook1 = new PhoneBook();
    phoneBook1.add(name, phoneNumbers);
//When

 List<String> actualnumber = phoneBook1.lookup(name);
    System.out.println(name);
    Assert.assertEquals(phoneNumbers, actualnumber);



}


@Test

public void reverselookUpTest() {
    String name = "Laxmi";
    String number = "232-454-6778";
    String number1 = "102-234-2348";

    List<String> phoneNumbers = new ArrayList<String>();

    phoneNumbers.add(number);
    phoneNumbers.add(number1);
    PhoneBook phoneBook1 = new PhoneBook();
    phoneBook1.add(name, phoneNumbers);
    phoneBook1.add(name, phoneNumbers);
//When

    String actualnumber = phoneBook1.reverselookup(number);
    System.out.println(name);
    Assert.assertEquals(name, actualnumber);


}


@Test
    public void displayTest(){

    String name = "Laxmi";
    String number = "232-454-6778";

    List<String> phoneNumbers = new ArrayList<String>();

    phoneNumbers.add(number);

    String expected = "Laxmi"+"232-454-6778" ;
    PhoneBook phoneBook1 = new PhoneBook();
    phoneBook1.add(name, phoneNumbers);

    String actual =  phoneBook1.display(expected);

    Assert.assertEquals(expected,actual);

}






    }






