package com.nouvolution.testEmail;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {

	@Autowired
	private JavaMailSender mailSender;

	// mailSending
	@RequestMapping(value = "mailSending.do")
	public String mailSending(HttpServletRequest request) {

		String setfrom = "devaccte@gmail.com";
		String tomail = request.getParameter("tomail"); // Receiver email.
		String title = request.getParameter("title"); // Title.
		String content = request.getParameter("content"); // Content.

		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

			messageHelper.setFrom(setfrom); //must be setup. 
			messageHelper.setTo(tomail); 
			messageHelper.setSubject(title); 
			messageHelper.setText(content); 

			mailSender.send(message);
		} catch (Exception e) {
			System.out.println(e);
		}

		return "home";
	}
}