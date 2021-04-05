package com.diego.catalogo.repository;

import com.diego.catalogo.model.Musica;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Musica, Long>{
    
}
