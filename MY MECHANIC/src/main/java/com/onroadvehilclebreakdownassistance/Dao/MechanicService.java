package com.onroadvehilclebreakdownassistance.Dao;

import java.util.List;
import com.onroadvehilclebreakdownassistance.Model.MechanicModel;


public interface MechanicService {


	 List<MechanicModel> getAllMechanic();
	 
	 MechanicModel getSingleMechanic(int Id);
	 
	 MechanicModel saveMechanic(MechanicModel MechanicModel);
	 
	 MechanicModel updateMechanic(MechanicModel MechanicModel);
	 
	 void deleteMechanic(int id);
	 
	 
	 
}
