package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1_1 {

	public static void main(String[] args) throws FileNotFoundException{
		String input;
		int dir =0;
		int x=0;
		int y=0;
		//File file = new File("test.txt");
		File file = new File("day1.txt");
		Scanner scan = new Scanner(file);
		input = scan.nextLine();
		input= input.replaceAll(" ", "");
		String[] commands = input.split(",");
		
		for(int z=0;z<commands.length;z++){
			if(commands[z].charAt(0)=='L'){
				dir++;
			}
			else{
				dir--;
			}
			
			if(dir==-1){
				dir=3;
			}
			else if(dir==4){
				dir =0;
			}
			int dis = Integer.parseInt(commands[z].substring(1));
			
			switch(dir){
				case 0: 
					x+=dis;
					break;
				case 1:
					y+=dis;
					break;
				case 2: 
					x-=dis;
					break;
				case 3:
					y-=dis;
					break;
			}
		}
		
		System.out.println("x: "+x+" y: "+y);
		System.out.println(Math.abs(x)+Math.abs(y));
		
	}
}
