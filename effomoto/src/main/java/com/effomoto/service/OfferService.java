package com.effomoto.service;

import com.effomoto.model.Offer;
import com.effomoto.model.OfferRepository;
import com.effomoto.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OfferService {
    @Autowired
    private OfferRepository offerRepository;

    public List<Offer> getOffers() {
        return offerRepository.findAll();
    }

    public Optional<Offer> getById(Long idOffer) { return offerRepository.findById(idOffer);
    }

    public Long create(Offer offer) {
        return offerRepository.save(offer).getIdOffer();
    }
}
