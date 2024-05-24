package Wildcards;

import java.util.List;

public class UnboundedWildcards {
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }
}
