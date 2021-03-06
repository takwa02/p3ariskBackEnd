package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * P3aMotctrId generated by hbm2java
 */
@Embeddable
public class P3aMotctrId implements java.io.Serializable {

	private String prvIdprog;
	private String ctrMatfis;
	private String ctrEtbsec;
	private String mvrCodmot;
	private String mvrLibmot;

	public P3aMotctrId() {
	}

	public P3aMotctrId(String prvIdprog, String ctrMatfis, String ctrEtbsec, String mvrCodmot, String mvrLibmot) {
		this.prvIdprog = prvIdprog;
		this.ctrMatfis = ctrMatfis;
		this.ctrEtbsec = ctrEtbsec;
		this.mvrCodmot = mvrCodmot;
		this.mvrLibmot = mvrLibmot;
	}

	@Column(name = "PRV_IDPROG", length = 11)
	public String getPrvIdprog() {
		return this.prvIdprog;
	}

	public void setPrvIdprog(String prvIdprog) {
		this.prvIdprog = prvIdprog;
	}

	@Column(name = "CTR_MATFIS", length = 8)
	public String getCtrMatfis() {
		return this.ctrMatfis;
	}

	public void setCtrMatfis(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	@Column(name = "CTR_ETBSEC", length = 3)
	public String getCtrEtbsec() {
		return this.ctrEtbsec;
	}

	public void setCtrEtbsec(String ctrEtbsec) {
		this.ctrEtbsec = ctrEtbsec;
	}

	@Column(name = "MVR_CODMOT", length = 4)
	public String getMvrCodmot() {
		return this.mvrCodmot;
	}

	public void setMvrCodmot(String mvrCodmot) {
		this.mvrCodmot = mvrCodmot;
	}

	@Column(name = "MVR_LIBMOT", length = 125)
	public String getMvrLibmot() {
		return this.mvrLibmot;
	}

	public void setMvrLibmot(String mvrLibmot) {
		this.mvrLibmot = mvrLibmot;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof P3aMotctrId))
			return false;
		P3aMotctrId castOther = (P3aMotctrId) other;

		return ((this.getPrvIdprog() == castOther.getPrvIdprog()) || (this.getPrvIdprog() != null
				&& castOther.getPrvIdprog() != null && this.getPrvIdprog().equals(castOther.getPrvIdprog())))
				&& ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
						&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCtrEtbsec() == castOther.getCtrEtbsec()) || (this.getCtrEtbsec() != null
						&& castOther.getCtrEtbsec() != null && this.getCtrEtbsec().equals(castOther.getCtrEtbsec())))
				&& ((this.getMvrCodmot() == castOther.getMvrCodmot()) || (this.getMvrCodmot() != null
						&& castOther.getMvrCodmot() != null && this.getMvrCodmot().equals(castOther.getMvrCodmot())))
				&& ((this.getMvrLibmot() == castOther.getMvrLibmot()) || (this.getMvrLibmot() != null
						&& castOther.getMvrLibmot() != null && this.getMvrLibmot().equals(castOther.getMvrLibmot())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPrvIdprog() == null ? 0 : this.getPrvIdprog().hashCode());
		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCtrEtbsec() == null ? 0 : this.getCtrEtbsec().hashCode());
		result = 37 * result + (getMvrCodmot() == null ? 0 : this.getMvrCodmot().hashCode());
		result = 37 * result + (getMvrLibmot() == null ? 0 : this.getMvrLibmot().hashCode());
		return result;
	}

}
