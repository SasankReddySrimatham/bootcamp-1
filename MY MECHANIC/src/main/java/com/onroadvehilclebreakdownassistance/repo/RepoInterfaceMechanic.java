package com.onroadvehilclebreakdownassistance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onroadvehilclebreakdownassistance.Model.MechanicModel;


@Repository
public interface RepoInterfaceMechanic extends JpaRepository<MechanicModel,Integer>{

}
