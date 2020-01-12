package Part1programmingTwo;
import java.util.*;
import java.io.*;

public class StringReverse {
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		char opt='Y';
		while(opt != 'N'){
			
			System.out.println("Enter the string you want to reverse:");
			String input= br.readLine();
			String rev="";
			
			for(int i=input.length()-1;i>=0;i--){
				rev+= input.charAt(i);
			}
			
			System.out.println("Reversed String:"+rev);
			
			System.out.println("Do you wish to continue ? Press Y  for Yes or N for No");
			opt= (br.readLine().charAt(0));
		}
	}

}
