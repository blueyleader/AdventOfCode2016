package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3_2 {

	public static void main(String[] args) throws FileNotFoundException{
		String input;
		//File file = new File("test.txt");
		File file = new File("day3.txt");
		Scanner scan = new Scanner(file);
		//input = scan.nextLine();
		String i[];
		int s1[] = new int[3];
		int s2[] = new int[3];
		int s3[] = new int[3];
		int count=0;
		boolean flag;
		while(scan.hasNext()){
			input=scan.nextLine();
			input.trim();
			input=input.replace("    ", " ");
			input=input.replace("   ", " ");
			input=input.replace("  ", " ");
			i= input.split(" ");
			s1[0]=Integer.parseInt(i[1]);
			s1[1]=Integer.parseInt(i[2]);
			s1[2]=Integer.parseInt(i[3]);
			
			input=scan.nextLine();
			input.trim();
			input=input.replace("    ", " ");
			input=input.replace("   ", " ");
			input=input.replace("  ", " ");
			i= input.split(" ");
			s2[0]=Integer.parseInt(i[1]);
			s2[1]=Integer.parseInt(i[2]);
			s2[2]=Integer.parseInt(i[3]);
			
			input=scan.nextLine();
			input.trim();
			input=input.replace("    ", " ");
			input=input.replace("   ", " ");
			input=input.replace("  ", " ");
			i= input.split(" ");
			s3[0]=Integer.parseInt(i[1]);
			s3[1]=Integer.parseInt(i[2]);
			s3[2]=Integer.parseInt(i[3]);
			
			if(s1[0]+s2[0]<=s3[0] || s1[0]+s3[0]<=s2[0] || s2[0]+s3[0]<=s1[0]){
				//count++;
			}
			else{
				count++;
			}
			if(s1[1]+s2[1]<=s3[1] || s1[1]+s3[1]<=s2[1] || s2[1]+s3[1]<=s1[1]){
				//count++;
			}
			else{
				count++;
			}
			if(s1[2]+s2[2]<=s3[2] || s1[2]+s3[2]<=s2[2] || s2[2]+s3[2]<=s1[2]){
				//count++;
			}
			else{
				count++;
			}
			
			
		}
		System.out.println(count);

		
	}
}
