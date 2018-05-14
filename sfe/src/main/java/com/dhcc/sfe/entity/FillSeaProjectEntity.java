package com.dhcc.sfe.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/*
 * 围填海项目表
 * */
@Entity
@Table(schema="sfe",name="tSasFillProject")
public class FillSeaProjectEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9160632019087940716L;
	

	@Id
	@GenericGenerator(strategy="uuid", name="uuid")
	@GeneratedValue(generator="uuid")
	private String fProId;
	private String fProPosition;
	private String fProUsename;
	private String fProTitleuser;
	public String getfProId() {
		return fProId;
	}
	public void setfProId(String fProId) {
		this.fProId = fProId;
	}
	public String getfProPosition() {
		return fProPosition;
	}
	public void setfProPosition(String fProPosition) {
		this.fProPosition = fProPosition;
	}
	public String getfProUsename() {
		return fProUsename;
	}
	public void setfProUsename(String fProUsename) {
		this.fProUsename = fProUsename;
	}
	public String getfProTitleuser() {
		return fProTitleuser;
	}
	public void setfProTitleuser(String fProTitleuser) {
		this.fProTitleuser = fProTitleuser;
	}

}
