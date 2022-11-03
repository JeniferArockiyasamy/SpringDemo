package com.propfile.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.propfile.Service.FileService;

@RestController
@RequestMapping("/api/")
public class FileController {
	@Autowired
	Environment env;
	@Autowired
	FileService fileServiceImpl;

	@RequestMapping(value = "testAPI", method = RequestMethod.GET)
	public ResponseEntity<?> testApi(@RequestParam String op) {
		int ans = 0;
		String c = null;
		int operation = Integer.parseInt(env.getProperty("n1"));
		int operation1 = Integer.parseInt(env.getProperty("n2"));
		switch (op) {
		case "add":
			ans = fileServiceImpl.add(operation, operation1);
			break;
		case "sub":
			ans = fileServiceImpl.sub(operation, operation1);
			break;
		case "multiply":
			ans = fileServiceImpl.multiplication(operation, operation1);
			break;
		case "division":

			ans = fileServiceImpl.division(operation, operation1);
			break;

		}

		return new ResponseEntity<>(ans, HttpStatus.OK);
	}

}
