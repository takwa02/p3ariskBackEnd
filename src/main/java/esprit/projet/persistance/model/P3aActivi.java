package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * P3aActivi generated by hbm2java
 */
@Entity
@Table(name = "P3A_ACTIVI")
public class P3aActivi implements java.io.Serializable {
	
	private String actCodact;
	private String actLibabv;
	private String actLibell;
	private String actSecact;
	private long actSousec;

	public P3aActivi() {
	}
	@Id
	public String getActCodact() {
		return actCodact;
	}

	public void setActCodact(String actCodact) {
		this.actCodact = actCodact;
	}

	public String getActLibabv() {
		return actLibabv;
	}

	public void setActLibabv(String actLibabv) {
		this.actLibabv = actLibabv;
	}

	public String getActLibell() {
		return actLibell;
	}

	public void setActLibell(String actLibell) {
		this.actLibell = actLibell;
	}

	public String getActSecact() {
		return actSecact;
	}

	public void setActSecact(String actSecact) {
		this.actSecact = actSecact;
	}

	public long getActSousec() {
		return actSousec;
	}

	public void setActSousec(long actSousec) {
		this.actSousec = actSousec;
	}

	


}
