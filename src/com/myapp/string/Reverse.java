package com.myapp.string;

import java.util.ArrayList;
import java.util.Vector;

import org.w3c.dom.ls.LSException;

/**
 * @author Sreeni
 *
 */
public class Reverse {
	/**
	 * @param main
	 */
	public static void main(String[] args) {
		 /*String s="Sachin";  
		   s=s.concat(" Tendulkar");
		   System.out.println(s);*/
		   /*StringBuffer sb= new StringBuffer();
		   sb.append("Two").ensureCapacity(0);
		   System.out.print(sb);*/
		   
		ArrayList<String> list = new ArrayList<String>();
		Vector vector = new Vector();
		   list.add("Sree");
		   list.trimToSize();
		   list.ensureCapacity(0);
		   System.out.println("Capacity "+list.size());
		   
	}
	
}
