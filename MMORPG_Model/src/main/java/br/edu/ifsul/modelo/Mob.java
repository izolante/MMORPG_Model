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
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author Izolan
 */
@Entity
@Table(name = "mob")
public class Mob implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_mob", sequenceName = "seq_mob_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_mob", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotBlank(message = "O nome nao pode ser vazio")
    @Length(max = 50, message = "O nome nao pode passar de 50 caracteres")
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    
    @NotNull(message = "O nivel base nao pode ser nulo")
    @Column(name = "nivelBase", nullable = false)
    private Integer nivelBase;
    
    @NotBlank(message = "A descricao nao pode ser vazia")
    @Length(max = 350, message = "A descricao nao pode passar de 350 caracteres")
    @Column(name = "descricao", nullable = false, length = 350)
    private String descricao;
    
    @ManyToOne
    @JoinColumn(name = "local", referencedColumnName = "id", nullable = false)
    private Local local;
    
    public Mob(){
        
    }

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nivelBase
     */
    public Integer getNivelBase() {
        return nivelBase;
    }

    /**
     * @param nivelBase the nivelBase to set
     */
    public void setNivelBase(Integer nivelBase) {
        this.nivelBase = nivelBase;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the local
     */
    public Local getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(Local local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Mob other = (Mob) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
