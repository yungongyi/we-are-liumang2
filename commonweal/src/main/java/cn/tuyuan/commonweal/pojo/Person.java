package cn.tuyuan.commonweal.pojo;

// Generated 2017-12-26 15:38:16 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name = "person", catalog = "commonweal")
public class Person implements java.io.Serializable {

	private Integer personid;
	private State state;
	private Type type;
	private Resource resource;
	private String iphone;
	private String name;
	private String password;
	private Date personCreateDate;
	private Integer sex;
	private Set<Notice> noticeSet;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personId")
	public Set<Notice> getNoticeSet() {
		return noticeSet;
	}

	public void setNoticeSet(Set<Notice> noticeSet) {
		this.noticeSet = noticeSet;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "personid", unique = true, nullable = false)
	public Integer getPersonid() {
		return this.personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "stateId")
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typeId")
	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "headImgId")
	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Column(name = "iphone", length = 50)
	public String getIphone() {
		return this.iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "personCreateDate", length = 19)
	public Date getPersonCreateDate() {
		return this.personCreateDate;
	}

	public void setPersonCreateDate(Date personCreateDate) {
		this.personCreateDate = personCreateDate;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
