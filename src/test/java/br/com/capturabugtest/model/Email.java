package br.com.capturabugtest.model;

import br.com.capturabugtest.util.Status;
import java.util.Date;

/**
 *
 * @author Rose
 */
public class Email {

    private String destinatario;
    private String remetente;
    private String assunto;
    private String texto;
    private Arquivo anexo;
    private Date dataEnvio;
    private Status status;
    private String senha;

    public Email(String destinatario, String remetente, String assunto, String texto,
            Arquivo anexo, Date dataEnvio) {
        this.destinatario = destinatario;
        this.remetente = remetente;
        this.assunto = assunto;
        this.texto = texto;
        this.anexo = anexo;
        this.dataEnvio = dataEnvio;

    }

    public Email() {

    }

    /**
     * @return the destinatario
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the remetente
     */
    public String getRemetente() {
        return remetente;
    }

    /**
     * @param remetente the remetente to set
     */
    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the dataEnvio
     */
    public Date getDataEnvio() {
        return dataEnvio;
    }

    /**
     * @param dataEnvio the dataEnvio to set
     */
    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    /**
     * @return the anexo
     */
    public Arquivo getAnexo() {
        return anexo;
    }

    /**
     * @param anexo the anexo to set
     */
    public void setAnexo(Arquivo anexo) {
        this.anexo = anexo;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
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
    

}
