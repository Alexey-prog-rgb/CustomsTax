//TIP Для <b>запуска</b> кода нажмите <shortcut actionId="Run"/> или
// щелкните значок <icon src="AllIcons.Actions.Execute"/> в боковой области.
import java.util.Scanner;

public class Main {

    public static int calulateCustoms(double price, double weight){
        int tax = (int)(price * 0.01 + 100 * weight);
        return tax;
    }


    public static void main(String[] args) {
        // Приветствие
        System.out.println("Довро пожаловать в калькулятор таможенной пошлины!");

        // Ввод стоимоси
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость товара (руб.): ");
        double price = scanner.nextDouble();

        // Ввод веса
        System.out.print("Введите вес товара (кг): ");
        double weight = scanner.nextDouble();

        // Расчёт пошлины
        int tax = calulateCustoms(price, weight);

        // Вывод пошлины
        System.out.println("Ваша таможенная пошлина: " + tax + " рублей!");
        System.out.println("Спасибо за использование нашего калькулятора!");
    }
}
