package com.book.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.controle.dominio.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
