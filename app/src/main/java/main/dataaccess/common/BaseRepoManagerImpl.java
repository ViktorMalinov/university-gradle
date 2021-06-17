package main.dataaccess.common;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public abstract class BaseRepoManagerImpl<PK, ENT> implements BaseRepoManager<PK, ENT> {

	
	protected abstract PK getPk(ENT entity);
	protected abstract void setPk(ENT entity);
	protected abstract Map<PK, ENT> getDataSource();
	protected abstract String getPath();
	protected abstract Class<?> getClazz(); 

	
	@Override
	public ENT insert(ENT entity) {
		setPk(entity);
		getDataSource().put(getPk(entity), entity);
		
		persist();
		return entity;
	}

	@Override
	public ENT select(PK id) {
		ENT entity = getDataSource().get(id);
		return entity;	
	}

	@Override
	public void update(ENT entity) {
		getDataSource().put(getPk(entity), entity);
		persist();
	}

	@Override
	public void delete(PK id) {
		getDataSource().remove(id);
		persist();
	}

	@Override
	public List<ENT> selectAll() {
		List<ENT> allData = (List<ENT>) getDataSource().values();
		return allData;
	}
	
	
	//---------------------------------------------------------------
	
	
	public void load() {
		ObjectMapper mapper = new ObjectMapper();
		File dataFile = new File(getPath());
		
		if (!dataFile.exists()) return; 
		
		try {
		
			List<ENT> listENT =  mapper.readValue(dataFile, mapper.getTypeFactory().constructCollectionType(List.class, getClazz()));

			getDataSource().clear();
			
			listENT.stream().forEach(e -> { getDataSource().put(getPk(e), e); } );
			
		
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	public void persist(){
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File(String.valueOf(getPath())), getDataSource().values());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
