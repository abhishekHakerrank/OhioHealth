package com.ohiohealth.notification.notificationservice;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${email.to}")
	private String emailTo;
	
	@Value("${email.text}")
	private String emailText;
	
	@Value("${email.subject}")
	private String emailSubject;
	
	 @RequestMapping("/sendMail")
	    public String sendMail() {
	        MimeMessage message = javaMailSender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);
	        try {
	            helper.setTo(emailTo);
	            helper.setText(emailText);
	            helper.setSubject(emailSubject);
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            return "Error while sending mail ..";
	        }
	        javaMailSender.send(message);
	        return "Mail Sent Success!";
	    }

}
