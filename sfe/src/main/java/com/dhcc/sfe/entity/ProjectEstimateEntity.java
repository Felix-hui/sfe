package com.dhcc.sfe.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(schema="sfe",name="tProjectEstimate")
public class ProjectEstimateEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4252726440126152627L;
	
	@Id
	@GenericGenerator(strategy="uuid", name="uuid")
	@GeneratedValue(generator="uuid")
	private String fAssessmentId;
	private String fProId;
	private String fAssessmentSuggest;
	private Date fAssessmentDate;
	private String fAssessmentTag;
	private String fDesignCode;
	public String getfAssessmentId() {
		return fAssessmentId;
	}
	public void setfAssessmentId(String fAssessmentId) {
		this.fAssessmentId = fAssessmentId;
	}
	public String getfProId() {
		return fProId;
	}
	public void setfProId(String fProId) {
		this.fProId = fProId;
	}
	public String getfAssessmentSuggest() {
		return fAssessmentSuggest;
	}
	public void setfAssessmentSuggest(String fAssessmentSuggest) {
		this.fAssessmentSuggest = fAssessmentSuggest;
	}

	public String getfAssessmentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(fAssessmentDate);
	}
	public void setfAssessmentDate(Date fAssessmentDate) {
		this.fAssessmentDate = fAssessmentDate;
	}
	public String getfAssessmentTag() {
		return fAssessmentTag;
	}
	public void setfAssessmentTag(String fAssessmentTag) {
		this.fAssessmentTag = fAssessmentTag;
	}
	public String getfDesignCode() {
		return fDesignCode;
	}
	public void setfDesignCode(String fDesignCode) {
		this.fDesignCode = fDesignCode;
	}

}
