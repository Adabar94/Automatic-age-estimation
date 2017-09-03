package core;

import util.Workspace;

/**
 * Main application class
 * 
 * @author Adam Bar�k
 */
public class Main {
	
	/**
	 * Main application method
	 * 
	 * @param args input arguments
	 */
	public static void main(String[] args) {
		Workspace instance = Workspace.getInstance();
		instance.init();
	}
}
