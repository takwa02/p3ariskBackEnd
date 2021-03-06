package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * P3aBurcen generated by hbm2java
 */
@Entity
@Table(name = "P3A_BURCEN")
public class P3aBurcen implements java.io.Serializable {

	private P3aBurcenId id;

	public P3aBurcen() {
	}

	public P3aBurcen(P3aBurcenId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "bctCodbur", column = @Column(name = "BCT_CODBUR", nullable = false, length = 3)),
			@AttributeOverride(name = "bctLibell", column = @Column(name = "BCT_LIBELL", length = 60)),
			@AttributeOverride(name = "bctCodcen", column = @Column(name = "BCT_CODCEN", length = 3)),
			@AttributeOverride(name = "bctTypstr", column = @Column(name = "BCT_TYPSTR", length = 1)) })
	public P3aBurcenId getId() {
		return this.id;
	}

	public void setId(P3aBurcenId id) {
		this.id = id;
	}

}
