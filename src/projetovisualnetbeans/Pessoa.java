/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovisualnetbeans;

import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Pessoa implements Serializable{

    private String nome;
    private String sobrenome;
    private String sexo;
    private Boolean ativo;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " - " + sexo + " - " + (ativo ? "ATIVO" : "INATIVO");
    }
   
}
