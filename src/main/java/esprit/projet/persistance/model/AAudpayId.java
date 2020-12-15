package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AAudpayId generated by hbm2java
 */
@Embeddable
public class AAudpayId implements java.io.Serializable {

	private String ctrMatfis;
	private BigDecimal critid;
	private BigDecimal auditgap;
	private BigDecimal gappc;

	public AAudpayId() {
	}

	public AAudpayId(String ctrMatfis, BigDecimal critid, BigDecimal auditgap, BigDecimal gappc) {
		this.ctrMatfis = ctrMatfis;
		this.critid = critid;
		this.auditgap = auditgap;
		this.gappc = gappc;
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

	@Column(name = "AUDITGAP", precision = 22, scale = 0)
	public BigDecimal getAuditgap() {
		return this.auditgap;
	}

	public void setAuditgap(BigDecimal auditgap) {
		this.auditgap = auditgap;
	}

	@Column(name = "GAPPC", precision = 22, scale = 0)
	public BigDecimal getGappc() {
		return this.gappc;
	}

	public void setGappc(BigDecimal gappc) {
		this.gappc = gappc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AAudpayId))
			return false;
		AAudpayId castOther = (AAudpayId) other;

		return ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
				&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCritid() == castOther.getCritid()) || (this.getCritid() != null
						&& castOther.getCritid() != null && this.getCritid().equals(castOther.getCritid())))
				&& ((this.getAuditgap() == castOther.getAuditgap()) || (this.getAuditgap() != null
						&& castOther.getAuditgap() != null && this.getAuditgap().equals(castOther.getAuditgap())))
				&& ((this.getGappc() == castOther.getGappc()) || (this.getGappc() != null
						&& castOther.getGappc() != null && this.getGappc().equals(castOther.getGappc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCritid() == null ? 0 : this.getCritid().hashCode());
		result = 37 * result + (getAuditgap() == null ? 0 : this.getAuditgap().hashCode());
		result = 37 * result + (getGappc() == null ? 0 : this.getGappc().hashCode());
		return result;
	}

}
