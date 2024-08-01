package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedWord {

	
	 public static String second_repeat(String[] arr, int n) {
	       HashMap<String,Integer> map = new HashMap<String,Integer>();
	       String str = null;
	       for(int i=0; i< n;i++){
	    	   if(map.containsKey(arr[i])) {
	    		  map.put(arr[i],map.get(arr[i])+1);
	    	   } else {
	    		   map.put(arr[i], 1);
	    		   
	    	   }
	       }
	       int max = Collections.max(map.values());
	       ArrayList<Integer> myList = new ArrayList<>();
	       
	       for(Map.Entry<String, Integer> entry : map.entrySet()) {
	    	  if(entry.getValue() != max) {
	    		  myList.add(entry.getValue());
	    	  }
	       }
	       Collections.sort(myList);
	       for(Map.Entry<String, Integer> entry1 : map.entrySet()) {
	    	  if(entry1.getValue() == myList.get(myList.size()-1)) {
	    		 return entry1.getKey().toString();
	    	  }
	       }
	       return "-1";
	  }
	
	public static void main(String[] args) {
		//String[] str = {"aaa","ccc","ddd","aaa","bbb","aaa","bbb"};
		String[] str = {"a","c","c","c","d","d"};
		int n = str.length;
		String s = second_repeat(str ,n);
		System.out.println("Second Most Repeated Word from the given array of strings is :"+s);
	}

}
