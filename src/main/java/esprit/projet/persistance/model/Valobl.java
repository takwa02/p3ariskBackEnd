package esprit.projet.persistance.model;
// Generated 30 ao�t 2020 13:08:24 by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Valobl generated by hbm2java
 */
@Entity
@Table(name = "VALOBL")
public class Valobl implements java.io.Serializable {

	private ValoblId id;
	private Oblfis oblfis;
	private String oblLibval;

	public Valobl() {
	}

	public Valobl(ValoblId id, Oblfis oblfis) {
		this.id = id;
		this.oblfis = oblfis;
	}

	public Valobl(ValoblId id, Oblfis oblfis, String oblLibval) {
		this.id = id;
		this.oblfis = oblfis;
		this.oblLibval = oblLibval;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "oblValobl", column = @Column(name = "OBL_VALOBL", nullable = false, length = 1)),
			@AttributeOverride(name = "oblCodobl", column = @Column(name = "OBL_CODOBL", nullable = false, length = 2)) })
	public ValoblId getId() {
		return this.id;
	}

	public void setId(ValoblId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OBL_CODOBL", nullable = false, insertable = false, updatable = false)
	public Oblfis getOblfis() {
		return this.oblfis;
	}

	public void setOblfis(Oblfis oblfis) {
		this.oblfis = oblfis;
	}

	@Column(name = "OBL_LIBVAL", length = 90)
	public String getOblLibval() {
		return this.oblLibval;
	}

	public void setOblLibval(String oblLibval) {
		this.oblLibval = oblLibval;
	}

}
