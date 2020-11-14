package br.com.zup.gothamcity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.gothamcity.dto.FuncionarioDTO;
import br.com.zup.gothamcity.dto.MensagemDTO;
import br.com.zup.gothamcity.dto.SecretariaDTO;
import br.com.zup.gothamcity.service.IFuncionarioService;
import br.com.zup.gothamcity.service.ISecretariaService;

@RestController
@RequestMapping("/funcionarios")
public class Funcionario {

	@Autowired
	IFuncionarioService funcionarioService;

	
	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO criaFuncionario(@RequestBody FuncionarioDTO funcionarioDTO) {
		return funcionarioService.criaFuncionario(funcionarioDTO);
	}

	
	@GetMapping(path = "/{idFuncionario}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Funcionario pesquisaFuncionario(@PathVariable Long idFuncionario) {
		return funcionarioService.pesquisaFuncionario(idFuncionario);
	}

	
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Funcionario> listaFucionarios() {
		return funcionarioService.listaFuncionarios();
	}

	
	@PutMapping(path = "/{idFuncionario}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO alteraFuncionario(@PathVariable Long idFuncionario, @RequestBody FuncionarioDTO funcionarioDTO) {
		return funcionarioService.alteraFuncionario(idFuncionario, funcionarioDTO);
	}

	
	@DeleteMapping(path = "/{idFuncionario}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO removeFuncionario(@PathVariable Long idFuncionario) {
		return funcionarioService.removeFuncionario(idFuncionario);
	}
}
