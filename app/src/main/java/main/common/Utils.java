package main.common;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import org.apache.log4j.Logger;

public class Utils {
	
	public static Long getNextId(Set<Long> set) {
		Long id = 0L;
		
		id = set.stream().mapToLong(v -> v).max().orElse(0L);
		id += 1;
		
		
		return id;
	}

	public static String getResourceFolder() {
		Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
         
        return absolutePath;
		
	}
	
	public static void log(String errorMessage, ErrCode errCode) {
		
		Logger logger = Logger.getLogger(Utils.class);
		
		switch(errCode) {
		
			case EMPTYSTRING:
				logger.error("***** " + errorMessage + " *****");
				break;
			case FILENOTFOUND:
				logger.error("***** " + errorMessage + " *****");
				break;
			case NULLOBJECT:
				logger.error("***** " + errorMessage + " *****");
				break;
			default:
				logger.error("--- UNKNOWN ERROR CODE: " + errorMessage);
				break;
		}

		
	}
	
	
}
