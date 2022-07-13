package acme.entities.chirp;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Chirp extends AbstractEntity{
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	protected Date           	creationMoment;
	
	
	@Length(min= 1, max= 101)
	@NotBlank
	protected String			title;
	
	@Length(min= 1, max= 101)
	@NotBlank
	protected String			author;
	
	
	@Length(min= 1, max= 256)
	@NotBlank
	protected String			body;
	
	
	@Email
	protected String			email;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
