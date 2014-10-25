/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dbs.aula.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivone M. V. Hess
 */
public class Playlist {
    
    private String nome;
    private Integer quantidadedeExecucao;
    private Date dataUltimaExecucao;
    private Date dataCriacao;
    private Integer duracaoTotal;
    private List <Musica> musicas = new ArrayList<>();
    
    public void adicionaMusica(Musica musica){
    
    musicas.add(musica);
    }

    
    public List <Musica> getMusicas() {
        return musicas;
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
     * @return the quantidadedeExecucao
     */
    public Integer getQuantidadedeExecucao() {
        return quantidadedeExecucao;
    }

    /**
     * @return the dataUltimaExecucao
     */
    public Date getDataUltimaExecucao() {
        return dataUltimaExecucao;
    }

    /**
     * @return the dataCriacao
     */
    public Date getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @return the duracaoTotal
     */
    public Integer getDuracaoTotal() {
        return duracaoTotal;
    }

    /**
     * @return the musicas
     */
    
    
    
}
