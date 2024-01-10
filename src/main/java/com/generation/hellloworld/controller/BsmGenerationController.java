package com.generation.hellloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-generation")
public class BsmGenerationController {
	@GetMapping
	public String bsmGeneration() {
		return "Trabalho em equipe,"
				+ "\n Mentalidade de Crescimento, "
				+ "\n Orientação ao futuro, "
				+ "\n Persistência, "
				+ "\n Comunicação, "
				+ "\n Atenção aos detalhes, "
				+ "\n Atenção aos detalhes, "
				+ "\n Responsabilidade Pessoal, "
				+ "\n Persistência, ";
	}
}
