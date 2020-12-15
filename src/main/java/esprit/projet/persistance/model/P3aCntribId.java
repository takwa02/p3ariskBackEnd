package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * P3aCntribId generated by hbm2java
 */
@Embeddable
public class P3aCntribId implements java.io.Serializable {

	private String ctrMatfis;
	private String ctrEtbsec;

	public P3aCntribId() {
	}

	public P3aCntribId(String ctrMatfis, String ctrEtbsec) {
		this.ctrMatfis = ctrMatfis;
		this.ctrEtbsec = ctrEtbsec;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof P3aCntribId))
			return false;
		P3aCntribId castOther = (P3aCntribId) other;

		return ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
				&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCtrEtbsec() == castOther.getCtrEtbsec()) || (this.getCtrEtbsec() != null
						&& castOther.getCtrEtbsec() != null && this.getCtrEtbsec().equals(castOther.getCtrEtbsec())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCtrEtbsec() == null ? 0 : this.getCtrEtbsec().hashCode());
		return result;
	}

}
