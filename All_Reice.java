package Reice;

import java.util.Scanner;

/**
 * @brief Класс, представляющий совокупность нескольких рейсов.
 */
public class All_Reice{
    Scanner imp=new Scanner(System.in);
    private This_Reice Reice_1; /**< Первый рейс. */
    private This_Reice Reice_2; /**< Второй рейс. */
    private This_Reice Reice_3; /**< Третий рейс. */
    int fill_Reice_1; /**< Процент заполнения первого рейса. */
    int fill_Reice_2; /**< Процент заполнения второго рейса. */
    int fill_Reice_3; /**< Процент заполнения третьего рейса. */

    /**
     * @brief Конструктор класса.
     * @param Reice_1 Первый рейс.
     * @param Reice_2 Второй рейс.
     * @param Reice_3 Третий рейс.
     */
    public All_Reice(This_Reice Reice_1, This_Reice Reice_2, This_Reice Reice_3) {
        this.Reice_1 = Reice_1;
        this.Reice_2 = Reice_2;
        this.Reice_3 = Reice_3;
        this.fill_Reice_1 = 0; /**< Инициализация процента заполнения первого рейса. */
        this.fill_Reice_2 = 0; /**< Инициализация процента заполнения второго рейса. */
        this.fill_Reice_3 = 0; /**< Инициализация процента заполнения третьего рейса. */
    }

    /**
     * @brief Вывод информации о всех рейсах.
     */
    public void Display() {
        System.out.print("Рейс Москва-Анапа: \n");
        Reice_1.Display();
        System.out.print("Процент заполнения: ");
        fill_Reice_1=imp.nextInt();
        System.out.print("\nРейс Москва-Саранск: \n");
        Reice_2.Display();
        System.out.print("Процент заполнения: ");
        fill_Reice_2=imp.nextInt();
        System.out.print("\nРейс Москва-Сухум: \n");
        Reice_3.Display();
        System.out.print("Процент заполнения: ");
        fill_Reice_3=imp.nextInt();
    }

    /**
     * @brief Вычисление общей ожидаемой суммы продаж для всех рейсов.
     * @return Общая ожидаемая сумма продаж.
     */
    public int Total() {
        int total_sales = Reice_1.Total_Sales() * fill_Reice_1 / 100;
        total_sales += Reice_2.Total_Sales() * fill_Reice_2 / 100;
        total_sales += Reice_3.Total_Sales() * fill_Reice_3 / 100;
        return total_sales;
    }

    /**
     * @brief Вывод рейса с максимальной ожидаемой суммой продаж.
     */
    public void GetMax() {
        int sales_Reice_1 = Reice_1.Total_Sales() * fill_Reice_1 / 100;
        int sales_Reice_2 = Reice_2.Total_Sales() * fill_Reice_2 / 100;
        int sales_Reice_3 = Reice_3.Total_Sales() * fill_Reice_3 / 100;
        int max_sales = Math.max(sales_Reice_1, Math.max (sales_Reice_2, sales_Reice_3));
        if (max_sales == sales_Reice_1) {
            System.out.print("\nПервый рейс: Москва-Анапа \n");
        }
        else if (max_sales == sales_Reice_2) {
            System.out.print("\nВторой рейс: Москва-Саранск \n");

        }
        else {
            System.out.print("\nретий рейс: Москва-Сухум \n");
        }
    }
};
