package org.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudo")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "hello world!!!";
	}
	
	@GetMapping("/bsm")
	public List<String> listarBsm() {
		return Arrays.asList("persistencia","responsabilidade pessoal","orientacao ao futuro");
	}
	
	@GetMapping("/objetivos")
	public List<String> listarObjetivos() {
		return Arrays.asList("estudar java springboot", "crud no springboot", "estudar mysql");
	}
}
