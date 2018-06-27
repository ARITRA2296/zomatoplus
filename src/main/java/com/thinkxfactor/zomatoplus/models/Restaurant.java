package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_restaurant")
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="Restaurant_id")
	private long id1;
	
	@Column(name="city")
	private String city;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="website")
	private String website;
	
	@Column(name="like_count")
	private int likeCount;
	
	@Column(name="contact")
	private String contact;
	
	public Restaurant()
	{
	}

	public Restaurant(long id, String city, String name, String address, String website, int likeCount,
			String contact) {
		super();
		this.id1 = id;
		this.city = city;
		this.name = name;
		this.address = address;
		this.website = website;
		this.likeCount = likeCount;
		this.contact = contact;
	}

	public long getId() {
		return id1;
	}

	public void setId(long id) {
		this.id1 = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
