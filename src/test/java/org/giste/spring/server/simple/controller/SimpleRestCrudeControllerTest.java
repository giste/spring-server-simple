package org.giste.spring.server.simple.controller;

import org.giste.spring.server.controller.RestCrudeControllerTest;
import org.giste.spring.server.service.CrudeService;
import org.giste.spring.server.simple.controller.SimpleRestCrudeController;
import org.giste.spring.server.simple.dto.SimpleNonRemovableDto;
import org.giste.spring.server.simple.service.SimpleCrudeService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(SimpleRestCrudeController.class)
public class SimpleRestCrudeControllerTest extends RestCrudeControllerTest<SimpleNonRemovableDto> {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private SimpleCrudeService service;
	
	@Override
	protected CrudeService<SimpleNonRemovableDto> getService() {
		return service;
	}

	@Override
	protected SimpleNonRemovableDto getNewDto() {
		return new SimpleNonRemovableDto(1L, true);
	}

	@Override
	protected String getBasePath() {
		return "/simples";
	}

	@Override
	protected MockMvc getMockMvc() {
		return mvc;
	}

}
