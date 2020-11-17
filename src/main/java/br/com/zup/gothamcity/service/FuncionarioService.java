package br.com.zup.gothamcity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zup.estrelas.lojapecas.entity.Peca;
import br.com.zup.gothamcity.controller.Funcionario;
import br.com.zup.gothamcity.controller.Secretaria;
import br.com.zup.gothamcity.dto.AlteraFuncionarioDTO;
import br.com.zup.gothamcity.dto.FuncionarioDTO;
import br.com.zup.gothamcity.dto.MensagemDTO;
import br.com.zup.gothamcity.repository.FuncionarioRepository;
import br.com.zup.gothamcity.repository.SecretariaRepository;

@Service
public class FuncionarioService {

	private static final String FUNCIONARIO_ALTERADO_COM_SUCESSO = "Funcionário alterado com sucesso.";
	private static final String FUNCIONARIO_REMOVIDA_COM_SUCESSO = "Funcionario removido com sucesso!";
	private static final String FUNCIONARIO_JA_CADASTRADO = "O cadastro não ocorreu, funcionario já está cadastrado";
	private static final String FUNCIONARIO_CADASTRADO_COM_SUCESSO = "Cadastro realizado com sucesso.";
	private static final String FUNCIONARIO_INEXISTENTE = "Funcionario inexistente.";

	@Autowired
	FuncionarioRepository funcionarioRepository;

	@Autowired
	SecretariaRepository secretariaRepository;

	public MensagemDTO criaFuncionario(AlteraFuncionarioDTO funcionarioDTO) {

		if (funcionarioRepository.existsById(funcionarioDTO.getIdSecretaria())) {
			return new MensagemDTO(FUNCIONARIO_JA_CADASTRADO);
		}

		funcionarioRepository.save(funcionarioDTO);
		return new MensagemDTO(FUNCIONARIO_CADASTRADO_COM_SUCESSO);

	}

//ok
	public Funcionario pesquisaFuncionario(Long idFuncionario) {
		return funcionarioRepository.findById(idFuncionario).orElse(null);
	}

//ok
	public List<Funcionario> listaFuncionarios() {
		return (List<Funcionario>) funcionarioRepository.findAll();
	}

	public  MensagemDTO alteraFuncionario(Long idFuncionario, AlteraFuncionarioDTO alteraFuncionario) {
		Optional<Funcionario> funcionarioConsultado = funcionarioRepository.findById(idFuncionario);

        if (funcionarioConsultado.isPresent()) {

          //  Funcionario funcionarioAlterado = Funcionario.get();

          //  funcionarioAlterado.setNome(AlteraFuncionarioDTO.getNome());
        

            funcionarioRepository.save(alteraFuncionario);
            return new MensagemDTO(FUNCIONARIO_ALTERADO_COM_SUCESSO);
        }

        return new MensagemDTO(FUNCIONARIO_INEXISTENTE);
    }

	public MensagemDTO removeFuncionario(Long idFuncionario) {
		if (funcionarioRepository.existsById(idFuncionario)) {
			funcionarioRepository.deleteById(idFuncionario);
            return new MensagemDTO(FUNCIONARIO_REMOVIDA_COM_SUCESSO);
        }

        return new MensagemDTO(FUNCIONARIO_INEXISTENTE);
	}

}
