package com.sathia.springboot.controller;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathia.springboot.service.TestService;

@RestController
@RequestMapping("api/excel")
@CrossOrigin
public class TestController {

	@Autowired
	private TestService testService;
	
	@GetMapping
	public ResponseEntity<Resource> generateExcel() {
		InputStream is = testService.generateExcel();
		InputStreamResource resource = new InputStreamResource(is);
		return ResponseEntity.ok(resource);
	}
	
}
