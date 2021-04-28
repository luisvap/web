package br.uniso.web.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface LivroRepository extends
        JpaRepository<Livro, Integer>, JpaSpecificationExecutor<Livro> {

    List<Livro> findByTitulo(String titulo);

}