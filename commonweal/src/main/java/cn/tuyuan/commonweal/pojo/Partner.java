package cn.tuyuan.commonweal.pojo;

// Generated 2017-12-26 15:38:16 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Partner generated by hbm2java
 */
@Entity
@Table(name = "partner", catalog = "commonweal")
public class Partner implements java.io.Serializable {

	private Integer partnerId;
	private State state;
	private Resource resource;
	private String partnerName;
	private String partnerMark;
	private Date partnerStartDate;
	private Date partnerEndDate;

	public Partner() {
	}

	public Partner(State state, Resource resource, String partnerName,
			String partnerMark, Date partnerStartDate, Date partnerEndDate) {
		this.state = state;
		this.resource = resource;
		this.partnerName = partnerName;
		this.partnerMark = partnerMark;
		this.partnerStartDate = partnerStartDate;
		this.partnerEndDate = partnerEndDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "partnerId", unique = true, nullable = false)
	public Integer getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stateId")
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supportSourceId")
	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Column(name = "partnerName", length = 50)
	public String getPartnerName() {
		return this.partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	@Column(name = "partnerMark", length = 100)
	public String getPartnerMark() {
		return this.partnerMark;
	}

	public void setPartnerMark(String partnerMark) {
		this.partnerMark = partnerMark;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "partnerStartDate", length = 19)
	public Date getPartnerStartDate() {
		return this.partnerStartDate;
	}

	public void setPartnerStartDate(Date partnerStartDate) {
		this.partnerStartDate = partnerStartDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "partnerEndDate", length = 19)
	public Date getPartnerEndDate() {
		return this.partnerEndDate;
	}

	public void setPartnerEndDate(Date partnerEndDate) {
		this.partnerEndDate = partnerEndDate;
	}

}
