package dam.kum.developmentbackend.dao;

import java.util.List;

import dam.kum.developmentbackend.dto.DoctorCategory;

public interface DoctorCategoryDAO {

	
	List<DoctorCategory> dlist();
	DoctorCategory get(int id);
}
