package org.esptunjug.services;


import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.esptunjug.domain.MessageJug;





@Local
@Path("/mail")
public interface MailService {
	
	@Path("/send")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean sendService(MessageJug msgJug);
	
	
	
	
	
	public class send{
		
	}
	

}
