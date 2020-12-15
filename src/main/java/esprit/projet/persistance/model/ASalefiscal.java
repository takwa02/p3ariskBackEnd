package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ASalefiscal generated by hbm2java
 */
@Entity
@Table(name = "A_SALEFISCAL")
public class ASalefiscal implements java.io.Serializable {

	private ASalefiscalId id;

	public ASalefiscal() {
	}

	public ASalefiscal(ASalefiscalId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "ctrMatfis", column = @Column(name = "CTR_MATFIS", length = 8)),
			@AttributeOverride(name = "critid", column = @Column(name = "CRITID", precision = 22, scale = 0)),
			@AttributeOverride(name = "salemorefiscal", column = @Column(name = "SALEMOREFISCAL", precision = 22, scale = 0)) })
	public ASalefiscalId getId() {
		return this.id;
	}

	public void setId(ASalefiscalId id) {
		this.id = id;
	}

}
