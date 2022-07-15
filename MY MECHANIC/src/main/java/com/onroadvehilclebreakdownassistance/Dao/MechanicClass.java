package com.onroadvehilclebreakdownassistance.Dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onroadvehilclebreakdownassistance.Model.MechanicModel;
import com.onroadvehilclebreakdownassistance.repo.RepoInterfaceMechanic;



@Service
public class MechanicClass {

	 @Autowired
		private RepoInterfaceMechanic repoobj;
		
		
		@Override
		public List<MechanicModel> getAllMechanic() {
			
			return repoobj.findAll();
		}

		@Override
		public MechanicModel getSingleMechanic(int id) {
			return repoobj.findById(id).get();
			
		}

		@Override
		public MechanicModel saveMechanic(MechanicModel	 MechanicModel) {
			return repoobj.save(MechanicModel);
		
		}

		@Override
		public MechanicModel updateMechanic(MechanicModel MechanicModel) {
			return repoobj.save(MechanicModel);
			
		}

		@Override
		public void deleteMechanic(int id) {
			 repoobj.deleteById(id);
			
		}
}
