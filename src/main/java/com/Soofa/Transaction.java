package com.Soofa;


public class Transaction
{
    private String status;
    private String sender_currency;
    private String receiver_currency;
    private String tid;
    private String reference;
    private String receipt_no;
    private float timestamp;
    private float gross_amount;
    private float net_amount;
    private String transacted_via;
    private boolean is_money_in;
    private String sender;
    private String receiver;


    // Getter Methods

    public String getStatus() {
        return status;
    }

    public String getSender_currency() {
        return sender_currency;
    }

    public String getReceiver_currency() {
        return receiver_currency;
    }

    public String getTid() {
        return tid;
    }

    public String getReference() {
        return reference;
    }

    public String getReceipt_no() {
        return receipt_no;
    }

    public float getTimestamp() {
        return timestamp;
    }

    public float getGross_amount() {
        return gross_amount;
    }

    public float getNet_amount() {
        return net_amount;
    }

    public String getTransacted_via() {
        return transacted_via;
    }

    public boolean getIs_money_in() {
        return is_money_in;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    // Setter Methods

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSender_currency(String sender_currency) {
        this.sender_currency = sender_currency;
    }

    public void setReceiver_currency(String receiver_currency) {
        this.receiver_currency = receiver_currency;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setReceipt_no(String receipt_no) {
        this.receipt_no = receipt_no;
    }

    public void setTimestamp(float timestamp) {
        this.timestamp = timestamp;
    }

    public void setGross_amount(float gross_amount) {
        this.gross_amount = gross_amount;
    }

    public void setNet_amount(float net_amount) {
        this.net_amount = net_amount;
    }

    public void setTransacted_via(String transacted_via) {
        this.transacted_via = transacted_via;
    }

    public void setIs_money_in(boolean is_money_in) {
        this.is_money_in = is_money_in;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "status='" + status + '\'' +
                ", sender_currency='" + sender_currency + '\'' +
                ", receiver_currency='" + receiver_currency + '\'' +
                ", tid='" + tid + '\'' +
                ", reference='" + reference + '\'' +
                ", receipt_no='" + receipt_no + '\'' +
                ", timestamp=" + timestamp +
                ", gross_amount=" + gross_amount +
                ", net_amount=" + net_amount +
                ", transacted_via='" + transacted_via + '\'' +
                ", is_money_in=" + is_money_in +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
