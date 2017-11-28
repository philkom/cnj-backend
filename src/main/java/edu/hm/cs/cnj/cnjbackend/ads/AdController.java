package edu.hm.cs.cnj.cnjbackend.ads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/adproxy")
public class AdController {

	@Autowired
	AdClient adClient;
	
	@GetMapping
	ResponseEntity<String> getAd() {
		return ResponseEntity.ok(adClient.findAd());
	}
}
