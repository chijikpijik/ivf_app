package org.cf.card.model;

import static javax.persistence.GenerationType.AUTO;

// Generated Sep 10, 2015 2:25:00 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * InvestigatinValue generated by hbm2java
 */
@Entity
@Table(name = "investigatin_value")
public class InvestigatinValue implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "patient_investigation")
	private PatientInvestigation patientInvestigation;

	@ManyToOne
	@JoinColumn(name = "investigation_id")
	private Investigation investigation;

	@Column(name = "_value", length = 45)
	private String value;

	public InvestigatinValue() {
	}

	public InvestigatinValue(PatientInvestigation patientInvestigation, Investigation investigation, String value) {
		this.patientInvestigation = patientInvestigation;
		this.investigation = investigation;
		this.value = value;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PatientInvestigation getPatientInvestigation() {
		return this.patientInvestigation;
	}

	public void setPatientInvestigation(PatientInvestigation patientInvestigation) {
		this.patientInvestigation = patientInvestigation;
	}

	public Investigation getInvestigation() {
		return this.investigation;
	}

	public void setInvestigation(Investigation investigation) {
		this.investigation = investigation;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((id == null) ? 0 : id.hashCode()); result =
	 * prime * result + ((value == null) ? 0 : value.hashCode()); return result;
	 * }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return
	 * true; if (obj == null) return false; if (getClass() != obj.getClass())
	 * return false; InvestigatinValue other = (InvestigatinValue) obj; if (id
	 * == null) { if (other.id != null) return false; } else if
	 * (!id.equals(other.id)) return false; if (investigation == null) { if
	 * (other.investigation != null) return false; } else if
	 * (!investigation.equals(other.investigation)) return false; if
	 * (patientInvestigation == null) { if (other.patientInvestigation != null)
	 * return false; } else if
	 * (!patientInvestigation.equals(other.patientInvestigation)) return false;
	 * if (value == null) { if (other.value != null) return false; } else if
	 * (!value.equals(other.value)) return false; return true; }
	 * 
	 * @Override public String toString() { return "InvestigatinValue [id=" + id
	 * + ", patientInvestigation=" + patientInvestigation + ", investigation=" +
	 * investigation + ", value=" + value + "]"; }
	 */

}
