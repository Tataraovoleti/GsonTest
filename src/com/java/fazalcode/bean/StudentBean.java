/**
 * 
 */
package com.java.fazalcode.bean;

/**
 * @author Sanjay
 *
 */
public class StudentBean {
	
	private String sId;
	private String sName;
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "StudentBean [sId=" + sId + ", sName=" + sName + "]";
	}
	
	

}
