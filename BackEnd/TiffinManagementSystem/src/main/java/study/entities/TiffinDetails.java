package study.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiffin_details")
public class TiffinDetails {

	@Id
    @Column(name="tiffin_id")
	private int tiffinId;
	
	@Column(name="tiffin_name")
	private String tiffinName;
	
	@Column(name="tiffin_image")
	private String tiffinImage;
	
	@Column(name="tiffin_price_month")
	private int tiffinPriceMonth;
	
	@Column(name="description")
	private String description;
	
	@Column(name="vend_id")
	private int vendorId;

	public int getTiffinId() {
		return tiffinId;
	}

	public void setTiffinId(int tiffinId) {
		this.tiffinId = tiffinId;
	}

	public String getTiffinName() {
		return tiffinName;
	}

	public void setTiffinName(String tiffinName) {
		this.tiffinName = tiffinName;
	}

	public String getTiffinImage() {
		return tiffinImage;
	}

	public void setTiffinImage(String tiffinImage) {
		this.tiffinImage = tiffinImage;
	}

	public int getTiffinPriceMonth() {
		return tiffinPriceMonth;
	}

	public void setTiffinPriceMonth(int tiffinPriceMonth) {
		this.tiffinPriceMonth = tiffinPriceMonth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	
}
