/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author votha
 */
public class GuiMail {
    public void GuiHoaDon(String nguoiN, String noiD) throws MessagingException, UnsupportedEncodingException{
//        final String fromEmail = "nghenhacvui2022@gmail.com";
//        // Mat khai email cua ban
//        final String password = "hqxmgeorzceilvwh";
//        // dia chi email nguoi nhan
        final String fromEmail = "vothanhdo113114@yahoo.com";
        // Mat khai email cua ban
        final String password = "pifbjnmaifqjvwsd";
        // dia chi email nguoi nhan
        final String toEmail = nguoiN;

        final String subject = "Hóa Đơn Mua Hàng Ngày: " + java.time.LocalDate.now() + " " +java.time.LocalTime.now() ;
        final String body = noiD;

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.mail.yahoo.com"); //SMTP Host
        //props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session session = Session.getInstance(props, auth);
	//

        MimeMessage msg = new MimeMessage(session);
        //set message headers
        msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
        msg.addHeader("format", "flowed");
        msg.addHeader("Content-Transfer-Encoding", "8bit");

        msg.setFrom(new InternetAddress(fromEmail, "Cửa Hàng Đá Quý ABC"));

        msg.setReplyTo(InternetAddress.parse(fromEmail, false));

        msg.setSubject(subject, "UTF-8");

        msg.setText(body, "UTF-8");

        msg.setSentDate(new Date());

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
        Transport.send(msg);
        System.out.println("Gui mail thanh cong");
    }
  

    
}
