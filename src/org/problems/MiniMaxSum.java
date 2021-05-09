package org.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MiniMaxSum {

    public static void main(String[] args) {
// Making A virtual List
        List<Integer> list2 = new ArrayList<Integer>();
        Stream.of(1,3,5,7,9).forEach(x -> list2.add(x));

//---------- Solution
        Collections.sort(list2);
        long sum = list2.stream().mapToLong(i -> i).sum();
//      int sum = list2.stream().reduce(0, Integer::sum);
        long min = sum-list2.get(4);
        long max = sum-list2.get(0);
        System.out.println(min +" "+max);

//----------- Condition If We Have array
//        int[] array ={1,4,5,8,2};
//        long[] longs = Arrays.stream(array).asLongStream().toArray();
//        Arrays.sort(longs);
//        long sum = Arrays.stream(longs).sum();
//        long min = sum-longs[4];
//        long max = sum-longs[0];
//        System.out.println(min +" "+max);



    }








}
