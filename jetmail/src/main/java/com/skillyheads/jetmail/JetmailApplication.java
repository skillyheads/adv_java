package com.skillyheads.jetmail;

import com.skillyheads.jetmail.services.MailSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class JetmailApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JetmailApplication.class, args);
	}

}
