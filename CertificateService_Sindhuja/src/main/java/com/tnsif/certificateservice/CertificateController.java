package com.tnsif.certificateservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateController 
{
	@Autowired
	private CertificateService service;
    @PostMapping("/certificateservice")
	public void add(@RequestBody Certificate cert) {
		service.save(cert);
	}
	
	
	
	@GetMapping("/certificateservice")
	public List<Certificate> ShowAll()
	{
		return service.getAllRecords();
	}

	@GetMapping("/certificateservice/{id}")
	public Certificate getCertificateById(@PathVariable Integer id)
	{
		return service.getCertificateById(id);
	}
	
	@DeleteMapping("/certificateservice/{id}")
	public void deleteCertificate(@PathVariable Integer id)
	{
		service.deleteCertificate(id);
	}
	
	@PutMapping("/certificateservice/{id}")
	public ResponseEntity<String> updateCertificate(@PathVariable Integer id,@RequestBody Certificate updatedCertificate)
	{
		service.updateCertificate(id,updatedCertificate);
		return ResponseEntity.ok("Certificate updated Successfully");
	}
		

}
