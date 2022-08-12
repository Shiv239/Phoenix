package proj.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import proj.springboot.email.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailService;

	@GetMapping({"/email"})
	public String sendEmail() {
		return emailService.sendEmail();
	}
}
