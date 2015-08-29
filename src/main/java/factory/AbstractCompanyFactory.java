package factory;

import model.Phone;
import model.Tablet;

/**
 * An interface to implement AbstractFactory.
 * @author p.bell
 *
 */
public interface AbstractCompanyFactory {

	 Phone createPhone();
	 Tablet createTablet();
}
