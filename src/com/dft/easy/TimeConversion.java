package com.dft.easy;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

public class TimeConversion {


    public static String timeConversion(String s) {
        int hh;
        String mm, ss;
        hh = Integer.parseInt(s.substring(0, 2));
        mm = s.substring(3, 5);
        ss = s.substring(6, 8);

        if (s.charAt(8) == 'A' && hh == 12) {
            return s.replaceFirst("12", "00").replaceAll("AM", "");
        } else if (s.charAt(8) == 'P' && hh == 12) {
            return s.replaceAll("PM", "");
        }
        else if (s.charAt(8) == 'A') {
            return s.replaceAll("AM", "");
        } else {
            hh += 12;
        }

        String result = Integer.toString(hh) + ":" + mm + ":" + ss;
        return result;
    }


    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }

}
