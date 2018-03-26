package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Fila;
/**
 * 
 * @author Filippe do Nascimento Valentim
 * RA 81612333
 * Turma SI3AN-MCA
 */
@Service
public class FilaService {
	private FilaDAO dao;
	
	@Autowired
	public FilaService(FilaDAO dao) {
		this.dao = dao;
	}

	
}
