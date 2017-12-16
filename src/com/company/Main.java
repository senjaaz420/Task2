package com.company;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Main {

    public static void main(String[] args) {
        SendEmail se = new SendEmail();
        String to = "ПОЧТАкудаОТПРАВИТЬ@gmail.com";
        String from = "почтаотпраки@gmail.com";
        final String username = "почтаотправки";
        final String password = "*****";
        String host = "smtp.gmail.com";
        se.SendingMessage(to, from, username, password, host);

   }
}
