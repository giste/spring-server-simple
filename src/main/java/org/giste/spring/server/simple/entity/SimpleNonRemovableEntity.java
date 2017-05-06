package org.giste.spring.server.simple.entity;
import javax.persistence.Entity;

import org.giste.spring.server.entity.NonRemovableEntity;

@Entity
public class SimpleNonRemovableEntity extends NonRemovableEntity {

	private static final long serialVersionUID = 4570558194177329729L;

	public SimpleNonRemovableEntity() {
		super();
	}

	public SimpleNonRemovableEntity(Long id, boolean enabled) {
		super(id, enabled);
	}

}
