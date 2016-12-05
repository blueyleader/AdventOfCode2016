package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3_1 {

	public static void main(String[] args) throws FileNotFoundException{
		String input;
		//File file = new File("test.txt");
		File file = new File("day3.txt");
		Scanner scan = new Scanner(file);
		//input = scan.nextLine();
		String i[];
		int s[] = new int[3];
		
		int count=0;
		boolean flag;
		while(scan.hasNext()){
			input=scan.nextLine();
			flag=true;
			input.trim();
			input=input.replace("    ", " ");
			input=input.replace("   ", " ");
			input=input.replace("  ", " ");
			i= input.split(" ");
			s[0]=Integer.parseInt(i[1]);
			s[1]=Integer.parseInt(i[2]);
			s[2]=Integer.parseInt(i[3]);
			
			if(s[0]+s[1]<=s[2] || s[0]+s[2]<=s[1] || s[1]+s[2]<=s[0]){
				//count++;
			}
			else{
				count++;
			}
			
			
		}
		System.out.println(count);

		
	}
}
