package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> list1 = new LinkedList<>();

        for (int i = 1; i <=numberOfDishes; i++) {
            list1.add(i);
        }

        int i = 1;
        while (!list1.isEmpty()) {
            int num = list1.poll();
            if(i % everyDishNumberToEat == 0) {
                list.add(num);
            } else {
                list1.add(num);
            }
            i++;
        }
        return list;
    }
}
