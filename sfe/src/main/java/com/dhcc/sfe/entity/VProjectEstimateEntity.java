package com.dhcc.sfe.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(schema="sfe",name="vProjectEstimate")
public class VProjectEstimateEntity {
	
	@Id
	@GenericGenerator(strategy="uuid", name="uuid")
	@GeneratedValue(generator="uuid")
	private String fAssessmentId;
	private String fProId;
	private String fAssessmentSuggest;
	private Date fAssessmentDate;
	private String fAssessmentTag;
	private String fDesignCode;
	
	private String e000000;
	private String e010000;
	private String e020000;
	private String e030000;
	private String e040000;
	private String e050000;
	private String e060000;
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
	public Object getfAssessmentDate() {
		if (fAssessmentDate != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(fAssessmentDate);
		} else {
			return fAssessmentDate;
		}
		
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
	public String getE000000() {
		return e000000;
	}
	public void setE000000(String e000000) {
		this.e000000 = e000000;
	}
	public String getE010000() {
		return e010000;
	}
	public void setE010000(String e010000) {
		this.e010000 = e010000;
	}
	public String getE020000() {
		return e020000;
	}
	public void setE020000(String e020000) {
		this.e020000 = e020000;
	}
	public String getE030000() {
		return e030000;
	}
	public void setE030000(String e030000) {
		this.e030000 = e030000;
	}
	public String getE040000() {
		return e040000;
	}
	public void setE040000(String e040000) {
		this.e040000 = e040000;
	}
	public String getE050000() {
		return e050000;
	}
	public void setE050000(String e050000) {
		this.e050000 = e050000;
	}
	public String getE060000() {
		return e060000;
	}
	public void setE060000(String e060000) {
		this.e060000 = e060000;
	}
	
}
