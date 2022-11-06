package com.tasks3.linkedlist;

public class LinkedList {
    Node head;
    public int counter = 0;
    /* Конструктор без аргументів */
    public LinkedList() {}

    /* Додати елемент в кінець списку */
    public void add (Integer data) {
        Node newNode = new Node();
        newNode.setData(data);
        counter++;
        System.out.println(newNode.getData());
        System.out.println(counter);
        if (head == null)
        {
            head = new Node();
            head.setData(data);
            return;
        }
        newNode.setNext(null);
        Node last = head;
        while (last.getNext() != null)
            last = last.getNext();
        last.setNext(newNode);
    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        if ((counter == 0)||(index>=counter)) {
            return null;
        }
        Node perebor = this.head;
        for (int i = 0; i<=index; i++) {
            if (i==index) {
                return perebor.getData();
            }
            perebor=perebor.getNext();
        }
        return 0;
    };

    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        if ((counter == 0)||(index>=counter)) {
            return false;
        }
        Node perebor = this.head;
        for (int i = 0; i<=index; i++) {
            if (i==index) {
                ;
            }
            perebor=perebor.getNext();
        }
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE

        counter--;
        return true;
    }

    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        return counter;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list.get(4));
    }
}