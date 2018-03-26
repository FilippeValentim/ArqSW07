package br.usjt.arqsw.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;
import br.usjt.arqsw.service.ChamadoService;
import br.usjt.arqsw.service.FilaService;
/**
 * 
 * @author Filippe do Nascimento Valentim
 * RA 81612333
 * Turma SI3AN-MCA
 *
 */
@Controller
public class ManterChamadosController {
	private FilaService filaService;
	private ChamadoService chamadoService;

	@Autowired
	public ManterChamadosController(FilaService fs, ChamadoService cs) {
		filaService = fs;
		chamadoService = cs;
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("index")
	public String inicio() {
		return "index";
	}

	
	/**
	 * 
	 * @param model Acesso à request http
	 * @return JSP de Listar Chamados
	 */
	

}
