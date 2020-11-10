package com.effomoto.controller;

import com.effomoto.model.Offer;
import com.effomoto.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfferController implements OfferControllerApi {
    @Autowired
    private OfferService offerService;

    @Override
    public List<Offer> getOffers() {
        return offerService.getOffers();
    }

    @Override
    public Offer getById(Long idOffer) {
        return offerService.getById(idOffer).get();
    }

    @Override
    public Long create(Offer offer) {
        return offerService.create(offer);
    }
}
