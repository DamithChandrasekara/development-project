package dam.kum.developmentbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dam.kum.developmentbackend.dao.DoctorCategoryDAO;
import dam.kum.developmentbackend.dto.DoctorCategory;


@Repository("doctorcategoryDAO")
public class DoctorCategoryDAOImpl implements DoctorCategoryDAO {

	private static List<DoctorCategory> dcategories = new ArrayList<>();

	static {

		DoctorCategory dcategory = new DoctorCategory();

		// adding first category
		dcategory.setId(1);
		dcategory.setName("Specialist");
		dcategory.setDescription("Best Category");
		dcategory.setImageURL("DCat_1.png");

		dcategories.add(dcategory);

		// adding second category
		dcategory = new DoctorCategory();
		dcategory.setId(2);
		dcategory.setName("So Far");
		dcategory.setDescription("Best Category");
		dcategory.setImageURL("DCat_2.png");

		dcategories.add(dcategory);
		
		// adding third category
		dcategory = new DoctorCategory();
		dcategory.setId(3);
		dcategory.setName("So Far");
		dcategory.setDescription("Best Category");
		dcategory.setImageURL("DCat_2.png");

		dcategories.add(dcategory);
	}

	@Override
	public List<DoctorCategory> dlist() {
		// TODO Auto-generated method stub
		return dcategories;
	}

	@Override
	public DoctorCategory get(int id) {

		for(DoctorCategory dcategory: dcategories) {
			
			if(dcategory.getId()==id) {
				
				return dcategory;
			}
		}
		
		
		return null;
	}

}
