package main;

import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;
import main.service.apigroup.ApiGroupService;
import main.service.apigroup.ApiGroupServiceImpl;
import main.service.apigroupuser.ApiGroupUserParam;
import main.service.apigroupuser.ApiGroupUserResult;
import main.service.apigroupuser.ApiGroupUserService;
import main.service.apigroupuser.ApiGroupUserServiceImpl;
import main.service.apiuser.ApiUserParam;
import main.service.apiuser.ApiUserResult;
import main.service.apiuser.ApiUserService;
import main.service.apiuser.ApiUserServiceImpl;
import main.service.department.DepartmentParam;
import main.service.department.DepartmentResult;
import main.service.department.DepartmentService;
import main.service.department.DepartmentServiceImpl;
import main.service.faculty.FacultyParam;
import main.service.faculty.FacultyResult;
import main.service.faculty.FacultyService;
import main.service.faculty.FacultyServiceImpl;

public class University {

	public static void main(String[] args) throws Exception {
		 

		/*
		String userDirectory = System.getProperty("user.dir");
        System.out.println(userDirectory);

        System.out.println("------------------------------------------------------");
        
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        
        System.out.println(absolutePath);
		*/
        System.out.println("------------------------------------------------------");
		
		apiGroupTest();
		ApiUserTest();
		apiGroupUserTest();
		
		FacultyTest();
		DepartmentTest();

		 // DisciplineTest();
		// FacultyTest();
		// FacultyDisciplineTest();
		// LecturerTest();
		// SpecialityTest();
		
		
		System.out.println("");
	}
	

	/*
	@Test
	public static void testApiGroupTest() {
		
	}
	*/
	
	
	public static void apiGroupTest() throws Exception {
		ApiGroupService apiGroup = new ApiGroupServiceImpl(); 
		ApiGroupParam param = new ApiGroupParam();
		
		
		System.out.println("------ ApiGroup TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		param.setDisplayName("Display Name AG");
		apiGroup.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		param.setDisplayName("Display Name AG - 2");
		apiGroup.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		param.setDisplayName("Display Name AG-3");
		
		// get
		ApiGroupResult res =  apiGroup.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s , displayName: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription(), res.getDisplayName());
		
		res =  apiGroup.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s , displayName: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription(), res.getDisplayName());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		apiGroup.update(param);
		res =  apiGroup.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s , displayName: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription(), res.getDisplayName());
		
		// delete
		apiGroup.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}
	
	
	
	
	//-------------------------------------------------
	public static void apiGroupUserTest()  throws Exception {
		ApiGroupUserService apiGroupUser = new ApiGroupUserServiceImpl(); 
		ApiGroupUserParam param = new ApiGroupUserParam();
		
		
		System.out.println("------ ApiGroupUser TEST ----------");
		// create
		//param.setId(id);
		param.setApiGroupId(1L);
		param.setApiUserId(1L);
		apiGroupUser.create(param);

		param.setApiGroupId(2L);
		param.setApiUserId(2L);
		apiGroupUser.create(param);

		
		// get
		ApiGroupUserResult res =  apiGroupUser.get(1L);
		System.out.printf("id: %d, Groupid: %d, user id: %d%n", res.getId(), res.getApiGroupId(), res.getApiUserId());
		
		res =  apiGroupUser.get(2L);
		System.out.printf("id: %d, Groupid: %d, user id: %d%n", res.getId(), res.getApiGroupId(), res.getApiUserId());


		// update
		
		// delete
		//apiGroupUser.delete(2L); // deleting group 
		//System.out.println("id: 2 was deleted...");
		
		System.out.println();
		System.out.println();
	}

	
	
	
	public static void ApiUserTest()  throws Exception{
		ApiUserService apiUser = new ApiUserServiceImpl(); 
		ApiUserParam param = new ApiUserParam();
		
		
		System.out.println("------ ApiUser TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setDisplayName("Group 1");
		param.setDescription("First group ever... :)");
		apiUser.create(param);

		param.setCode(20L);
		param.setDisplayName("Group 2");
		param.setDescription("Secong group ever... :)");
		apiUser.create(param);

		
		// get
		ApiUserResult res =  apiUser.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getDisplayName(), res.getDescription());
		
		res =  apiUser.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getDisplayName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setDisplayName("Group 2a");
		apiUser.update(param);
		res =  apiUser.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getDisplayName(), res.getDescription());
		
	}


	
	
	public static void DepartmentTest() throws Exception {
		DepartmentService Department = new DepartmentServiceImpl(); 
		DepartmentParam param = new DepartmentParam();
		
		
		System.out.println("------ Department TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		param.setFacultyId(1L);
		Department.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		param.setFacultyId(2L);
		Department.create(param);

		//param.setCode(30L);
		//param.setName("Group 3");
		//param.setFacultyId(1L);
		//param.setDescription("Last group ever... :)");
		
		// get
		DepartmentResult res =  Department.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s, facultyID: %d %n", res.getId(), res.getCode(), res.getName(), res.getDescription(), res.getFacultyId());
		
		res =  Department.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s, facultyID: %d %n", res.getId(), res.getCode(), res.getName(), res.getDescription(), res.getFacultyId());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		param.setFacultyId(2L);
		Department.update(param);
		res =  Department.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s, facultyID: %d %n", res.getId(), res.getCode(), res.getName(), res.getDescription(), res.getFacultyId());
		
	
		System.out.println();
		System.out.println();
	}


	public static void FacultyTest() throws Exception {
		FacultyService Faculty = new FacultyServiceImpl(); 
		FacultyParam param = new FacultyParam();
		
		
		System.out.println("------ Faculty TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		Faculty.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		Faculty.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		
		// get
		FacultyResult res =  Faculty.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		res =  Faculty.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		Faculty.update(param);
		res =  Faculty.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// delete
		Faculty.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}

	
	
	/*
	
	
	public static void DisciplineTest() {
		DisciplineService Discipline = new DisciplineServiceImpl(); 
		DisciplineParam param = new DisciplineParam();
		
		
		System.out.println("------ Discipline TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		Discipline.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		Discipline.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		
		// get
		DisciplineResult res =  Discipline.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		res =  Discipline.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		Discipline.update(param);
		res =  Discipline.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// delete
		Discipline.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}


	
	
	
	public static void FacultyTest() {
		FacultyService Faculty = new FacultyServiceImpl(); 
		FacultyParam param = new FacultyParam();
		
		
		System.out.println("------ Faculty TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		Faculty.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		Faculty.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		
		// get
		FacultyResult res =  Faculty.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		res =  Faculty.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		Faculty.update(param);
		res =  Faculty.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// delete
		Faculty.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}

	
	
	
	public static void FacultyDisciplineTest() {
		FacultyDisciplineService FacultyDiscipline = new FacultyDisciplineServiceImpl(); 
		FacultyDisciplineParam param = new FacultyDisciplineParam();
		
		
		System.out.println("------ FacultyDiscipline TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		FacultyDiscipline.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		FacultyDiscipline.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		
		// get
		FacultyDisciplineResult res =  FacultyDiscipline.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		res =  FacultyDiscipline.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		FacultyDiscipline.update(param);
		res =  FacultyDiscipline.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// delete
		FacultyDiscipline.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}


	
	
	
	public static void LecturerTest() {
		LecturerService Lecturer = new LecturerServiceImpl(); 
		LecturerParam param = new LecturerParam();
		
		
		System.out.println("------ Lecturer TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		Lecturer.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		Lecturer.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		
		// get
		LecturerResult res =  Lecturer.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		res =  Lecturer.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		Lecturer.update(param);
		res =  Lecturer.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// delete
		Lecturer.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}


	
	
	
	public static void SpecialityTest() {
		SpecialityService Speciality = new SpecialityServiceImpl(); 
		SpecialityParam param = new SpecialityParam();
		
		
		System.out.println("------ Speciality TEST ----------");
		// create
		//param.setId(id);
		param.setCode(10L);
		param.setName("Group 1");
		param.setDescription("First group ever... :)");
		Speciality.create(param);

		param.setCode(20L);
		param.setName("Group 2");
		param.setDescription("Secong group ever... :)");
		Speciality.create(param);

		param.setCode(30L);
		param.setName("Group 3");
		param.setDescription("Last group ever... :)");
		
		// get
		SpecialityResult res =  Speciality.get(1L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		res =  Speciality.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// update
		param.setId(res.getId());
		param.setDescription(res.getDescription());
		param.setCode(21L);
		param.setName("Group 2a");
		Speciality.update(param);
		res =  Speciality.get(2L);
		System.out.printf("id: %d, code: %d, name: %s, description: %s%n", res.getId(), res.getCode(), res.getName(), res.getDescription());
		
		// delete
		Speciality.delete(3L); // deleting group 
		System.out.println("id: 3 was deleted...");
		
		System.out.println();
		System.out.println();
	}

*/
	
	

}
