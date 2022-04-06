package com.hulkstore.kardex;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  echotest{
	@RequestMapping("/")
	public String hola(){
		
		
		return "Hola mundo!";
	}
}