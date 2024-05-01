package Reice;

import java.util.Scanner;

/**
 * @brief Класс Рейс: является рейсом, имеющим свою цену за билет и общее количество билетов.
 */
public class This_Reice {
    private int price; /**< Цена билета. */
    private int num_tickets; /**< Количество билетов. */

    /**
     * @brief Вывод информации о рейсе.
     */
    void Display()
    {
        System.out.print("Цена билета= " + price + "\n Количество билетов = " + num_tickets +  "\n");
    }

    /**
     * @brief Считывание данных о рейсе с клавиатуры.
     */
    void Read()
    {
        Scanner imp=new Scanner(System.in);
        System.out.print("Введите цену билета:\n");
        price=imp.nextInt();
        System.out.print("Введите количество билетов:\n");
        num_tickets=imp.nextInt();
    }

    /**
     * @brief Инициализация данных о рейсе.
     * @param pprice Цена билета.
     * @param nnum Количество билетов.
     */
    public void Init(int pprice,int nnum)  // (4)
    {
        price=pprice;
        num_tickets=nnum;
    }

    /**
     * @brief Вычисление общей выручки от продажи билетов.
     * @return Общая выручка от продажи билетов.
     */
    public int Total_Sales(){
        return price*num_tickets;
    }
}
