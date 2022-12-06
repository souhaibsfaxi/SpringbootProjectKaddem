package com.example.springproject.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Contrat implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrat;

    private Integer montantContrat;

    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;

    private Boolean Archive;
    private Specialite specialite;


    public enum Specialite{
        IA, RESEAUX, CLOUD, SECURITE;
    }

    @ManyToOne
    Etudiant etudiant;

}

