package com.bridgelabz.springbatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateModel {
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "CIC_ID")
	private String cicId;
	@Column(name = "FULL_NAME")
	private String fullName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "MOBILE_NUMBER")
	private String mobileNum;
	@Column(name = "HIRED_DATE")
	private String hiredDate;
	@Column(name = "DEGREE")
	private String degree;
	@Column(name = "AGGREGATE_PERCENTAGE")
	private Double aggrPer;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "PREFFERED_JOB_LOCATION")
	private String preferredJobLocation;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "PASSED_OUT_YEAR")
	private String passedOutYear;
	@Column(name = "CREATOR_USER")
	private String creatorUser;
	@Column(name = "CANDIDATE_STATUS")
	private String candidateStatus;
}
