package test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 公司信息表.
 * 
 */
@Entity
public class Companyinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** CIID. */
	@Id
	@GeneratedValue
	private Long ciid;

	/** 公司. */
	private Company company;

	/** 用户信息表. */
	private User user;

	/**
	 * Constructor.
	 */
	public Companyinfo() {
	}

	/**
	 * Set the CIID.
	 * 
	 * @param ciid
	 *            CIID
	 */
	public void setCiid(Long ciid) {
		this.ciid = ciid;
	}

	/**
	 * Get the CIID.
	 * 
	 * @return CIID
	 */
	public Long getCiid() {
		return this.ciid;
	}

	/**
	 * Set the 公司.
	 * 
	 * @param company
	 *            公司
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * Get the 公司.
	 * 
	 * @return 公司
	 */
	public Company getCompany() {
		return this.company;
	}

	/**
	 * Set the 用户信息表.
	 * 
	 * @param user
	 *            用户信息表
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Get the 用户信息表.
	 * 
	 * @return 用户信息表
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciid == null) ? 0 : ciid.hashCode());
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
		Companyinfo other = (Companyinfo) obj;
		if (ciid == null) {
			if (other.ciid != null) {
				return false;
			}
		} else if (!ciid.equals(other.ciid)) {
			return false;
		}
		return true;
	}

}
