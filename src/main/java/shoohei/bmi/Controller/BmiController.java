package shoohei.bmi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BmiController {

	@GetMapping("bmi")
	public String calculateBmi(Integer weight, Double height) {
		System.out.println("calculateBmi ");
		double bmiNumber = weight / (height * height);
		String bmiDescription;
		if (bmiNumber <= 18.5) {
			bmiDescription = "Underweight";
		} else if (bmiNumber <= 25) {
			bmiDescription = "Normal range";
		} else if (bmiNumber <= 30) {
			bmiDescription = "Pre-obese";
		} else if (bmiNumber <= 35) {
			bmiDescription = "Obese class I";
		} else if (bmiNumber <= 40) {
			bmiDescription = "Obese class II";
		} else {
			bmiDescription = "Obese class III";
		}
		String result = "BMI: " + bmiNumber + " (" + bmiDescription + ")";
		System.out.println(result);


		return result;
		
	}
}
