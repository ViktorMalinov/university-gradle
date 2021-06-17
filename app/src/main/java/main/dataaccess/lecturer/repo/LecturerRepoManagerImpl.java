package main.dataaccess.lecturer.repo;

import java.util.HashMap;
import java.util.Map;

import main.common.Utils;
import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.lecturer.dao.Lecturer;

public class LecturerRepoManagerImpl extends PersistentRepoManagerImpl<Lecturer> implements LecturerRepoManager {

	private static Map<Long, Lecturer> datasource = new HashMap<Long, Lecturer>();

	@Override
	public Map<Long, Lecturer> getDataSource() {
		return datasource;
	}

	
	public String getPath() {
        String file = Utils.getResourceFolder() + "\\datafiles\\Lecturer.json"; 
		
		return file;
	}
	
	@Override
	public Class<?> getClazz() {
		return Lecturer.class;
	}

	public LecturerRepoManagerImpl() {
		load();
	}
}
