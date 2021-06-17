package main.dataaccess.facultydiscipline.repo;

import java.util.HashMap;
import java.util.Map;

import main.common.Utils;
import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;

public class FacultyDisciplineRepoManagerImpl extends PersistentRepoManagerImpl<FacultyDiscipline> implements FacultyDisciplineRepoManager {

	private static Map<Long, FacultyDiscipline> datasource = new HashMap<Long, FacultyDiscipline>();

	@Override
	public Map<Long, FacultyDiscipline> getDataSource() {
		return datasource;
	}

	public String getPath() {
        String file = Utils.getResourceFolder() + "\\datafiles\\FacultyDiscipline.json"; 
		
		return file;
	}
	
	@Override
	public Class<?> getClazz() {
		return FacultyDiscipline.class;
	}

	public FacultyDisciplineRepoManagerImpl() {
		load();
	}
}
