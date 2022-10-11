/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Item;
import br.edu.ifsul.modelo.Local;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Izolan
 */
@Test
public class TestePersistirItem {
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.ifsul_MMORPG_Model");
        EntityManager em = emf.createEntityManager();
        Item l = new Item();
        l.setNome("Espada Longa");
        l.setDescricao("Espada longa simples, feita por um blacksmith nada experiente");
        l.setValor(50);
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
