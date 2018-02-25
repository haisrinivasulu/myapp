package com.myapp.mail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;

public class SendMail {

	public static Properties prop;
	final static Logger log = Logger.getLogger(SendMail.class);

	static {
		try {
			prop = new Properties();
			prop.load(SendMail.class.getClassLoader().getResourceAsStream("email.properties"));
		} catch (IOException e) {
			log.info("email.properties not found in class path , " + e.getMessage());
		}

	}

	@SuppressWarnings("null")
	public void notifyErrorMsg(String message) throws Exception {
		ArrayList<String> ccEmaillist = new ArrayList<String>();
		String ccList = prop.getProperty("mail.cc.emaillist");
		String[] list = ccList.split(",");

		for (String string : list) {
			ccEmaillist.add(string);
		}
		ArrayList<String> recipients = new ArrayList<String>();
		String toEmail = prop.getProperty("mail.to.emaillist");
		String[] list1 = toEmail.split(",");

		for (String string : list1) {
			recipients.add(string);
		}
		// EmailHandler.sendEmail(prop, recipients, ccEmaillist, null, message, null,
		// null, true);//(emailProperties, recipients, ccEmaillist, message);
	}

	public static void main(String[] args) throws Exception {
		SendMail mail = new SendMail();
		mail.notifyErrorMsg("Exception");
	}
}
