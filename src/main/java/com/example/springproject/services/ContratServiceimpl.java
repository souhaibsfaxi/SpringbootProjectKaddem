package com.example.springproject.services;

import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.Etudiant;
import com.example.springproject.repositories.ContratRepo;
import com.example.springproject.repositories.EtudiantRepo;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor //connect to db
public class ContratServiceimpl implements ContratService {

    ContratRepo contratrepo;
    EtudiantRepo Etudiantrepo;

    @Override
    public List<Contrat> retrieveAllContrats(){
        return contratrepo.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c){
        return contratrepo.save(c);
    }

    @Override
    public void deleteContrat(Integer id){
        contratrepo.deleteById(id);
    }

    @Override
    public Contrat updateContrat(Contrat c){
        return contratrepo.save(c);
    }

    @Override
    public Contrat retrieveContrat(Integer id){
        return contratrepo.findById(id).orElse(null);
    }

    @Override
    //@Scheduled(cron = "* 0 13 * * *")
    @Scheduled(fixedRate = 3000)
    public void retrieveAndUpdateStatusContrat(){
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        List<Contrat> cont =contratrepo.findAll();
        for(Contrat c: cont){
            if((date.getTime()  -  c.getDateFinContrat().getTime()/(1000 * 60 * 60 * 24)% 365) < 15){
                System.out.println(c);
            }
            if((date.getTime()  -  c.getDateFinContrat().getTime()/(1000 * 60 * 60 * 24)% 365) < 0){
                c.setArchive(true);
            }
        }

    };
/*
    @Override
    public Contrat affectContratToEtudiant (Contrat ce,String nomE ,String prenomE){

        Etudiant etud = Etudiantrepo.findByNomeAndPrenome(nomE, prenomE);
        Contrat cont= ce;
        if (etud.getContrats().stream().count() <= 5){
            etud.getContrats().add(ce);
            Etudiantrepo.save(etud);
        }

        return cont;
    }
    */

}
