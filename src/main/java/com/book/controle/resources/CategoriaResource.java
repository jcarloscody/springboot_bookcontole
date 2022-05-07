package com.book.controle.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.controle.dominio.Categoria;
import com.book.controle.dto.CategoriaDTO;
import com.book.controle.servico.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;

	@CrossOrigin
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Integer id) {
		Categoria obj = this.categoriaService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> findAll() {
		List<Categoria> listCategorias = categoriaService.findAll();
		List<CategoriaDTO> categoriaDTOs = listCategorias.stream().map((obj) -> new CategoriaDTO(obj)).toList();
		return ResponseEntity.ok().body(categoriaDTOs);
	}

}
