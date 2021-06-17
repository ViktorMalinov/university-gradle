package main.dataaccess.apigroup.repo;

import java.util.HashMap;
import java.util.Map;

import main.common.Utils;
import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.common.PersistentRepoManagerImpl;

public class ApiGroupRepoManagerImpl extends PersistentRepoManagerImpl<ApiGroup> implements ApiGroupRepoManager {

	private static Map<Long, ApiGroup> datasource = new HashMap<Long, ApiGroup>();

	
	public ApiGroupRepoManagerImpl() {
		load();
	}
	
	
	
	@Override
	public Map<Long, ApiGroup> getDataSource() {
		return datasource;
	}

	public String getPath() {
        String file = Utils.getResourceFolder() + "\\datafiles\\ApiGroup.json"; 
		
		return file;
	}
	

	@Override
	public Class<?> getClazz() {
		return ApiGroup.class;
	}
	
	

}
