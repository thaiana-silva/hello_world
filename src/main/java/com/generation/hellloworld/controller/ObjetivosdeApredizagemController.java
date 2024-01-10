package com.generation.hellloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-apredizagem")
public class ObjetivosdeApredizagemController {

	@GetMapping
	public String objetivosApredizagem() {
		return "Revisar assuntos relacionado ao Java,"
				+ "\n Revisar e Praticar Banco de Dados, "
				+ "\n Pesquisar sobre o papel de Tester para o projeto, "
				+ "\n Reler os cookbooks, "
				+ "\n Ver videos sobre API REST e Restful, ";
	}
}
