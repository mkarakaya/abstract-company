package factory;

import model.Phone;
import model.SonyPhone;
import model.SonyTablet;
import model.Tablet;

public class SonyFactory  implements AbstractCompanyFactory{

	private static SonyFactory instance;
	private SonyFactory()
	{
		
	}
	public static  AbstractCompanyFactory getInstance()
	{
		if (instance == null) {
			synchronized (SonyFactory.class) {
				if (instance == null) {
					instance = new SonyFactory();
				}
			}
		}
		return instance;
	}
	public Phone createPhone() {
		return new SonyPhone();
	}

	public Tablet createTablet() {
		return new SonyTablet();
	}

}
