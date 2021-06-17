package main.service.apigroupuser;

import main.service.common.BaseDto;

public class ApiGroupUserParam extends BaseDto {

	private Long apiGroupId;
	private Long apiUserId;
	
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
	
	
	
	
	
}
