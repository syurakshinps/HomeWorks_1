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
        ArrayList<String> list = new ArrayList<>();
        list.add("9 Иванов");
        list.add("10 Петров");
        list.add("11 Сидоров");
        list.add("11 Сидоров");
        list.add("9 Григорьев");
        list.add("9 Сергеев");
        list.add("10 Яковлев");
//        list.add(new Students("8 Григорьев"));

        for (String s : list)
        {
            String[] fields = s.split(" ");
          //  System.out.println(fields[0] + fields[1]);
            String[][] Records = new String[fields.length][2];
            for (int i = 0; i<fields.length; i++)
            {
                Records[i][0] = fields[0];
                Records[i][1] = fields[1];
            }
            System.out.println(Records[0][0] + Records[0][1]);

        }

    }
}
