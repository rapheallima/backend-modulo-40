package com.mod40.Modulo_40.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mod40.Modulo_40.main.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
