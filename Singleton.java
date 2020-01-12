package Part2;
import java.util.*;
import java.io.*;

public class Singleton {
	private static Singleton s = new Singleton();
	private int value;
	private String msg;
	private Singleton(){
		
		value= 10;
		msg="Default message";
	}
	
	public static Singleton getInstance(){
		
		return s;
	}
	
	public void printvalues(){
		System.out.println("Value: "+value+"Msg:"+msg);
	} 
}
