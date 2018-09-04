package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author archit.singhal
 *
 */

public class ConfigReader {

	Properties prop;

	/*
	 * Description: Method to load the property file
	 */
	public ConfigReader() {

		try {

			File src = new File("./src/propertyfile/Propertyfile.property");
			FileInputStream fs = new FileInputStream(src);

			prop = new Properties();
			prop.load(fs);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public String getUrl() {
		return prop.getProperty("url");
	}

	public String getUserName() {
		return prop.getProperty("eid");
	}

	public String getPassWord() {
		return prop.getProperty("password");
	}

	public String getservicestring() {
		return prop.getProperty("servicestring");
	}

	public String getfilelocation() {
		return prop.getProperty("filelocation");
	}

	public String getfilename() {
		return prop.getProperty("filename");
	}

	public String getfilenameforprojectstaff() {
		return prop.getProperty("projectstaff");
	}
	
	public String getfilenameforprojectstaffactuals() {
		return prop.getProperty("projectstaffactuals");
	}
	
	public String getfilenameforprojectartifacts() {
		return prop.getProperty("projectartifacts");
	}
	
	public String getfilenameforSDOStaff() {
		return prop.getProperty("sdofilename");
	}
	
	public String getfilenameforInvalidSDOStaff() {
		return prop.getProperty("sdofilename1");
	}
	
	public String getfilenameTTTTracker() {
		return prop.getProperty("trainthetrainerTTTtracker");
	}
	
	
	public String getfilenameDTTTracker() {
		return prop.getProperty("dtttrackerfile");
	}
	
	public String getfilenameTWETracker() {
		return prop.getProperty("twetrackerfile");
	}
	
	public String getfilenameTWEAccTracker() {
		return prop.getProperty("tweacctrackerfile");
	}
	
	
	
	public String getfilenameTTTAssess() {
		return prop.getProperty("tttassessment");
	}
	
	

	public String getfilenameDTTAssess() {
		return prop.getProperty("dttassessment");
	}
	
	public String getfilenameforSDOStaff1() {
		return prop.getProperty("sdofilename1");
	}
	
	
	
	public String getfilenameforWaveSetUp() {
		return prop.getProperty("wavesetup");
	}
	
	public String getfilenameforExecutionSummary() {
		return prop.getProperty("executionsummary");
	}
	
	
	public String getfilenameforWaveWrkstrmSetUp() {
		return prop.getProperty("waveworkstrmsetup");
	}
	
	
	public String getfilenameforProjectUserAccess() {
		return prop.getProperty("projectUseraccess");
	}
	
	public String getfilenameforPlanSetUp() {
		return prop.getProperty("planSetup");
	}
	
	
	public String getfilenameforProjectPlanActuals() {
		return prop.getProperty("projectplanactuals");
	}

	
	public String getfilenameforTravelTracker() {
		return prop.getProperty("TTfilename");
	}
	
	
	
	public String getInvalidWavefileforSDOStaff() {
		return prop.getProperty("sdowavefile");
	}
	
	
	public String getInvalidWavefileforTT() {
		return prop.getProperty("TTwavefile");
	}

	
	
}
