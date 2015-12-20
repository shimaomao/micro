package com.hashnot.u.collections;

/**
 * @author Rafał Krupiński
 */
public class Comparables {

    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}
