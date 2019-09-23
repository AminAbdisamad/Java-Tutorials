package com.Aminux;

public class StringPractice {

public void playWithIt(){
    String name = "Hassan";
    String sentence = "Good things come late";
    String result = sentence.contains("come") ? "found something":"could not find";
    System.out.println(result);
    result = sentence.substring(0,9);
    System.out.println(result);
    String notFound = name.equals("san") ? "Found it" : "not found it";
}

public String categoryListing(String str){
    String info = "We have a large inventory of things in our warehouse falling in the"
            +" the category:appeal and slightly more in demand category:makeup along with category:furniture";

    return info;

}

}
