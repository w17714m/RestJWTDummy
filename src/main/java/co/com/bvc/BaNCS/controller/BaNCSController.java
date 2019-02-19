package co.com.bvc.BaNCS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.bvc.BaNCS.service.JwtAdmin;

@RestController
public class BaNCSController {
	
	@Autowired
	JwtAdmin jwtAdmin;
	
	@RequestMapping(value = "/hi")
	public String prueba() {
		String prueba = jwtAdmin.createJWT();
		jwtAdmin.verifyJWT(prueba);
		return prueba;
	}

}
