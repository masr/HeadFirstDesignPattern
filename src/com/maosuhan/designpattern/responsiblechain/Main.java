package com.maosuhan.designpattern.responsiblechain;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      Manager commonManager=new CommonManager(50);
      Manager majordomo=new Majordomo(70);
      Manager generalManager=new GeneralManager(100);
      
      commonManager.setSuperior(majordomo);
      majordomo.setSuperior(generalManager);
      
      Request request=new Request("我要加薪啊！我要加薪啊！",90,RequestType.PLUSSALARY);
      commonManager.requestApplication(request);
      System.out.println("请求被"+(request.isApproved()?"批准了":"否决了"));
	}

}
