package factory;

import model.ApplePhone;
import model.AppleTablet;
import model.Phone;
import model.Tablet;

/**
 * extends AbstractCompanyFactory for Apple products.
 * @author p.bell
 *
 */
public class AppleFactory implements AbstractCompanyFactory{

	private static AppleFactory instance;
	private AppleFactory()
	{
		
	}
	public static AbstractCompanyFactory getInstance()
	{
		if (instance == null) {
			synchronized(AppleFactory.class) {
				if (instance == null) {
					instance = new AppleFactory();
				}
			}
		}
		return instance;
	}
	public Phone createPhone() {
		return new ApplePhone();
	}

	public Tablet createTablet() {
		return new AppleTablet();
	}

}
