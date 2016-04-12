package br.com.capturabugtest.util;

import br.com.capturabugtest.model.Email;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

/**
 *
 * @author Rose
 */
public class Conexao {

    /**
     * Parâmetros de conexão com servidor Gmail
     *
     * @return
     */
    public Properties conectaServidorGmail() {

        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        return props;

    }

    public Session logaEmail(final Email email) {

        Session session = Session.getDefaultInstance(conectaServidorGmail(),
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(email.getRemetente(), email.getSenha());
                    }
                });
        return session;

    }

}
