package test;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 公司.
 * 
 */
@Entity
public class Company implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 公司ID. */
	@Id
	@GeneratedValue
	private Long cid;

	/** 公司名称. */
	@Column(nullable=true)
	private String name;

	/** 公司地址. */
	@Column(nullable=true)
	private String address;

	/** 公司电话. */
	@Column(nullable=true)
	private String phone;

	/** 公司座机号码. */
	@Column(nullable=true)
	private String tele;

	/** 公司邮件. */
	@Column(nullable=true)
	private String email;

	/** 公司介绍. */
	@Column(nullable=true)
	private String description;

	/**
	 * Constructor.
	 */
	public Company() {
		this.companyinfoSet = new HashSet<Companyinfo>();
		this.projectSet = new HashSet<Project>();
	}

	/**
	 * Set the 公司ID.
	 * 
	 * @param cid
	 *            公司ID
	 */
	public void setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * Get the 公司ID.
	 * 
	 * @return 公司ID
	 */
	public Long getCid() {
		return this.cid;
	}

	/**
	 * Set the 公司名称.
	 * 
	 * @param name
	 *            公司名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 公司名称.
	 * 
	 * @return 公司名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the 公司地址.
	 * 
	 * @param address
	 *            公司地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Get the 公司地址.
	 * 
	 * @return 公司地址
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * Set the 公司电话.
	 * 
	 * @param phone
	 *            公司电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Get the 公司电话.
	 * 
	 * @return 公司电话
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Set the 公司座机号码.
	 * 
	 * @param tele
	 *            公司座机号码
	 */
	public void setTele(String tele) {
		this.tele = tele;
	}

	/**
	 * Get the 公司座机号码.
	 * 
	 * @return 公司座机号码
	 */
	public String getTele() {
		return this.tele;
	}

	/**
	 * Set the 公司邮件.
	 * 
	 * @param email
	 *            公司邮件
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the 公司邮件.
	 * 
	 * @return 公司邮件
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Set the 公司介绍.
	 * 
	 * @param description
	 *            公司介绍
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the 公司介绍.
	 * 
	 * @return 公司介绍
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set the set of the 公司信息表.
	 * 
	 * @param companyinfoSet
	 *            The set of 公司信息表
	 */
	public void setCompanyinfoSet(Set<Companyinfo> companyinfoSet) {
		this.companyinfoSet = companyinfoSet;
	}

	/**
	 * Add the 公司信息表.
	 * 
	 * @param companyinfo
	 *            公司信息表
	 */
	public void addCompanyinfo(Companyinfo companyinfo) {
		this.companyinfoSet.add(companyinfo);
	}

	/**
	 * Get the set of the 公司信息表.
	 * 
	 * @return The set of 公司信息表
	 */
	public Set<Companyinfo> getCompanyinfoSet() {
		return this.companyinfoSet;
	}

	/**
	 * Set the set of the 项目表.
	 * 
	 * @param projectSet
	 *            The set of 项目表
	 */
	public void setProjectSet(Set<Project> projectSet) {
		this.projectSet = projectSet;
	}

	/**
	 * Add the 项目表.
	 * 
	 * @param project
	 *            项目表
	 */
	public void addProject(Project project) {
		this.projectSet.add(project);
	}

	/**
	 * Get the set of the 项目表.
	 * 
	 * @return The set of 项目表
	 */
	public Set<Project> getProjectSet() {
		return this.projectSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Company other = (Company) obj;
		if (cid == null) {
			if (other.cid != null) {
				return false;
			}
		} else if (!cid.equals(other.cid)) {
			return false;
		}
		return true;
	}

}
