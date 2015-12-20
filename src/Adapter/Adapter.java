package Adapter;

import java.util.ArrayList;

public class Adapter  extends Adaptee implements Target
{   
	  
	 public void printList(ArrayList<Person> list) {  
	   
	  String str = "";  
	  for (Person p : list)  
	  {  
	      str += p.toString() + "\n";  
	  }  
	    
	  // instantiating adaptee class  
		//Adaptee ad=new Adaptee();  
		//ad.print(str);  
	 super.print(str);
	 }  
	}  


