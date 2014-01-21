package org.esptunjug.services;



import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.esptunjug.domain.CallOfPaper;
@Remote
@Path("/call")
public interface CallOfPaperService {
	@Path("/send")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("text/plain")
	public boolean insertCall(CallOfPaper callOfPaper) ;
	
	@Path("/update")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean updateCall(CallOfPaper callOfPaper);
	public boolean removeCall(CallOfPaper callOfPaper);
	public CallOfPaper selectCallOfPaper(int idCall);
	public List<CallOfPaper> selectCallOfPaper(String fName, String lName);
	
	public List<CallOfPaper> selectCallOfPaper(String eMail);
	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CallOfPaper> getAllCallOfPaper();
	public List<CallOfPaper> selectCallOfPaper(boolean workshop);

}
