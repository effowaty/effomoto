package com.effomoto.controller;

import com.effomoto.model.Offer;
import com.effomoto.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/offer")
public interface OfferControllerApi {
    @GetMapping
    List<Offer> getOffers();

    @GetMapping("/{id}")
    Offer getById(Long idUser);

    @PostMapping
    Long create(Offer offer);
}
