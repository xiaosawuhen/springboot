package test;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 项目表.
 * 
 */
@Entity
public class Project implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** PID. */
	@Id
	@GeneratedValue
	private Long pid;

	/** 公司. */
	private Company company;

	/** 名称. */
	private String name;

	/** 描述. */
	private String description;

	/** The set of 项目名称. */
	private Set<Projectinfo> projectinfoSet;

	/**
	 * Constructor.
	 */
	public Project() {
		this.projectinfoSet = new HashSet<Projectinfo>();
	}

	/**
	 * Set the PID.
	 * 
	 * @param pid
	 *            PID
	 */
	public void setPid(Long pid) {
		this.pid = pid;
	}

	/**
	 * Get the PID.
	 * 
	 * @return PID
	 */
	public Long getPid() {
		return this.pid;
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
	 * Set the 名称.
	 * 
	 * @param name
	 *            名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 名称.
	 * 
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the 描述.
	 * 
	 * @param description
	 *            描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the 描述.
	 * 
	 * @return 描述
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set the set of the 项目名称.
	 * 
	 * @param projectinfoSet
	 *            The set of 项目名称
	 */
	public void setProjectinfoSet(Set<Projectinfo> projectinfoSet) {
		this.projectinfoSet = projectinfoSet;
	}

	/**
	 * Add the 项目名称.
	 * 
	 * @param projectinfo
	 *            项目名称
	 */
	public void addProjectinfo(Projectinfo projectinfo) {
		this.projectinfoSet.add(projectinfo);
	}

	/**
	 * Get the set of the 项目名称.
	 * 
	 * @return The set of 项目名称
	 */
	public Set<Projectinfo> getProjectinfoSet() {
		return this.projectinfoSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
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
		Project other = (Project) obj;
		if (pid == null) {
			if (other.pid != null) {
				return false;
			}
		} else if (!pid.equals(other.pid)) {
			return false;
		}
		return true;
	}

}
