package com.maosuhan.designpattern.simplefactory;


public class OperationFactory {
   public static IOperation getOperation(Operand operand)
   {
	   IOperation operation=null;
	   switch(operand)
	   {
	   case plus:
		   operation= new PlusOperation();
	break;
	   case minus:
		   operation= new MinusOperation();
	break;
	   case multi:
		   operation= new MultiOperation();
		   break;
	   case div:
		   operation= new DivOperation();
		   break;
	   }
	   return operation;
   }
}
