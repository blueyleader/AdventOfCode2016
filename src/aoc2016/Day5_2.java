package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Day5_2 {

	public static void main(String[] args) throws FileNotFoundException, NoSuchAlgorithmException{
		String input;
		//File file = new File("test.txt");
		File file = new File("day5.txt");
		Scanner scan = new Scanner(file);
		input = scan.nextLine();
		String temp = null;
		int x=0;
		char done[]=new char[8];
		boolean flag = false;
		String out="1111111";
		MessageDigest md = MessageDigest.getInstance("MD5");
		while(!flag){
			flag=true;
			while(!out.substring(0,5).equals("00000")){
				x++;
				temp=input+x;
				md.reset();
				md.update(temp.getBytes(),0,temp.length());	
				byte[] thedigest = md.digest();
				out=javax.xml.bind.DatatypeConverter.printHexBinary(thedigest);
			}
			//done+=temp.charAt(6);
			if(out.charAt(5)>='0' &&out.charAt(5)<='7'){
				if(done[out.charAt(5)-'0']=='\0'){
					done[out.charAt(5)-'0']=out.charAt(6);
				}
			}
			for(int b=0;b<done.length;b++){
				if(done[b]=='\0'){
					flag=false;
				}
			}
			
			
			out="1111111";
		}
		//System.out.println(out);
		for(int a=0;a<done.length;a++){
			System.out.print(done[a]);
		}
	}
		
}	