package com.userservice.entity.copy;

public class Contact {
	private Long cId;
	private String contactEmail;
	private String contactName;
	private Long userId;

	public Contact() {
		super();
	}

	public Contact(Long cId, String contactEmail, String contactName, Long userId) {
		super();
		this.cId = cId;
		this.contactEmail = contactEmail;
		this.contactName = contactName;
		this.userId = userId;
	}

	public long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
