package com.printer;

import java.util.List;

import linkedList.Node;

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
		for(int i=0;i<arr.length;i++) {
			array=array.concat(arr[i]+",");
		}
		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}
	public void printSimpleStringArray(String [] arr) {
		String array = "[";
		for(int i=0;i<arr.length;i++) {
			array=array.concat(arr[i]+",");
		}
		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}
	
	public void printSimpleCharArray(char [] arr) {
		String array = "[";
		for(int i=0;i<arr.length;i++) {
			array=array.concat(arr[i]+",");
		}
		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}
	
	public void printLinkedList(Node head) {
		String array = "[";
		Node temp = head;

		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}
	public void print2dArray(int[][] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}

	}
}
