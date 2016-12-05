package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4_1 {

	public static void main(String[] args) throws FileNotFoundException{
		String input;
		//File file = new File("test.txt");
		File file = new File("day4.txt");
		Scanner scan = new Scanner(file);
		//input = scan.nextLine();
		int letters[] = new int[26];
		int max;
		int index;
		int sum=0;
		boolean flag;
		
		while(scan.hasNext()){
			input=scan.nextLine();
			letters = new int[26];
			
			for(int x=0;x<input.length()-7;x++){
				if(input.charAt(x)>='a' && input.charAt(x)<='z'){
					letters[input.charAt(x)-'a']++;
				}
			}
			flag=true;
			for(int z=0;z<5;z++){
				max=0;
				index=0;
				for(int y=0;y<letters.length;y++){
					if(letters[y]>max){
						max=letters[y];
						index=y;
					}
				}
				
				if(index==input.charAt(input.length()-6+z)-'a'){
					letters[index]=0;
				}
				else{
					flag=false;
				}
			}
			
			if(flag){
				sum+=Integer.parseInt(input.substring(input.lastIndexOf("-")+1,input.indexOf("[")));
			}
		}
		
		System.out.println(sum);	
	}
}	