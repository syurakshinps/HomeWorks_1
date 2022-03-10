package com.company.studentslist;

public class Students implements Comparable{
    String list;
    public Students(String list) {
        this.list = list;
    }

    //I DONT NEED THIS CLASS!


    @Override
    public int compareTo(Object o) {
        Students b = (Students) o;
        return (list.replaceAll("(\\d{1})\\s", "0$0\\s").compareTo(b.toString()));
    }
    @Override
    public String toString() {
        return list;
    }
}


