package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * P3aSitfisId generated by hbm2java
 */
@Embeddable
public class P3aSitfisId implements java.io.Serializable {

	private String sitExerci;
	private String ctrMatfis;
	private String ctrEtbsec;
	private String oblCodobl;
	private String oblLibell;
	private String sitDefdep;

	public P3aSitfisId() {
	}

	public P3aSitfisId(String sitExerci, String ctrMatfis, String ctrEtbsec) {
		this.sitExerci = sitExerci;
		this.ctrMatfis = ctrMatfis;
		this.ctrEtbsec = ctrEtbsec;
	}

	public P3aSitfisId(String sitExerci, String ctrMatfis, String ctrEtbsec, String oblCodobl, String oblLibell,
			String sitDefdep) {
		this.sitExerci = sitExerci;
		this.ctrMatfis = ctrMatfis;
		this.ctrEtbsec = ctrEtbsec;
		this.oblCodobl = oblCodobl;
		this.oblLibell = oblLibell;
		this.sitDefdep = sitDefdep;
	}

	@Column(name = "SIT_EXERCI", nullable = false, length = 4)
	public String getSitExerci() {
		return this.sitExerci;
	}

	public void setSitExerci(String sitExerci) {
		this.sitExerci = sitExerci;
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

	@Column(name = "OBL_CODOBL", length = 2)
	public String getOblCodobl() {
		return this.oblCodobl;
	}

	public void setOblCodobl(String oblCodobl) {
		this.oblCodobl = oblCodobl;
	}

	@Column(name = "OBL_LIBELL", length = 240)
	public String getOblLibell() {
		return this.oblLibell;
	}

	public void setOblLibell(String oblLibell) {
		this.oblLibell = oblLibell;
	}

	@Column(name = "SIT_DEFDEP", length = 12)
	public String getSitDefdep() {
		return this.sitDefdep;
	}

	public void setSitDefdep(String sitDefdep) {
		this.sitDefdep = sitDefdep;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof P3aSitfisId))
			return false;
		P3aSitfisId castOther = (P3aSitfisId) other;

		return ((this.getSitExerci() == castOther.getSitExerci()) || (this.getSitExerci() != null
				&& castOther.getSitExerci() != null && this.getSitExerci().equals(castOther.getSitExerci())))
				&& ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
						&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCtrEtbsec() == castOther.getCtrEtbsec()) || (this.getCtrEtbsec() != null
						&& castOther.getCtrEtbsec() != null && this.getCtrEtbsec().equals(castOther.getCtrEtbsec())))
				&& ((this.getOblCodobl() == castOther.getOblCodobl()) || (this.getOblCodobl() != null
						&& castOther.getOblCodobl() != null && this.getOblCodobl().equals(castOther.getOblCodobl())))
				&& ((this.getOblLibell() == castOther.getOblLibell()) || (this.getOblLibell() != null
						&& castOther.getOblLibell() != null && this.getOblLibell().equals(castOther.getOblLibell())))
				&& ((this.getSitDefdep() == castOther.getSitDefdep()) || (this.getSitDefdep() != null
						&& castOther.getSitDefdep() != null && this.getSitDefdep().equals(castOther.getSitDefdep())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSitExerci() == null ? 0 : this.getSitExerci().hashCode());
		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCtrEtbsec() == null ? 0 : this.getCtrEtbsec().hashCode());
		result = 37 * result + (getOblCodobl() == null ? 0 : this.getOblCodobl().hashCode());
		result = 37 * result + (getOblLibell() == null ? 0 : this.getOblLibell().hashCode());
		result = 37 * result + (getSitDefdep() == null ? 0 : this.getSitDefdep().hashCode());
		return result;
	}

}
