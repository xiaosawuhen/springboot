package test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 用户信息表.
 * 
 */
@Entity
public class Userlevel implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	@Id
	@GeneratedValue
	private Long ulid;

	/** 用户信息表. */
	private User user;

	/** 用户级别. */
	private Employeelevel employeelevel;

	/**
	 * Constructor.
	 */
	public Userlevel() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param ulid
	 *            ID
	 */
	public void setUlid(Long ulid) {
		this.ulid = ulid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getUlid() {
		return this.ulid;
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
	 * Set the 用户级别.
	 * 
	 * @param employeelevel
	 *            用户级别
	 */
	public void setEmployeelevel(Employeelevel employeelevel) {
		this.employeelevel = employeelevel;
	}

	/**
	 * Get the 用户级别.
	 * 
	 * @return 用户级别
	 */
	public Employeelevel getEmployeelevel() {
		return this.employeelevel;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ulid == null) ? 0 : ulid.hashCode());
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
		Userlevel other = (Userlevel) obj;
		if (ulid == null) {
			if (other.ulid != null) {
				return false;
			}
		} else if (!ulid.equals(other.ulid)) {
			return false;
		}
		return true;
	}

}
