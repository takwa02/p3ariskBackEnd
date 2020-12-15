package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * P3aCntrib generated by hbm2java
 */
@Entity
@Table(name = "P3A_CNTRIB")
public class P3aCntrib implements java.io.Serializable {

	private P3aCntribId id;
	private String bctCodbur;
	private String ctrCatego;
	private String ctrCodtva;
	private String actCodact;
	private Date ctrDatouv;
	private String ctrCessat;
	private Date ctrDatces;
	private String ctrRaison;
	private String ctrAdress;
	private String ctrObldir;
	private String ctrOblacp;
	private String ctrOblres;
	private String ctrOblfop;
	private String ctrObltfp;
	private String ctrObldco;
	private String ctrObltva;
	private String ctrOfodec;
	private String ctrOfodep;
	private String ctrOfodet;
	private String ctrOblaut;
	private String ctrOblass;
	private String ctrOdtimb;
	private String ctrObltcl;
	private String ctrObltho;
	private String ctrObldli;
	private String ctrObltvi;
	private String ctrRatiss;

	public P3aCntrib() {
	}

	public P3aCntrib(P3aCntribId id, String ctrCatego, String ctrRaison) {
		this.id = id;
		this.ctrCatego = ctrCatego;
		this.ctrRaison = ctrRaison;
	}

	public P3aCntrib(P3aCntribId id, String bctCodbur, String ctrCatego, String ctrCodtva, String actCodact,
			Date ctrDatouv, String ctrCessat, Date ctrDatces, String ctrRaison, String ctrAdress, String ctrObldir,
			String ctrOblacp, String ctrOblres, String ctrOblfop, String ctrObltfp, String ctrObldco, String ctrObltva,
			String ctrOfodec, String ctrOfodep, String ctrOfodet, String ctrOblaut, String ctrOblass, String ctrOdtimb,
			String ctrObltcl, String ctrObltho, String ctrObldli, String ctrObltvi, String ctrRatiss) {
		this.id = id;
		this.bctCodbur = bctCodbur;
		this.ctrCatego = ctrCatego;
		this.ctrCodtva = ctrCodtva;
		this.actCodact = actCodact;
		this.ctrDatouv = ctrDatouv;
		this.ctrCessat = ctrCessat;
		this.ctrDatces = ctrDatces;
		this.ctrRaison = ctrRaison;
		this.ctrAdress = ctrAdress;
		this.ctrObldir = ctrObldir;
		this.ctrOblacp = ctrOblacp;
		this.ctrOblres = ctrOblres;
		this.ctrOblfop = ctrOblfop;
		this.ctrObltfp = ctrObltfp;
		this.ctrObldco = ctrObldco;
		this.ctrObltva = ctrObltva;
		this.ctrOfodec = ctrOfodec;
		this.ctrOfodep = ctrOfodep;
		this.ctrOfodet = ctrOfodet;
		this.ctrOblaut = ctrOblaut;
		this.ctrOblass = ctrOblass;
		this.ctrOdtimb = ctrOdtimb;
		this.ctrObltcl = ctrObltcl;
		this.ctrObltho = ctrObltho;
		this.ctrObldli = ctrObldli;
		this.ctrObltvi = ctrObltvi;
		this.ctrRatiss = ctrRatiss;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "ctrMatfis", column = @Column(name = "CTR_MATFIS", nullable = false, length = 8)),
			@AttributeOverride(name = "ctrEtbsec", column = @Column(name = "CTR_ETBSEC", nullable = false, length = 3)) })
	public P3aCntribId getId() {
		return this.id;
	}

	public void setId(P3aCntribId id) {
		this.id = id;
	}

	@Column(name = "BCT_CODBUR", length = 3)
	public String getBctCodbur() {
		return this.bctCodbur;
	}

	public void setBctCodbur(String bctCodbur) {
		this.bctCodbur = bctCodbur;
	}

	@Column(name = "CTR_CATEGO", nullable = false, length = 1)
	public String getCtrCatego() {
		return this.ctrCatego;
	}

	public void setCtrCatego(String ctrCatego) {
		this.ctrCatego = ctrCatego;
	}

	@Column(name = "CTR_CODTVA", length = 1)
	public String getCtrCodtva() {
		return this.ctrCodtva;
	}

	public void setCtrCodtva(String ctrCodtva) {
		this.ctrCodtva = ctrCodtva;
	}

	@Column(name = "ACT_CODACT", length = 4)
	public String getActCodact() {
		return this.actCodact;
	}

	public void setActCodact(String actCodact) {
		this.actCodact = actCodact;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CTR_DATOUV", length = 7)
	public Date getCtrDatouv() {
		return this.ctrDatouv;
	}

	public void setCtrDatouv(Date ctrDatouv) {
		this.ctrDatouv = ctrDatouv;
	}

	@Column(name = "CTR_CESSAT", length = 1)
	public String getCtrCessat() {
		return this.ctrCessat;
	}

	public void setCtrCessat(String ctrCessat) {
		this.ctrCessat = ctrCessat;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CTR_DATCES", length = 7)
	public Date getCtrDatces() {
		return this.ctrDatces;
	}

	public void setCtrDatces(Date ctrDatces) {
		this.ctrDatces = ctrDatces;
	}

	@Column(name = "CTR_RAISON", nullable = false, length = 120)
	public String getCtrRaison() {
		return this.ctrRaison;
	}

	public void setCtrRaison(String ctrRaison) {
		this.ctrRaison = ctrRaison;
	}

	@Column(name = "CTR_ADRESS", length = 120)
	public String getCtrAdress() {
		return this.ctrAdress;
	}

	public void setCtrAdress(String ctrAdress) {
		this.ctrAdress = ctrAdress;
	}

	@Column(name = "CTR_OBLDIR", length = 1)
	public String getCtrObldir() {
		return this.ctrObldir;
	}

	public void setCtrObldir(String ctrObldir) {
		this.ctrObldir = ctrObldir;
	}

	@Column(name = "CTR_OBLACP", length = 1)
	public String getCtrOblacp() {
		return this.ctrOblacp;
	}

	public void setCtrOblacp(String ctrOblacp) {
		this.ctrOblacp = ctrOblacp;
	}

	@Column(name = "CTR_OBLRES", length = 1)
	public String getCtrOblres() {
		return this.ctrOblres;
	}

	public void setCtrOblres(String ctrOblres) {
		this.ctrOblres = ctrOblres;
	}

	@Column(name = "CTR_OBLFOP", length = 1)
	public String getCtrOblfop() {
		return this.ctrOblfop;
	}

	public void setCtrOblfop(String ctrOblfop) {
		this.ctrOblfop = ctrOblfop;
	}

	@Column(name = "CTR_OBLTFP", length = 1)
	public String getCtrObltfp() {
		return this.ctrObltfp;
	}

	public void setCtrObltfp(String ctrObltfp) {
		this.ctrObltfp = ctrObltfp;
	}

	@Column(name = "CTR_OBLDCO", length = 1)
	public String getCtrObldco() {
		return this.ctrObldco;
	}

	public void setCtrObldco(String ctrObldco) {
		this.ctrObldco = ctrObldco;
	}

	@Column(name = "CTR_OBLTVA", length = 1)
	public String getCtrObltva() {
		return this.ctrObltva;
	}

	public void setCtrObltva(String ctrObltva) {
		this.ctrObltva = ctrObltva;
	}

	@Column(name = "CTR_OFODEC", length = 1)
	public String getCtrOfodec() {
		return this.ctrOfodec;
	}

	public void setCtrOfodec(String ctrOfodec) {
		this.ctrOfodec = ctrOfodec;
	}

	@Column(name = "CTR_OFODEP", length = 1)
	public String getCtrOfodep() {
		return this.ctrOfodep;
	}

	public void setCtrOfodep(String ctrOfodep) {
		this.ctrOfodep = ctrOfodep;
	}

	@Column(name = "CTR_OFODET", length = 1)
	public String getCtrOfodet() {
		return this.ctrOfodet;
	}

	public void setCtrOfodet(String ctrOfodet) {
		this.ctrOfodet = ctrOfodet;
	}

	@Column(name = "CTR_OBLAUT", length = 1)
	public String getCtrOblaut() {
		return this.ctrOblaut;
	}

	public void setCtrOblaut(String ctrOblaut) {
		this.ctrOblaut = ctrOblaut;
	}

	@Column(name = "CTR_OBLASS", length = 1)
	public String getCtrOblass() {
		return this.ctrOblass;
	}

	public void setCtrOblass(String ctrOblass) {
		this.ctrOblass = ctrOblass;
	}

	@Column(name = "CTR_ODTIMB", length = 1)
	public String getCtrOdtimb() {
		return this.ctrOdtimb;
	}

	public void setCtrOdtimb(String ctrOdtimb) {
		this.ctrOdtimb = ctrOdtimb;
	}

	@Column(name = "CTR_OBLTCL", length = 1)
	public String getCtrObltcl() {
		return this.ctrObltcl;
	}

	public void setCtrObltcl(String ctrObltcl) {
		this.ctrObltcl = ctrObltcl;
	}

	@Column(name = "CTR_OBLTHO", length = 1)
	public String getCtrObltho() {
		return this.ctrObltho;
	}

	public void setCtrObltho(String ctrObltho) {
		this.ctrObltho = ctrObltho;
	}

	@Column(name = "CTR_OBLDLI", length = 1)
	public String getCtrObldli() {
		return this.ctrObldli;
	}

	public void setCtrObldli(String ctrObldli) {
		this.ctrObldli = ctrObldli;
	}

	@Column(name = "CTR_OBLTVI", length = 1)
	public String getCtrObltvi() {
		return this.ctrObltvi;
	}

	public void setCtrObltvi(String ctrObltvi) {
		this.ctrObltvi = ctrObltvi;
	}

	@Column(name = "CTR_RATISS", length = 1)
	public String getCtrRatiss() {
		return this.ctrRatiss;
	}

	public void setCtrRatiss(String ctrRatiss) {
		this.ctrRatiss = ctrRatiss;
	}

}
