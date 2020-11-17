package br.com.zup.gothamcity.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.gothamcity.controller.Funcionario;
import br.com.zup.gothamcity.dto.AlteraFuncionarioDTO;
import br.com.zup.gothamcity.dto.FuncionarioDTO;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

	void save(AlteraFuncionarioDTO alteraFuncionario);
	

}
