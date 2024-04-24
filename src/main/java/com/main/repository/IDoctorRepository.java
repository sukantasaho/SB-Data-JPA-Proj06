package com.main.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.main.entity.Doctor;
import com.main.view.IDoctorView;
import com.main.view.IView;

 
 
public interface IDoctorRepository extends JpaRepository<Doctor, Integer>
{
      //native sql query
	  @Query(value = "INSERT INTO Jpa_Doctor_Info VALUES(JPA_DOCTOR_INFO_SEQ.NEXTVAL,:docName,:income,:specialization)", nativeQuery = true)
	  @Modifying
	  public int registerDoctor(String docName,Float income, String specialization);
	  
	  @Query(value="SELECT SYSDATE FROM DUAL", nativeQuery = true)
	  public String displaySysDate();
}
