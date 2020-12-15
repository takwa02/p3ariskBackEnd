package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ASalefiscalId generated by hbm2java
 */
@Embeddable
public class ASalefiscalId implements java.io.Serializable {

	private String ctrMatfis;
	private BigDecimal critid;
	private BigDecimal salemorefiscal;

	public ASalefiscalId() {
	}

	public ASalefiscalId(String ctrMatfis, BigDecimal critid, BigDecimal salemorefiscal) {
		this.ctrMatfis = ctrMatfis;
		this.critid = critid;
		this.salemorefiscal = salemorefiscal;
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

	@Column(name = "SALEMOREFISCAL", precision = 22, scale = 0)
	public BigDecimal getSalemorefiscal() {
		return this.salemorefiscal;
	}

	public void setSalemorefiscal(BigDecimal salemorefiscal) {
		this.salemorefiscal = salemorefiscal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ASalefiscalId))
			return false;
		ASalefiscalId castOther = (ASalefiscalId) other;

		return ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
				&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCritid() == castOther.getCritid()) || (this.getCritid() != null
						&& castOther.getCritid() != null && this.getCritid().equals(castOther.getCritid())))
				&& ((this.getSalemorefiscal() == castOther.getSalemorefiscal())
						|| (this.getSalemorefiscal() != null && castOther.getSalemorefiscal() != null
								&& this.getSalemorefiscal().equals(castOther.getSalemorefiscal())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCritid() == null ? 0 : this.getCritid().hashCode());
		result = 37 * result + (getSalemorefiscal() == null ? 0 : this.getSalemorefiscal().hashCode());
		return result;
	}

}