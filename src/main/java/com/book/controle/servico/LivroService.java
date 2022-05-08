package com.book.controle.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.controle.dominio.Livro;
import com.book.controle.repositories.LivroRepository;
import com.book.controle.servico.excecoes.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	@Autowired
	private CategoriaService categoriaService;

	public Livro findById(Integer id) {
		Optional<Livro> obj = this.livroRepository.findById(id); // optional pq pode encontrar ou nao
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Livro.class.getName()));
	}
	
	public List<Livro> findAll(Integer id_cat) {
		categoriaService.findById(id_cat); // caso não exita retorna uma exceção
		return livroRepository.findAllByIdCategoria(id_cat);
	}

}
