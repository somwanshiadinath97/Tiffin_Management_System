package study.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="extra_order_absent_request")
public class ExtraOrderAndAbsentRequest {

	@Id
	@Column(name="request_id")
	private int requestId;
	
	@Column(name="tiffin_id")
	private int tiffinId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="request_Date")
	private Date requestDate;
	
	@Column(name="is_ack")
	private boolean isAcknowledged;
	
	@Column(name="request_count")
	private int requestCount;
	
	@Column(name="absent_present_info")
	private String absentPresentInfo;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getTiffinId() {
		return tiffinId;
	}

	public void setTiffinId(int tiffinId) {
		this.tiffinId = tiffinId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public boolean isAcknowledged() {
		return isAcknowledged;
	}

	public void setAcknowledged(boolean isAcknowledged) {
		this.isAcknowledged = isAcknowledged;
	}

	public int getRequestCount() {
		return requestCount;
	}

	public void setRequestCount(int requestCount) {
		this.requestCount = requestCount;
	}

	public String getAbsentPresentInfo() {
		return absentPresentInfo;
	}

	public void setAbsentPresentInfo(String absentPresentInfo) {
		this.absentPresentInfo = absentPresentInfo;
	}
	
}
