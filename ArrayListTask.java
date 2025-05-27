package day22;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayListTask {
public static void main(String[] args) {
	ArrayList<Object> value=new ArrayList<Object>();
    value.add(1);
    value.add("apple");
    value.add(2);
    value.add("chennai");
    ArrayList<Object> value1=new ArrayList<Object>();
    value1.add(10);
    value1.add("orange");
    value1.add(2);     
    value1.add("Tindivanam");
 System.out.println(value);
    Collections.addAll(value,2,4,5);
    System.out.println("After addAll: "+value);
    System.out.println(value.get(0));
    int indexNum=value.indexOf("chennai");
    System.out.println(indexNum);
    System.out.println(value.isEmpty());
    System.out.println(value1.contains(10));
    System.out.println(value.lastIndexOf(indexNum));
    System.out.println(value.remove(1));
    System.out.println(value.size());
    System.out.println(value.retainAll(value1));
    value1.set(0,"perumal");
    System.out.println(value1);

    ArrayList<String> l = new ArrayList<>();
    l.add("Rose");
    l.add("Lotus");
    l.add("Lavender");
    l.add("Lilly");
    l.add("Sunflower");
    l.add("Rose");
    
    List<String> a1= l.subList(1, 4);
    System.out.println(a1);

    
}
}
