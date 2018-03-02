package test;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model class of 用户信息表.
 * 
 */
@Entity
public class User implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 用户ID. */
	@Id
	@GeneratedValue
	private Long uid;

	/** 名称. */
	@Column(nullable=true)
	private String name;

	/** 密码. */
	@Column(nullable=true)
	private String password;

	/** 年龄. */
	@Column(nullable=true)
	private Short age;

	/** 手机号. */
	@Column(nullable=true)
	private String phone;

	/** 邮箱. */
	@Column(nullable=true)
	private String email;

	/** The set of 公司信息表. */
	private Set<Companyinfo> companyinfoSet;

	/** The set of 项目名称. */
	private Set<Projectinfo> projectinfoSet;

	/** The set of 用户评价表. */
	private Set<Userestimate> userestimateSet;

	/** The set of 用户信息表. */
	private Set<Userlevel> userlevelSet;

	/**
	 * Constructor.
	 */
	public User() {
		this.companyinfoSet = new HashSet<Companyinfo>();
		this.projectinfoSet = new HashSet<Projectinfo>();
		this.userestimateSet = new HashSet<Userestimate>();
		this.userlevelSet = new HashSet<Userlevel>();
	}

	/**
	 * Set the 用户ID.
	 * 
	 * @param uid
	 *            用户ID
	 */
	public void setUid(Long uid) {
		this.uid = uid;
	}

	/**
	 * Get the 用户ID.
	 * 
	 * @return 用户ID
	 */
	public Long getUid() {
		return this.uid;
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
	 * Set the 密码.
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Get the 密码.
	 * 
	 * @return 密码
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Set the 年龄.
	 * 
	 * @param age
	 *            年龄
	 */
	public void setAge(Short age) {
		this.age = age;
	}

	/**
	 * Get the 年龄.
	 * 
	 * @return 年龄
	 */
	public Short getAge() {
		return this.age;
	}

	/**
	 * Set the 手机号.
	 * 
	 * @param phone
	 *            手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Get the 手机号.
	 * 
	 * @return 手机号
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Set the 邮箱.
	 * 
	 * @param email
	 *            邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the 邮箱.
	 * 
	 * @return 邮箱
	 */
	public String getEmail() {
		return this.email;
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
	 * Set the set of the 用户评价表.
	 * 
	 * @param userestimateSet
	 *            The set of 用户评价表
	 */
	public void setUserestimateSet(Set<Userestimate> userestimateSet) {
		this.userestimateSet = userestimateSet;
	}

	/**
	 * Add the 用户评价表.
	 * 
	 * @param userestimate
	 *            用户评价表
	 */
	public void addUserestimate(Userestimate userestimate) {
		this.userestimateSet.add(userestimate);
	}

	/**
	 * Get the set of the 用户评价表.
	 * 
	 * @return The set of 用户评价表
	 */
	public Set<Userestimate> getUserestimateSet() {
		return this.userestimateSet;
	}

	/**
	 * Set the set of the 用户信息表.
	 * 
	 * @param userlevelSet
	 *            The set of 用户信息表
	 */
	public void setUserlevelSet(Set<Userlevel> userlevelSet) {
		this.userlevelSet = userlevelSet;
	}

	/**
	 * Add the 用户信息表.
	 * 
	 * @param userlevel
	 *            用户信息表
	 */
	public void addUserlevel(Userlevel userlevel) {
		this.userlevelSet.add(userlevel);
	}

	/**
	 * Get the set of the 用户信息表.
	 * 
	 * @return The set of 用户信息表
	 */
	public Set<Userlevel> getUserlevelSet() {
		return this.userlevelSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		User other = (User) obj;
		if (uid == null) {
			if (other.uid != null) {
				return false;
			}
		} else if (!uid.equals(other.uid)) {
			return false;
		}
		return true;
	}

}
