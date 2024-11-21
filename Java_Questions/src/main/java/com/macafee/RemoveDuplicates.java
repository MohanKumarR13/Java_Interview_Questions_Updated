package com.macafee;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(new ArrayList<>(new HashSet<>(List.of(1, 2, 2, 3, 4, 4, 5, 5, 6))));
        System.out.println(new ArrayList<>(new HashSet<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6))));

    }
}
