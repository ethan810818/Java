package generics.RestrictionsOnGenerics.CannotCreateArraysOfParameterizedTypes;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    public static void main(String[] args) {
        List<Integer>[] arrayOfLists = new List<Integer>[2];
        Object[] strings = new String[2];
        strings[0] = "hihi";
        strings[1] = 100;

        Object[] stringLists = new List<String>[2];
        stringLists[0] = new ArrayList<String>();
        stringLists[1] = new ArrayList<Integer>();
    }
} 
