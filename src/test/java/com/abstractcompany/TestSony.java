package com.abstractcompany;

import model.Phone;
import model.Tablet;
import factory.AbstractCompanyFactory;
import factory.FactoryMaker;
import junit.framework.TestCase;

public class TestSony extends TestCase {

	private static final String COMPANY_NAME="sony";
	public void testIPhone(){
		AbstractCompanyFactory factory = FactoryMaker.getFactory(COMPANY_NAME);
		Phone phone = factory.createPhone();
		System.out.println("testXPeriaPhone:"+phone.getModel());
		assertEquals("XperiaPhone", phone.getModel());
	}
	
	public void testIPad(){
		AbstractCompanyFactory factory = FactoryMaker.getFactory(COMPANY_NAME);
		Tablet tablet= factory.createTablet();
		System.out.println("testXPeriaTablet:"+tablet.getModel());
		assertEquals("XperiaTablet", tablet.getModel());
	}
}
