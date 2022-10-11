/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Item;
import br.edu.ifsul.modelo.ItemUsuario;
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
public class TestePersistirItemUsuario {
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.edu.ifsul_MMORPG_Model");
        EntityManager em = emf.createEntityManager();
        ItemUsuario l = new ItemUsuario();
        l.setAddForca(0);
        l.setAddInt(0);
        l.setAddVeloc(0);
        
        Item item = em.find(Item.class, 4);
        
        l.setItemid(item);
        
        Usuario usuario = em.find(Usuario.class, 5);
        
        l.setUsuario(usuario);
        
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
