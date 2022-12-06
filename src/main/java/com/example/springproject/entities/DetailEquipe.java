package com.example.springproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DetailEquipe implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailEquipe;


    private Integer salle;
    private String thematique;

    @OneToOne (mappedBy = "detail_equipe")
    @JsonIgnore //ignorer l'quipe fi detailEquipe lors de l'extraction de la DB
    private Equipe equipe;
}
