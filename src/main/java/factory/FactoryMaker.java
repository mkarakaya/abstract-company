package factory;

/**
 * a class to instantiate factory
 * @author p.bell
 *
 */
public class FactoryMaker {

	/**
	 * @param choice : has two valid values: sony and apple otherwise returns null.
	 * @return
	 */
	public static AbstractCompanyFactory getFactory(String choice) {
		AbstractCompanyFactory pf=null;
		if (choice.equals("sony")) {
			pf = SonyFactory.getInstance();
		} else if (choice.equals("apple")) {
			pf = AppleFactory.getInstance();
		}
		return pf;
	}
}
