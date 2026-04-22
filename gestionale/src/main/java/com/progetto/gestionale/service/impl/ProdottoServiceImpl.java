package com.progetto.gestionale.service.impl;

import java.util.List;
import com.progetto.gestionale.repository.ProgettoRepository;
import org.springframework.stereotype.Service;

import com.progetto.gestionale.service.ProdottiService;
import com.progetto.gestionale.entity.Prodotto;
import com.progetto.gestionale.repository.ProdottoRepository;


@Service
public class ProdottoServiceImpl implements ProdottiService {

 private final ProdottoRepository prodottoRepository;

    public ProdottoServiceImpl(ProdottoRepository prodottoRepository) {
        this.prodottoRepository = prodottoRepository;
    }

    @Override
    public Prodotto creaProdotto(Prodotto prodotto) {

        // Valori di default per evitare errori
        if (prodotto.getQuantita() == null) prodotto.setQuantita(1L);
        if (prodotto.getVisibile() == null) prodotto.setVisibile(true);
        if (prodotto.getCreatoIl() == null) prodotto.setCreatoIl(java.time.LocalDateTime.now());
        prodotto.setAggiornatoIl(java.time.LocalDateTime.now());

        return prodottoRepository.save(prodotto);
    }

    @Override
    public List<Prodotto> ottieniTuttiProdotti() {
        return prodottoRepository.findAll();
    }
}