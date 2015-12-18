package model;

import java.util.ArrayList;

public class TestAdapter
{
 		   
		 public static void main(String[] args)  
		 {  
		  ArrayList<String> list=new  ArrayList<String>();  
		  list.add("one");  
		  list.add("two");  
		  list.add("three"); 
		  
		  Target a=new Adapter();  
		  a.printList(list);  
		 }  
		}  


