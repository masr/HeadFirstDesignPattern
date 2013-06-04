package com.maosuhan.designpattern.visitor;

public class Main {


	public static void main(String[] args) {
        Person msh=new Man("ë����");
        Person loo=new Woman("½����");
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
