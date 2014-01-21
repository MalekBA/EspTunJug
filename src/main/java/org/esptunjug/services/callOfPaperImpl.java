package org.esptunjug.services;





import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.esptunjug.domain.CallOfPaper;
import org.esptunjug.mongoDBaccess.DataBaseConnector;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoException;


@Stateless(name="callForPaperServ")
public class callOfPaperImpl implements CallOfPaperService {
	private static DataBaseConnector dbc= new DataBaseConnector();
	@Override
	public boolean insertCall(CallOfPaper callOfPaper) {
		boolean add = false;
		try{
			System.out.println(callOfPaper.toString());
		DBCollection callForPapersCollection = dbc.getDb().getCollection("callForPapers");
		BasicDBObject callForPapersObj = new BasicDBObject("fName", callOfPaper.getfName()).
				append("lName", callOfPaper.getlName()).
				append("mail", callOfPaper.getMail()).
				append("presentationType", callOfPaper.getCallType()).
				append("description", callOfPaper.getDescription()).
				append("facebook", callOfPaper.getFacebook()).
				append("twitter", callOfPaper.getTwitter()).
				append("topic", callOfPaper.getTopic()).
				append("accepted", callOfPaper.isAccepted()).
				append("readen", callOfPaper.isReaden()).
				append("status", callOfPaper.getStatus());
		callForPapersCollection.insert(callForPapersObj);
		add=true;
		
		}
		catch(Exception e){
		add=false;
		}
		return add;
	}

	@Override
	public boolean updateCall(CallOfPaper callOfPaper) {
		try{
		DBCollection callForPapersCollection = dbc.getDb().getCollection("callForPapers");
		BasicDBObject callForPapersNew = new BasicDBObject().
				append("$set",new BasicDBObject().append("accepted", callOfPaper.isAccepted()).
				append("readen", callOfPaper.isReaden()).
				append("status", callOfPaper.getStatus()));
		BasicDBObject callForPaperOld = new BasicDBObject("mail",callOfPaper.getMail());
		callForPapersCollection.update(callForPaperOld, callForPapersNew);
		return true;
		}
		catch(Exception e){
			System.out.println("failed");
			return false;
		}
	}

	@Override
	public boolean removeCall(CallOfPaper callOfPaper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CallOfPaper selectCallOfPaper(int idCall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CallOfPaper> selectCallOfPaper(String fName, String lName) {
	
		return null;
	}

	@Override
	public List<CallOfPaper> selectCallOfPaper(String eMail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CallOfPaper> selectCallOfPaper(boolean workshop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CallOfPaper> getAllCallOfPaper() {
		CallOfPaper callOfPaper;
		List<CallOfPaper> allCallsCallOfPapers = new ArrayList<CallOfPaper>() ;
		
		DBCollection callForPapersCollection = dbc.getDb().getCollection("callForPapers");
		BasicDBObject callForPapersObj = new BasicDBObject();
		DBCursor allCallsCursor = callForPapersCollection.find();
		try{
		while(allCallsCursor.hasNext()){
			
			callForPapersObj=new BasicDBObject(allCallsCursor.next().toMap());
			callOfPaper = new CallOfPaper(1, callForPapersObj.getString("fName"),
					callForPapersObj.getString("lName"),
					callForPapersObj.getString("mail"),
					callForPapersObj.getString("presentationType"),
					callForPapersObj.getString("description"),
					callForPapersObj.getString("facebook"),
					callForPapersObj.getString("twitter") ,
					callForPapersObj.getString("topic"),
					callForPapersObj.getBoolean("readen") ,
					callForPapersObj.getBoolean("accepted"),
					callForPapersObj.getString("status"));
			allCallsCallOfPapers.add(callOfPaper);
			System.out.println(callOfPaper.getMail());
			}
		}
			finally{
				allCallsCursor.close();
				
			}
		return allCallsCallOfPapers;
		}
		
		
	

}
