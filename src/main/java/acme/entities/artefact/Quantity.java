package acme.entities.artefact;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import acme.entities.toolkit.Toolkit;
import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Quantity extends AbstractEntity {
	
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	@Min(1)
	protected int number;
		
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
		
	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Artefact artefact;
		
	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Toolkit toolkit;

}
