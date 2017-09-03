package util;

/**
 * Class for static logical methods used across project
 * 
 * @author Adam Barák
 */
public abstract class Convert {
	
	/**
	 * True if stringValue is null or empty string
	 * 
	 * @param stringValue
	 * @return true if stringValue is null or empty string
	 */
	public static boolean isBlank(String stringValue) {
		if (stringValue == null || stringValue.equals("")) {
			return true;
		}
		return false;
	}
	
	/**
	 * False if stringValue is null or empty string
	 * 
	 * @param stringValue
	 * @return false if stringValue is null or empty string
	 */
	public static boolean isNotBlank(String stringValue) {
		return !isBlank(stringValue);
	}
	
	/**
	 * Parse string to integer
	 * 
	 * @param stringValue
	 * @return integer value of stringValue, , if string is blank or not number, return -1
	 */
	public static int stringToInt(String stringValue) {
		if (isBlank(stringValue)) {
			return -1;
		}
		
		try {
			return Integer.parseInt(stringValue);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	/**
	 * Parse string to double
	 * 
	 * @param stringValue
	 * @return double value of stringValue, if string is blank or not number, return -1
	 */
	public static double stringToDouble(String stringValue) {
		if (isBlank(stringValue)) {
			return -1;
		}
		
		try {
			return Double.parseDouble(stringValue);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return -1;
		}	
	}
	
	/**
	 * Parse string to boolean
	 * 
	 * @param stringValue
	 * @return stringValue is true, TRUE, y, Y then true, else false
	 */
	public static boolean stringToBoolean(String stringValue) {
		if (isNotBlank(stringValue) && (stringValue.toLowerCase() == "true" || stringValue.toUpperCase() == "Y")) {
			return true;
		}
		return false;
	}
}
