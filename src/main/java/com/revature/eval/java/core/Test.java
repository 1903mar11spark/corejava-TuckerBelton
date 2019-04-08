package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {

	public static void main(String[] args) {
		
		List<Integer> sortedList=ArrayLsit<Integer>();
	System.out.println(indexOf(""));

		
	}
	
	static class BinarySearch<T> {
		private List<T> sortedList;

		public void lessThan(int u, int x, T t) {
			if(u<x) {
				x=Math.round(x/2);
				if(sortedList.get(x)==t&&x>0) {
					
			}else if(u<x) {
				lessThan(u,x,t);
			}else if(u>x) {
				moreThan(u,x,t);
			}
		}}
		
		public void moreThan(int u, int x, T t) {
			if(u>x) {
				x=(int) Math.round(x*1.5);
				if(sortedList.get(x)==t&&x<sortedList.size()) {
					
				}	else if(u<x) {
					lessThan(u,x,t);
				}else if(u>x) {
					moreThan(u,x,t);
				}
			}}
		
		
		public int indexOf(T t) {
			//input is value being searched for, find it and return the location using a binary search
			int y=sortedList.size();
			int x=Math.round(y/2);
			if(sortedList.get(x)==t) {
		
			}
			else if(t instanceof Integer) {
				Integer u=(Integer) t;	
				if(u<x) {
					lessThan(u,x,t);
				}else if (u>x) {
					moreThan(u,x,t);
				}	
			}
			return x;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}
}




