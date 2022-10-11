/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Local;
import br.edu.ifsul.modelo.Mob;
import br.edu.ifsul.modelo.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Izolan
 */
public class TestePersistirUsuario {
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.ifsul_MMORPG_Model");
        EntityManager em = emf.createEntityManager();
        Usuario l = new Usuario();
        l.setNickname("Usuario01");
        l.setDinheiro(500);
        l.setSenha("senha123");
        l.setExp(0);
        
        Local loc = em.find(Local.class, 1);
        
        l.setLocal(loc);
        
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
