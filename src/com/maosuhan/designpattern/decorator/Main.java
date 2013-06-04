package com.maosuhan.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b[]=new byte[1000];
     int c;
     
     try {
		InputStream inputStream=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("a.txt")));
	    int len=inputStream.read(b);
	    
	    for(int i=0;i<len;i++)
	    	System.out.print((char)b[i]);
	    
//		while((c=inputStream.read())>=0){
//		System.out.print((char)c);
//	}

		inputStream.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}

}
