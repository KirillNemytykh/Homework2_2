
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int PhoneBalance = 100; // Изначальный баланс телефона
        int BonusBalance = 1; // Бонус за пополнение счета за каждые 100р
        int Deposit = 1300; // Сумма пополнения счета телефона

        if (Deposit > 1000) {
            System.out.println("Баланс телефона");
            System.out.println(PhoneBalance + Deposit + Deposit / 100);
        } else {
            System.out.println("Баланс телефона");
            System.out.println(PhoneBalance + Deposit);
        }
    }
}