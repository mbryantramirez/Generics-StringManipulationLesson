package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "Hello";
        String empty = "";
       // a.substring();
        StringBuilder emptyBuilder = new StringBuilder();
        System.out.println(emptyBuilder.toString());

        String num = String.valueOf(1);

        StringBuilder s = new StringBuilder("Hello");
        System.out.println(s.toString());

        StringBuilder b = new StringBuilder().append("Hello");
        System.out.println(b.toString());

        //It can't be broken, it passes all unit tests
        StringBuilder quote = new StringBuilder();
        System.out.println(quote);
        quote.append("It can't be broken");
        System.out.println(quote);

        char punctuation = ',';
        String punctual = "1:00";
        quote.append(punctuation);
        System.out.println(quote);
        quote.append(" it passes all unit tests");
        System.out.println(quote);

//        List list = new ArrayList<>();
//        Map<Integer, String> map = new HashMap<>();
//
//        list.add(1);
//        list.add("hello");
//        list.add(true);
//
//        List<Integer> numberList = new ArrayList<>();
//        numberList.add(1);
//
//        String generciString =(String) list.get(0);
//        System.out.println(generciString);

        Box<Integer> box = new Box<>();
        box.setItem(1);
        int boxnum = box.getItem();
        System.out.println("Item: " + box.getItem()+ "\nClass Type: " + box.getItem().getClass().getSimpleName());



        Box<String> stringBox = new Box<>();
        stringBox.setItem("String");
        System.out.println(stringBox.getItem());
        Box<Location> locationBox = new Box<>();

        Tuple<String, String> stringTuple = new Tuple<>("String1", "String2");
        Tuple<Integer, Integer> integerTuple = new Tuple<>(1 , 2);
        Tuple<String, String> secondStringTuple = new Tuple<>("String3","String4");

        int firstNum = integerTuple.getFirst();
        int secondNum = integerTuple.getSecond();
        System.out.println("Item: " + firstNum + "\n Class name: "+ integerTuple.getFirst().getClass().getSimpleName());
        System.out.println("Item: " + secondNum  + "\n Class name: "+ integerTuple.getSecond().getClass().getSimpleName());

        List<Tuple<String,String>> tupleList = new ArrayList<>();

        tupleList.add(stringTuple);
        tupleList.add(secondStringTuple);

        System.out.println(Arrays.toString(tupleList.toArray()));
        System.out.println("Get first element: "+tupleList.get(0).getFirst() + "\n Get Second element: "+ tupleList.get(0).getSecond() + "\n Class name: "+ tupleList.get(0).getClass().getSimpleName());
        System.out.println("Get first element: "+tupleList.get(1).getFirst() + "\n Get Second element: "+ tupleList.get(1).getSecond() + "\n Class name: "+ tupleList.get(1).getClass().getSimpleName());

        Container<Boolean> booleanContainer = new Container<>();
        booleanContainer.setItem(true);

        System.out.println("Item: "+ booleanContainer.getItem() + "\n Class: "+ booleanContainer.getItem().getClass().getSimpleName());

        Container<Character> characterContainer = new Container<>();
        characterContainer.setItem('a');
        System.out.println("Item: "+ characterContainer.getItem() + "\nClass: "+ characterContainer.getItem().getClass().getSimpleName());

        List<Container> anyContainerList = new ArrayList<>();
        anyContainerList.add(booleanContainer);
        anyContainerList.add(characterContainer);
        System.out.println();
        System.out.println();
        for(Container containerItem: anyContainerList) {
            System.out.println( "Item Class: "+containerItem.getClass().getSimpleName() +  "\nItem: "+containerItem.getItem() + "\nContainer Item Class: "+containerItem.getItem().getClass().getSimpleName());
        }

        List< Container<Double> > doubleContainerList = new ArrayList<>();

        Container<Double> webContainer = new Container<>();
        webContainer.setItem(5.1);
        Container<Double> iosContainer = new Container<>();
        iosContainer.setItem(5.2);
        Container<Double> webNightsCOntainer = new Container<>();
        webNightsCOntainer.setItem(5.3);
        Container<Double> androidCOntainer = new Container<>();
        androidCOntainer.setItem(5.4);

        doubleContainerList.add(webContainer);
        doubleContainerList.add(iosContainer);
        doubleContainerList.add(webNightsCOntainer);
        doubleContainerList.add(androidCOntainer);
        System.out.println('\n');
        for(Container containerItem: doubleContainerList) {
            System.out.println( "Item Class: "+containerItem.getClass().getSimpleName() +  "\nItem: "+containerItem.getItem() + "\nContainer Item Class: "+containerItem.getItem().getClass().getSimpleName());
        }


    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if( a.length() > b.length() ) {
            String check = a.substring(a.length()- b.length());
            if(check.equals(b)){
                return true;
            }
        }else{
            String check = b.substring(b.length()- a.length());
            if(check.equals(a)){
                return true;
            }
        }
        return false;
    }

    public boolean endOthe2r(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        // H i a b c
        //     a b c

        // a b X a b c   '
        //       a b c


        // if( a.length() > b.length() ) {
        //   return a.substring(a.length()- b.length()).equals(b);
        // }else{
        //   return b.substring(b.length()- a.length()).equals(a);
        // }

        return a.length() > b.length() ? a.substring(a.length()- b.length()).equals(b) :  b.substring(b.length()- a.length()).equals(a) ;
    }
}
