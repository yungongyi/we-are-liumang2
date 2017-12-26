package cn.tuyuan.commonweal.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Province entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_province", catalog = "commonweal")
public class Province implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -5235456660228035499L;
	private Integer provinceId;
	private String provinceName;

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** minimal constructor */
	public Province(Integer provinceId) {
		this.provinceId = provinceId;
	}

	/** full constructor */
	public Province(Integer provinceId, String provinceName) {
		this.provinceId = provinceId;
		this.provinceName = provinceName;
	}

	// Property accessors
	@Id
	@Column(name = "provinceId", unique = true, nullable = false)
	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	@Column(name = "provinceName", length = 50)
	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}