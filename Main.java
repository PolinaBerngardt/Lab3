package Reice;

/**
 * @brief Главный класс программы.
 */
public class Main {

    /**
     * @brief Точка входа в программу.
     * @param args Аргументы командной строки.
     *             \image html parovozic.png width=500cm
     * \f[
     * |I_2|=\left| \int_{0}^T \psi(t)
     * \left\{
     * u(a,t)-
     * \int_{\gamma(t)}^a
     * \frac{d\theta}{k(\theta,t)}
     * \int_{a}^\theta c(\xi)u_t(\xi,t)\,d\xi
     * \right\} dt
     * \right|
     * \f]
     *
     */
    public static void main(String[] args) {
        // Создание трех объектов класса This_Reice
        This_Reice reice1 = new This_Reice();
        This_Reice reice2 = new This_Reice();
        This_Reice reice3 = new This_Reice();

        System.out.print("Рейс Москва-Анапа: \n");
        // Ввод данных для первого рейса
        reice1.Read();
        System.out.print("Рейс Москва-Саранск: \n");
        // Ввод данных для второго рейса
        reice2.Read();
        // Инициализация данных для третьего рейса
        reice3.Init(7500,540);

        // Создание объекта класса All_Reice, передача ему трех рейсов
        All_Reice all_reice = new All_Reice(reice1, reice2, reice3);

        // Вывод информации о всех рейсах
        all_reice.Display();

        // Вычисление общей ожидаемой суммы продаж
        int total_sales = all_reice.Total();
        System.out.print("Общая ожидаемая сумма продаж:  "+total_sales );

        System.out.print("\nРейс с максимальной ожидаемой суммой продаж:  " );
        // Вывод рейса с максимальной ожидаемой суммой продаж
        all_reice.GetMax();
    }
}
