package com.Soofa;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
public class SoofaPay {
    private Client client;
    private WebResource target;
    private String TILL_NO;
    private  String Client_Secret;
    public  Balance GetBalance()
    {
        String url= "https://api.soofapay.com/v1/balance/";
        client =Client.create();
        target = client.resource(url);
        ClientResponse response = target.accept(MediaType.APPLICATION_JSON).
                header("Authorization","Token "+Client_Secret)
                .header("X-TILL",TILL_NO)
                .get(ClientResponse.class);
        ObjectMapper mapper = new ObjectMapper();
        String output = response.getEntity(String.class);
        Balance balance=null;
        try {
            balance = mapper.readValue(output, Balance.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  balance;
    }
    public  Transaction GetTransaction(String transactionId) {
        String url="https://api.soofapay.com/v1/transactions/"+transactionId;
        client =Client.create();
        target = client.resource(url);
        ClientResponse response = target.accept(MediaType.APPLICATION_JSON).
                header("Authorization","Token "+Client_Secret)
                .header("X-TILL",TILL_NO)
                .get(ClientResponse.class);
        String output = response.getEntity(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Transaction transaction = null;
        try {
            transaction = mapper.readValue(output, Transaction.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  transaction;
    }
    public SoofaPay(String till_no, String client_Secret)
    {
        TILL_NO = till_no;
        Client_Secret = client_Secret;
    }
}
