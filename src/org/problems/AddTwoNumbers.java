package org.problems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddTwoNumbers {

    public static void main(String[] args) {
        String word="lkhkjhkjhjkh";
//        Transform From String To ListOfStrings
        List<String> asList = Stream.of(word.split("")).collect(Collectors.toList());
//       Solving
        int count=0;
        List<List<Striging>> listOflist = new ArrayList<>();
       do{

           List<String> listCount = new ArrayList<>();

           for(int i=count;i<asList.size();i++){
               if(listCount.indexOf(asList.get(i))!=-1) break;
               listCount.add(asList.get(i));
           }
            count++;
           listOflist.add(listCount);
       }while (count<=asList.size());

       if(word.equals(""))
           System.out.println(0);
       else
        System.out.println(listOflist.stream().max(Comparator.comparingInt(List::size)).get().size());


    }








}



