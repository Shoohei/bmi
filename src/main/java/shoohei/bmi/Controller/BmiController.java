package shoohei.bmi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiController {

	@GetMapping("bmi")
	public String calculateBmi(Integer weight, Double height) {
		
		return "TODO 2 : " + weight + height;
	}
}
