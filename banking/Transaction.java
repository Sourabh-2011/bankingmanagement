package banking;

public class Transaction {
	private int tranNumber;
    private String actNumber;
    private long tranAmount;
    private String tranType;
    private long balanceAfterThisTransaction;
    public Transaction() {
        super();
    }
    public Transaction(int tranNumber, String actNumber, long tranAmount, String tranType, long balanceAfterThisTransaction) {
        super();
        this.tranNumber = tranNumber;
        this.actNumber = actNumber;
        this.tranAmount = tranAmount;
        this.tranType = tranType;
        this.balanceAfterThisTransaction = balanceAfterThisTransaction;
    }
    public int getTranNumber() {
        return tranNumber;
    }
    public void setTranNumber(int tranNumber) {
        this.tranNumber = tranNumber;
    }
    public String getActNumber() {
        return actNumber;
    }
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }
    public long getTranAmount() {
    	return tranAmount;
    }
    public void setTranAmount (long tranAmount) {
        this.tranAmount = tranAmount;
    }
    public String getTranType() {
        return tranType;
    }
    public void setTranType(String tranType) {
        this.tranType = tranType;
    }
    public long getBalanceAfterThisTransaction() {
        return balanceAfterThisTransaction;
    }
    public void setBalanceAfterThisTransaction(long balanceAfterThisTransaction) {
        this.balanceAfterThisTransaction = balanceAfterThisTransaction;
    }
}
