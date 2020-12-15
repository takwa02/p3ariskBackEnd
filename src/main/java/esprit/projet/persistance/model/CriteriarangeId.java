package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CriteriarangeId generated by hbm2java
 */
@Embeddable
public class CriteriarangeId implements java.io.Serializable {

	private BigDecimal critid;
	private BigDecimal rangeid;
	private Double lowerlimit;
	private Double upperlimit;
	private BigDecimal score;

	public CriteriarangeId() {
	}

	public CriteriarangeId(BigDecimal critid, BigDecimal rangeid, Double lowerlimit, Double upperlimit,
			BigDecimal score) {
		this.critid = critid;
		this.rangeid = rangeid;
		this.lowerlimit = lowerlimit;
		this.upperlimit = upperlimit;
		this.score = score;
	}

	@Column(name = "CRITID", precision = 22, scale = 0)
	public BigDecimal getCritid() {
		return this.critid;
	}

	public void setCritid(BigDecimal critid) {
		this.critid = critid;
	}

	@Column(name = "RANGEID", precision = 22, scale = 0)
	public BigDecimal getRangeid() {
		return this.rangeid;
	}

	public void setRangeid(BigDecimal rangeid) {
		this.rangeid = rangeid;
	}

	@Column(name = "LOWERLIMIT", precision = 126, scale = 0)
	public Double getLowerlimit() {
		return this.lowerlimit;
	}

	public void setLowerlimit(Double lowerlimit) {
		this.lowerlimit = lowerlimit;
	}

	@Column(name = "UPPERLIMIT", precision = 126, scale = 0)
	public Double getUpperlimit() {
		return this.upperlimit;
	}

	public void setUpperlimit(Double upperlimit) {
		this.upperlimit = upperlimit;
	}

	@Column(name = "SCORE", precision = 22, scale = 0)
	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CriteriarangeId))
			return false;
		CriteriarangeId castOther = (CriteriarangeId) other;

		return ((this.getCritid() == castOther.getCritid()) || (this.getCritid() != null
				&& castOther.getCritid() != null && this.getCritid().equals(castOther.getCritid())))
				&& ((this.getRangeid() == castOther.getRangeid()) || (this.getRangeid() != null
						&& castOther.getRangeid() != null && this.getRangeid().equals(castOther.getRangeid())))
				&& ((this.getLowerlimit() == castOther.getLowerlimit()) || (this.getLowerlimit() != null
						&& castOther.getLowerlimit() != null && this.getLowerlimit().equals(castOther.getLowerlimit())))
				&& ((this.getUpperlimit() == castOther.getUpperlimit()) || (this.getUpperlimit() != null
						&& castOther.getUpperlimit() != null && this.getUpperlimit().equals(castOther.getUpperlimit())))
				&& ((this.getScore() == castOther.getScore()) || (this.getScore() != null
						&& castOther.getScore() != null && this.getScore().equals(castOther.getScore())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCritid() == null ? 0 : this.getCritid().hashCode());
		result = 37 * result + (getRangeid() == null ? 0 : this.getRangeid().hashCode());
		result = 37 * result + (getLowerlimit() == null ? 0 : this.getLowerlimit().hashCode());
		result = 37 * result + (getUpperlimit() == null ? 0 : this.getUpperlimit().hashCode());
		result = 37 * result + (getScore() == null ? 0 : this.getScore().hashCode());
		return result;
	}

}
