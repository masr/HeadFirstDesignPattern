package com.maosuhan.designpattern.bridge;

public abstract class HandsetBrand {
protected HandsetSoft soft;

public void setHandsetSoft(HandsetSoft soft){
	this.soft=soft;
}

public abstract void run();
}
