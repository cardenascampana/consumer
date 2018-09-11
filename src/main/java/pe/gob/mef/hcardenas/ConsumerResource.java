package pe.gob.mef.hcardenas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerResource {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/rest/consumer/{user}")
	public String usuario(@PathVariable("user") String user) {
		//String url ="http://hcardenas-producer/rest/producer/" + user;
		String url ="http://localhost:8071/rest/producer/" + user;
		return restTemplate.getForObject(url,String.class);
	}
}
