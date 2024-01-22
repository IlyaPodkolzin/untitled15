package com.company;

import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;
import java.util.Arrays;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        String[] zoo =
                {"Farm","Zoo","Car","Apple","Bee","Golf","Bee","Dog","Golf","Zoo","Zoo","Bee","Bee","Apple"};
        System.out.println(Arrays.asList(zoo));
        guavaSort(zoo);
        System.out.println(Arrays.asList(zoo));
    }
    public static void guavaSort(String[] arr) {
        Multiset<String> multiset = TreeMultiset.create();
        multiset.addAll(Arrays.asList(arr));
        int i = 0;
        for (String item : multiset) {
            arr[i]= item;
            i++;
        }
    }
}