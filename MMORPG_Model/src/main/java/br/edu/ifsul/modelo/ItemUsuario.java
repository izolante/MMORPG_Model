/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Izolan
 */
@Entity
@Table(name = "itemusuario")
public class ItemUsuario implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_itemusuario", sequenceName = "seq_itemusuario_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_itemusuario", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotNull(message = "addForca nao pode ser nulo")
    @Column(name = "addForca", nullable = false)
    private Integer addForca;
    
    @NotNull(message = "addInt nao pode ser nulo")
    @Column(name = "addInt", nullable = false)
    private Integer addInt;
    
    @NotNull(message = "addVeloc nao pode ser nulo")
    @Column(name = "addVeloc", nullable = false)
    private Integer addVeloc;
    
    @ManyToOne
    @JoinColumn(name = "itemid", referencedColumnName = "id", nullable = false)
    private Item itemid;
    
    @ManyToOne
    @JoinColumn(name = "usuario", referencedColumnName = "id", nullable = false)
    private Usuario usuario;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the addForca
     */
    public Integer getAddForca() {
        return addForca;
    }

    /**
     * @param addForca the addForca to set
     */
    public void setAddForca(Integer addForca) {
        this.addForca = addForca;
    }

    /**
     * @return the addInt
     */
    public Integer getAddInt() {
        return addInt;
    }

    /**
     * @param addInt the addInt to set
     */
    public void setAddInt(Integer addInt) {
        this.addInt = addInt;
    }

    /**
     * @return the addVeloc
     */
    public Integer getAddVeloc() {
        return addVeloc;
    }

    /**
     * @param addVeloc the addVeloc to set
     */
    public void setAddVeloc(Integer addVeloc) {
        this.addVeloc = addVeloc;
    }

    /**
     * @return the itemid
     */
    public Item getItemid() {
        return itemid;
    }

    /**
     * @param itemid the itemid to set
     */
    public void setItemid(Item itemid) {
        this.itemid = itemid;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemUsuario other = (ItemUsuario) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
}
