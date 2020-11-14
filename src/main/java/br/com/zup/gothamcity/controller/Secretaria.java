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

import br.com.zup.gothamcity.dto.MensagemDTO;
import br.com.zup.gothamcity.dto.SecretariaDTO;
import br.com.zup.gothamcity.service.ISecretariaService;

@RestController
@RequestMapping("/secretarias")
public class Secretaria {

	@Autowired
	ISecretariaService secretariaService;
//ok
	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO criaSecretaria(@RequestBody SecretariaDTO secretariaDTO) {
		return secretariaService.criaSecretaria(secretariaDTO);
	}
//ok
	@GetMapping(path = "/{idSecretaria}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Secretaria pesquisaSecretaria(@PathVariable Long idSecretaria) {
		return secretariaService.pesquisaSecretaria(idSecretaria);
	}
//ok
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Secretaria> listaSecretarias() {
		return secretariaService.listaSecretarias();
	}
//ok
	@PutMapping(path = "/{idSecretaria}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO alteraSecretaria(@PathVariable Long idSecretaria, @RequestBody SecretariaDTO secretariaDTO) {
		return secretariaService.alteraSecretaria(idSecretaria, secretariaDTO);
	}

	//ok
	@DeleteMapping(path = "/{idSecretaria}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public MensagemDTO removeSecretaria(@PathVariable Long idSecretaria) {
		return secretariaService.removeSecretaria(idSecretaria);
	}
	
}
