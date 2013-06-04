package com.maosuhan.designpattern.simplefactory;

public class Operation {
   public static double getResult(double a,double b,Operand operand)
   {
		double result=0;

	   switch (operand){
	   case plus:
		   result= a+b;
		   break;
	   case minus:
		   result=a-b;
		   break;
	   case multi:
		   result=a*b;
		   break;
	   case div:
		   result=a/b;
		   break;
	   
	   }
	   return result;
   }
}
