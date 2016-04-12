package br.com.capturabugtest.model;

import java.util.Date;

/**
 *
 * @author Rose
 */
public class Arquivo {

    private String nome;
    private String caminho;
    private Date data;

    public Arquivo(String nome, String caminho, Date data) {
        this.nome = nome;
        this.caminho = caminho;
        this.data = data;
    }

    public Arquivo() {
       
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
     * @return the caminho
     */
    public String getCaminho() {
        return caminho;
    }

    /**
     * @param caminho the caminho to set
     */
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

}
