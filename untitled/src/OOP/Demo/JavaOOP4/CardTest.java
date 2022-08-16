package OOP.Demo.JavaOOP4;

public class CardTest {
    public static void main(String[] args) {
        Card card=new Card("123456",123,1000);
        card.getMoney(123);//查看钱
        card.setPassword(123,321);//改密码
        card.delMoney(321,300);//输入密码，取钱
        card.getMoney(321);
        card.setMoney(3000);//存钱
        card.getMoney(321);

    }
}
