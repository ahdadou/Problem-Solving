package org.problems;

import java.text.DateFormat;
import java.util.Date;

public class TimeConversion {
    public static void main(String[] args) {
        String time = "06:40:03AM";
        int h = Integer.parseInt(time.substring(0,2));
        String mil = time.substring(8);
        String hs = "";

            if(mil.equals("AM")){
                if(h==12) {hs="00";}
                else hs="0"+h;
            }else{
                if(h>=12) hs=""+h;
                else hs=""+(h+=12);
            }







        System.out.println(hs+time.substring(2,8));
    }
}
