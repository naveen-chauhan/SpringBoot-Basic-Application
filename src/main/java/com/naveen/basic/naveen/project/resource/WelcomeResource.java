package com.naveen.basic.naveen.project.resource;

import com.naveen.basic.naveen.project.models.AuthRequest;
import com.naveen.basic.naveen.project.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author naveen.chauhan on 25/10/22
 */
@RestController
public class WelcomeResource {

	@Autowired
	private JwtUtils jwtUtils;

	@Autowired
	private AuthenticationManager authenticationManager;

    @GetMapping("/")
	public String welcome() {
       return "Welcome to Service !!";
	}

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
			);
		} catch (Exception e) {
			throw new Exception("Invalid Username or password");
		}

		return jwtUtils.generateToken(authRequest.getUsername());
	}
}
