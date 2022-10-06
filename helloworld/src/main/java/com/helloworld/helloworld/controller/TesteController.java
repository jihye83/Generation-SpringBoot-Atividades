package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TesteController {

	@GetMapping("/teste")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/teste1")
	public String aprender() {
		return"<h2>Objetivos de Aprendizagem</h2><li>aprender MVC<li>primeiros passos no SpringBoot<li>Endpoint<li>Controller ";
	}
	
	@GetMapping("/teste2")
	public String bsm() {
		return "<h2>BSM</h2>"
				+ "Mentalidades:<ol><li>Orientação ao Futuro <li>Responsabilidade Pessoal <li>Mentalidade de Crescimento <li>Persistencia</br></ol>"
				+ "<br>Habilidades:<ol><li>Trabalho em Equipe <li>Atenção ao Detalhe <li>Proatividade <li>Comunicação</br></ol>";
	}
}
