package com.example.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart;

    private String nomDepart;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
    @JsonIgnore
    private Set<Etudiant> etudiants;


}
