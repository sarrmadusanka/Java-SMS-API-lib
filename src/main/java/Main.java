import dto.Msisdn;
import dto.SendTextBody;
import dto.TokenBody;
import dto.TransactionBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{

        TokenBody tokenBody = new TokenBody();

        tokenBody.setUsername("sadisha");
        tokenBody.setPassword("Admin123!");

        SendSMSImpl sendSMS = new SendSMSImpl();

        SendTextBody sendTextBody = new SendTextBody();

        sendTextBody.setMsisdn(sendSMS.setMsisdns(new String[]{"716843099", "719012099"}));
        sendTextBody.setSourceAddress("sadisha 514");
        sendTextBody.setMessage("Hi! this is test from JAVA lib");
        sendTextBody.setTransaction_id("144");

        TransactionBody transactionBody = new TransactionBody();
        transactionBody.setTransaction_id("144");

        System.out.println(sendSMS.sendText(sendTextBody, sendSMS.getToken(tokenBody).getToken()).getStatus());
        System.out.println(sendSMS.getTransactionIDStatus(transactionBody,sendSMS.getToken(tokenBody).getToken()).getDataTransaction().getCampaign_status());
    }
}
