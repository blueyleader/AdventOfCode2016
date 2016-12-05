package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2_2 {

	public static void main(String[] args) throws FileNotFoundException{
		String input;
		//File file = new File("test.txt");
		File file = new File("day2.txt");
		Scanner scan = new Scanner(file);
		//input = scan.nextLine();
		int x =2;
		int y =0;
		String code = "";
		
		while(scan.hasNext()){
			input=scan.nextLine();
			for(int a=0;a<input.length();a++){
				switch(input.charAt(a)){
					case 'U':
						if(x==0){
							
						}
						else if(x==1){
							if(y!=1 && y!=3){
								x--;
							}
						}
						else if(x==2){
							if(y!=0 && y!=4){
								x--;
							}
						}
						else{
							x--;
						}
						break;
					case 'D':
						if(x==0){
							x++;
						}
						else if(x==1){
							x++;
						}
						else if(x==2){
							if(y!=0 && y!=4){
								x++;
							}
						}
						else if(x==3){
							if(y!=1 && y!=3){
								x++;
							}
						}
						
						break;
					case 'L':
						if(x==1){
							if(y>=2){
								y--;
							}
						}
						else if(x==2){
							if(y>=1){
								y--;
							}
						}
						else if(x==3){
							if(y>=2){
								y--;
							}
						}
						break;
					case 'R':
						if(x==1){
							if(y<=2){
								y++;
							}
						}
						else if(x==2){
							if(y<=3){
								y++;
							}
						}
						else if(x==3){
							if(y<=2){
								y++;
							}
						}
						break;
				}
			}
			if(x==0){
				code+="1";
			}
			else if(x==1){
				code+=y+1;
			}
			else if(x==2){
				code+=y+5;
			}
			else if(x==3){
				char c=(char) ((char)'A'+y-1);
				code+=c;
			}
			else{
				code+="D";
			}
			//System.out.println(code);
		}
		System.out.println(code);
		
	}
}
