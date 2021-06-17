package main.service.apigroupuser;

import main.service.common.BaseDto;

public class ApiGroupUserResult extends BaseDto {

	private Long apiGroupId;
	private Long apiUserId;
	
	private String apiGroupDisplayName;
	private String apiUserDisplayName;

	public Long getApiUserId() {
		return apiUserId;
	}


	public void setApiUserId(Long apiUserId) {
		this.apiUserId = apiUserId;
	}


	public Long getApiGroupId() {
		return apiGroupId;
	}


	public void setApiGroupId(Long apiGroupId) {
		this.apiGroupId = apiGroupId;
	}


	public String getApiGroupDisplayName() {
		return apiGroupDisplayName;
	}


	public void setApiGroupDisplayName(String apiGroupDisplayName) {
		this.apiGroupDisplayName = apiGroupDisplayName;
	}


	public String getApiUserDisplayName() {
		return apiUserDisplayName;
	}


	public void setApiUserDisplayName(String apiUserDisplayName) {
		this.apiUserDisplayName = apiUserDisplayName;
	}
	
	
	
	
	
}
