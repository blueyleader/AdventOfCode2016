package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2_1 {

	public static void main(String[] args) throws FileNotFoundException{
		String input;
		//File file = new File("test.txt");
		File file = new File("day2.txt");
		Scanner scan = new Scanner(file);
		//input = scan.nextLine();
		int x =1;
		int y =1;
		String code = "";
		
		while(scan.hasNext()){
			input=scan.nextLine();
			for(int a=0;a<input.length();a++){
				switch(input.charAt(a)){
					case 'U':
						if(x!=0){
							x--;
						}
						break;
					case 'D':
						if(x!=2){
							x++;
						}
						break;
					case 'L':
						if(y!=0){
							y--;
						}
						break;
					case 'R':
						if(y!=2){
							y++;
						}
						break;
				}
			}
			code+=x*3+y+1;
			//System.out.println(code);
		}
		System.out.println(code);
		
	}
}
