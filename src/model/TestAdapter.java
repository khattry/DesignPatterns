package model;

import java.util.ArrayList;

public class TestAdapter
{
 		   
		 public static void main(String[] args)  
		 {  
		  ArrayList<Person> list=new  ArrayList<Person>();  
		  list.add(new Person("khattry","ould"));  
		  list.add(new Person("heba","emam"));  
		  list.add(new Person("julia","klein")); 
		  
		  Target a=new Adapter();  
		  a.printList(list);  
		 }  
		}  


