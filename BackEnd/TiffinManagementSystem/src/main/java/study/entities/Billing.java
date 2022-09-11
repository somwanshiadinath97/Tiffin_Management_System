package study.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billing")
public class Billing {

	@Id
	@Column(name="trans_id")
	private int transId;
	
	@Column(name="sub_id")
	private int subId;
	
	@Column(name="no_of_days")
	private int noOfDays;
	
	@Column(name="no_of_off_days")
	private int noOfOffDays;
	
	@Column(name="month")
	private String month;
	
	@Column(name="year")
	private int year;
	
	@Column(name="total_amount")
	private int totalAmount;
	
	@Column(name="status")
	private String status;

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getNoOfOffDays() {
		return noOfOffDays;
	}

	public void setNoOfOffDays(int noOfOffDays) {
		this.noOfOffDays = noOfOffDays;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
