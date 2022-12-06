package com.example.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Equipe implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe;

    private String nomEquipe;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;


    public enum Niveau{
        Junior, Senior, Expert
    }

    @OneToOne(cascade = CascadeType.ALL)
    private DetailEquipe detail_equipe;

    @ManyToMany
    private Set<Etudiant> etudiants;

    @ManyToOne
    Entreprise entreprise;

}
