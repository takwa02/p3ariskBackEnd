package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * P3aAgadebId generated by hbm2java
 */
@Embeddable
public class P3aAgadebId implements java.io.Serializable {

	private String ctrMatfis;
	private String ctrEtbsec;
	private String adbAnnees;

	public P3aAgadebId() {
	}

	public P3aAgadebId(String ctrMatfis, String ctrEtbsec, String adbAnnees) {
		this.ctrMatfis = ctrMatfis;
		this.ctrEtbsec = ctrEtbsec;
		this.adbAnnees = adbAnnees;
	}

	@Column(name = "CTR_MATFIS", nullable = false, length = 8)
	public String getCtrMatfis() {
		return this.ctrMatfis;
	}

	public void setCtrMatfis(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	@Column(name = "CTR_ETBSEC", nullable = false, length = 3)
	public String getCtrEtbsec() {
		return this.ctrEtbsec;
	}

	public void setCtrEtbsec(String ctrEtbsec) {
		this.ctrEtbsec = ctrEtbsec;
	}

	@Column(name = "ADB_ANNEES", nullable = false, length = 4)
	public String getAdbAnnees() {
		return this.adbAnnees;
	}

	public void setAdbAnnees(String adbAnnees) {
		this.adbAnnees = adbAnnees;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof P3aAgadebId))
			return false;
		P3aAgadebId castOther = (P3aAgadebId) other;

		return ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
				&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCtrEtbsec() == castOther.getCtrEtbsec()) || (this.getCtrEtbsec() != null
						&& castOther.getCtrEtbsec() != null && this.getCtrEtbsec().equals(castOther.getCtrEtbsec())))
				&& ((this.getAdbAnnees() == castOther.getAdbAnnees()) || (this.getAdbAnnees() != null
						&& castOther.getAdbAnnees() != null && this.getAdbAnnees().equals(castOther.getAdbAnnees())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCtrEtbsec() == null ? 0 : this.getCtrEtbsec().hashCode());
		result = 37 * result + (getAdbAnnees() == null ? 0 : this.getAdbAnnees().hashCode());
		return result;
	}

}
