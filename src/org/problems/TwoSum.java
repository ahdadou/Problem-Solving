package org.problems;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(7);
        nums.add(3);

        int target = 6;
        int da=0,db=0;
        int[] result=new int[2];


        for(int i=0;i<nums.size()-1;i++){
            da=nums.get(i);
            for(int j=i+1;j<nums.size();j++){
                db=nums.get(j);
                if((da+db)==target){
                    result[0]=i;
                    result[1]=j;
                    System.out.println(i + " "+j);
                }
            }
        }
    }



}
