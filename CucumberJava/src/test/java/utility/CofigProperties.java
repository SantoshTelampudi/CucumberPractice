package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CofigProperties {

	
	private Properties prop;
	
	public Properties intilizeProp()
	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("src\\test\\resources\\configProperties\\config.properties");
			prop.load(ip);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
}
