package com.maosuhan.designpattern.memento;
//Originator
public class GameRole {
	
	private int vit;
	private int atk;
	private int def;
	public RoleMemento getSavedState()
	{
		return (new RoleMemento(vit,atk,def));
	}
	
	public void recoveryState(RoleMemento memento)
	{
		this.vit=memento.getVit();
		this.atk=memento.getAtk();
		this.def=memento.getDef();
	}
	
	public void stateDisplay(){
		System.out.println("��ɫ��ǰ״̬��");
		System.out.println("������"+this.vit);
		System.out.println("��������"+this.atk);
		System.out.println("��������"+this.def);
	}
	public void initState()
	{
		this.vit=100;
		this.atk=100;
		this.def=100;
	}
	
	public void fight()
	{
		this.vit=0;
		this.atk=0;
		this.def=0;
	}

}














