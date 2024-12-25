package com.printer;

import java.util.List;

public class PrintArray {
	public void printOneDimArrayList(List<String> arr) {
		String array = "[";
		for(int i=0;i<arr.size();i++) {
			array=array.concat(arr.get(i)+",");
		}
		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}
	
	public void printSimpleImtArray(int [] arr) {
		String array = "[";
		for(int i:arr) {
			array=array.concat(arr[i]+",");
		}
		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}
}
