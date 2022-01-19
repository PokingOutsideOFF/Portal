package Project;

public class Wallet implements java.io.Serializable {
private String userName;
private float amount;
public Wallet(String userName, float amount) {
super();
this.userName = userName;
this.amount = amount;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
public float getAmount() {
return amount;
}
public void setAmount(float amount) {
this.amount = amount;
}
@Override
public String toString() {
return userName+" you have Rs. "+amount+" in your wallet";
}
}