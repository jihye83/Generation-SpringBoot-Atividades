package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	@GetMapping
	public String bsm() {
		return "<h2>BSM</h2>"
				+ "Mentalidades:<ol><li>Orientação ao Futuro <li>Responsabilidade Pessoal <li>Mentalidade de Crescimento <li>Persistencia</br></ol>"
				+ "<br>Habilidades:<ol><li>Trabalho em Equipe <li>Atenção ao Detalhe <li>Proatividade <li>Comunicação</br></ol>";
	}
	
}
