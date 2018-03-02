package test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 项目名称.
 * 
 */
@Entity
public class Projectinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** PIID. */
	@Id
	@GeneratedValue
	private Long piid;

	/** 项目表. */
	private Project project;

	/** 用户信息表. */
	private User user;

	/**
	 * Constructor.
	 */
	public Projectinfo() {
	}

	/**
	 * Set the PIID.
	 * 
	 * @param piid
	 *            PIID
	 */
	public void setPiid(Long piid) {
		this.piid = piid;
	}

	/**
	 * Get the PIID.
	 * 
	 * @return PIID
	 */
	public Long getPiid() {
		return this.piid;
	}

	/**
	 * Set the 项目表.
	 * 
	 * @param project
	 *            项目表
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * Get the 项目表.
	 * 
	 * @return 项目表
	 */
	public Project getProject() {
		return this.project;
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
		result = prime * result + ((piid == null) ? 0 : piid.hashCode());
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
		Projectinfo other = (Projectinfo) obj;
		if (piid == null) {
			if (other.piid != null) {
				return false;
			}
		} else if (!piid.equals(other.piid)) {
			return false;
		}
		return true;
	}

}
