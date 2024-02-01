//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int initialBalance = 300;
        int payment = 1000;
        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int balance = initialBalance + payment + bonus;
        System.out.println("Ваш баланс " + balance + " рублей");

    }
}
