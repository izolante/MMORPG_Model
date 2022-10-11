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
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_usuario", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @NotBlank(message = "O nickname nao pode ser vazio")
    @Length(max = 50, message = "O nickname nao pode passar de 50 caracteres")
    @Column(name = "nickname", nullable = false, length = 50)
    private String nickname;
    
    @NotNull(message = "A experiencia nao pode ser nula")
    @Column(name = "exp", nullable = false)
    private Integer exp;
    
    //private String email;
    
    @NotBlank(message = "A senha nao pode ser vazia")
    @Length(max = 50, message = "A senha nao pode passar de 50 caracteres")
    @Column(name = "senha", nullable = false, length = 50)
    private String senha;
    
    @NotNull(message = "O dinheiro nao pode ser nulo")
    @Column(name = "dinheiro", nullable = false)
    private Integer dinheiro;
    
    @ManyToOne
    @JoinColumn(name = "local", referencedColumnName = "id", nullable = false)
    private Local local;
    
    public Usuario(){
        
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
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the exp
     */
    public Integer getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(Integer exp) {
        this.exp = exp;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the dinheiro
     */
    public Integer getDinheiro() {
        return dinheiro;
    }

    /**
     * @param dinheiro the dinheiro to set
     */
    public void setDinheiro(Integer dinheiro) {
        this.dinheiro = dinheiro;
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
        int hash = 7;
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
}
