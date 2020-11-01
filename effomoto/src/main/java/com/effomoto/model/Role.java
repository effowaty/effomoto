package com.effomoto.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "com_role")
@SequenceGenerator(name = "seq_role", sequenceName = "seq_role", allocationSize = 1)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_role")
    @Column(name = "id_role")
    private Long idRole;

    private String name;
}
