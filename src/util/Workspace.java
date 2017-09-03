package util;

/**
 * Class which contains necessary values across project
 * 
 * @author Adam Barák
 */
public class Workspace {
	private static Workspace instance;
	
	/**
	 * Init values for {@link Workspace}
	 */
	public void init() {
		return;
	}
	
	/**
	 * Get {@link Workspace} instance
	 * 
	 * @return actual {@link Workspace} instance
	 */
	public static Workspace getInstance() {
		return instance == null ? new Workspace() : instance;
	}
}
