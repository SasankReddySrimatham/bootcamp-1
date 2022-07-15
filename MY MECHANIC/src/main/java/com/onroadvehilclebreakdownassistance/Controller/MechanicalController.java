package com.onroadvehilclebreakdownassistance.Controller;


import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onroadvehilclebreakdownassistance.Dao.MechanicService;
import com.onroadvehilclebreakdownassistance.Model.MechanicModel;

@RestController

public class MechanicalController {
	@Autowired
	private MechanicService mechobj;
	@GetMapping("/kello")
	public String kello() {
		return "This is your mechanic";
	}
	
	@GetMapping("/Mechanic/getAll")
	public List<MechanicModel> getAllMechanic(){
		return mechobj.getAllMechanic();
	
	}
	@GetMapping("/Mechanic/{Id}")
	public MechanicModel getSingleMechanic(@PathVariable int Id) {
		return mechobj.getSingleMechanic(Id);
		
	}
	@PostMapping("/Mechanic")
	public MechanicModel saveMechanic(@RequestBody MechanicModel MechanicModel) {
		return mechobj.saveMechanic(MechanicModel);
		
	}
	@PutMapping("/Mechanic/Update/{Id}")
	public MechanicModel updateMechanic(@RequestBody MechanicModel MechanicModel,@PathVariable int Id) {
		MechanicModel.setMechanic_id(Id);
		return mechobj.updateMechanic(MechanicModel);
	}
	@DeleteMapping("/Mechanic/Delete/{Id}")
	public void deleteMechanic(@RequestParam int Id) {
		mechobj.deleteMechanic(Id);
	}
	
	

}

