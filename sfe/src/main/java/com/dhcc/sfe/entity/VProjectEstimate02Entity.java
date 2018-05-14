package com.dhcc.sfe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(schema="sfe", name="vProjectEstimate02")
public class VProjectEstimate02Entity {
	@Id
	@GenericGenerator(strategy="uuid", name="uuid")
	@GeneratedValue(generator="uuid")
	private String fAssessmentId;
	private String fProId;
	private String e020000;
	private String e020100;
	private String e020200;
	private String e020300;
	private String e020400;
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
	public String getE020000() {
		return e020000;
	}
	public void setE020000(String e020000) {
		this.e020000 = e020000;
	}
	public String getE020100() {
		return e020100;
	}
	public void setE020100(String e020100) {
		this.e020100 = e020100;
	}
	public String getE020200() {
		return e020200;
	}
	public void setE020200(String e020200) {
		this.e020200 = e020200;
	}
	public String getE020300() {
		return e020300;
	}
	public void setE020300(String e020300) {
		this.e020300 = e020300;
	}
	public String getE020400() {
		return e020400;
	}
	public void setE020400(String e020400) {
		this.e020400 = e020400;
	}
}
