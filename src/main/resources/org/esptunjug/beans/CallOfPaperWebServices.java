package org.esptunjug.beans;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.esptunjug.domain.CallOfPaper;
import org.esptunjug.services.CallOfPaperService;


@Path("/call")
public class CallOfPaperWebServices implements CallForPapersWServ {
	
	@EJB
	private CallOfPaperService callOfPaperService;
	
	private CallOfPaper callOfPaper= new CallOfPaper();

	
	public CallOfPaper getCallOfPaper() {
		return callOfPaper;
	}
	public void setCallOfPaper(CallOfPaper callOfPaper) {
		this.callOfPaper = callOfPaper;
	}
	@Override
	@Path("/send")
	@GET
	//@Consumes(MediaType.APPLICATION_JSON)
	public String addCall(){
		callOfPaperService.insertCall(callOfPaper);
		return "OK";
	}
}
