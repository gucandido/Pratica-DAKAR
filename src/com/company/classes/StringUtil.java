package com.company.classes;

public class StringUtil {

    public static String lPad(String s, char c, int length){
        return String.format("%1$" + length + "s", s).replace(' ', c);
    }

    public static String rPad(String s, char c, int length){
        return String.format("%1$-" + length + "s", s).replace(' ', c);
    }

    public static String lTrim(String s){
        return s.replaceAll("^\\s+", "");
    }

    public static String rTrim(String s){
        return s.replaceAll("\\s+$", "");
    }

    public static String trim(String s){
        return s.trim();
    }

    public static int indexOfN(String s, char c, int n){

        int ret = -1;
        int occ = 0;

        for (int i = 0; i < s.length(); i++){

            if(s.charAt(i) == c)
                occ++;

            if(occ == n){
                ret = i;
                break;
            }

        }

        return ret;

    }

}
