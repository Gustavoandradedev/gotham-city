package br.com.zup.gothamcity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.gothamcity.controller.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, Long> {

}
