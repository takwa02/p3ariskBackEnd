package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * P3aAgranxId generated by hbm2java
 */
@Embeddable
public class P3aAgranxId implements java.io.Serializable {

	private String agxTypocc;
	private String ctrMatfis;
	private String ctrEtbsec;
	private String empExerci;
	private BigDecimal ax1Revimp;
	private BigDecimal ax1Avgnat;
	private BigDecimal ax1Brtimp;
	private BigDecimal ax1Revinv;
	private BigDecimal ax1Mntret;
	private BigDecimal ax1Netsrv;
	private BigDecimal ax2Honora;
	private BigDecimal ax2Loyers;
	private BigDecimal ax2Jetpre;
	private BigDecimal ax2Pluval;
	private BigDecimal ax2Mntret;
	private BigDecimal ax2Ristor;
	private BigDecimal ax2Netsrv;
	private BigDecimal ax5Mntmar;
	private BigDecimal ax5Mntret;
	private BigDecimal ax5Netsrv;
	private BigDecimal ax5Ristor;
	private BigDecimal ax6Recouv;

	public P3aAgranxId() {
	}

	public P3aAgranxId(String ctrEtbsec, String empExerci) {
		this.ctrEtbsec = ctrEtbsec;
		this.empExerci = empExerci;
	}

	public P3aAgranxId(String agxTypocc, String ctrMatfis, String ctrEtbsec, String empExerci, BigDecimal ax1Revimp,
			BigDecimal ax1Avgnat, BigDecimal ax1Brtimp, BigDecimal ax1Revinv, BigDecimal ax1Mntret,
			BigDecimal ax1Netsrv, BigDecimal ax2Honora, BigDecimal ax2Loyers, BigDecimal ax2Jetpre,
			BigDecimal ax2Pluval, BigDecimal ax2Mntret, BigDecimal ax2Ristor, BigDecimal ax2Netsrv,
			BigDecimal ax5Mntmar, BigDecimal ax5Mntret, BigDecimal ax5Netsrv, BigDecimal ax5Ristor,
			BigDecimal ax6Recouv) {
		this.agxTypocc = agxTypocc;
		this.ctrMatfis = ctrMatfis;
		this.ctrEtbsec = ctrEtbsec;
		this.empExerci = empExerci;
		this.ax1Revimp = ax1Revimp;
		this.ax1Avgnat = ax1Avgnat;
		this.ax1Brtimp = ax1Brtimp;
		this.ax1Revinv = ax1Revinv;
		this.ax1Mntret = ax1Mntret;
		this.ax1Netsrv = ax1Netsrv;
		this.ax2Honora = ax2Honora;
		this.ax2Loyers = ax2Loyers;
		this.ax2Jetpre = ax2Jetpre;
		this.ax2Pluval = ax2Pluval;
		this.ax2Mntret = ax2Mntret;
		this.ax2Ristor = ax2Ristor;
		this.ax2Netsrv = ax2Netsrv;
		this.ax5Mntmar = ax5Mntmar;
		this.ax5Mntret = ax5Mntret;
		this.ax5Netsrv = ax5Netsrv;
		this.ax5Ristor = ax5Ristor;
		this.ax6Recouv = ax6Recouv;
	}

	@Column(name = "AGX_TYPOCC", length = 1)
	public String getAgxTypocc() {
		return this.agxTypocc;
	}

	public void setAgxTypocc(String agxTypocc) {
		this.agxTypocc = agxTypocc;
	}

	@Column(name = "CTR_MATFIS", length = 8)
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

	@Column(name = "EMP_EXERCI", nullable = false, length = 4)
	public String getEmpExerci() {
		return this.empExerci;
	}

	public void setEmpExerci(String empExerci) {
		this.empExerci = empExerci;
	}

	@Column(name = "AX1_REVIMP", precision = 22, scale = 0)
	public BigDecimal getAx1Revimp() {
		return this.ax1Revimp;
	}

	public void setAx1Revimp(BigDecimal ax1Revimp) {
		this.ax1Revimp = ax1Revimp;
	}

	@Column(name = "AX1_AVGNAT", precision = 22, scale = 0)
	public BigDecimal getAx1Avgnat() {
		return this.ax1Avgnat;
	}

	public void setAx1Avgnat(BigDecimal ax1Avgnat) {
		this.ax1Avgnat = ax1Avgnat;
	}

	@Column(name = "AX1_BRTIMP", precision = 22, scale = 0)
	public BigDecimal getAx1Brtimp() {
		return this.ax1Brtimp;
	}

	public void setAx1Brtimp(BigDecimal ax1Brtimp) {
		this.ax1Brtimp = ax1Brtimp;
	}

	@Column(name = "AX1_REVINV", precision = 22, scale = 0)
	public BigDecimal getAx1Revinv() {
		return this.ax1Revinv;
	}

	public void setAx1Revinv(BigDecimal ax1Revinv) {
		this.ax1Revinv = ax1Revinv;
	}

	@Column(name = "AX1_MNTRET", precision = 22, scale = 0)
	public BigDecimal getAx1Mntret() {
		return this.ax1Mntret;
	}

	public void setAx1Mntret(BigDecimal ax1Mntret) {
		this.ax1Mntret = ax1Mntret;
	}

	@Column(name = "AX1_NETSRV", precision = 22, scale = 0)
	public BigDecimal getAx1Netsrv() {
		return this.ax1Netsrv;
	}

	public void setAx1Netsrv(BigDecimal ax1Netsrv) {
		this.ax1Netsrv = ax1Netsrv;
	}

	@Column(name = "AX2_HONORA", precision = 22, scale = 0)
	public BigDecimal getAx2Honora() {
		return this.ax2Honora;
	}

	public void setAx2Honora(BigDecimal ax2Honora) {
		this.ax2Honora = ax2Honora;
	}

	@Column(name = "AX2_LOYERS", precision = 22, scale = 0)
	public BigDecimal getAx2Loyers() {
		return this.ax2Loyers;
	}

	public void setAx2Loyers(BigDecimal ax2Loyers) {
		this.ax2Loyers = ax2Loyers;
	}

	@Column(name = "AX2_JETPRE", precision = 22, scale = 0)
	public BigDecimal getAx2Jetpre() {
		return this.ax2Jetpre;
	}

	public void setAx2Jetpre(BigDecimal ax2Jetpre) {
		this.ax2Jetpre = ax2Jetpre;
	}

	@Column(name = "AX2_PLUVAL", precision = 22, scale = 0)
	public BigDecimal getAx2Pluval() {
		return this.ax2Pluval;
	}

	public void setAx2Pluval(BigDecimal ax2Pluval) {
		this.ax2Pluval = ax2Pluval;
	}

	@Column(name = "AX2_MNTRET", precision = 22, scale = 0)
	public BigDecimal getAx2Mntret() {
		return this.ax2Mntret;
	}

	public void setAx2Mntret(BigDecimal ax2Mntret) {
		this.ax2Mntret = ax2Mntret;
	}

	@Column(name = "AX2_RISTOR", precision = 22, scale = 0)
	public BigDecimal getAx2Ristor() {
		return this.ax2Ristor;
	}

	public void setAx2Ristor(BigDecimal ax2Ristor) {
		this.ax2Ristor = ax2Ristor;
	}

	@Column(name = "AX2_NETSRV", precision = 22, scale = 0)
	public BigDecimal getAx2Netsrv() {
		return this.ax2Netsrv;
	}

	public void setAx2Netsrv(BigDecimal ax2Netsrv) {
		this.ax2Netsrv = ax2Netsrv;
	}

	@Column(name = "AX5_MNTMAR", precision = 22, scale = 0)
	public BigDecimal getAx5Mntmar() {
		return this.ax5Mntmar;
	}

	public void setAx5Mntmar(BigDecimal ax5Mntmar) {
		this.ax5Mntmar = ax5Mntmar;
	}

	@Column(name = "AX5_MNTRET", precision = 22, scale = 0)
	public BigDecimal getAx5Mntret() {
		return this.ax5Mntret;
	}

	public void setAx5Mntret(BigDecimal ax5Mntret) {
		this.ax5Mntret = ax5Mntret;
	}

	@Column(name = "AX5_NETSRV", precision = 22, scale = 0)
	public BigDecimal getAx5Netsrv() {
		return this.ax5Netsrv;
	}

	public void setAx5Netsrv(BigDecimal ax5Netsrv) {
		this.ax5Netsrv = ax5Netsrv;
	}

	@Column(name = "AX5_RISTOR", precision = 22, scale = 0)
	public BigDecimal getAx5Ristor() {
		return this.ax5Ristor;
	}

	public void setAx5Ristor(BigDecimal ax5Ristor) {
		this.ax5Ristor = ax5Ristor;
	}

	@Column(name = "AX6_RECOUV", precision = 22, scale = 0)
	public BigDecimal getAx6Recouv() {
		return this.ax6Recouv;
	}

	public void setAx6Recouv(BigDecimal ax6Recouv) {
		this.ax6Recouv = ax6Recouv;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof P3aAgranxId))
			return false;
		P3aAgranxId castOther = (P3aAgranxId) other;

		return ((this.getAgxTypocc() == castOther.getAgxTypocc()) || (this.getAgxTypocc() != null
				&& castOther.getAgxTypocc() != null && this.getAgxTypocc().equals(castOther.getAgxTypocc())))
				&& ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
						&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCtrEtbsec() == castOther.getCtrEtbsec()) || (this.getCtrEtbsec() != null
						&& castOther.getCtrEtbsec() != null && this.getCtrEtbsec().equals(castOther.getCtrEtbsec())))
				&& ((this.getEmpExerci() == castOther.getEmpExerci()) || (this.getEmpExerci() != null
						&& castOther.getEmpExerci() != null && this.getEmpExerci().equals(castOther.getEmpExerci())))
				&& ((this.getAx1Revimp() == castOther.getAx1Revimp()) || (this.getAx1Revimp() != null
						&& castOther.getAx1Revimp() != null && this.getAx1Revimp().equals(castOther.getAx1Revimp())))
				&& ((this.getAx1Avgnat() == castOther.getAx1Avgnat()) || (this.getAx1Avgnat() != null
						&& castOther.getAx1Avgnat() != null && this.getAx1Avgnat().equals(castOther.getAx1Avgnat())))
				&& ((this.getAx1Brtimp() == castOther.getAx1Brtimp()) || (this.getAx1Brtimp() != null
						&& castOther.getAx1Brtimp() != null && this.getAx1Brtimp().equals(castOther.getAx1Brtimp())))
				&& ((this.getAx1Revinv() == castOther.getAx1Revinv()) || (this.getAx1Revinv() != null
						&& castOther.getAx1Revinv() != null && this.getAx1Revinv().equals(castOther.getAx1Revinv())))
				&& ((this.getAx1Mntret() == castOther.getAx1Mntret()) || (this.getAx1Mntret() != null
						&& castOther.getAx1Mntret() != null && this.getAx1Mntret().equals(castOther.getAx1Mntret())))
				&& ((this.getAx1Netsrv() == castOther.getAx1Netsrv()) || (this.getAx1Netsrv() != null
						&& castOther.getAx1Netsrv() != null && this.getAx1Netsrv().equals(castOther.getAx1Netsrv())))
				&& ((this.getAx2Honora() == castOther.getAx2Honora()) || (this.getAx2Honora() != null
						&& castOther.getAx2Honora() != null && this.getAx2Honora().equals(castOther.getAx2Honora())))
				&& ((this.getAx2Loyers() == castOther.getAx2Loyers()) || (this.getAx2Loyers() != null
						&& castOther.getAx2Loyers() != null && this.getAx2Loyers().equals(castOther.getAx2Loyers())))
				&& ((this.getAx2Jetpre() == castOther.getAx2Jetpre()) || (this.getAx2Jetpre() != null
						&& castOther.getAx2Jetpre() != null && this.getAx2Jetpre().equals(castOther.getAx2Jetpre())))
				&& ((this.getAx2Pluval() == castOther.getAx2Pluval()) || (this.getAx2Pluval() != null
						&& castOther.getAx2Pluval() != null && this.getAx2Pluval().equals(castOther.getAx2Pluval())))
				&& ((this.getAx2Mntret() == castOther.getAx2Mntret()) || (this.getAx2Mntret() != null
						&& castOther.getAx2Mntret() != null && this.getAx2Mntret().equals(castOther.getAx2Mntret())))
				&& ((this.getAx2Ristor() == castOther.getAx2Ristor()) || (this.getAx2Ristor() != null
						&& castOther.getAx2Ristor() != null && this.getAx2Ristor().equals(castOther.getAx2Ristor())))
				&& ((this.getAx2Netsrv() == castOther.getAx2Netsrv()) || (this.getAx2Netsrv() != null
						&& castOther.getAx2Netsrv() != null && this.getAx2Netsrv().equals(castOther.getAx2Netsrv())))
				&& ((this.getAx5Mntmar() == castOther.getAx5Mntmar()) || (this.getAx5Mntmar() != null
						&& castOther.getAx5Mntmar() != null && this.getAx5Mntmar().equals(castOther.getAx5Mntmar())))
				&& ((this.getAx5Mntret() == castOther.getAx5Mntret()) || (this.getAx5Mntret() != null
						&& castOther.getAx5Mntret() != null && this.getAx5Mntret().equals(castOther.getAx5Mntret())))
				&& ((this.getAx5Netsrv() == castOther.getAx5Netsrv()) || (this.getAx5Netsrv() != null
						&& castOther.getAx5Netsrv() != null && this.getAx5Netsrv().equals(castOther.getAx5Netsrv())))
				&& ((this.getAx5Ristor() == castOther.getAx5Ristor()) || (this.getAx5Ristor() != null
						&& castOther.getAx5Ristor() != null && this.getAx5Ristor().equals(castOther.getAx5Ristor())))
				&& ((this.getAx6Recouv() == castOther.getAx6Recouv()) || (this.getAx6Recouv() != null
						&& castOther.getAx6Recouv() != null && this.getAx6Recouv().equals(castOther.getAx6Recouv())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAgxTypocc() == null ? 0 : this.getAgxTypocc().hashCode());
		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCtrEtbsec() == null ? 0 : this.getCtrEtbsec().hashCode());
		result = 37 * result + (getEmpExerci() == null ? 0 : this.getEmpExerci().hashCode());
		result = 37 * result + (getAx1Revimp() == null ? 0 : this.getAx1Revimp().hashCode());
		result = 37 * result + (getAx1Avgnat() == null ? 0 : this.getAx1Avgnat().hashCode());
		result = 37 * result + (getAx1Brtimp() == null ? 0 : this.getAx1Brtimp().hashCode());
		result = 37 * result + (getAx1Revinv() == null ? 0 : this.getAx1Revinv().hashCode());
		result = 37 * result + (getAx1Mntret() == null ? 0 : this.getAx1Mntret().hashCode());
		result = 37 * result + (getAx1Netsrv() == null ? 0 : this.getAx1Netsrv().hashCode());
		result = 37 * result + (getAx2Honora() == null ? 0 : this.getAx2Honora().hashCode());
		result = 37 * result + (getAx2Loyers() == null ? 0 : this.getAx2Loyers().hashCode());
		result = 37 * result + (getAx2Jetpre() == null ? 0 : this.getAx2Jetpre().hashCode());
		result = 37 * result + (getAx2Pluval() == null ? 0 : this.getAx2Pluval().hashCode());
		result = 37 * result + (getAx2Mntret() == null ? 0 : this.getAx2Mntret().hashCode());
		result = 37 * result + (getAx2Ristor() == null ? 0 : this.getAx2Ristor().hashCode());
		result = 37 * result + (getAx2Netsrv() == null ? 0 : this.getAx2Netsrv().hashCode());
		result = 37 * result + (getAx5Mntmar() == null ? 0 : this.getAx5Mntmar().hashCode());
		result = 37 * result + (getAx5Mntret() == null ? 0 : this.getAx5Mntret().hashCode());
		result = 37 * result + (getAx5Netsrv() == null ? 0 : this.getAx5Netsrv().hashCode());
		result = 37 * result + (getAx5Ristor() == null ? 0 : this.getAx5Ristor().hashCode());
		result = 37 * result + (getAx6Recouv() == null ? 0 : this.getAx6Recouv().hashCode());
		return result;
	}

}
