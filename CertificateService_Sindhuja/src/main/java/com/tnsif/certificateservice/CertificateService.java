package com.tnsif.certificateservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateService
{
	@Autowired
	private Certificaterepository repo;
	//to insert the records to the table
	public void save(Certificate cert) {
		repo.save(cert);
	}
	//show all the records from the table
	public List<Certificate>getAllRecords()
	{
		return repo.findAll();
	}
	//show specific record from the table
	public Certificate getCertificateById(Integer id) {
		return repo.findById(id).orElse(null);
	}
	//to delete specific record from the table in the database
	public void deleteCertificate(Integer certid) {
		repo.deleteById(certid);
	}
	//updating the existing record
	public void updateCertificate(Integer certid,Certificate updateCertificate) {
		Certificate existingCertificate=repo.findById(certid).orElse(null);
		if(existingCertificate !=null) {
			existingCertificate.setStudname(updateCertificate.getStudname());
			existingCertificate.setCertid(updateCertificate.getCertid());
			existingCertificate.setDept(updateCertificate.getDept());
			existingCertificate.setGrade(updateCertificate.getGrade());
			existingCertificate.setYear(updateCertificate.getYear());
			existingCertificate.setGender(updateCertificate.getGender());
			existingCertificate.setDateofissue(updateCertificate.getDateofissue());
			repo.save(existingCertificate);
		}
	}
}
