package com.abstractcompany;

import model.Phone;
import model.Tablet;
import factory.AbstractCompanyFactory;
import factory.FactoryMaker;
import junit.framework.TestCase;

public class TestApple extends TestCase {

	
	private static final String COMPANY_NAME="apple";
	public void testIPhone(){
		AbstractCompanyFactory factory = FactoryMaker.getFactory(COMPANY_NAME);
		Phone phone = factory.createPhone();
		System.out.println("testIPhone:"+phone.getModel());
		assertEquals("IPhone", phone.getModel());
	}
	
	public void testIPad(){
		AbstractCompanyFactory factory = FactoryMaker.getFactory(COMPANY_NAME);
		Tablet tablet= factory.createTablet();
		System.out.println("testIPad:"+tablet.getModel());
		assertEquals("IPad", tablet.getModel());
	}
}
