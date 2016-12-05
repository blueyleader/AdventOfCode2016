package aoc2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Day5_1 {

	public static void main(String[] args) throws FileNotFoundException, NoSuchAlgorithmException{
		String input;
		//File file = new File("test.txt");
		File file = new File("day5.txt");
		Scanner scan = new Scanner(file);
		input = scan.nextLine();
		String temp = null;
		int x=0;
		String done="";
		String out="1111111";
		MessageDigest md = MessageDigest.getInstance("MD5");
		for(int z=0;z<8;z++){
			while(!out.substring(0,5).equals("00000")){
				x++;
				temp=input+x;
				md.reset();
				md.update(temp.getBytes(),0,temp.length());	
				byte[] thedigest = md.digest();
				out=javax.xml.bind.DatatypeConverter.printHexBinary(thedigest);
			}
			//done+=temp.charAt(6);
			done+=out.charAt(5);
			out="1111111";
		}
		//System.out.println(out);
		System.out.println(done);
	}
		
}	