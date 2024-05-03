package generics;

import java.util.ArrayList;
import java.util.List;

public class WhyUseGenerics {
    public static void main(String[] args) {
        //Non-Generics
        List list = new ArrayList();
        list.add("Hello");
        String s = (String) list.get(0);
        System.out.println("s: " + s);

        //Generics
        List<String> listUseGenerics = new ArrayList<String>();
        listUseGenerics.add("Hello Generic!");
        String sGeneric = listUseGenerics.get(0);
        System.out.println("sGeneric:" + sGeneric);
    }
}
