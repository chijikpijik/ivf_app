package org.cf.card.model;

import static javax.persistence.GenerationType.AUTO;

// Generated Sep 10, 2015 2:25:00 PM by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DayProgressValue generated by hbm2java
 */
@Entity
@Table(name = "day_progress_value")
public class DayProgressValue implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "embryologist_id")
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "embryo_code_id")
	private EmbryoCode embryoCode;

	@Temporal(TemporalType.DATE)
	@Column(name = "day_date", length = 19)
	private Date dayDate;

	@Column(name = "day_index", length = 2)
	private int dayIndex;

	@Column(name = "day_option_id")
	private Integer dayOptionId;


	@Column(name = "day_column_name")
	private String dayColumnName;

	// setting default value to embroyolgy overview from enum Module.EMBRYOLOGY_OVERVIEW.getKey()
	@Column(name = "module_id", columnDefinition = "int default 13")
	private int moduleId;

	public DayProgressValue() {
	}

	public DayProgressValue(User user, EmbryoCode embryoCode, Date dayDate) {

		this.user = user;
		this.embryoCode = embryoCode;
		this.dayDate = dayDate;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public EmbryoCode getEmbryoCode() {
		return this.embryoCode;
	}

	public void setEmbryoCode(EmbryoCode embryoCode) {
		this.embryoCode = embryoCode;
	}

	public Date getDayDate() {
		return this.dayDate;
	}

	public void setDayDate(Date dayDate) {
		this.dayDate = dayDate;
	}

	public Integer getDayOptionId() {
		return dayOptionId;
	}

	public void setDayOptionId(Integer dayOptionId) {
		this.dayOptionId = dayOptionId;
	}

	public int getDayIndex() {
		return dayIndex;
	}

	public void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}

	public String getDayColumnName() {
		return dayColumnName;
	}

	public void setDayColumnName(String dayColumnName) {
		this.dayColumnName = dayColumnName;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

}