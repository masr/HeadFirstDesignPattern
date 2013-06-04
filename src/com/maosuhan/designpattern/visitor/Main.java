package com.maosuhan.designpattern.visitor;

public class Main {


	public static void main(String[] args) {
        Person msh=new Man("Ã«ËÕêÏ");
        Person loo=new Woman("Â½æÂæÂ");
        Action success=new Success();
        msh.accept(success);
        loo.accept(success);
        Action fail=new Fail();
        Action love=new Love();
        CompositeAction multiAction=new CompositeAction();
        multiAction.addAction(fail);
        multiAction.addAction(love);
        msh.accept(multiAction);
        loo.accept(multiAction);
	}

}
