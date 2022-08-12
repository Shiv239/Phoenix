package proj.springboot.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import proj.springboot.parking.booking_details;

import static org.aspectj.bridge.Version.getTime;
import static proj.springboot.parking.booking_details.*;
import static proj.springboot.service.UserServiceImpl.email_123;

@Service
public class EmailService {
	
	@Autowired
	JavaMailSender javaMailSender;

	public String sendEmail() {
		SimpleMailMessage message = new SimpleMailMessage();
		booking_details b = new booking_details();
		
		message.setFrom("ph14asdc@gmail.com");
		message.setTo(email_123);
		message.setSubject("Tranaction Successfull");
		message.setText("Place: "+b.getPlace()+" Time: " +b.getTime()+" Transaction ID: " + b.getTransactionId() +" Location: "+ b.getAddress());

		javaMailSender.send(message);
		
		return "Paypal_success";
	}
}
