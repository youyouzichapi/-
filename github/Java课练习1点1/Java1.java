package Java课练习1点1;
//封装练习
public class Java1 {
    private String name;
    private double balance;
    private String pwd;
    public Java1()
    {

    }
    public Java1(String name , double balance,String pwd)
    {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4)
        {
            this.name = name;
        }
        else {
            System.out.println("姓名有要求，默认值为“无名”");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20)
        {
            this.balance = balance;
        }
        else {
            System.out.println("余额必须大于");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length()==6)
        {
            this.pwd = pwd;
        }
        else
        {
            System.out.println("默认密码为:000000");
        }
    }
    public void  showInfo()
    {
        System.out.println("信息为 name =" + name + "年龄 ="+ balance + "薪水=" +pwd);
    }
}
