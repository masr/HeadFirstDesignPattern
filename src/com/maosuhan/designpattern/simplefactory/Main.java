package com.maosuhan.designpattern.simplefactory;

public class Main {
  public static void main(String args[])
  {
	  double v1=Operation.getResult(1, 2.2, Operand.plus);
	  assert(v1==1.3);
	  System.out.println("success");
  }
}
