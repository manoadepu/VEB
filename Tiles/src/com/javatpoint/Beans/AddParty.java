package com.javatpoint.Beans;

public class AddParty {
	String Party;
	String CandidateName;
	public String getParty() {
		return Party;
	}
	public void setParty(String party) {
		Party = party;
	}
	public String getCandidateName() {
		return CandidateName;
	}
	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}
	@Override
	public String toString() {
		return "AddParty [Party=" + Party + ", CandidateName=" + CandidateName + "]";
	}
	
}
