package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * P3aAgrresId generated by hbm2java
 */
@Embeddable
public class P3aAgrresId implements java.io.Serializable {

	private String resExerci;
	private String ctrMatfis;
	private String ctrCatego;
	private String ctrEtbsec;
	private BigDecimal resSalbas;
	private BigDecimal resSalret;
	private BigDecimal resHonass;
	private BigDecimal resHonret;
	private BigDecimal resHonn15;
	private BigDecimal resHnrret;
	private BigDecimal resHonrra;
	private BigDecimal resHonrrr;
	private BigDecimal resLhoass;
	private BigDecimal resLhoret;
	private BigDecimal resRedbas;
	private BigDecimal resRedmnt;
	private BigDecimal resCspbas;
	private BigDecimal resCspmnt;
	private BigDecimal resMobprb;
	private BigDecimal resMobprr;
	private BigDecimal resMobmrb;
	private BigDecimal resMobmrr;
	private BigDecimal resMobpnb;
	private BigDecimal resMobpnr;
	private BigDecimal resMobmnb;
	private BigDecimal resMobmnr;
	private BigDecimal resVmoass;
	private BigDecimal resVmoret;
	private BigDecimal resJetrba;
	private BigDecimal resJetrrt;
	private BigDecimal resJetnba;
	private BigDecimal resJetnrt;
	private BigDecimal resRtpraa;
	private BigDecimal jetRtprar;
	private BigDecimal jetIppeba;
	private BigDecimal resIppret;
	private BigDecimal resPidacb;
	private BigDecimal resPirret;
	private BigDecimal resImbpnb;
	private BigDecimal resImbpnr;
	private BigDecimal resImbmnb;
	private BigDecimal resImbmnr;
	private BigDecimal resMarchb;
	private BigDecimal resMarchr;
	private BigDecimal resTva50b;
	private BigDecimal resTva50r;
	private BigDecimal resTrsanr;
	private BigDecimal resTrsrnr;
	private BigDecimal resTpfrub;
	private BigDecimal resTplegr;
	private BigDecimal resCapioa;
	private BigDecimal resCapior;
	private Long resAvvppa;
	private Long resAvvppr;
	private Long resHonbea;
	private Long resHonber;
	private Long resPlvcsa;
	private Long resPlvcsr;
	private Long resCcoass;
	private Long resCcoret;

	public P3aAgrresId() {
	}

	public P3aAgrresId(String resExerci, String ctrMatfis, String ctrEtbsec) {
		this.resExerci = resExerci;
		this.ctrMatfis = ctrMatfis;
		this.ctrEtbsec = ctrEtbsec;
	}

	public P3aAgrresId(String resExerci, String ctrMatfis, String ctrCatego, String ctrEtbsec, BigDecimal resSalbas,
			BigDecimal resSalret, BigDecimal resHonass, BigDecimal resHonret, BigDecimal resHonn15,
			BigDecimal resHnrret, BigDecimal resHonrra, BigDecimal resHonrrr, BigDecimal resLhoass,
			BigDecimal resLhoret, BigDecimal resRedbas, BigDecimal resRedmnt, BigDecimal resCspbas,
			BigDecimal resCspmnt, BigDecimal resMobprb, BigDecimal resMobprr, BigDecimal resMobmrb,
			BigDecimal resMobmrr, BigDecimal resMobpnb, BigDecimal resMobpnr, BigDecimal resMobmnb,
			BigDecimal resMobmnr, BigDecimal resVmoass, BigDecimal resVmoret, BigDecimal resJetrba,
			BigDecimal resJetrrt, BigDecimal resJetnba, BigDecimal resJetnrt, BigDecimal resRtpraa,
			BigDecimal jetRtprar, BigDecimal jetIppeba, BigDecimal resIppret, BigDecimal resPidacb,
			BigDecimal resPirret, BigDecimal resImbpnb, BigDecimal resImbpnr, BigDecimal resImbmnb,
			BigDecimal resImbmnr, BigDecimal resMarchb, BigDecimal resMarchr, BigDecimal resTva50b,
			BigDecimal resTva50r, BigDecimal resTrsanr, BigDecimal resTrsrnr, BigDecimal resTpfrub,
			BigDecimal resTplegr, BigDecimal resCapioa, BigDecimal resCapior, Long resAvvppa, Long resAvvppr,
			Long resHonbea, Long resHonber, Long resPlvcsa, Long resPlvcsr, Long resCcoass, Long resCcoret) {
		this.resExerci = resExerci;
		this.ctrMatfis = ctrMatfis;
		this.ctrCatego = ctrCatego;
		this.ctrEtbsec = ctrEtbsec;
		this.resSalbas = resSalbas;
		this.resSalret = resSalret;
		this.resHonass = resHonass;
		this.resHonret = resHonret;
		this.resHonn15 = resHonn15;
		this.resHnrret = resHnrret;
		this.resHonrra = resHonrra;
		this.resHonrrr = resHonrrr;
		this.resLhoass = resLhoass;
		this.resLhoret = resLhoret;
		this.resRedbas = resRedbas;
		this.resRedmnt = resRedmnt;
		this.resCspbas = resCspbas;
		this.resCspmnt = resCspmnt;
		this.resMobprb = resMobprb;
		this.resMobprr = resMobprr;
		this.resMobmrb = resMobmrb;
		this.resMobmrr = resMobmrr;
		this.resMobpnb = resMobpnb;
		this.resMobpnr = resMobpnr;
		this.resMobmnb = resMobmnb;
		this.resMobmnr = resMobmnr;
		this.resVmoass = resVmoass;
		this.resVmoret = resVmoret;
		this.resJetrba = resJetrba;
		this.resJetrrt = resJetrrt;
		this.resJetnba = resJetnba;
		this.resJetnrt = resJetnrt;
		this.resRtpraa = resRtpraa;
		this.jetRtprar = jetRtprar;
		this.jetIppeba = jetIppeba;
		this.resIppret = resIppret;
		this.resPidacb = resPidacb;
		this.resPirret = resPirret;
		this.resImbpnb = resImbpnb;
		this.resImbpnr = resImbpnr;
		this.resImbmnb = resImbmnb;
		this.resImbmnr = resImbmnr;
		this.resMarchb = resMarchb;
		this.resMarchr = resMarchr;
		this.resTva50b = resTva50b;
		this.resTva50r = resTva50r;
		this.resTrsanr = resTrsanr;
		this.resTrsrnr = resTrsrnr;
		this.resTpfrub = resTpfrub;
		this.resTplegr = resTplegr;
		this.resCapioa = resCapioa;
		this.resCapior = resCapior;
		this.resAvvppa = resAvvppa;
		this.resAvvppr = resAvvppr;
		this.resHonbea = resHonbea;
		this.resHonber = resHonber;
		this.resPlvcsa = resPlvcsa;
		this.resPlvcsr = resPlvcsr;
		this.resCcoass = resCcoass;
		this.resCcoret = resCcoret;
	}

	@Column(name = "RES_EXERCI", nullable = false, length = 4)
	public String getResExerci() {
		return this.resExerci;
	}

	public void setResExerci(String resExerci) {
		this.resExerci = resExerci;
	}

	@Column(name = "CTR_MATFIS", nullable = false, length = 8)
	public String getCtrMatfis() {
		return this.ctrMatfis;
	}

	public void setCtrMatfis(String ctrMatfis) {
		this.ctrMatfis = ctrMatfis;
	}

	@Column(name = "CTR_CATEGO", length = 1)
	public String getCtrCatego() {
		return this.ctrCatego;
	}

	public void setCtrCatego(String ctrCatego) {
		this.ctrCatego = ctrCatego;
	}

	@Column(name = "CTR_ETBSEC", nullable = false, length = 3)
	public String getCtrEtbsec() {
		return this.ctrEtbsec;
	}

	public void setCtrEtbsec(String ctrEtbsec) {
		this.ctrEtbsec = ctrEtbsec;
	}

	@Column(name = "RES_SALBAS", precision = 22, scale = 0)
	public BigDecimal getResSalbas() {
		return this.resSalbas;
	}

	public void setResSalbas(BigDecimal resSalbas) {
		this.resSalbas = resSalbas;
	}

	@Column(name = "RES_SALRET", precision = 22, scale = 0)
	public BigDecimal getResSalret() {
		return this.resSalret;
	}

	public void setResSalret(BigDecimal resSalret) {
		this.resSalret = resSalret;
	}

	@Column(name = "RES_HONASS", precision = 22, scale = 0)
	public BigDecimal getResHonass() {
		return this.resHonass;
	}

	public void setResHonass(BigDecimal resHonass) {
		this.resHonass = resHonass;
	}

	@Column(name = "RES_HONRET", precision = 22, scale = 0)
	public BigDecimal getResHonret() {
		return this.resHonret;
	}

	public void setResHonret(BigDecimal resHonret) {
		this.resHonret = resHonret;
	}

	@Column(name = "RES_HONN15", precision = 22, scale = 0)
	public BigDecimal getResHonn15() {
		return this.resHonn15;
	}

	public void setResHonn15(BigDecimal resHonn15) {
		this.resHonn15 = resHonn15;
	}

	@Column(name = "RES_HNRRET", precision = 22, scale = 0)
	public BigDecimal getResHnrret() {
		return this.resHnrret;
	}

	public void setResHnrret(BigDecimal resHnrret) {
		this.resHnrret = resHnrret;
	}

	@Column(name = "RES_HONRRA", precision = 22, scale = 0)
	public BigDecimal getResHonrra() {
		return this.resHonrra;
	}

	public void setResHonrra(BigDecimal resHonrra) {
		this.resHonrra = resHonrra;
	}

	@Column(name = "RES_HONRRR", precision = 22, scale = 0)
	public BigDecimal getResHonrrr() {
		return this.resHonrrr;
	}

	public void setResHonrrr(BigDecimal resHonrrr) {
		this.resHonrrr = resHonrrr;
	}

	@Column(name = "RES_LHOASS", precision = 22, scale = 0)
	public BigDecimal getResLhoass() {
		return this.resLhoass;
	}

	public void setResLhoass(BigDecimal resLhoass) {
		this.resLhoass = resLhoass;
	}

	@Column(name = "RES_LHORET", precision = 22, scale = 0)
	public BigDecimal getResLhoret() {
		return this.resLhoret;
	}

	public void setResLhoret(BigDecimal resLhoret) {
		this.resLhoret = resLhoret;
	}

	@Column(name = "RES_REDBAS", precision = 22, scale = 0)
	public BigDecimal getResRedbas() {
		return this.resRedbas;
	}

	public void setResRedbas(BigDecimal resRedbas) {
		this.resRedbas = resRedbas;
	}

	@Column(name = "RES_REDMNT", precision = 22, scale = 0)
	public BigDecimal getResRedmnt() {
		return this.resRedmnt;
	}

	public void setResRedmnt(BigDecimal resRedmnt) {
		this.resRedmnt = resRedmnt;
	}

	@Column(name = "RES_CSPBAS", precision = 22, scale = 0)
	public BigDecimal getResCspbas() {
		return this.resCspbas;
	}

	public void setResCspbas(BigDecimal resCspbas) {
		this.resCspbas = resCspbas;
	}

	@Column(name = "RES_CSPMNT", precision = 22, scale = 0)
	public BigDecimal getResCspmnt() {
		return this.resCspmnt;
	}

	public void setResCspmnt(BigDecimal resCspmnt) {
		this.resCspmnt = resCspmnt;
	}

	@Column(name = "RES_MOBPRB", precision = 22, scale = 0)
	public BigDecimal getResMobprb() {
		return this.resMobprb;
	}

	public void setResMobprb(BigDecimal resMobprb) {
		this.resMobprb = resMobprb;
	}

	@Column(name = "RES_MOBPRR", precision = 22, scale = 0)
	public BigDecimal getResMobprr() {
		return this.resMobprr;
	}

	public void setResMobprr(BigDecimal resMobprr) {
		this.resMobprr = resMobprr;
	}

	@Column(name = "RES_MOBMRB", precision = 22, scale = 0)
	public BigDecimal getResMobmrb() {
		return this.resMobmrb;
	}

	public void setResMobmrb(BigDecimal resMobmrb) {
		this.resMobmrb = resMobmrb;
	}

	@Column(name = "RES_MOBMRR", precision = 22, scale = 0)
	public BigDecimal getResMobmrr() {
		return this.resMobmrr;
	}

	public void setResMobmrr(BigDecimal resMobmrr) {
		this.resMobmrr = resMobmrr;
	}

	@Column(name = "RES_MOBPNB", precision = 22, scale = 0)
	public BigDecimal getResMobpnb() {
		return this.resMobpnb;
	}

	public void setResMobpnb(BigDecimal resMobpnb) {
		this.resMobpnb = resMobpnb;
	}

	@Column(name = "RES_MOBPNR", precision = 22, scale = 0)
	public BigDecimal getResMobpnr() {
		return this.resMobpnr;
	}

	public void setResMobpnr(BigDecimal resMobpnr) {
		this.resMobpnr = resMobpnr;
	}

	@Column(name = "RES_MOBMNB", precision = 22, scale = 0)
	public BigDecimal getResMobmnb() {
		return this.resMobmnb;
	}

	public void setResMobmnb(BigDecimal resMobmnb) {
		this.resMobmnb = resMobmnb;
	}

	@Column(name = "RES_MOBMNR", precision = 22, scale = 0)
	public BigDecimal getResMobmnr() {
		return this.resMobmnr;
	}

	public void setResMobmnr(BigDecimal resMobmnr) {
		this.resMobmnr = resMobmnr;
	}

	@Column(name = "RES_VMOASS", precision = 22, scale = 0)
	public BigDecimal getResVmoass() {
		return this.resVmoass;
	}

	public void setResVmoass(BigDecimal resVmoass) {
		this.resVmoass = resVmoass;
	}

	@Column(name = "RES_VMORET", precision = 22, scale = 0)
	public BigDecimal getResVmoret() {
		return this.resVmoret;
	}

	public void setResVmoret(BigDecimal resVmoret) {
		this.resVmoret = resVmoret;
	}

	@Column(name = "RES_JETRBA", precision = 22, scale = 0)
	public BigDecimal getResJetrba() {
		return this.resJetrba;
	}

	public void setResJetrba(BigDecimal resJetrba) {
		this.resJetrba = resJetrba;
	}

	@Column(name = "RES_JETRRT", precision = 22, scale = 0)
	public BigDecimal getResJetrrt() {
		return this.resJetrrt;
	}

	public void setResJetrrt(BigDecimal resJetrrt) {
		this.resJetrrt = resJetrrt;
	}

	@Column(name = "RES_JETNBA", precision = 22, scale = 0)
	public BigDecimal getResJetnba() {
		return this.resJetnba;
	}

	public void setResJetnba(BigDecimal resJetnba) {
		this.resJetnba = resJetnba;
	}

	@Column(name = "RES_JETNRT", precision = 22, scale = 0)
	public BigDecimal getResJetnrt() {
		return this.resJetnrt;
	}

	public void setResJetnrt(BigDecimal resJetnrt) {
		this.resJetnrt = resJetnrt;
	}

	@Column(name = "RES_RTPRAA", precision = 22, scale = 0)
	public BigDecimal getResRtpraa() {
		return this.resRtpraa;
	}

	public void setResRtpraa(BigDecimal resRtpraa) {
		this.resRtpraa = resRtpraa;
	}

	@Column(name = "JET_RTPRAR", precision = 22, scale = 0)
	public BigDecimal getJetRtprar() {
		return this.jetRtprar;
	}

	public void setJetRtprar(BigDecimal jetRtprar) {
		this.jetRtprar = jetRtprar;
	}

	@Column(name = "JET_IPPEBA", precision = 22, scale = 0)
	public BigDecimal getJetIppeba() {
		return this.jetIppeba;
	}

	public void setJetIppeba(BigDecimal jetIppeba) {
		this.jetIppeba = jetIppeba;
	}

	@Column(name = "RES_IPPRET", precision = 22, scale = 0)
	public BigDecimal getResIppret() {
		return this.resIppret;
	}

	public void setResIppret(BigDecimal resIppret) {
		this.resIppret = resIppret;
	}

	@Column(name = "RES_PIDACB", precision = 22, scale = 0)
	public BigDecimal getResPidacb() {
		return this.resPidacb;
	}

	public void setResPidacb(BigDecimal resPidacb) {
		this.resPidacb = resPidacb;
	}

	@Column(name = "RES_PIRRET", precision = 22, scale = 0)
	public BigDecimal getResPirret() {
		return this.resPirret;
	}

	public void setResPirret(BigDecimal resPirret) {
		this.resPirret = resPirret;
	}

	@Column(name = "RES_IMBPNB", precision = 22, scale = 0)
	public BigDecimal getResImbpnb() {
		return this.resImbpnb;
	}

	public void setResImbpnb(BigDecimal resImbpnb) {
		this.resImbpnb = resImbpnb;
	}

	@Column(name = "RES_IMBPNR", precision = 22, scale = 0)
	public BigDecimal getResImbpnr() {
		return this.resImbpnr;
	}

	public void setResImbpnr(BigDecimal resImbpnr) {
		this.resImbpnr = resImbpnr;
	}

	@Column(name = "RES_IMBMNB", precision = 22, scale = 0)
	public BigDecimal getResImbmnb() {
		return this.resImbmnb;
	}

	public void setResImbmnb(BigDecimal resImbmnb) {
		this.resImbmnb = resImbmnb;
	}

	@Column(name = "RES_IMBMNR", precision = 22, scale = 0)
	public BigDecimal getResImbmnr() {
		return this.resImbmnr;
	}

	public void setResImbmnr(BigDecimal resImbmnr) {
		this.resImbmnr = resImbmnr;
	}

	@Column(name = "RES_MARCHB", precision = 22, scale = 0)
	public BigDecimal getResMarchb() {
		return this.resMarchb;
	}

	public void setResMarchb(BigDecimal resMarchb) {
		this.resMarchb = resMarchb;
	}

	@Column(name = "RES_MARCHR", precision = 22, scale = 0)
	public BigDecimal getResMarchr() {
		return this.resMarchr;
	}

	public void setResMarchr(BigDecimal resMarchr) {
		this.resMarchr = resMarchr;
	}

	@Column(name = "RES_TVA50B", precision = 22, scale = 0)
	public BigDecimal getResTva50b() {
		return this.resTva50b;
	}

	public void setResTva50b(BigDecimal resTva50b) {
		this.resTva50b = resTva50b;
	}

	@Column(name = "RES_TVA50R", precision = 22, scale = 0)
	public BigDecimal getResTva50r() {
		return this.resTva50r;
	}

	public void setResTva50r(BigDecimal resTva50r) {
		this.resTva50r = resTva50r;
	}

	@Column(name = "RES_TRSANR", precision = 22, scale = 0)
	public BigDecimal getResTrsanr() {
		return this.resTrsanr;
	}

	public void setResTrsanr(BigDecimal resTrsanr) {
		this.resTrsanr = resTrsanr;
	}

	@Column(name = "RES_TRSRNR", precision = 22, scale = 0)
	public BigDecimal getResTrsrnr() {
		return this.resTrsrnr;
	}

	public void setResTrsrnr(BigDecimal resTrsrnr) {
		this.resTrsrnr = resTrsrnr;
	}

	@Column(name = "RES_TPFRUB", precision = 22, scale = 0)
	public BigDecimal getResTpfrub() {
		return this.resTpfrub;
	}

	public void setResTpfrub(BigDecimal resTpfrub) {
		this.resTpfrub = resTpfrub;
	}

	@Column(name = "RES_TPLEGR", precision = 22, scale = 0)
	public BigDecimal getResTplegr() {
		return this.resTplegr;
	}

	public void setResTplegr(BigDecimal resTplegr) {
		this.resTplegr = resTplegr;
	}

	@Column(name = "RES_CAPIOA", precision = 22, scale = 0)
	public BigDecimal getResCapioa() {
		return this.resCapioa;
	}

	public void setResCapioa(BigDecimal resCapioa) {
		this.resCapioa = resCapioa;
	}

	@Column(name = "RES_CAPIOR", precision = 22, scale = 0)
	public BigDecimal getResCapior() {
		return this.resCapior;
	}

	public void setResCapior(BigDecimal resCapior) {
		this.resCapior = resCapior;
	}

	@Column(name = "RES_AVVPPA", precision = 13, scale = 0)
	public Long getResAvvppa() {
		return this.resAvvppa;
	}

	public void setResAvvppa(Long resAvvppa) {
		this.resAvvppa = resAvvppa;
	}

	@Column(name = "RES_AVVPPR", precision = 13, scale = 0)
	public Long getResAvvppr() {
		return this.resAvvppr;
	}

	public void setResAvvppr(Long resAvvppr) {
		this.resAvvppr = resAvvppr;
	}

	@Column(name = "RES_HONBEA", precision = 13, scale = 0)
	public Long getResHonbea() {
		return this.resHonbea;
	}

	public void setResHonbea(Long resHonbea) {
		this.resHonbea = resHonbea;
	}

	@Column(name = "RES_HONBER", precision = 13, scale = 0)
	public Long getResHonber() {
		return this.resHonber;
	}

	public void setResHonber(Long resHonber) {
		this.resHonber = resHonber;
	}

	@Column(name = "RES_PLVCSA", precision = 13, scale = 0)
	public Long getResPlvcsa() {
		return this.resPlvcsa;
	}

	public void setResPlvcsa(Long resPlvcsa) {
		this.resPlvcsa = resPlvcsa;
	}

	@Column(name = "RES_PLVCSR", precision = 13, scale = 0)
	public Long getResPlvcsr() {
		return this.resPlvcsr;
	}

	public void setResPlvcsr(Long resPlvcsr) {
		this.resPlvcsr = resPlvcsr;
	}

	@Column(name = "RES_CCOASS", precision = 13, scale = 0)
	public Long getResCcoass() {
		return this.resCcoass;
	}

	public void setResCcoass(Long resCcoass) {
		this.resCcoass = resCcoass;
	}

	@Column(name = "RES_CCORET", precision = 13, scale = 0)
	public Long getResCcoret() {
		return this.resCcoret;
	}

	public void setResCcoret(Long resCcoret) {
		this.resCcoret = resCcoret;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof P3aAgrresId))
			return false;
		P3aAgrresId castOther = (P3aAgrresId) other;

		return ((this.getResExerci() == castOther.getResExerci()) || (this.getResExerci() != null
				&& castOther.getResExerci() != null && this.getResExerci().equals(castOther.getResExerci())))
				&& ((this.getCtrMatfis() == castOther.getCtrMatfis()) || (this.getCtrMatfis() != null
						&& castOther.getCtrMatfis() != null && this.getCtrMatfis().equals(castOther.getCtrMatfis())))
				&& ((this.getCtrCatego() == castOther.getCtrCatego()) || (this.getCtrCatego() != null
						&& castOther.getCtrCatego() != null && this.getCtrCatego().equals(castOther.getCtrCatego())))
				&& ((this.getCtrEtbsec() == castOther.getCtrEtbsec()) || (this.getCtrEtbsec() != null
						&& castOther.getCtrEtbsec() != null && this.getCtrEtbsec().equals(castOther.getCtrEtbsec())))
				&& ((this.getResSalbas() == castOther.getResSalbas()) || (this.getResSalbas() != null
						&& castOther.getResSalbas() != null && this.getResSalbas().equals(castOther.getResSalbas())))
				&& ((this.getResSalret() == castOther.getResSalret()) || (this.getResSalret() != null
						&& castOther.getResSalret() != null && this.getResSalret().equals(castOther.getResSalret())))
				&& ((this.getResHonass() == castOther.getResHonass()) || (this.getResHonass() != null
						&& castOther.getResHonass() != null && this.getResHonass().equals(castOther.getResHonass())))
				&& ((this.getResHonret() == castOther.getResHonret()) || (this.getResHonret() != null
						&& castOther.getResHonret() != null && this.getResHonret().equals(castOther.getResHonret())))
				&& ((this.getResHonn15() == castOther.getResHonn15()) || (this.getResHonn15() != null
						&& castOther.getResHonn15() != null && this.getResHonn15().equals(castOther.getResHonn15())))
				&& ((this.getResHnrret() == castOther.getResHnrret()) || (this.getResHnrret() != null
						&& castOther.getResHnrret() != null && this.getResHnrret().equals(castOther.getResHnrret())))
				&& ((this.getResHonrra() == castOther.getResHonrra()) || (this.getResHonrra() != null
						&& castOther.getResHonrra() != null && this.getResHonrra().equals(castOther.getResHonrra())))
				&& ((this.getResHonrrr() == castOther.getResHonrrr()) || (this.getResHonrrr() != null
						&& castOther.getResHonrrr() != null && this.getResHonrrr().equals(castOther.getResHonrrr())))
				&& ((this.getResLhoass() == castOther.getResLhoass()) || (this.getResLhoass() != null
						&& castOther.getResLhoass() != null && this.getResLhoass().equals(castOther.getResLhoass())))
				&& ((this.getResLhoret() == castOther.getResLhoret()) || (this.getResLhoret() != null
						&& castOther.getResLhoret() != null && this.getResLhoret().equals(castOther.getResLhoret())))
				&& ((this.getResRedbas() == castOther.getResRedbas()) || (this.getResRedbas() != null
						&& castOther.getResRedbas() != null && this.getResRedbas().equals(castOther.getResRedbas())))
				&& ((this.getResRedmnt() == castOther.getResRedmnt()) || (this.getResRedmnt() != null
						&& castOther.getResRedmnt() != null && this.getResRedmnt().equals(castOther.getResRedmnt())))
				&& ((this.getResCspbas() == castOther.getResCspbas()) || (this.getResCspbas() != null
						&& castOther.getResCspbas() != null && this.getResCspbas().equals(castOther.getResCspbas())))
				&& ((this.getResCspmnt() == castOther.getResCspmnt()) || (this.getResCspmnt() != null
						&& castOther.getResCspmnt() != null && this.getResCspmnt().equals(castOther.getResCspmnt())))
				&& ((this.getResMobprb() == castOther.getResMobprb()) || (this.getResMobprb() != null
						&& castOther.getResMobprb() != null && this.getResMobprb().equals(castOther.getResMobprb())))
				&& ((this.getResMobprr() == castOther.getResMobprr()) || (this.getResMobprr() != null
						&& castOther.getResMobprr() != null && this.getResMobprr().equals(castOther.getResMobprr())))
				&& ((this.getResMobmrb() == castOther.getResMobmrb()) || (this.getResMobmrb() != null
						&& castOther.getResMobmrb() != null && this.getResMobmrb().equals(castOther.getResMobmrb())))
				&& ((this.getResMobmrr() == castOther.getResMobmrr()) || (this.getResMobmrr() != null
						&& castOther.getResMobmrr() != null && this.getResMobmrr().equals(castOther.getResMobmrr())))
				&& ((this.getResMobpnb() == castOther.getResMobpnb()) || (this.getResMobpnb() != null
						&& castOther.getResMobpnb() != null && this.getResMobpnb().equals(castOther.getResMobpnb())))
				&& ((this.getResMobpnr() == castOther.getResMobpnr()) || (this.getResMobpnr() != null
						&& castOther.getResMobpnr() != null && this.getResMobpnr().equals(castOther.getResMobpnr())))
				&& ((this.getResMobmnb() == castOther.getResMobmnb()) || (this.getResMobmnb() != null
						&& castOther.getResMobmnb() != null && this.getResMobmnb().equals(castOther.getResMobmnb())))
				&& ((this.getResMobmnr() == castOther.getResMobmnr()) || (this.getResMobmnr() != null
						&& castOther.getResMobmnr() != null && this.getResMobmnr().equals(castOther.getResMobmnr())))
				&& ((this.getResVmoass() == castOther.getResVmoass()) || (this.getResVmoass() != null
						&& castOther.getResVmoass() != null && this.getResVmoass().equals(castOther.getResVmoass())))
				&& ((this.getResVmoret() == castOther.getResVmoret()) || (this.getResVmoret() != null
						&& castOther.getResVmoret() != null && this.getResVmoret().equals(castOther.getResVmoret())))
				&& ((this.getResJetrba() == castOther.getResJetrba()) || (this.getResJetrba() != null
						&& castOther.getResJetrba() != null && this.getResJetrba().equals(castOther.getResJetrba())))
				&& ((this.getResJetrrt() == castOther.getResJetrrt()) || (this.getResJetrrt() != null
						&& castOther.getResJetrrt() != null && this.getResJetrrt().equals(castOther.getResJetrrt())))
				&& ((this.getResJetnba() == castOther.getResJetnba()) || (this.getResJetnba() != null
						&& castOther.getResJetnba() != null && this.getResJetnba().equals(castOther.getResJetnba())))
				&& ((this.getResJetnrt() == castOther.getResJetnrt()) || (this.getResJetnrt() != null
						&& castOther.getResJetnrt() != null && this.getResJetnrt().equals(castOther.getResJetnrt())))
				&& ((this.getResRtpraa() == castOther.getResRtpraa()) || (this.getResRtpraa() != null
						&& castOther.getResRtpraa() != null && this.getResRtpraa().equals(castOther.getResRtpraa())))
				&& ((this.getJetRtprar() == castOther.getJetRtprar()) || (this.getJetRtprar() != null
						&& castOther.getJetRtprar() != null && this.getJetRtprar().equals(castOther.getJetRtprar())))
				&& ((this.getJetIppeba() == castOther.getJetIppeba()) || (this.getJetIppeba() != null
						&& castOther.getJetIppeba() != null && this.getJetIppeba().equals(castOther.getJetIppeba())))
				&& ((this.getResIppret() == castOther.getResIppret()) || (this.getResIppret() != null
						&& castOther.getResIppret() != null && this.getResIppret().equals(castOther.getResIppret())))
				&& ((this.getResPidacb() == castOther.getResPidacb()) || (this.getResPidacb() != null
						&& castOther.getResPidacb() != null && this.getResPidacb().equals(castOther.getResPidacb())))
				&& ((this.getResPirret() == castOther.getResPirret()) || (this.getResPirret() != null
						&& castOther.getResPirret() != null && this.getResPirret().equals(castOther.getResPirret())))
				&& ((this.getResImbpnb() == castOther.getResImbpnb()) || (this.getResImbpnb() != null
						&& castOther.getResImbpnb() != null && this.getResImbpnb().equals(castOther.getResImbpnb())))
				&& ((this.getResImbpnr() == castOther.getResImbpnr()) || (this.getResImbpnr() != null
						&& castOther.getResImbpnr() != null && this.getResImbpnr().equals(castOther.getResImbpnr())))
				&& ((this.getResImbmnb() == castOther.getResImbmnb()) || (this.getResImbmnb() != null
						&& castOther.getResImbmnb() != null && this.getResImbmnb().equals(castOther.getResImbmnb())))
				&& ((this.getResImbmnr() == castOther.getResImbmnr()) || (this.getResImbmnr() != null
						&& castOther.getResImbmnr() != null && this.getResImbmnr().equals(castOther.getResImbmnr())))
				&& ((this.getResMarchb() == castOther.getResMarchb()) || (this.getResMarchb() != null
						&& castOther.getResMarchb() != null && this.getResMarchb().equals(castOther.getResMarchb())))
				&& ((this.getResMarchr() == castOther.getResMarchr()) || (this.getResMarchr() != null
						&& castOther.getResMarchr() != null && this.getResMarchr().equals(castOther.getResMarchr())))
				&& ((this.getResTva50b() == castOther.getResTva50b()) || (this.getResTva50b() != null
						&& castOther.getResTva50b() != null && this.getResTva50b().equals(castOther.getResTva50b())))
				&& ((this.getResTva50r() == castOther.getResTva50r()) || (this.getResTva50r() != null
						&& castOther.getResTva50r() != null && this.getResTva50r().equals(castOther.getResTva50r())))
				&& ((this.getResTrsanr() == castOther.getResTrsanr()) || (this.getResTrsanr() != null
						&& castOther.getResTrsanr() != null && this.getResTrsanr().equals(castOther.getResTrsanr())))
				&& ((this.getResTrsrnr() == castOther.getResTrsrnr()) || (this.getResTrsrnr() != null
						&& castOther.getResTrsrnr() != null && this.getResTrsrnr().equals(castOther.getResTrsrnr())))
				&& ((this.getResTpfrub() == castOther.getResTpfrub()) || (this.getResTpfrub() != null
						&& castOther.getResTpfrub() != null && this.getResTpfrub().equals(castOther.getResTpfrub())))
				&& ((this.getResTplegr() == castOther.getResTplegr()) || (this.getResTplegr() != null
						&& castOther.getResTplegr() != null && this.getResTplegr().equals(castOther.getResTplegr())))
				&& ((this.getResCapioa() == castOther.getResCapioa()) || (this.getResCapioa() != null
						&& castOther.getResCapioa() != null && this.getResCapioa().equals(castOther.getResCapioa())))
				&& ((this.getResCapior() == castOther.getResCapior()) || (this.getResCapior() != null
						&& castOther.getResCapior() != null && this.getResCapior().equals(castOther.getResCapior())))
				&& ((this.getResAvvppa() == castOther.getResAvvppa()) || (this.getResAvvppa() != null
						&& castOther.getResAvvppa() != null && this.getResAvvppa().equals(castOther.getResAvvppa())))
				&& ((this.getResAvvppr() == castOther.getResAvvppr()) || (this.getResAvvppr() != null
						&& castOther.getResAvvppr() != null && this.getResAvvppr().equals(castOther.getResAvvppr())))
				&& ((this.getResHonbea() == castOther.getResHonbea()) || (this.getResHonbea() != null
						&& castOther.getResHonbea() != null && this.getResHonbea().equals(castOther.getResHonbea())))
				&& ((this.getResHonber() == castOther.getResHonber()) || (this.getResHonber() != null
						&& castOther.getResHonber() != null && this.getResHonber().equals(castOther.getResHonber())))
				&& ((this.getResPlvcsa() == castOther.getResPlvcsa()) || (this.getResPlvcsa() != null
						&& castOther.getResPlvcsa() != null && this.getResPlvcsa().equals(castOther.getResPlvcsa())))
				&& ((this.getResPlvcsr() == castOther.getResPlvcsr()) || (this.getResPlvcsr() != null
						&& castOther.getResPlvcsr() != null && this.getResPlvcsr().equals(castOther.getResPlvcsr())))
				&& ((this.getResCcoass() == castOther.getResCcoass()) || (this.getResCcoass() != null
						&& castOther.getResCcoass() != null && this.getResCcoass().equals(castOther.getResCcoass())))
				&& ((this.getResCcoret() == castOther.getResCcoret()) || (this.getResCcoret() != null
						&& castOther.getResCcoret() != null && this.getResCcoret().equals(castOther.getResCcoret())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getResExerci() == null ? 0 : this.getResExerci().hashCode());
		result = 37 * result + (getCtrMatfis() == null ? 0 : this.getCtrMatfis().hashCode());
		result = 37 * result + (getCtrCatego() == null ? 0 : this.getCtrCatego().hashCode());
		result = 37 * result + (getCtrEtbsec() == null ? 0 : this.getCtrEtbsec().hashCode());
		result = 37 * result + (getResSalbas() == null ? 0 : this.getResSalbas().hashCode());
		result = 37 * result + (getResSalret() == null ? 0 : this.getResSalret().hashCode());
		result = 37 * result + (getResHonass() == null ? 0 : this.getResHonass().hashCode());
		result = 37 * result + (getResHonret() == null ? 0 : this.getResHonret().hashCode());
		result = 37 * result + (getResHonn15() == null ? 0 : this.getResHonn15().hashCode());
		result = 37 * result + (getResHnrret() == null ? 0 : this.getResHnrret().hashCode());
		result = 37 * result + (getResHonrra() == null ? 0 : this.getResHonrra().hashCode());
		result = 37 * result + (getResHonrrr() == null ? 0 : this.getResHonrrr().hashCode());
		result = 37 * result + (getResLhoass() == null ? 0 : this.getResLhoass().hashCode());
		result = 37 * result + (getResLhoret() == null ? 0 : this.getResLhoret().hashCode());
		result = 37 * result + (getResRedbas() == null ? 0 : this.getResRedbas().hashCode());
		result = 37 * result + (getResRedmnt() == null ? 0 : this.getResRedmnt().hashCode());
		result = 37 * result + (getResCspbas() == null ? 0 : this.getResCspbas().hashCode());
		result = 37 * result + (getResCspmnt() == null ? 0 : this.getResCspmnt().hashCode());
		result = 37 * result + (getResMobprb() == null ? 0 : this.getResMobprb().hashCode());
		result = 37 * result + (getResMobprr() == null ? 0 : this.getResMobprr().hashCode());
		result = 37 * result + (getResMobmrb() == null ? 0 : this.getResMobmrb().hashCode());
		result = 37 * result + (getResMobmrr() == null ? 0 : this.getResMobmrr().hashCode());
		result = 37 * result + (getResMobpnb() == null ? 0 : this.getResMobpnb().hashCode());
		result = 37 * result + (getResMobpnr() == null ? 0 : this.getResMobpnr().hashCode());
		result = 37 * result + (getResMobmnb() == null ? 0 : this.getResMobmnb().hashCode());
		result = 37 * result + (getResMobmnr() == null ? 0 : this.getResMobmnr().hashCode());
		result = 37 * result + (getResVmoass() == null ? 0 : this.getResVmoass().hashCode());
		result = 37 * result + (getResVmoret() == null ? 0 : this.getResVmoret().hashCode());
		result = 37 * result + (getResJetrba() == null ? 0 : this.getResJetrba().hashCode());
		result = 37 * result + (getResJetrrt() == null ? 0 : this.getResJetrrt().hashCode());
		result = 37 * result + (getResJetnba() == null ? 0 : this.getResJetnba().hashCode());
		result = 37 * result + (getResJetnrt() == null ? 0 : this.getResJetnrt().hashCode());
		result = 37 * result + (getResRtpraa() == null ? 0 : this.getResRtpraa().hashCode());
		result = 37 * result + (getJetRtprar() == null ? 0 : this.getJetRtprar().hashCode());
		result = 37 * result + (getJetIppeba() == null ? 0 : this.getJetIppeba().hashCode());
		result = 37 * result + (getResIppret() == null ? 0 : this.getResIppret().hashCode());
		result = 37 * result + (getResPidacb() == null ? 0 : this.getResPidacb().hashCode());
		result = 37 * result + (getResPirret() == null ? 0 : this.getResPirret().hashCode());
		result = 37 * result + (getResImbpnb() == null ? 0 : this.getResImbpnb().hashCode());
		result = 37 * result + (getResImbpnr() == null ? 0 : this.getResImbpnr().hashCode());
		result = 37 * result + (getResImbmnb() == null ? 0 : this.getResImbmnb().hashCode());
		result = 37 * result + (getResImbmnr() == null ? 0 : this.getResImbmnr().hashCode());
		result = 37 * result + (getResMarchb() == null ? 0 : this.getResMarchb().hashCode());
		result = 37 * result + (getResMarchr() == null ? 0 : this.getResMarchr().hashCode());
		result = 37 * result + (getResTva50b() == null ? 0 : this.getResTva50b().hashCode());
		result = 37 * result + (getResTva50r() == null ? 0 : this.getResTva50r().hashCode());
		result = 37 * result + (getResTrsanr() == null ? 0 : this.getResTrsanr().hashCode());
		result = 37 * result + (getResTrsrnr() == null ? 0 : this.getResTrsrnr().hashCode());
		result = 37 * result + (getResTpfrub() == null ? 0 : this.getResTpfrub().hashCode());
		result = 37 * result + (getResTplegr() == null ? 0 : this.getResTplegr().hashCode());
		result = 37 * result + (getResCapioa() == null ? 0 : this.getResCapioa().hashCode());
		result = 37 * result + (getResCapior() == null ? 0 : this.getResCapior().hashCode());
		result = 37 * result + (getResAvvppa() == null ? 0 : this.getResAvvppa().hashCode());
		result = 37 * result + (getResAvvppr() == null ? 0 : this.getResAvvppr().hashCode());
		result = 37 * result + (getResHonbea() == null ? 0 : this.getResHonbea().hashCode());
		result = 37 * result + (getResHonber() == null ? 0 : this.getResHonber().hashCode());
		result = 37 * result + (getResPlvcsa() == null ? 0 : this.getResPlvcsa().hashCode());
		result = 37 * result + (getResPlvcsr() == null ? 0 : this.getResPlvcsr().hashCode());
		result = 37 * result + (getResCcoass() == null ? 0 : this.getResCcoass().hashCode());
		result = 37 * result + (getResCcoret() == null ? 0 : this.getResCcoret().hashCode());
		return result;
	}

}
