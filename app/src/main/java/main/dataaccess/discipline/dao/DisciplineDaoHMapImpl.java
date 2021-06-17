package main.dataaccess.discipline.dao;

import main.dataaccess.common.BaseDaoHMapImpl;
import main.dataaccess.discipline.repo.DisciplineRepoManager;
import main.dataaccess.discipline.repo.DisciplineRepoManagerImpl;

public class DisciplineDaoHMapImpl extends BaseDaoHMapImpl <Long, Discipline, DisciplineRepoManager> implements DisciplineDao {

	public DisciplineDaoHMapImpl() {
		this.repoManager = new DisciplineRepoManagerImpl();
	}

}
