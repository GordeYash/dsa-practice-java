package com.practice.arrays;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
    	Map<String,List<String>> data=new HashMap<String, List<String>>();
    	
    	for(String str:strs)
    	{
    		char[] ch=str.toCharArray();
    		
    		Arrays.sort(ch);
    		String st=new String(ch);
    		if(!data.containsKey(st))
    		{
    			data.put(st, new ArrayList<>());
    		}
    		data.get(st).add(str);
    	
    		
    	}
    	return new ArrayList<List<String>>(data.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}