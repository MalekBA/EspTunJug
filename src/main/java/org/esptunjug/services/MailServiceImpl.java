package org.esptunjug.services;

import java.util.Date;
import java.util.Properties;

import javax.ejb.Stateful;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.esptunjug.domain.MessageJug;



@Stateful
public class MailServiceImpl implements MailService {

	@Override
	public boolean sendService(MessageJug msgJug) {
		boolean sent=false;
		try
	    {
			
			
			
			
			Properties props = System.getProperties();
		      // -- Attaching to default Session, or we could start a new one --
		      props.put("mail.smtp.host", "smtp.topnet.tn");
		      Session session = Session.getDefaultInstance(props, null);
		      // -- Create a new message --
		      Message msg = new MimeMessage(session);
		    
		      // -- Set the FROM and TO fields --
		      msg.setFrom(new InternetAddress(msgJug.getFrom()));
		      msg.setRecipients(Message.RecipientType.TO,
		        InternetAddress.parse("malek.benammar@esprit.tn", false));
		      // -- We could include CC recipients too --
		      // if (cc != null)
		      // msg.setRecipients(Message.RecipientType.CC
		      // ,InternetAddress.parse(cc, false));
		      // -- Set the subject and body text --
		      msg.setSubject(msgJug.getSubject());
		      msg.setText(msgJug.getBody());
		      // -- Set some other header information --
		      msg.setHeader("X-Mailer", "LOTONtechEmail");
		      msg.setSentDate(new Date());
		      // -- Send the message --
		      Transport.send(msg);
			
			
	      System.out.println("Message sent OK.");
	      sent=true;
	      return sent;
	      
	    }
	    catch (Exception ex)
	    {
	    	 ex.printStackTrace();
	    	return sent;
	     
	    }
		
	}

}
