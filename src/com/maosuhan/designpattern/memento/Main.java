package com.maosuhan.designpattern.memento;

/**
 * ��ʵ�����RoleMemento����һ��������DTO�Ķ��������Ľṹ��ʵ�Ǹ������ǵ��������ġ�����װ��������Ҫ
 * �����һϵ�е�״̬���������ýӿ���ʵ�ֶ�״̬�ı���ͻָ������ⲿ���ԣ���
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
