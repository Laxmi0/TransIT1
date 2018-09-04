package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader2 {
	Properties prop;
	
	public ConfigReader2()
	{ 
		
		
try {
			
			File src=new File("./src/propertyfile/Propertyfile.property");
			FileInputStream fs=new FileInputStream(src);
			
			prop=new Properties();
			prop.load(fs);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		}
	
	public String getProp(String Key)
	{
		return prop.getProperty(Key);
	}
	
	public String getUrl()
	{
		return prop.getProperty("url");
	}
	
			
	
	public String getUserName()
	{
		return prop.getProperty("enterpriseid");
	}
	
	public String getPassWord()
	{
		return prop.getProperty("password");
	}
	
	public String getBrowser()
	{
		return prop.getProperty("Browser");
	}
	

}
