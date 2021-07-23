package com.atividades1.habilidades.e.mentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HabilidadesEMentalidadesController {
	
	@GetMapping("/Atividade1")
	public String Hello () {
		return "Habilidade e Mentalidade:"
				+ "Eu usei muito persistência e Adaptabilidade";
	}
	
	@GetMapping("/Atividade2")
	public String Atividade2 () {
		return "Objetivos de aprendizagem:"
				+ "Eu espero ter muita persistência para compreender o assunto novo";
	}
	

}



