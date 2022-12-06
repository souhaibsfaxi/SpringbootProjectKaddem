package com.example.springproject.services;


import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.Equipe;

import com.example.springproject.entities.Etudiant;
import com.example.springproject.repositories.EquipeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class EquipeServiceimpl implements EquipeService{

    EquipeRepo Equiperepo;

    @Override
    public List<Equipe> retrieveAllEquipe(){
        return Equiperepo.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe c){
        return Equiperepo.save(c);
    }

    @Override
    public void deleteEquipe(Integer id){
        Equiperepo.deleteById(id);
    }

    @Override
    public Equipe updateEquipe(Equipe c){
        return Equiperepo.save(c);
    }

    @Override
    public Equipe retrieveEquipe(Integer id){
        return Equiperepo.findById(id).orElse(null);
    }

    @Override
    public void faireEvoluerEquipes(){
        List<Equipe> eq = Equiperepo.findAll();
        int a=0;
        for( Equipe e : eq){
            Set<Etudiant> etList= e.getEtudiants();
            for(Etudiant etud: etList){
                Set<Contrat> cont= etud.getContrats();
                for (Contrat c: cont){
                    if ((c.getDateDebutContrat().getTime()- c.getDateFinContrat().getTime())/ (1000l * 60 * 60 * 24 * 365) > 1){
                        a ++;
                    }

                }
                if((a >= 3) &  (e.getNiveau().equals("Junior") )){
                    e.setNiveau(Equipe.Niveau.valueOf("Senior"));
                }
                if((a >= 3) &  (e.getNiveau().equals("Senior") )){
                    e.setNiveau(Equipe.Niveau.valueOf("Expert"));
                }
            }
        }
    }
}
