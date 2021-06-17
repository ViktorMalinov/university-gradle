package main.dataaccess.facultydiscipline.dao;

import main.dataaccess.common.BaseDaoHMapImpl;
import main.dataaccess.facultydiscipline.repo.FacultyDisciplineRepoManager;
import main.dataaccess.facultydiscipline.repo.FacultyDisciplineRepoManagerImpl;


public class FacultyDisciplineDaoHMapImpl extends BaseDaoHMapImpl <Long, FacultyDiscipline, FacultyDisciplineRepoManager> implements FacultyDisciplineDao {

	public FacultyDisciplineDaoHMapImpl() {
		this.repoManager = new FacultyDisciplineRepoManagerImpl();
	}

}
