package com.example.RBS.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;


//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
//@NoArgsConstructor
//@Getter
//@Setter
@Table(name="Customer")
public class Customer {

	/**
	 * Customer Entity persisted in Repository
	 */
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "slno")
//	private long id;
//	
//	private String loanType;
//	private int durationOfMonths;
//	private float roi;
//	
//	
//
//	public Customer(String loanType, int durationOfMonths, float roi) {
//		super();
//		this.loanType = loanType;
//		this.durationOfMonths = durationOfMonths;
//		this.roi = roi;
//	}
//
//
//	public String getLoanType() {
//		return loanType;
//	}
//
//	public void setLoanType(String loanType) {
//		this.loanType = loanType;
//	}
//
//	public int getDurationOfMonths() {
//		return durationOfMonths;
//	}
//
//	public void setDurationOfMonths(int durationOfMonths) {
//		this.durationOfMonths = durationOfMonths;
//	}
//
//	public float getRoi() {
//		return roi;
//	}
//
//	public void setRoi(float roi) {
//		this.roi = roi;
//	}

	
	

//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Customer(//long id,
			String customerId,
//			double loanAmount,
			@NotBlank @Size(min = 3, max = 20, message = "Customer Name should be in between 3 to 20 characters") String customerName,
			@NotBlank(message = "Address should not be blank") @Size(max = 50) String address, 
//			Date dateOfBirth,
			@NotBlank(message = "PAN number should not be blank") @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "Pan No should contain 5 Capital letters, 4 digits, 1 Capital letter") String panNo,
			
			@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", message = "It contains atleast 8 characters and atmost 20 characters, atleast one digit, atleast one uppercase alphabet, atleast one lowercase alphabet, atleast one special character which includes !@#$%&*()-+=^., doesn't contain any whitespace.") String password) {
		super();
//		this.id = id;
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
//		this.dateOfBirth = dateOfBirth;
		this.panNo = panNo;
		this.password = password;
	}

//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}


	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}
//
//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerId")
	private String customerId;

	@NotBlank
	@Size(min = 3, max = 20, message = "Customer Name should be in between 3 to 20 characters")
	private String customerName;

	@NotBlank(message = "Address should not be blank")
	@Size(max = 50)
	private String address;

//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//	private Date dateOfBirth;

	@NotBlank(message = "PAN number should not be blank")
	@Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "Pan No should contain 5 Capital letters, 4 digits, 1 Capital letter")
	private String panNo;
	
//	private double loanAmount;
//
//	
//
//	public double getLoanAmount() {
//		return loanAmount;
//	}
//
//	public void setLoanAmount(double loanAmount) {
//		this.loanAmount = loanAmount;
//	}

	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", message = "It contains atleast 8 characters and atmost 20 characters, atleast one digit, atleast one uppercase alphabet, atleast one lowercase alphabet, atleast one special character which includes !@#$%&*()-+=^., doesn't contain any whitespace.")
	private String password;

//	@Override
//	public String toString() {
//		return "Customer [id=" + id + ", customerId=" + customerId + ", customerName=" + customerName + ", address="
//				+ address + ", dateOfBirth=" + dateOfBirth + ", panNo=" + panNo + ", loanAmount=" + loanAmount
//				+ ", password=" + password + ", loanType=" + loanType + ", durationOfMonths=" + durationOfMonths + ", roi=" + roi + "]";
//	}

}



//public class Customer {
//
//}
