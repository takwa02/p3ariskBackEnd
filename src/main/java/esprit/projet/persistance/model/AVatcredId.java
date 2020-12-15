package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AVatcredId generated by hbm2java
 */
@Embeddable
public class AVatcredId implements java.io.Serializable {

	private String ctrMatfis;
	private BigDecimal critid;
	private String actsec;
	private String ctrCatego;
	private BigDecimal tocat;
	private BigDecimal credityears;
	private String lastaudyear;
	private BigDecimal crednorefund;

	public AVatcredId() {
	}

	public AVatcredId(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	public AVatcredId(String ctrMatfis, BigDecimal critid, String actsec, String ctrCatego, BigDecimal tocat,
			BigDecimal credityears, String lastaudyear, BigDecimal crednorefund) {
		this.ctrMatfis = ctrMatfis;
		this.critid = critid;
		this.actsec = actsec;
		this.ctrCatego = ctrCatego;
		this.tocat = tocat;
		this.credityears = credityears;
		this.lastaudyear = lastaudyear;
		this.crednorefund = crednorefund;
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

	@Column(name = "ACTSEC", length = 4)
	public String getActsec() {
		return this.actsec;
	}

	public void setActsec(String actsec) {
		this.actsec = actsec;
	}

	@Column(name = "CTR_CATEGO", length = 1)
	public String getCtrCatego() {
		return this.ctrCatego;
	}

	public void setCtrCatego(String ctrCatego) {
		this.ctrCatego = ctrCatego;
	}

	@Column(name = "TOCAT", precision = 22, scale = 0)
	public BigDecimal getTocat() {
		return this.tocat;
	}

	public void setTocat(BigDecimal tocat) {
		this.tocat = tocat;
	}

	@Column(name = "CREDITYEARS", precision = 22, scale = 0)
	public BigDecimal getCredityears() {
		return this.credityears;
	}

	public void setCredityears(BigDecimal credityears) {
		this.credityears = credityears;
	}

	@Column(name = "LASTAUDYEAR", length = 4)
	public String getLastaudyear() {
		return this.lastaudyear;
	}

	public void setLastaudyear(String lastaudyear) {
		this.lastaudyear = lastaudyear;
	}

	@Column(name = "CREDNOREFUND", precision = 22, scale = 0)
	public BigDecimal getCrednorefund() {
		return this.crednorefund;
	}

	public void setCrednorefund(BigDecimal crednorefund) {
		this.crednorefund = crednorefund;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AVatcredId))
			return false;
		AVatcredId castOther = (AVatcredId) other;

		return ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
				&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCritid() == castOther.getCritid()) || (this.getCritid() != null
						&& castOther.getCritid() != null && this.getCritid().equals(castOther.getCritid())))
				&& ((this.getActsec() == castOther.getActsec()) || (this.getActsec() != null
						&& castOther.getActsec() != null && this.getActsec().equals(castOther.getActsec())))
				&& ((this.getCtrCatego() == castOther.getCtrCatego()) || (this.getCtrCatego() != null
						&& castOther.getCtrCatego() != null && this.getCtrCatego().equals(castOther.getCtrCatego())))
				&& ((this.getTocat() == castOther.getTocat()) || (this.getTocat() != null
						&& castOther.getTocat() != null && this.getTocat().equals(castOther.getTocat())))
				&& ((this.getCredityears() == castOther.getCredityears())
						|| (this.getCredityears() != null && castOther.getCredityears() != null
								&& this.getCredityears().equals(castOther.getCredityears())))
				&& ((this.getLastaudyear() == castOther.getLastaudyear())
						|| (this.getLastaudyear() != null && castOther.getLastaudyear() != null
								&& this.getLastaudyear().equals(castOther.getLastaudyear())))
				&& ((this.getCrednorefund() == castOther.getCrednorefund())
						|| (this.getCrednorefund() != null && castOther.getCrednorefund() != null
								&& this.getCrednorefund().equals(castOther.getCrednorefund())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCritid() == null ? 0 : this.getCritid().hashCode());
		result = 37 * result + (getActsec() == null ? 0 : this.getActsec().hashCode());
		result = 37 * result + (getCtrCatego() == null ? 0 : this.getCtrCatego().hashCode());
		result = 37 * result + (getTocat() == null ? 0 : this.getTocat().hashCode());
		result = 37 * result + (getCredityears() == null ? 0 : this.getCredityears().hashCode());
		result = 37 * result + (getLastaudyear() == null ? 0 : this.getLastaudyear().hashCode());
		result = 37 * result + (getCrednorefund() == null ? 0 : this.getCrednorefund().hashCode());
		return result;
	}

}
