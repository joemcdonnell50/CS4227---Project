package HotelSystem.Entities;


public class User implements Entity{
    
    private int user_id;
    private String user_name;
    private String password;
    private String first_name;
    private String last_name;
    private String email_address;
    private int loyalty_level;
    private String name_on_card;
    private String credit_card_number;
    private int cvv;
    private String expiry;
    
    private  static User loggedUser;

    public static User getLoggedUser(){
        return loggedUser;
    }
    
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setLoyalty_level(int loyalty_level) {
        this.loyalty_level = loyalty_level;
    }
    
    public void setLoggerUser(User user){
        this.loggedUser = user;
    }
    
    public void setName_on_card(String name_on_card){
        this.name_on_card = name_on_card;
    }
    
    public void setCredit_card_number(String credit_card_number){
        this.credit_card_number = credit_card_number;
    }
    
    public void setCvv(int cvv){
        this.cvv = cvv;
    }
    
    public void setExpiry(String expiry){
        this.expiry = expiry;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public int getLoyalty_level() {
        return loyalty_level;
    }
    
    public String getName_on_card(){
        return name_on_card;
    }
    
    public String getCredit_card_number(){
        return credit_card_number;
    }
    
    public int getCvv(){
        return cvv;
    }
    
    public String getExpiry(){
        return expiry;
    }
}
