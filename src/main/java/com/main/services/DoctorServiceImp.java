package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.entity.Doctor;
import com.main.repository.IDoctorRepository;
import com.main.view.IDoctorView;
import com.main.view.IView;

@Service("docService")
@Transactional
public class DoctorServiceImp implements IDoctorService 
{
	@Autowired
	private IDoctorRepository repo;

	@Override
	@Transactional
	public String registerDoctor(String docName, Float income, String specialization) 
	{
		   int i = repo.registerDoctor(docName, income, specialization);
		 if(i == 1)
		 {
			  return i+" record is inserted successfully completed";
		 }
		 else
			return "reocrd is not inserted";
	}

	@Override
	public String displaySysDate() 
	{
		 
		return repo.displaySysDate();
	}

	 
	 
}
