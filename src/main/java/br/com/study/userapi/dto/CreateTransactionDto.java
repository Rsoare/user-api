package br.com.study.userapi.dto;

public class CreateTransactionDto {
    private long payer_id;

    private long Payee_id;

    private float value;

    public long getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(long payer_id) {
        this.payer_id = payer_id;
    }

    public long getPayee_id() {
        return Payee_id;
    }

    public void setPayee_id(long payee_id) {
        Payee_id = payee_id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}



