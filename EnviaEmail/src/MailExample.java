import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class MailExample {
	public static void main(String args[]) {

		System.out.println(System.getProperty("java.runtime.version"));

		final String username = "fabricio.teixeira";
		final String password = "fabricioadm00!";
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "mail.hemominas.mg.gov.br");
		// props.put("mail.transport.protocol","smtp");
		// props.put("mail.protocol.ssl.trust","*");
		// props.put("mail.smtp.ssl.checkserveridentity","false");
		props.put("mail.smtp.port", "587");

		MailSSLSocketFactory sf = null;
		try {
			sf = new MailSSLSocketFactory();
		} catch (GeneralSecurityException e1) {
			e1.printStackTrace();
		}
		sf.setTrustAllHosts(true);
		props.put("mail.smtp.ssl.enable", "false");
		props.put("mail.smtp.ssl.socketFactory", sf);
		props.put("mail.smtp.socketFactory.class", sf);
		

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});
		try {
			Message message = new MimeMessage(session);
			session.setDebug(true);
			message.setFrom(new InternetAddress(
					"fabricio.teixeira@hemominas.mg.gov.br"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("fabriciotn@yahoo.com.br"));
			message.setSubject("Titulo do Email");
			String msg = "<b>Teste negrito</b>. Teste sem negrito.<br/><br/>";
			message.setContent(msg, "text/html");
			Transport.send(message);
			System.out.println("Enviada!");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}