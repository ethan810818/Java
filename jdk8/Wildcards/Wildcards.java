package Wildcards;

import java.util.List;

import NumberAndStrings.strings.ComputeInitials;

public class Wildcards {
    public static void process(List<? extends Foo> list) {}

    public static void process(List<? extends Foo> list, List<? extends Object> map) {
        for (Foo elem : list) {
            System.out.println(elem);
        }
    }
}
