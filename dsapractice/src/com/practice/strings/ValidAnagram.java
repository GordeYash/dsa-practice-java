package com.practice.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
    	
    	if( s==null || t==null || s.length()!=t.length() )
        	return false;
        
    	char[] ch=s.toCharArray();
    	char [] ch1=t.toCharArray();
    	
    	Arrays.sort(ch);
    	Arrays.sort(ch1);
    	for(int i=0;i<ch.length;i++)
    	{
    		if(ch[i]!=ch1[i])
    			return false;
    	}
        
        return true; // placeholder
    }
}