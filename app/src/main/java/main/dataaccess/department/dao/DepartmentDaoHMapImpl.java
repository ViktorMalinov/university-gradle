package main.dataaccess.department.dao;

import main.dataaccess.common.BaseDaoHMapImpl;
import main.dataaccess.department.repo.DepartmentRepoManager;
import main.dataaccess.department.repo.DepartmentRepoManagerImpl;


public class DepartmentDaoHMapImpl extends BaseDaoHMapImpl <Long, Department, DepartmentRepoManager> implements DepartmentDao {

	public DepartmentDaoHMapImpl() {
		this.repoManager = new DepartmentRepoManagerImpl();
	}


}
