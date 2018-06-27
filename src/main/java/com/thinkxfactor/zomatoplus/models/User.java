package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_user")
public class User implements Serializable {
		@Id
		@GeneratedValue(strategy=GenerationType.TABLE)
		@Column(name="user_id")
		private long id;
		
		@Column(name="name",unique=true)
		private String name;
		
		@Column(name="type")
		private String type;
		
		@Column(name="mobile")
		private String mobile;
		
		@Column(name="address")
		private String address;
		
		@Column(name="password")
		private String password;
		
		@Column(name="landmark")
		private String landmark;
		
		@Column(name="pincode")
		private String pincode;
		
		public User()
		{
		}
		public User(long id,String unm,String pwd,String tp,String phn,String lmk,String pcode,String add)
		{
			super();
			this.id=id;
			this.name=unm;
			this.address=add;
			this.password=pwd;
			this.type=tp;
			this.mobile=phn;
			this.landmark=lmk;
			this.pincode=pcode;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		
		
		
		
	}
