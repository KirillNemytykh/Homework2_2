
public class Main {
    public static void main(String[] args) {

        int phoneBalance = 100; // Изначальный баланс телефона
        int bonusBalance = 1; // Бонус за пополнение счета за каждые 100р
        int deposit = 1300; // Сумма пополнения счета телефона

        if (deposit > 1000) {
            System.out.println("Баланс телефона");
            System.out.println(phoneBalance + deposit + deposit / 100);
        } else {
            System.out.println("Баланс телефона");
            System.out.println(phoneBalance + deposit);
        }
    }
}