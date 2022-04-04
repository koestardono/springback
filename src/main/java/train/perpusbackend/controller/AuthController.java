package train.perpusbackend.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import Model.Greeting;

@RestController
public class AuthController {
	
	final static Logger logger = LoggerFactory.getLogger(AuthController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	// method login
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ResponseEntity<?> firstLogin(HttpServletRequest request, HttpServletResponse response) {
		logger.debug("running login");
		String value = "test running login";
		
		return new ResponseEntity<String>(value, HttpStatus.OK);
		
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	//coba tes wadoh berubah
}
