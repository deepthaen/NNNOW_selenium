package webAutomation.Nnnow.commomUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
	
	public static String getPropertyVal(String val) {
		 Properties prop = new Properties();
		 try {
			prop.load(new FileInputStream("./config.properties"));
			String ref = prop.getProperty(val);
			return ref;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return null;
	}
}
