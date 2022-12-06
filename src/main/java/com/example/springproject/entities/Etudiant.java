package com.example.springproject.entities;

import lombok.*;

import javax.persistence.*;
import javax.swing.text.html.Option;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;

    private String prenomE;
    private String nomE;
    private Option op;

    public enum Op{
        GAMIX, SE, SIM, NIDS;
    }

    @ManyToMany(mappedBy = "etudiants", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    @OneToMany(cascade =CascadeType.ALL ,mappedBy = "etudiant")
    private Set<Contrat> Contrats;




    @ManyToOne
    Department department;

}
