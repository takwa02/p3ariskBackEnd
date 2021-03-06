package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CriteriaAvgId generated by hbm2java
 */
@Embeddable
public class CriteriaAvgId implements java.io.Serializable {

	private Short criteriaYear;
	private Short actSec;
	private Character ctrCatego;
	private String toGroup;
	private BigDecimal criteriaId;
	private BigDecimal tpCount;
	private BigDecimal critAvg;

	public CriteriaAvgId() {
	}

	public CriteriaAvgId(Short criteriaYear, Short actSec, Character ctrCatego, String toGroup, BigDecimal criteriaId,
			BigDecimal tpCount, BigDecimal critAvg) {
		this.criteriaYear = criteriaYear;
		this.actSec = actSec;
		this.ctrCatego = ctrCatego;
		this.toGroup = toGroup;
		this.criteriaId = criteriaId;
		this.tpCount = tpCount;
		this.critAvg = critAvg;
	}

	@Column(name = "CRITERIA_YEAR", precision = 4, scale = 0)
	public Short getCriteriaYear() {
		return this.criteriaYear;
	}

	public void setCriteriaYear(Short criteriaYear) {
		this.criteriaYear = criteriaYear;
	}

	@Column(name = "ACT_SEC", precision = 4, scale = 0)
	public Short getActSec() {
		return this.actSec;
	}

	public void setActSec(Short actSec) {
		this.actSec = actSec;
	}

	@Column(name = "CTR_CATEGO", length = 1)
	public Character getCtrCatego() {
		return this.ctrCatego;
	}

	public void setCtrCatego(Character ctrCatego) {
		this.ctrCatego = ctrCatego;
	}

	@Column(name = "TO_GROUP", length = 4)
	public String getToGroup() {
		return this.toGroup;
	}

	public void setToGroup(String toGroup) {
		this.toGroup = toGroup;
	}

	@Column(name = "CRITERIA_ID", precision = 22, scale = 0)
	public BigDecimal getCriteriaId() {
		return this.criteriaId;
	}

	public void setCriteriaId(BigDecimal criteriaId) {
		this.criteriaId = criteriaId;
	}

	@Column(name = "TP_COUNT", precision = 22, scale = 0)
	public BigDecimal getTpCount() {
		return this.tpCount;
	}

	public void setTpCount(BigDecimal tpCount) {
		this.tpCount = tpCount;
	}

	@Column(name = "CRIT_AVG", precision = 38, scale = 15)
	public BigDecimal getCritAvg() {
		return this.critAvg;
	}

	public void setCritAvg(BigDecimal critAvg) {
		this.critAvg = critAvg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CriteriaAvgId))
			return false;
		CriteriaAvgId castOther = (CriteriaAvgId) other;

		return ((this.getCriteriaYear() == castOther.getCriteriaYear()) || (this.getCriteriaYear() != null
				&& castOther.getCriteriaYear() != null && this.getCriteriaYear().equals(castOther.getCriteriaYear())))
				&& ((this.getActSec() == castOther.getActSec()) || (this.getActSec() != null
						&& castOther.getActSec() != null && this.getActSec().equals(castOther.getActSec())))
				&& ((this.getCtrCatego() == castOther.getCtrCatego()) || (this.getCtrCatego() != null
						&& castOther.getCtrCatego() != null && this.getCtrCatego().equals(castOther.getCtrCatego())))
				&& ((this.getToGroup() == castOther.getToGroup()) || (this.getToGroup() != null
						&& castOther.getToGroup() != null && this.getToGroup().equals(castOther.getToGroup())))
				&& ((this.getCriteriaId() == castOther.getCriteriaId()) || (this.getCriteriaId() != null
						&& castOther.getCriteriaId() != null && this.getCriteriaId().equals(castOther.getCriteriaId())))
				&& ((this.getTpCount() == castOther.getTpCount()) || (this.getTpCount() != null
						&& castOther.getTpCount() != null && this.getTpCount().equals(castOther.getTpCount())))
				&& ((this.getCritAvg() == castOther.getCritAvg()) || (this.getCritAvg() != null
						&& castOther.getCritAvg() != null && this.getCritAvg().equals(castOther.getCritAvg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCriteriaYear() == null ? 0 : this.getCriteriaYear().hashCode());
		result = 37 * result + (getActSec() == null ? 0 : this.getActSec().hashCode());
		result = 37 * result + (getCtrCatego() == null ? 0 : this.getCtrCatego().hashCode());
		result = 37 * result + (getToGroup() == null ? 0 : this.getToGroup().hashCode());
		result = 37 * result + (getCriteriaId() == null ? 0 : this.getCriteriaId().hashCode());
		result = 37 * result + (getTpCount() == null ? 0 : this.getTpCount().hashCode());
		result = 37 * result + (getCritAvg() == null ? 0 : this.getCritAvg().hashCode());
		return result;
	}

}
