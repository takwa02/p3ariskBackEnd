package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AZerotoId generated by hbm2java
 */
@Embeddable
public class AZerotoId implements java.io.Serializable {

	private String ctrMatfis;
	private BigDecimal critid;
	private BigDecimal zeroto;

	public AZerotoId() {
	}

	public AZerotoId(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	public AZerotoId(String ctrMatfis, BigDecimal critid, BigDecimal zeroto) {
		this.ctrMatfis = ctrMatfis;
		this.critid = critid;
		this.zeroto = zeroto;
	}

	@Column(name = "CTR_MATFIS", nullable = false, length = 8)
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

	@Column(name = "ZEROTO", precision = 22, scale = 0)
	public BigDecimal getZeroto() {
		return this.zeroto;
	}

	public void setZeroto(BigDecimal zeroto) {
		this.zeroto = zeroto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AZerotoId))
			return false;
		AZerotoId castOther = (AZerotoId) other;

		return ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
				&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCritid() == castOther.getCritid()) || (this.getCritid() != null
						&& castOther.getCritid() != null && this.getCritid().equals(castOther.getCritid())))
				&& ((this.getZeroto() == castOther.getZeroto()) || (this.getZeroto() != null
						&& castOther.getZeroto() != null && this.getZeroto().equals(castOther.getZeroto())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCritid() == null ? 0 : this.getCritid().hashCode());
		result = 37 * result + (getZeroto() == null ? 0 : this.getZeroto().hashCode());
		return result;
	}

}
