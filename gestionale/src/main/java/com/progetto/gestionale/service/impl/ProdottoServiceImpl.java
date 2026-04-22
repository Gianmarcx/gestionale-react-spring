package com.progetto.gestionale.service.impl;

import java.util.List;
import com.progetto.gestionale.repository.ProgettoRepository;
import org.springframework.stereotype.Service;

import com.progetto.gestionale.service.ProdottiService;
import com.progetto.gestionale.entity.Prodotto;
import com.progetto.gestionale.repository.ProdottoRepository;


@Service
public class ProdottoServiceImpl implements ProdottiService {

    private final ProgettoRepository progettoRepository;
    private final ProdottoRepository  prodottoRepository;

    public ProdottoServiceImpl(
        ProdottoRepository prodottoRepository, ProgettoRepository progettoRepository

    ){
        this.prodottoRepository = prodottoRepository;
        this.progettoRepository = progettoRepository;

    }

    @Override
    public Prodotto creaProdotto(Prodotto prodotto) {
        return prodottoRepository.save(prodotto);


    }

    @Override
    public List<Prodotto>ottieniTuttiProdotti() {
        return prodottoRepository.findAll();

    }
    
}
