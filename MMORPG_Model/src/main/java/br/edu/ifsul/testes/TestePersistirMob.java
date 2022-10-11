/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Local;
import br.edu.ifsul.modelo.Mob;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Izolan
 */
public class TestePersistirMob {
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.ifsul_MMORPG_Model");
        EntityManager em = emf.createEntityManager();
        Mob l = new Mob();
        l.setNome("Diabrete");
        l.setDescricao("Criatura alada pequena e vermelha, parece a fusao de uma harpia e um demonio");
        l.setNivelBase(1);
        
        Local loc = em.find(Local.class, 2);
        
        l.setLocal(loc);
        
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
