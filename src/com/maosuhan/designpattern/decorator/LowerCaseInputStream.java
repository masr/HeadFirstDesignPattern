package com.maosuhan.designpattern.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream{
    
	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException{
		int c=super.read();
		return c==-1?c:Character.toLowerCase(c);
	}
	public int read(byte[] b) throws IOException{
		int result=super.read(b);
		for(int i=0;i<result;i++)
			b[i]=(byte)Character.toLowerCase(b[i]);
			
			return result;
		}
		
	}


