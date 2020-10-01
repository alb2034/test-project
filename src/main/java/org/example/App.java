package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Главный класс для запуска консольного приложения
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> integers = Arrays.asList(1, 2, 3);

        // Вывод на экран значений списка
        integers.forEach(System.out::println);
    }
}
