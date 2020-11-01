package com.effomoto.model;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "com_user")
@SequenceGenerator(name = "seq_user", sequenceName = "seq_user", allocationSize = 1)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
    @Column(name = "id_user")
    private Long idUser;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_role")
    private Role role;

    private String name;

    private String surname;

    private String email;
}
