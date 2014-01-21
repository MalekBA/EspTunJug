package org.esptunjug.domain;

import java.io.Serializable;

public class CallOfPaper implements Serializable {
	
	private int id;
	private String fName;
	private String lName;
	private String mail;
	private String callType;
	private String description;
	private String facebook;
	private String twitter;
	private String topic;
	private boolean readen;
	private String status;
	private boolean accepted;
	
	
	public CallOfPaper() {
		// TODO Auto-generated constructor stub
	}

	public CallOfPaper(int id, String fName, String lName, String mail,
			String callType, String description, String facebook,
			String twitter,String topic, boolean readen, boolean accepted, String status) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.mail = mail;
		this.callType = callType;
		this.description = description;
		this.facebook = facebook;
		this.twitter = twitter;
		this.topic=topic;
		this.readen = readen;
		this.accepted = accepted;
		this.status=status;
	}










	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String eMailAddr) {
		this.mail = eMailAddr;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public boolean isReaden() {
		return readen;
	}
	public void setReaden(boolean readen) {
		this.readen = readen;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}










	@Override
	public String toString() {
		return "CallOfPaper [id=" + id + ", fName=" + fName + ", lName="
				+ lName + ", mail=" + mail + ", callType=" + callType
				+ ", description=" + description + ", facebook=" + facebook
				+ ", twitter=" + twitter+", topic="+topic + ", readen=" + readen + ", accepted="
				+ accepted +", status=" + status+ "]";
	}





	
	

}
