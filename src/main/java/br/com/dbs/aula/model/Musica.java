/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dbs.aula.model;

import java.util.List;

/**
 *
 * @author Ivone M. V. Hess
 */
public class Musica {
    
    private String nome;
    private Integer duraca;
    private Cantor cantor;
    

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
     * @return the duraca
     */
    public Integer getDuraca() {
        return duraca;
    }

    /**
     * @param duraca the duraca to set
     */
    public void setDuraca(Integer duraca) {
        this.duraca = duraca;
    }

    /**
     * @return the cantor
     */
    public Cantor getCantor() {
        return cantor;
    }

    /**
     * @param cantor the cantor to set
     */
    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }
    
}
