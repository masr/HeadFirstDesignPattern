package com.maosuhan.designpattern.responsiblechain;


public class Request {
  private boolean approved=false;
  private int privilege;
  private String content;
  private int type;
  public Request(String content,int privilege,int type)
  {
	  this.content=content;
	  this.privilege=privilege;
	  this.type=type;
  }
  
  public String getContent(){
	  return content;
  }
  
  public int getPrivilege(){
	  return privilege;
  }
  
  public void approve(){
	
	  this.approved=true;
  }
  
  public boolean isApproved(){
	  return approved;
  }
  
  public void deny(){
	  approved=false;
  }
  
  public int getType(){
	  return type;
  }
  
  
  
  
}
