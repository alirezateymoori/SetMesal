package com.demisco;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Ali");
        set.add("Taghi");
        set.add("Ali");
        set.add("Taghi");
        System.out.println(set.size());
        System.out.println(set.contains("Ali"));
        for (String s : set) {
            System.out.println(s);
        }
        set.remove("Ali");
        System.out.println(set.contains("Ali"));
        System.out.println(set.contains("Taghi"));
        set.clear();
        System.out.println(set.size());

    }
}