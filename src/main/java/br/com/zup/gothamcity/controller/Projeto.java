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
import br.com.zup.gothamcity.dto.ProjetoDTO;
import br.com.zup.gothamcity.service.IProjetoService;

@RestController
@RequestMapping("/projetos")
public class Projeto {

	@Autowired
	IProjetoService projetoService;
//ok
	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO criaProjeto(@RequestBody ProjetoDTO projetoDTO) {
		return projetoService.criaProjeto(projetoDTO);
	}
//ok
	@GetMapping(path = "/{idProjeto}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Funcionario pesquisaProjeto(@PathVariable Long idProjeto) {
		return projetoService.pesquisaProjeto(idProjeto);
	}
//ok
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Projeto> listaProjetos() {
		return projetoService.listaProjetos();
	}
//ok
	@PutMapping(path = "/{idProjeto}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO alteraProjeto(@PathVariable Long idProjeto, @RequestBody ProjetoDTO projetoDTO) {
		return projetoService.alteraProjeto(idProjeto, projetoDTO);
	}
//ok
	@PutMapping(path = "/concluido/{idProjeto}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO projetoFinalizado(@PathVariable Long idProjeto,
			@RequestBody projetoFinalizadoDTO projetoFinalizadoDTO) {
		return projetoService.projetoFinalizado(idProjeto, projetoFinalizadoDTO);
	}
}
