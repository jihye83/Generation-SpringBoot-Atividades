package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprender")
public class ApredizagemController {

	@GetMapping
	public String aprender() {
		return"<h2>Objetivos de Aprendizagem</h2><li>aprender MVC<li>primeiros passos no SpringBoot<li>Endpoint<li>Controller ";
	}
}
