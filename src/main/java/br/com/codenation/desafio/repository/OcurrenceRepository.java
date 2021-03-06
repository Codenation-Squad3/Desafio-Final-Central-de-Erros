package br.com.codenation.desafio.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.codenation.desafio.model.Ocurrence;


@Repository
public interface OcurrenceRepository extends JpaRepository<Ocurrence, UUID> {

}
