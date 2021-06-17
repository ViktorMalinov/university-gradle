package main.dataaccess.common;

public class NamePersistent extends Persistent {

	protected Long code;
	protected String name;
	protected String description;
	
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public NamePersistent() {
		
	};

}
