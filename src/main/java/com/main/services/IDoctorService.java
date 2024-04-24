package com.main.services;

import java.util.List;

import com.main.entity.Doctor;
import com.main.view.IDoctorView;
import com.main.view.IView;

public interface IDoctorService 
{
	public String registerDoctor(String docName,Float income, String specialization);
	public String displaySysDate();
}
