package study.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback_complaint")
public class FeedbackAndComplaint {

	@Id
	@Column(name="fc_id")
	private int fcId;
	
	@Column(name="feedback_rating")
	private int feedbackRating;
	
	@Column(name="feedback_comments")
	private String feedbackComments;
	
	@Column(name="feedback_datetime")
	private Date feedbackDateTime;
	
	@Column(name="delivery_issue")
	private String deliveryIssue;
	
	@Column(name="payment_issue")
	private String paymentIssue;
	
	@Column(name="other_issue")
	private String otherIssue;
	
	@Column(name="order_id")
	private int orderId;

	public int getFcId() {
		return fcId;
	}

	public void setFcId(int fcId) {
		this.fcId = fcId;
	}

	public int getFeedbackRating() {
		return feedbackRating;
	}

	public void setFeedbackRating(int feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

	public String getFeedbackComments() {
		return feedbackComments;
	}

	public void setFeedbackComments(String feedbackComments) {
		this.feedbackComments = feedbackComments;
	}

	public Date getFeedbackDateTime() {
		return feedbackDateTime;
	}

	public void setFeedbackDateTime(Date feedbackDateTime) {
		this.feedbackDateTime = feedbackDateTime;
	}

	public String getDeliveryIssue() {
		return deliveryIssue;
	}

	public void setDeliveryIssue(String deliveryIssue) {
		this.deliveryIssue = deliveryIssue;
	}

	public String getPaymentIssue() {
		return paymentIssue;
	}

	public void setPaymentIssue(String paymentIssue) {
		this.paymentIssue = paymentIssue;
	}

	public String getOtherIssue() {
		return otherIssue;
	}

	public void setOtherIssue(String otherIssue) {
		this.otherIssue = otherIssue;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

}
