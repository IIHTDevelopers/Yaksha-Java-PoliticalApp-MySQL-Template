package com.iiht.training.ratings.dto;

import java.util.Objects;

public class PoliticalLeaderDto {

	private Long politicalLeaderId;
	
	private Long politicalPartyId;
	
	private String candidateName;
	
	private String candidateState;

	public Long getPoliticalLeaderId() {
		return politicalLeaderId;
	}

	public void setPoliticalLeaderId(Long candidateId) {
		this.politicalLeaderId = candidateId;
	}

	public Long getPoliticalPartyId() {
		return politicalPartyId;
	}

	public void setPoliticalPartyId(Long partyId) {
		this.politicalPartyId = partyId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateState() {
		return candidateState;
	}

	public void setCandidateState(String candidateState) {
		this.candidateState = candidateState;
	}

	@Override
	public int hashCode() {
		return Objects.hash(politicalLeaderId, candidateName, candidateState, politicalPartyId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliticalLeaderDto other = (PoliticalLeaderDto) obj;
		return Objects.equals(politicalLeaderId, other.politicalLeaderId)
				&& Objects.equals(candidateName, other.candidateName)
				&& Objects.equals(candidateState, other.candidateState)
				&& Objects.equals(politicalPartyId, other.politicalPartyId);
	}

}
