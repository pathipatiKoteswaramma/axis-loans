package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Emp;
import com.ashokit.entity.EmpAdd;
import com.ashokit.repo.EmpAddRepo;
import com.ashokit.repo.EmpRepo;

import jakarta.transaction.Transactional;

@Service
public class EmpService {
	@Autowired
	private EmpRepo emprepo;
	@Autowired
	private EmpAddRepo empaddrepo;
	
	@Transactional(rollbackOn   = Exception.class)
	public void saveData() {
		Emp e = new Emp();
		e.setEname("koti");
		e.setEsalary(10000.00);
		Emp save = emprepo.save(e);
		
		int i=10/0;
		
		EmpAdd eadd = new EmpAdd();
		eadd.setCity("hyd");
		eadd.setState("Ts");
		eadd.setCountrry("India");
		eadd.setEid(save.getEid());
		empaddrepo.save(eadd);
	}
	
	
	
	
	
	
	public EmpService(EmpRepo emprepo, EmpAddRepo empaddrepo) {
		
		this.emprepo = emprepo;
		this.empaddrepo = empaddrepo;
	}
	
	
	
	

}
