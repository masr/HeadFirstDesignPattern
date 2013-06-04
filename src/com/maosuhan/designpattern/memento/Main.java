package com.maosuhan.designpattern.memento;

/**
 * 其实这里的RoleMemento就是一个类似于DTO的东西，它的结构其实是根据我们的需求来的。它封装了我们需要
 * 保存的一系列的状态。我们利用接口来实现对状态的保存和恢复（对外部而言）。
 * @author maosuhan
 *
 */
public class Main {

   
	public static void main(String[] args) {
		 GameRole lixiaoyao=new GameRole();
         lixiaoyao.initState();
         lixiaoyao.stateDisplay();
         RoleStateCaretaker stateCaretaker=new RoleStateCaretaker();
         stateCaretaker.setMemento(lixiaoyao.getSavedState());
         lixiaoyao.fight();
         lixiaoyao.stateDisplay();
         lixiaoyao.recoveryState(stateCaretaker.getMemento());
         lixiaoyao.stateDisplay();
	}

}
