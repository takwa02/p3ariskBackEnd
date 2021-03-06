package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AExportbeneId generated by hbm2java
 */
@Embeddable
public class AExportbeneId implements java.io.Serializable {

	private String ctrMatfis;
	private BigDecimal critid;
	private BigDecimal exportbenefit;

	public AExportbeneId() {
	}

	public AExportbeneId(String ctrMatfis, BigDecimal critid, BigDecimal exportbenefit) {
		this.ctrMatfis = ctrMatfis;
		this.critid = critid;
		this.exportbenefit = exportbenefit;
	}

	@Column(name = "CTR_MATFIS", length = 8)
	public String getCtrMatfis() {
		return this.ctrMatfis;
	}

	public void setCtrMatfis(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	@Column(name = "CRITID", precision = 22, scale = 0)
	public BigDecimal getCritid() {
		return this.critid;
	}

	public void setCritid(BigDecimal critid) {
		this.critid = critid;
	}

	@Column(name = "EXPORTBENEFIT", precision = 22, scale = 0)
	public BigDecimal getExportbenefit() {
		return this.exportbenefit;
	}

	public void setExportbenefit(BigDecimal exportbenefit) {
		this.exportbenefit = exportbenefit;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AExportbeneId))
			return false;
		AExportbeneId castOther = (AExportbeneId) other;

		return ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
				&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCritid() == castOther.getCritid()) || (this.getCritid() != null
						&& castOther.getCritid() != null && this.getCritid().equals(castOther.getCritid())))
				&& ((this.getExportbenefit() == castOther.getExportbenefit())
						|| (this.getExportbenefit() != null && castOther.getExportbenefit() != null
								&& this.getExportbenefit().equals(castOther.getExportbenefit())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCritid() == null ? 0 : this.getCritid().hashCode());
		result = 37 * result + (getExportbenefit() == null ? 0 : this.getExportbenefit().hashCode());
		return result;
	}

}
