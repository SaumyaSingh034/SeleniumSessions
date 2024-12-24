package MailValidation;


import java.util.Properties;

public class MailInboxValidation {

    private void getLatestEmailValidation(String host, String userName, String password, String subject){
        Properties prop = new Properties();
        prop.put("mail.store.protocol","imaps");

        //Session session = Session.getDefaultInstance(prop, null);

    }
}
