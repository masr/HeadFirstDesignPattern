package com.maosuhan.designpattern.mediator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnitedNations unscCouncil=new UnitedNationsSecurityCouncil();
   Country usa=new USA(unscCouncil);
   Country iraq=new Iraq(unscCouncil);
   unscCouncil.setCountries(new Country[]{usa,iraq});
   usa.claim("����Ҫ����������");
   iraq.claim("������Ҫ������԰");
	}

}
