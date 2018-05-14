package com.dhcc.sfe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(schema="sfe", name="vProjectEstimate01")
public class VProjectEstimate01Entity {
	
	@Id
	@GenericGenerator(strategy="uuid", name="uuid")
	@GeneratedValue(generator="uuid")
	private String fAssessmentId;
	private String fProId;
	private String e010000;
	private String e010100;
	private String e010200;
	private String e010300;
	private String e010400;
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
	public String getE010000() {
		return e010000;
	}
	public void setE010000(String e010000) {
		this.e010000 = e010000;
	}
	public String getE010100() {
		return e010100;
	}
	public void setE010100(String e010100) {
		this.e010100 = e010100;
	}
	public String getE010200() {
		return e010200;
	}
	public void setE010200(String e010200) {
		this.e010200 = e010200;
	}
	public String getE010300() {
		return e010300;
	}
	public void setE010300(String e010300) {
		this.e010300 = e010300;
	}
	public String getE010400() {
		return e010400;
	}
	public void setE010400(String e010400) {
		this.e010400 = e010400;
	}
	
}
