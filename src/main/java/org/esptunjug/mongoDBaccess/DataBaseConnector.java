package org.esptunjug.mongoDBaccess;



import java.net.UnknownHostException;



import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.tools.ConnectionPoolStat;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

//@Stateful(name="dbConnectorServ")
public class DataBaseConnector {
	
	private DB db= null;
	public DB getDb() {
		return db;
	}
	
	
	public DataBaseConnector(){
		
			try {
				db= new Mongo("localhost",27017).getDB("esp_tun_jug_DB");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	
}
