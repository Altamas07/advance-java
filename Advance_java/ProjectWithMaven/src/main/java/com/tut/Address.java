package com.tut;

import java.util.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "students_address")
public class Address {

	

	@Id // treats address id as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generates default values
	@Column(name = "address_id") // changes column name or anything
	private int addressId;

	private String street;

	private String city;

	@Temporal(TemporalType.DATE) // to format date
	private Date addedDate;

	private Boolean isopen;

	@Transient // it will not save the x value in the data base
	private Double x;

	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] image;

	public Address() {
		super();
	}

	public Address(int addressId, String street, String city, Date addedDate, Boolean isopen, Double x, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.addedDate = addedDate;
		this.isopen = isopen;
		this.x = x;
		this.image = image;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAddeddate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Date getAddeddate() {
		return addedDate;

	}

	public Boolean getIsopen() {
		return isopen;
	}

	public void setIsopen(Boolean isopen) {
		this.isopen = isopen;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", addedDate=" + addedDate
				+ ", isopen=" + isopen + ", x=" + x + ", image=" + Arrays.toString(image) + "]";
	}

}
