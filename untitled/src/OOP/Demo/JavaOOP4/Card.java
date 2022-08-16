package OOP.Demo.JavaOOP4;

/*2、
	编写银行卡类:
	包含属性卡号,密码和余额,要求卡号不能修改,
	密码修改需要提供原密码,不能被查看,余额不能为负数,
	取钱和查看需要密码验证,存钱不需要密码*/
public class Card {
    private String id;
    private int password;
    private double money;

    public Card(String id, int password, double money) {
        this.id = id;
        this.password = password;
        this.money = money;
        if (money < 0){
            System.out.println("余额不能为负数");
            this.money = 0;
        }
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

//    public int getPassword() {
//        return password;
//    }

    public void setPassword(int OldPassword,int NewPassword) {
       // this.password = password;
        if (OldPassword==this.password){
            this.password = NewPassword;
        }else {
            System.out.println("密码输入错误，更改失败");
        }
    }

    //取钱
    public void delMoney(int password , double money){
        if (password == this.password){
            if (money > this.money){
                System.out.println("余额不足");
            }else {
                this.money = this.money - money;
            }
        }
    }
    //查看
    public void getMoney(int password) {
        if (password == this.password){
            System.out.println(this.money);
        }else {
            System.out.println("密码输入错误");
        }
    }

    //存钱
    public void setMoney(double many) {
        this.money += many;
    }
}
