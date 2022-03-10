package com.company.studentslist;

import java.util.ArrayList;
import java.util.Comparator;

public class studentlist {

    /*
    Задача: программа на вход получает список школьников следующего вида:

9 Иванов
10 Петров
11 Сидоров
9 Григорьев
9 Сергеев
10 Яковлев
В каждой строке сначала записан номер класса (число, равное 9, 10 или 11),
затем (через пробел) – фамилия. Необходимо вывести список по классам:
сначала всех учащихся 1 класса, затем – 2, и так до 11.
Внутри класса выводить список учеников по алфавиту.

     */
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students("9 Иванов"));
        list.add(new Students("10 Петров"));
        list.add(new Students("11 Сидоров"));
        list.add(new Students("11 Сидоров"));
        list.add(new Students("9 Григорьев"));
        list.add(new Students("9 Сергеев"));
        list.add(new Students("10 Яковлев"));
//        list.add(new Students("8 Григорьев"));

       System.out.println(list.toString().replaceAll("([1-9])\\s", "  ++ 0($1) "));
        list.sort(Students::compareTo);
        System.out.println(list);

    }
}
