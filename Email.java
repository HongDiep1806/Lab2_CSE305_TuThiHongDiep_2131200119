package utils;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import model.User;

public class Email {

    public String getRandom() {
        Random random = new Random();
        int number = random.nextInt(999999);
        return String.format("%06d", number);
    }

    public boolean Email(User account) {
        boolean test = false;
        String toEmail = account.getEmail();
        final String fromEmail = "yuetsukuyo@gmail.com";
        final String password = "gaqpmklxuceyczjg";

        try {
            Properties pr = new Properties();
            pr.put("mail.smtp.auth", "true");
            pr.put("mail.smtp.starttls.enable", "true");
            pr.put("mail.smtp.host", "smtp.gmail.com");
            pr.put("mail.smtp.port", "25");
            pr.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            Session session = Session.getInstance(pr, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            });

            Message mess = new MimeMessage(session);

            mess.setFrom(new InternetAddress(fromEmail));
            mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            mess.setSubject("Order in Helendo");
            mess.setContent(
                     "\n"
                    + "Dear Customer.\n"
                    + "You have to put all the data from accurate information in order for us to reach your address to receive your package\n" 
                    + "Sincerely, \n"
                    + "Helendo \n"
                    + "Please do not reply this email. To get in touch with us, visit our Page", "text/html");
            Transport.send(mess);

            test = true;
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return test;
    }

}
