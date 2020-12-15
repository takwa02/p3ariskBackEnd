package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Criteriagroup generated by hbm2java
 */
@Entity
@Table(name = "CRITERIAGROUP")
public class Criteriagroup implements java.io.Serializable {

	private CriteriaGroupId id;

	public Criteriagroup() {
	}

	public Criteriagroup(CriteriaGroupId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "actsec", column = @Column(name = "ACTSEC", precision = 22, scale = 0)),
			@AttributeOverride(name = "ctrCatego", column = @Column(name = "CTR_CATEGO", length = 1)),
			@AttributeOverride(name = "togroup", column = @Column(name = "TOGROUP", length = 4)),
			@AttributeOverride(name = "crityear", column = @Column(name = "CRITYEAR", precision = 22, scale = 0)) })
	public CriteriaGroupId getId() {
		return this.id;
	}

	public void setId(CriteriaGroupId id) {
		this.id = id;
	}

}
