public class OOPS {
    public static void main(String[] args) {
        bankAcc myAcc=new bankAcc();
        myAcc.name="om";
        myAcc.setPassword("password");

        
    }
    
}
class bankAcc{
    public String name;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
