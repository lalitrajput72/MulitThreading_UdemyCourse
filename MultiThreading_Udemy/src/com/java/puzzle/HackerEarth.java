package com.java.puzzle;

import java.util.ArrayList;
import java.util.List;

import java.util.*;
//Manhattan distance between two point
/*
 * class HackerEarth { public static void main(String args[]) {
 * ArrayList<Double> vals = new ArrayList<>(); vals.add(1.0); vals.add(4.0);
 * vals.add(16.0); Spliterator<Double> spltitr = vals.spliterator();
 * while(spltitr.tryAdvance((n) -> System.out.print(" "+n)));
 * System.out.println(); spltitr = vals.spliterator(); ArrayList<Double> sqrs =
 * new ArrayList<>(); while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
 * spltitr = sqrs.spliterator(); spltitr.forEachRemaining((n) ->
 * System.out.print(" "+n)); } }
 */

class HackerEarth
{
static int val = 3;

static int getValue()
{
    return val--;
}

public static void main(String args[])
{
    int n;
    for(int i=0; i < 5; i++)
    {
        n = getValue();
        assert n > 2;
        System.out.println(" " + n);
    }
}
}