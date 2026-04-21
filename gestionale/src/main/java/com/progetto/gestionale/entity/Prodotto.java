package com.progetto.gestionale.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "prodotti")
public class Prodotto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String titolo;

    private String descrizione;
    
    @NotNull
    @DecimalMin(value = "0.00" , inclusive = false)
    @Column(nullable = false, precision = 10 , scale = 2)
    private BigDecimal prezzo;

    @Column(nullable = false)
    private Long quantita;

    @Column(nullable = true)
    private Boolean visibile;

    private LocalDateTime creatoIl;

    private LocalDateTime aggionatoIl;

    public Prodotto(Long id, @NotBlank String titolo, String descrizione,
            @NotNull @DecimalMin(value = "0.00", inclusive = false) BigDecimal prezzo, Long quantita, Boolean visibile,
            LocalDateTime creatoIl, LocalDateTime aggionatoIl) {
        this.id = id;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.visibile = visibile;
        this.creatoIl = creatoIl;
        this.aggionatoIl = aggionatoIl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public Long getQuantita() {
        return quantita;
    }

    public void setQuantita(Long quantita) {
        this.quantita = quantita;
    }

    public Boolean getVisibile() {
        return visibile;
    }

    public void setVisibile(Boolean visibile) {
        this.visibile = visibile;
    }

    public LocalDateTime getCreatoIl() {
        return creatoIl;
    }

    public void setCreatoIl(LocalDateTime creatoIl) {
        this.creatoIl = creatoIl;
    }

    public LocalDateTime getAggionatoIl() {
        return aggionatoIl;
    }

    public void setAggionatoIl(LocalDateTime aggionatoIl) {
        this.aggionatoIl = aggionatoIl;
    }

    
    
}
