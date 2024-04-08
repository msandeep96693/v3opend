package Config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	public Properties prop;
	
	
	
	public ConfigReader() { 
	
//	public static void InitialiseProperties() {

		prop = new Properties();
		File configFile = new File(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
		try {
		FileInputStream fis = new FileInputStream(configFile);
		prop.load(fis);
		} catch(Throwable e) {
			e.printStackTrace();
		}
		
		
		
		
}
}