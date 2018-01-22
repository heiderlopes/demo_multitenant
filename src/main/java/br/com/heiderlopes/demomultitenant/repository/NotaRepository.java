package br.com.heiderlopes.demomultitenant.repository;

import br.com.heiderlopes.demomultitenant.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {

}
