package generalUtils;

import java.util.Random;



public class JavaUtils {
	public int getRandomNumber(int limit) {
		return new Random().nextInt(limit);
	}
	/**
	 * This method is used to convert string to any data type based on strategy
	 * @return 
	 * @return 
	 * 
	 * 
	 */
	public Object convertStringtoAnyDatatype(String data,DataTypesConversion strategy) {
		Object obj=null;
		if(strategy.toString().equalsIgnoreCase("long")) {
			obj=Long.parseLong(data);
		}
		
		else if(strategy.toString().equalsIgnoreCase("int")) {
			obj=Integer.parseInt(data);
		}
		
		else if(strategy.toString().equalsIgnoreCase("double")) {
			obj=Double.parseDouble(data);
		}
		return obj;
		
	}
}
