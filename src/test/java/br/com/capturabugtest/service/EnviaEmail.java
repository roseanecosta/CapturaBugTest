package br.com.capturabugtest.service;

import br.com.capturabugtest.model.Arquivo;
import br.com.capturabugtest.model.Email;
import br.com.capturabugtest.util.Conexao;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Part;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Rose
 */
public class EnviaEmail {

    public void envia() {

        final Email email = new Email();
        Arquivo arquivo = new Arquivo();
        Conexao con = new Conexao();

        /**
         * Ativa Debug para sessão
         */
        //  session.setDebug(true);
        try {

            email.setRemetente("capturabugtest@gmail.com");
            email.setSenha("capturabugtest");
            email.setDestinatario("roseanecosta88@gmail.com");
            email.setAssunto("Teste print de Erro");
            email.setTexto("Enviado print da tela");
           // email.setAnexo(arquivo.getCaminho()+ arquivo.getNome());
            
            arquivo.setNome("erro.png");
            arquivo.setCaminho("C:\\tmp\\" + arquivo.getNome());
            
            Message message = new MimeMessage(con.logaEmail(email));

            message.setFrom(new InternetAddress(email.getRemetente())); //Remetente

            Address[] toUser = InternetAddress //Destinatário(s)
                    .parse(email.getDestinatario());

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(email.getAssunto());//Assunto

            MimeMultipart mpRoot = new MimeMultipart("mixed");
            MimeMultipart mpContent = new MimeMultipart("alternative");
            MimeBodyPart contentPartRoot = new MimeBodyPart();
            contentPartRoot.setContent(mpContent);
            mpRoot.addBodyPart(contentPartRoot);

            //enviando texto  
            MimeBodyPart texto = new MimeBodyPart();
            texto.setText(email.getTexto());
            mpContent.addBodyPart(texto);

            //enviando html
            /*
             MimeBodyPart mbp2 = new MimeBodyPart();
             mbp2.setContent("<P> Enviado print da tela. Erro Login </P>", "text/html");
             mpContent.addBodyPart(mbp2); */
            
            //enviando anexo 
            MimeBodyPart anexo = new MimeBodyPart();
            DataSource fds = new FileDataSource(arquivo.getCaminho());

            anexo.setDisposition(Part.ATTACHMENT);
            anexo.setDataHandler(new DataHandler(fds));
            anexo.setFileName(arquivo.getNome());

            mpRoot.addBodyPart(anexo);

            message.setContent(mpRoot);
            message.saveChanges();

            /**
             * Método para enviar a mensagem criada
             */
            Transport.send(message);

            System.out.println("Feito!!!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
