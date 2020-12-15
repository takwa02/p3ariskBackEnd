package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PactagrId generated by hbm2java
 */
@Embeddable
public class PactagrId implements java.io.Serializable {

	private String agrAnnact;
	private String actQallib;
	private String ctrMatfis;
	private String ctrEtbsec;
	private String agrMntbin;

	public PactagrId() {
	}

	public PactagrId(String agrAnnact, String actQallib, String ctrMatfis, String ctrEtbsec, String agrMntbin) {
		this.agrAnnact = agrAnnact;
		this.actQallib = actQallib;
		this.ctrMatfis = ctrMatfis;
		this.ctrEtbsec = ctrEtbsec;
		this.agrMntbin = agrMntbin;
	}

	@Column(name = "AGR_ANNACT")
	public String getAgrAnnact() {
		return this.agrAnnact;
	}

	public void setAgrAnnact(String agrAnnact) {
		this.agrAnnact = agrAnnact;
	}

	@Column(name = "ACT_QALLIB")
	public String getActQallib() {
		return this.actQallib;
	}

	public void setActQallib(String actQallib) {
		this.actQallib = actQallib;
	}

	@Column(name = "CTR_MATFIS")
	public String getCtrMatfis() {
		return this.ctrMatfis;
	}

	public void setCtrMatfis(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	@Column(name = "CTR_ETBSEC")
	public String getCtrEtbsec() {
		return this.ctrEtbsec;
	}

	public void setCtrEtbsec(String ctrEtbsec) {
		this.ctrEtbsec = ctrEtbsec;
	}

	@Column(name = "AGR_MNTBIN")
	public String getAgrMntbin() {
		return this.agrMntbin;
	}

	public void setAgrMntbin(String agrMntbin) {
		this.agrMntbin = agrMntbin;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PactagrId))
			return false;
		PactagrId castOther = (PactagrId) other;

		return ((this.getAgrAnnact() == castOther.getAgrAnnact()) || (this.getAgrAnnact() != null
				&& castOther.getAgrAnnact() != null && this.getAgrAnnact().equals(castOther.getAgrAnnact())))
				&& ((this.getActQallib() == castOther.getActQallib()) || (this.getActQallib() != null
						&& castOther.getActQallib() != null && this.getActQallib().equals(castOther.getActQallib())))
				&& ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
						&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCtrEtbsec() == castOther.getCtrEtbsec()) || (this.getCtrEtbsec() != null
						&& castOther.getCtrEtbsec() != null && this.getCtrEtbsec().equals(castOther.getCtrEtbsec())))
				&& ((this.getAgrMntbin() == castOther.getAgrMntbin()) || (this.getAgrMntbin() != null
						&& castOther.getAgrMntbin() != null && this.getAgrMntbin().equals(castOther.getAgrMntbin())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAgrAnnact() == null ? 0 : this.getAgrAnnact().hashCode());
		result = 37 * result + (getActQallib() == null ? 0 : this.getActQallib().hashCode());
		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCtrEtbsec() == null ? 0 : this.getCtrEtbsec().hashCode());
		result = 37 * result + (getAgrMntbin() == null ? 0 : this.getAgrMntbin().hashCode());
		return result;
	}

}
