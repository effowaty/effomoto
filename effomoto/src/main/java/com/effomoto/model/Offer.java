package com.effomoto.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "com_offer")
@SequenceGenerator(name = "seq_offer", sequenceName = "seq_offer", allocationSize = 1)
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_offer")
    @Column(name = "id_offer")
    private Long idOffer;

    //TODO:add idVehicle

    private double price;

    @Column(name = "expire_date")
    private Date expireDate;

    @Column(name = "addition_date")
    private Date additionDate;

    @Column(name = "is_sold")
    private boolean isSold;

    @Column(name = "is_active")
    private boolean isActive;
}

