package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AGpmarginId generated by hbm2java
 */
@Embeddable
public class AGpmarginId implements java.io.Serializable {

	private String ctrMatfis;
	private String imsExerci;
	private BigDecimal critid;
	private String actsec;
	private String ctrCatego;
	private BigDecimal tocat;
	private BigDecimal cogs;
	private BigDecimal turnover;
	private BigDecimal gp;
	private BigDecimal gpmargin;
	private BigDecimal decok;

	public AGpmarginId() {
	}

	public AGpmarginId(String ctrMatfis, String imsExerci) {
		this.ctrMatfis = ctrMatfis;
		this.imsExerci = imsExerci;
	}

	public AGpmarginId(String ctrMatfis, String imsExerci, BigDecimal critid, String actsec, String ctrCatego,
			BigDecimal tocat, BigDecimal cogs, BigDecimal turnover, BigDecimal gp, BigDecimal gpmargin,
			BigDecimal decok) {
		this.ctrMatfis = ctrMatfis;
		this.imsExerci = imsExerci;
		this.critid = critid;
		this.actsec = actsec;
		this.ctrCatego = ctrCatego;
		this.tocat = tocat;
		this.cogs = cogs;
		this.turnover = turnover;
		this.gp = gp;
		this.gpmargin = gpmargin;
		this.decok = decok;
	}

	@Column(name = "CTR_MATFIS", nullable = false, length = 8)
	public String getCtrMatfis() {
		return this.ctrMatfis;
	}

	public void setCtrMatfis(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	@Column(name = "IMS_EXERCI", nullable = false, length = 4)
	public String getImsExerci() {
		return this.imsExerci;
	}

	public void setImsExerci(String imsExerci) {
		this.imsExerci = imsExerci;
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

	@Column(name = "COGS", precision = 22, scale = 0)
	public BigDecimal getCogs() {
		return this.cogs;
	}

	public void setCogs(BigDecimal cogs) {
		this.cogs = cogs;
	}

	@Column(name = "TURNOVER", precision = 22, scale = 0)
	public BigDecimal getTurnover() {
		return this.turnover;
	}

	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}

	@Column(name = "GP", precision = 22, scale = 0)
	public BigDecimal getGp() {
		return this.gp;
	}

	public void setGp(BigDecimal gp) {
		this.gp = gp;
	}

	@Column(name = "GPMARGIN", precision = 22, scale = 0)
	public BigDecimal getGpmargin() {
		return this.gpmargin;
	}

	public void setGpmargin(BigDecimal gpmargin) {
		this.gpmargin = gpmargin;
	}

	@Column(name = "DECOK", precision = 22, scale = 0)
	public BigDecimal getDecok() {
		return this.decok;
	}

	public void setDecok(BigDecimal decok) {
		this.decok = decok;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AGpmarginId))
			return false;
		AGpmarginId castOther = (AGpmarginId) other;

		return ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
				&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getImsExerci() == castOther.getImsExerci()) || (this.getImsExerci() != null
						&& castOther.getImsExerci() != null && this.getImsExerci().equals(castOther.getImsExerci())))
				&& ((this.getCritid() == castOther.getCritid()) || (this.getCritid() != null
						&& castOther.getCritid() != null && this.getCritid().equals(castOther.getCritid())))
				&& ((this.getActsec() == castOther.getActsec()) || (this.getActsec() != null
						&& castOther.getActsec() != null && this.getActsec().equals(castOther.getActsec())))
				&& ((this.getCtrCatego() == castOther.getCtrCatego()) || (this.getCtrCatego() != null
						&& castOther.getCtrCatego() != null && this.getCtrCatego().equals(castOther.getCtrCatego())))
				&& ((this.getTocat() == castOther.getTocat()) || (this.getTocat() != null
						&& castOther.getTocat() != null && this.getTocat().equals(castOther.getTocat())))
				&& ((this.getCogs() == castOther.getCogs()) || (this.getCogs() != null && castOther.getCogs() != null
						&& this.getCogs().equals(castOther.getCogs())))
				&& ((this.getTurnover() == castOther.getTurnover()) || (this.getTurnover() != null
						&& castOther.getTurnover() != null && this.getTurnover().equals(castOther.getTurnover())))
				&& ((this.getGp() == castOther.getGp()) || (this.getGp() != null && castOther.getGp() != null
						&& this.getGp().equals(castOther.getGp())))
				&& ((this.getGpmargin() == castOther.getGpmargin()) || (this.getGpmargin() != null
						&& castOther.getGpmargin() != null && this.getGpmargin().equals(castOther.getGpmargin())))
				&& ((this.getDecok() == castOther.getDecok()) || (this.getDecok() != null
						&& castOther.getDecok() != null && this.getDecok().equals(castOther.getDecok())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getImsExerci() == null ? 0 : this.getImsExerci().hashCode());
		result = 37 * result + (getCritid() == null ? 0 : this.getCritid().hashCode());
		result = 37 * result + (getActsec() == null ? 0 : this.getActsec().hashCode());
		result = 37 * result + (getCtrCatego() == null ? 0 : this.getCtrCatego().hashCode());
		result = 37 * result + (getTocat() == null ? 0 : this.getTocat().hashCode());
		result = 37 * result + (getCogs() == null ? 0 : this.getCogs().hashCode());
		result = 37 * result + (getTurnover() == null ? 0 : this.getTurnover().hashCode());
		result = 37 * result + (getGp() == null ? 0 : this.getGp().hashCode());
		result = 37 * result + (getGpmargin() == null ? 0 : this.getGpmargin().hashCode());
		result = 37 * result + (getDecok() == null ? 0 : this.getDecok().hashCode());
		return result;
	}

}
