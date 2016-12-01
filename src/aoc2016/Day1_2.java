package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1_2 {

	public static void main(String[] args) throws FileNotFoundException{
		String input;
		int dir =0;
		int x=500;
		int y=500;
		int newx=500;
		int newy=500;
		int xc=0;
		int yc=0;
		int grid[][] = new int [1000][1000];
		boolean flag = true;
		
		//File file = new File("test.txt");
		File file = new File("day1.txt");
		Scanner scan = new Scanner(file);
		input = scan.nextLine();
		input= input.replaceAll(" ", "");
		String[] commands = input.split(",");
		
		for(int z=0;z<commands.length && flag;z++){
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
					newx=x+dis;
					newy=y;
					xc=1;
					yc=0;
					break;
				case 1:
					newy=y+dis;
					newx=x;
					yc=1;
					xc=0;
					break;
				case 2: 
					newx=x-dis;
					newy=y;
					xc=-1;
					yc=0;
					break;
				case 3:
					newy=y-dis;
					newx=x;
					yc=-1;
					xc=0;
					break;
			}
			
			while(!(x==newx && y==newy)){
				if(grid[x][y]==0){
				grid[x][y]=1;
				}
				else{
					flag=false;
					break;
				}
				x+=xc;
				y+=yc;
			}
			
		}
		
		System.out.println("x: "+x+" y: "+y);
		System.out.println(Math.abs(x-500)+Math.abs(y-500));
		
	}
}
