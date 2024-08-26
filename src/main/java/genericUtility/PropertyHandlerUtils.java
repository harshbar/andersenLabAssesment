package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandlerUtils {
	
	public static String propertyDataFetch(String key) throws IOException {
		FileInputStream fis = new FileInputStream(Constant.propFilePath);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
		
	
	}

}
