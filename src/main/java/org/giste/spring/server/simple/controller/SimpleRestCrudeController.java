package org.giste.spring.server.simple.controller;

import org.giste.spring.server.controller.RestCrudeController;
import org.giste.spring.server.simple.dto.SimpleNonRemovableDto;
import org.giste.spring.server.simple.service.SimpleCrudeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simples")
public class SimpleRestCrudeController extends RestCrudeController<SimpleNonRemovableDto> {

	public SimpleRestCrudeController(SimpleCrudeService service) {
		super(service);
	}

}
