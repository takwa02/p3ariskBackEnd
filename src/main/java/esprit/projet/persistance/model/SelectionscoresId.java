package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SelectionscoresId generated by hbm2java
 */
@Embeddable
public class SelectionscoresId implements java.io.Serializable {

	private Short crityear;
	private String actsec;
	private String actLibell;
	private BigDecimal tocat;
	private String ctrMatfis;
	private String ctrRaison;
	private BigDecimal gpscore;
	private BigDecimal npscore;
	private BigDecimal wagescore;
	private BigDecimal xrefvattoscore;
	private BigDecimal vatcredscore;
	private BigDecimal conseclossscore;
	private BigDecimal xrefimportscore;
	private BigDecimal incdefaultscore;
	private BigDecimal vatdefaultscore;
	private BigDecimal noauditscore;
	private BigDecimal exportdeductscore;
	private BigDecimal zerotoscore;
	private BigDecimal rentreportscore;
	private BigDecimal vatdecdefscore;
	private BigDecimal audpayscore;
	private BigDecimal exportbenescore;
	private BigDecimal salefiscalscore;
	private BigDecimal cashmoretoscore;
	private BigDecimal acctfiscalscore;
	private BigDecimal advtotaltoscore;
	private BigDecimal caftotclscore;
	private BigDecimal totalscore;

	public SelectionscoresId() {
	}

	public SelectionscoresId(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	public SelectionscoresId(Short crityear, String actsec, String actLibell, BigDecimal tocat, String ctrMatfis,
			String ctrRaison, BigDecimal gpscore, BigDecimal npscore, BigDecimal wagescore, BigDecimal xrefvattoscore,
			BigDecimal vatcredscore, BigDecimal conseclossscore, BigDecimal xrefimportscore, BigDecimal incdefaultscore,
			BigDecimal vatdefaultscore, BigDecimal noauditscore, BigDecimal exportdeductscore, BigDecimal zerotoscore,
			BigDecimal rentreportscore, BigDecimal vatdecdefscore, BigDecimal audpayscore, BigDecimal exportbenescore,
			BigDecimal salefiscalscore, BigDecimal cashmoretoscore, BigDecimal acctfiscalscore,
			BigDecimal advtotaltoscore, BigDecimal caftotclscore, BigDecimal totalscore) {
		this.crityear = crityear;
		this.actsec = actsec;
		this.actLibell = actLibell;
		this.tocat = tocat;
		this.ctrMatfis = ctrMatfis;
		this.ctrRaison = ctrRaison;
		this.gpscore = gpscore;
		this.npscore = npscore;
		this.wagescore = wagescore;
		this.xrefvattoscore = xrefvattoscore;
		this.vatcredscore = vatcredscore;
		this.conseclossscore = conseclossscore;
		this.xrefimportscore = xrefimportscore;
		this.incdefaultscore = incdefaultscore;
		this.vatdefaultscore = vatdefaultscore;
		this.noauditscore = noauditscore;
		this.exportdeductscore = exportdeductscore;
		this.zerotoscore = zerotoscore;
		this.rentreportscore = rentreportscore;
		this.vatdecdefscore = vatdecdefscore;
		this.audpayscore = audpayscore;
		this.exportbenescore = exportbenescore;
		this.salefiscalscore = salefiscalscore;
		this.cashmoretoscore = cashmoretoscore;
		this.acctfiscalscore = acctfiscalscore;
		this.advtotaltoscore = advtotaltoscore;
		this.caftotclscore = caftotclscore;
		this.totalscore = totalscore;
	}

	@Column(name = "CRITYEAR", precision = 4, scale = 0)
	public Short getCrityear() {
		return this.crityear;
	}

	public void setCrityear(Short crityear) {
		this.crityear = crityear;
	}

	@Column(name = "ACTSEC", length = 4)
	public String getActsec() {
		return this.actsec;
	}

	public void setActsec(String actsec) {
		this.actsec = actsec;
	}

	@Column(name = "ACT_LIBELL", length = 120)
	public String getActLibell() {
		return this.actLibell;
	}

	public void setActLibell(String actLibell) {
		this.actLibell = actLibell;
	}

	@Column(name = "TOCAT", precision = 22, scale = 0)
	public BigDecimal getTocat() {
		return this.tocat;
	}

	public void setTocat(BigDecimal tocat) {
		this.tocat = tocat;
	}

	@Column(name = "CTR_MATFIS", nullable = false, length = 8)
	public String getCtrMatfis() {
		return this.ctrMatfis;
	}

	public void setCtrMatfis(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	@Column(name = "CTR_RAISON", length = 120)
	public String getCtrRaison() {
		return this.ctrRaison;
	}

	public void setCtrRaison(String ctrRaison) {
		this.ctrRaison = ctrRaison;
	}

	@Column(name = "GPSCORE", precision = 22, scale = 0)
	public BigDecimal getGpscore() {
		return this.gpscore;
	}

	public void setGpscore(BigDecimal gpscore) {
		this.gpscore = gpscore;
	}

	@Column(name = "NPSCORE", precision = 22, scale = 0)
	public BigDecimal getNpscore() {
		return this.npscore;
	}

	public void setNpscore(BigDecimal npscore) {
		this.npscore = npscore;
	}

	@Column(name = "WAGESCORE", precision = 22, scale = 0)
	public BigDecimal getWagescore() {
		return this.wagescore;
	}

	public void setWagescore(BigDecimal wagescore) {
		this.wagescore = wagescore;
	}

	@Column(name = "XREFVATTOSCORE", precision = 22, scale = 0)
	public BigDecimal getXrefvattoscore() {
		return this.xrefvattoscore;
	}

	public void setXrefvattoscore(BigDecimal xrefvattoscore) {
		this.xrefvattoscore = xrefvattoscore;
	}

	@Column(name = "VATCREDSCORE", precision = 22, scale = 0)
	public BigDecimal getVatcredscore() {
		return this.vatcredscore;
	}

	public void setVatcredscore(BigDecimal vatcredscore) {
		this.vatcredscore = vatcredscore;
	}

	@Column(name = "CONSECLOSSSCORE", precision = 22, scale = 0)
	public BigDecimal getConseclossscore() {
		return this.conseclossscore;
	}

	public void setConseclossscore(BigDecimal conseclossscore) {
		this.conseclossscore = conseclossscore;
	}

	@Column(name = "XREFIMPORTSCORE", precision = 22, scale = 0)
	public BigDecimal getXrefimportscore() {
		return this.xrefimportscore;
	}

	public void setXrefimportscore(BigDecimal xrefimportscore) {
		this.xrefimportscore = xrefimportscore;
	}

	@Column(name = "INCDEFAULTSCORE", precision = 22, scale = 0)
	public BigDecimal getIncdefaultscore() {
		return this.incdefaultscore;
	}

	public void setIncdefaultscore(BigDecimal incdefaultscore) {
		this.incdefaultscore = incdefaultscore;
	}

	@Column(name = "VATDEFAULTSCORE", precision = 22, scale = 0)
	public BigDecimal getVatdefaultscore() {
		return this.vatdefaultscore;
	}

	public void setVatdefaultscore(BigDecimal vatdefaultscore) {
		this.vatdefaultscore = vatdefaultscore;
	}

	@Column(name = "NOAUDITSCORE", precision = 22, scale = 0)
	public BigDecimal getNoauditscore() {
		return this.noauditscore;
	}

	public void setNoauditscore(BigDecimal noauditscore) {
		this.noauditscore = noauditscore;
	}

	@Column(name = "EXPORTDEDUCTSCORE", precision = 22, scale = 0)
	public BigDecimal getExportdeductscore() {
		return this.exportdeductscore;
	}

	public void setExportdeductscore(BigDecimal exportdeductscore) {
		this.exportdeductscore = exportdeductscore;
	}

	@Column(name = "ZEROTOSCORE", precision = 22, scale = 0)
	public BigDecimal getZerotoscore() {
		return this.zerotoscore;
	}

	public void setZerotoscore(BigDecimal zerotoscore) {
		this.zerotoscore = zerotoscore;
	}

	@Column(name = "RENTREPORTSCORE", precision = 22, scale = 0)
	public BigDecimal getRentreportscore() {
		return this.rentreportscore;
	}

	public void setRentreportscore(BigDecimal rentreportscore) {
		this.rentreportscore = rentreportscore;
	}

	@Column(name = "VATDECDEFSCORE", precision = 22, scale = 0)
	public BigDecimal getVatdecdefscore() {
		return this.vatdecdefscore;
	}

	public void setVatdecdefscore(BigDecimal vatdecdefscore) {
		this.vatdecdefscore = vatdecdefscore;
	}

	@Column(name = "AUDPAYSCORE", precision = 22, scale = 0)
	public BigDecimal getAudpayscore() {
		return this.audpayscore;
	}

	public void setAudpayscore(BigDecimal audpayscore) {
		this.audpayscore = audpayscore;
	}

	@Column(name = "EXPORTBENESCORE", precision = 22, scale = 0)
	public BigDecimal getExportbenescore() {
		return this.exportbenescore;
	}

	public void setExportbenescore(BigDecimal exportbenescore) {
		this.exportbenescore = exportbenescore;
	}

	@Column(name = "SALEFISCALSCORE", precision = 22, scale = 0)
	public BigDecimal getSalefiscalscore() {
		return this.salefiscalscore;
	}

	public void setSalefiscalscore(BigDecimal salefiscalscore) {
		this.salefiscalscore = salefiscalscore;
	}

	@Column(name = "CASHMORETOSCORE", precision = 22, scale = 0)
	public BigDecimal getCashmoretoscore() {
		return this.cashmoretoscore;
	}

	public void setCashmoretoscore(BigDecimal cashmoretoscore) {
		this.cashmoretoscore = cashmoretoscore;
	}

	@Column(name = "ACCTFISCALSCORE", precision = 22, scale = 0)
	public BigDecimal getAcctfiscalscore() {
		return this.acctfiscalscore;
	}

	public void setAcctfiscalscore(BigDecimal acctfiscalscore) {
		this.acctfiscalscore = acctfiscalscore;
	}

	@Column(name = "ADVTOTALTOSCORE", precision = 22, scale = 0)
	public BigDecimal getAdvtotaltoscore() {
		return this.advtotaltoscore;
	}

	public void setAdvtotaltoscore(BigDecimal advtotaltoscore) {
		this.advtotaltoscore = advtotaltoscore;
	}

	@Column(name = "CAFTOTCLSCORE", precision = 22, scale = 0)
	public BigDecimal getCaftotclscore() {
		return this.caftotclscore;
	}

	public void setCaftotclscore(BigDecimal caftotclscore) {
		this.caftotclscore = caftotclscore;
	}

	@Column(name = "TOTALSCORE", precision = 22, scale = 0)
	public BigDecimal getTotalscore() {
		return this.totalscore;
	}

	public void setTotalscore(BigDecimal totalscore) {
		this.totalscore = totalscore;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SelectionscoresId))
			return false;
		SelectionscoresId castOther = (SelectionscoresId) other;

		return ((this.getCrityear() == castOther.getCrityear()) || (this.getCrityear() != null
				&& castOther.getCrityear() != null && this.getCrityear().equals(castOther.getCrityear())))
				&& ((this.getActsec() == castOther.getActsec()) || (this.getActsec() != null
						&& castOther.getActsec() != null && this.getActsec().equals(castOther.getActsec())))
				&& ((this.getActLibell() == castOther.getActLibell()) || (this.getActLibell() != null
						&& castOther.getActLibell() != null && this.getActLibell().equals(castOther.getActLibell())))
				&& ((this.getTocat() == castOther.getTocat()) || (this.getTocat() != null
						&& castOther.getTocat() != null && this.getTocat().equals(castOther.getTocat())))
				&& ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
						&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCtrRaison() == castOther.getCtrRaison()) || (this.getCtrRaison() != null
						&& castOther.getCtrRaison() != null && this.getCtrRaison().equals(castOther.getCtrRaison())))
				&& ((this.getGpscore() == castOther.getGpscore()) || (this.getGpscore() != null
						&& castOther.getGpscore() != null && this.getGpscore().equals(castOther.getGpscore())))
				&& ((this.getNpscore() == castOther.getNpscore()) || (this.getNpscore() != null
						&& castOther.getNpscore() != null && this.getNpscore().equals(castOther.getNpscore())))
				&& ((this.getWagescore() == castOther.getWagescore()) || (this.getWagescore() != null
						&& castOther.getWagescore() != null && this.getWagescore().equals(castOther.getWagescore())))
				&& ((this.getXrefvattoscore() == castOther.getXrefvattoscore())
						|| (this.getXrefvattoscore() != null && castOther.getXrefvattoscore() != null
								&& this.getXrefvattoscore().equals(castOther.getXrefvattoscore())))
				&& ((this.getVatcredscore() == castOther.getVatcredscore())
						|| (this.getVatcredscore() != null && castOther.getVatcredscore() != null
								&& this.getVatcredscore().equals(castOther.getVatcredscore())))
				&& ((this.getConseclossscore() == castOther.getConseclossscore())
						|| (this.getConseclossscore() != null && castOther.getConseclossscore() != null
								&& this.getConseclossscore().equals(castOther.getConseclossscore())))
				&& ((this.getXrefimportscore() == castOther.getXrefimportscore())
						|| (this.getXrefimportscore() != null && castOther.getXrefimportscore() != null
								&& this.getXrefimportscore().equals(castOther.getXrefimportscore())))
				&& ((this.getIncdefaultscore() == castOther.getIncdefaultscore())
						|| (this.getIncdefaultscore() != null && castOther.getIncdefaultscore() != null
								&& this.getIncdefaultscore().equals(castOther.getIncdefaultscore())))
				&& ((this.getVatdefaultscore() == castOther.getVatdefaultscore())
						|| (this.getVatdefaultscore() != null && castOther.getVatdefaultscore() != null
								&& this.getVatdefaultscore().equals(castOther.getVatdefaultscore())))
				&& ((this.getNoauditscore() == castOther.getNoauditscore())
						|| (this.getNoauditscore() != null && castOther.getNoauditscore() != null
								&& this.getNoauditscore().equals(castOther.getNoauditscore())))
				&& ((this.getExportdeductscore() == castOther.getExportdeductscore())
						|| (this.getExportdeductscore() != null && castOther.getExportdeductscore() != null
								&& this.getExportdeductscore().equals(castOther.getExportdeductscore())))
				&& ((this.getZerotoscore() == castOther.getZerotoscore())
						|| (this.getZerotoscore() != null && castOther.getZerotoscore() != null
								&& this.getZerotoscore().equals(castOther.getZerotoscore())))
				&& ((this.getRentreportscore() == castOther.getRentreportscore())
						|| (this.getRentreportscore() != null && castOther.getRentreportscore() != null
								&& this.getRentreportscore().equals(castOther.getRentreportscore())))
				&& ((this.getVatdecdefscore() == castOther.getVatdecdefscore())
						|| (this.getVatdecdefscore() != null && castOther.getVatdecdefscore() != null
								&& this.getVatdecdefscore().equals(castOther.getVatdecdefscore())))
				&& ((this.getAudpayscore() == castOther.getAudpayscore())
						|| (this.getAudpayscore() != null && castOther.getAudpayscore() != null
								&& this.getAudpayscore().equals(castOther.getAudpayscore())))
				&& ((this.getExportbenescore() == castOther.getExportbenescore())
						|| (this.getExportbenescore() != null && castOther.getExportbenescore() != null
								&& this.getExportbenescore().equals(castOther.getExportbenescore())))
				&& ((this.getSalefiscalscore() == castOther.getSalefiscalscore())
						|| (this.getSalefiscalscore() != null && castOther.getSalefiscalscore() != null
								&& this.getSalefiscalscore().equals(castOther.getSalefiscalscore())))
				&& ((this.getCashmoretoscore() == castOther.getCashmoretoscore())
						|| (this.getCashmoretoscore() != null && castOther.getCashmoretoscore() != null
								&& this.getCashmoretoscore().equals(castOther.getCashmoretoscore())))
				&& ((this.getAcctfiscalscore() == castOther.getAcctfiscalscore())
						|| (this.getAcctfiscalscore() != null && castOther.getAcctfiscalscore() != null
								&& this.getAcctfiscalscore().equals(castOther.getAcctfiscalscore())))
				&& ((this.getAdvtotaltoscore() == castOther.getAdvtotaltoscore())
						|| (this.getAdvtotaltoscore() != null && castOther.getAdvtotaltoscore() != null
								&& this.getAdvtotaltoscore().equals(castOther.getAdvtotaltoscore())))
				&& ((this.getCaftotclscore() == castOther.getCaftotclscore())
						|| (this.getCaftotclscore() != null && castOther.getCaftotclscore() != null
								&& this.getCaftotclscore().equals(castOther.getCaftotclscore())))
				&& ((this.getTotalscore() == castOther.getTotalscore())
						|| (this.getTotalscore() != null && castOther.getTotalscore() != null
								&& this.getTotalscore().equals(castOther.getTotalscore())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCrityear() == null ? 0 : this.getCrityear().hashCode());
		result = 37 * result + (getActsec() == null ? 0 : this.getActsec().hashCode());
		result = 37 * result + (getActLibell() == null ? 0 : this.getActLibell().hashCode());
		result = 37 * result + (getTocat() == null ? 0 : this.getTocat().hashCode());
		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCtrRaison() == null ? 0 : this.getCtrRaison().hashCode());
		result = 37 * result + (getGpscore() == null ? 0 : this.getGpscore().hashCode());
		result = 37 * result + (getNpscore() == null ? 0 : this.getNpscore().hashCode());
		result = 37 * result + (getWagescore() == null ? 0 : this.getWagescore().hashCode());
		result = 37 * result + (getXrefvattoscore() == null ? 0 : this.getXrefvattoscore().hashCode());
		result = 37 * result + (getVatcredscore() == null ? 0 : this.getVatcredscore().hashCode());
		result = 37 * result + (getConseclossscore() == null ? 0 : this.getConseclossscore().hashCode());
		result = 37 * result + (getXrefimportscore() == null ? 0 : this.getXrefimportscore().hashCode());
		result = 37 * result + (getIncdefaultscore() == null ? 0 : this.getIncdefaultscore().hashCode());
		result = 37 * result + (getVatdefaultscore() == null ? 0 : this.getVatdefaultscore().hashCode());
		result = 37 * result + (getNoauditscore() == null ? 0 : this.getNoauditscore().hashCode());
		result = 37 * result + (getExportdeductscore() == null ? 0 : this.getExportdeductscore().hashCode());
		result = 37 * result + (getZerotoscore() == null ? 0 : this.getZerotoscore().hashCode());
		result = 37 * result + (getRentreportscore() == null ? 0 : this.getRentreportscore().hashCode());
		result = 37 * result + (getVatdecdefscore() == null ? 0 : this.getVatdecdefscore().hashCode());
		result = 37 * result + (getAudpayscore() == null ? 0 : this.getAudpayscore().hashCode());
		result = 37 * result + (getExportbenescore() == null ? 0 : this.getExportbenescore().hashCode());
		result = 37 * result + (getSalefiscalscore() == null ? 0 : this.getSalefiscalscore().hashCode());
		result = 37 * result + (getCashmoretoscore() == null ? 0 : this.getCashmoretoscore().hashCode());
		result = 37 * result + (getAcctfiscalscore() == null ? 0 : this.getAcctfiscalscore().hashCode());
		result = 37 * result + (getAdvtotaltoscore() == null ? 0 : this.getAdvtotaltoscore().hashCode());
		result = 37 * result + (getCaftotclscore() == null ? 0 : this.getCaftotclscore().hashCode());
		result = 37 * result + (getTotalscore() == null ? 0 : this.getTotalscore().hashCode());
		return result;
	}

}