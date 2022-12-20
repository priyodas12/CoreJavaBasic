package java9.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUnmodify {

    public static void main(String[] args) {
        List<String> listStr=new ArrayList<>();

        listStr.add("KPL");
        listStr.add("IPL");
        listStr.add("BBL");

        List<String> unmodList=Collections.unmodifiableList(listStr);//just a view, not underlined list is immutable

        System.out.println(listStr.getClass());//class java.util.ArrayList
        System.out.println(unmodList.getClass());//class java.util.Collections$UnmodifiableRandomAccessList

        //unmodList.add("BPL");//Exception in thread "main" java.lang.UnsupportedOperationException
        listStr.add("BPL");

        System.out.println(listStr);//[KPL, IPL, BBL, BPL]
        System.out.println(unmodList);//[KPL, IPL, BBL, BPL]
    }
}
