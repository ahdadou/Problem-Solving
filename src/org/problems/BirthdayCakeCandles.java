package org.problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        // Making A virtual List
        List<Integer> list2 = new ArrayList<Integer>();
        Stream.of(1,3,9,5,7,9).forEach(x -> list2.add(x));



//--------------Solution
        int max = Collections.max(list2);
//        long count = list2.stream().filter(i-> i==max).count(); // return Long
        int count=0;
        for (int item:list2){
           if(item==max)count++;
        }
        System.out.println(count);





    }


}
