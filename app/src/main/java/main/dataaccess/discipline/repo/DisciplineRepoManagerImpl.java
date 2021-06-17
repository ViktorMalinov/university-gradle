package main.dataaccess.discipline.repo;

import java.util.HashMap;
import java.util.Map;

import main.common.Utils;
import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.discipline.dao.Discipline;

public class DisciplineRepoManagerImpl extends PersistentRepoManagerImpl<Discipline> implements DisciplineRepoManager {

	private static Map<Long, Discipline> datasource = new HashMap<Long, Discipline>();

	@Override
	public Map<Long, Discipline> getDataSource() {
		return datasource;
	}

	
	public String getPath() {
        String file = Utils.getResourceFolder() + "\\datafiles\\Discipline.json"; 
		
		return file;

	}
	
	@Override
	public Class<?> getClazz() {
		return Discipline.class;
	}

	public DisciplineRepoManagerImpl() {
		load();
	}
}
