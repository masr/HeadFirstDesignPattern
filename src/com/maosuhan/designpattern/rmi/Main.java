package com.maosuhan.designpattern.rmi;

import java.rmi.Naming;

public class Main {
  public static void main(String args[]){
	  MyRemote service;
	try {
		service = new MyRemoteImpl();
		  Naming.rebind("RemoteHello", service);

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
