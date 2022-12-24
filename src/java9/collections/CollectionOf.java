package java9.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionOf {
    public static void main(String[] args) {
        List<String> listStr=new ArrayList<>();

        listStr.add("KPL");
        listStr.add("IPL");
        listStr.add("BBL");

        List<String> unmodList= List.of("KPL","IPL","BBL");

        System.out.println(listStr.getClass());//class java.util.ArrayList
        System.out.println(unmodList.getClass());//class java.util.ImmutableCollections$ListN

        //unmodList.add("BPL");//Exception in thread "main" java.lang.UnsupportedOperationException
        listStr.add("BPL");

        System.out.println(listStr);//[KPL, IPL, BBL, BPL]
        System.out.println(unmodList);//[KPL, IPL, BBL]
    }
}
