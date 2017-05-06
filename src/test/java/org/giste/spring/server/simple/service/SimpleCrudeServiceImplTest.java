package org.giste.spring.server.simple.service;

import org.giste.spring.server.repository.CrudeRepository;
import org.giste.spring.server.service.CrudeServiceImpl;
import org.giste.spring.server.service.CrudeServiceImplTest;
import org.giste.spring.server.simple.dto.SimpleNonRemovableDto;
import org.giste.spring.server.simple.entity.SimpleNonRemovableEntity;
import org.giste.spring.server.simple.repository.SimpleCrudeRepository;
import org.giste.spring.server.simple.service.SimpleCrudeServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SimpleCrudeServiceImplTest extends CrudeServiceImplTest<SimpleNonRemovableDto, SimpleNonRemovableEntity> {

	@MockBean
	private SimpleCrudeRepository repository;
	
	@Override
	protected CrudeRepository<SimpleNonRemovableEntity> getRepositoryMock() {
		return repository;
	}

	@Override
	protected CrudeServiceImpl<SimpleNonRemovableDto, SimpleNonRemovableEntity> getService() {
		return new SimpleCrudeServiceImpl(repository);
	}

	@Override
	protected SimpleNonRemovableEntity getNewEntity() {
		return new SimpleNonRemovableEntity(1L, true);
	}

}
