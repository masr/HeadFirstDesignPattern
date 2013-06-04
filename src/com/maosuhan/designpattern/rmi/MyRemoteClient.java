package com.maosuhan.designpattern.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
   public static void main(String args[]){
	   new MyRemoteClient().go();
   }
   
   public void go(){
	   try {
		MyRemote serviceMyRemote=(MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
	    String s=serviceMyRemote.sayHello();
	    System.out.println(s);
	   } catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NotBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
}
