package org.naren.com.EurekhaConsumer.Controller;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsurmerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("getDatt")
	public String getDataConsure() {
		String url="http://PRODUCER/producer/getport";
		return restTemplate.getForObject(url, String.class);
	}
}
