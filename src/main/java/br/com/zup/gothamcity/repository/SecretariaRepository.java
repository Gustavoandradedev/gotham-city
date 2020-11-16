package br.com.zup.gothamcity.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.gothamcity.entity.Secretaria;
import br.com.zup.gothamcity.enums.Area;

@Repository
public interface SecretariaRepository extends CrudRepository<Secretaria, Long> {
	Optional<Secretaria> findByArea(Area area);
}
