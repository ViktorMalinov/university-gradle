package main.common;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

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
	
	
}
