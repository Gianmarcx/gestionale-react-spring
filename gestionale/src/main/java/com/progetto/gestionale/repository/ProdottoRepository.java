package com.progetto.gestionale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//importo l'entity da legare alla repository
import com.progetto.gestionale.entity.Prodotto;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long>{

    
}