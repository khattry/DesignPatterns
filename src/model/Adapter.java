package model;

import java.util.ArrayList;

public class Adapter extends Adaptee implements Target
{  
	  
	 public void printList(ArrayList<Person> list) {  
	   
	  //Converting ArrayList<String> to String so that we can pass String to  
	  // adaptee class  
	  String str = "";  
	  for (Person p : list)  
	  {  
	      str += p.toString() + "\n";  
	  }  
	    
	  // instantiating adaptee class  
//	  PrintString ps=new PrintString();  
	  //ps.print(listString);  
	  super.print(str);
	 }  
	}  


