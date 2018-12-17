package com.gt.feign.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gt.feign.dto.Bullone;

@RestController
class CancellettoEndPoint {

	Logger logger = LoggerFactory.getLogger(CancellettoEndPoint.class);

	CancellettoEndPoint() {
	}

	@GetMapping("/bullone")
	List<Bullone> all() {
		logger.info("XXXXX all  " );
		List<Bullone> lista = new ArrayList<Bullone>();
		lista.add(new Bullone(1));
		lista.add(new Bullone(2));
		lista.add(new Bullone(3));
		return lista;
	}

	@PostMapping("/bullone")
	Bullone newBullone(@RequestBody Bullone bullone) {
		logger.info("XXXXX newBullone  " +bullone.toString());
		return new Bullone();
	}

	// Single item

	@GetMapping("/bullone/{id}")
	Bullone getBullone(@PathVariable Long id) {
		logger.info("XXXXX getBullone  " +id);

		return new Bullone(id);
	}

	@PutMapping("/bullone/{id}")
	Bullone replaceBullone(@RequestBody Bullone bullone, @PathVariable Long id) {
		logger.info("XXXXX replaceBullone  " +bullone.toString());
		return new Bullone();
	}

	@DeleteMapping("/bullone/{id}")
	void deleteBullone(@PathVariable Long id) {
	}
}