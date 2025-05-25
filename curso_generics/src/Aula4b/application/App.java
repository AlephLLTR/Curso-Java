package Aula4b.application;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Aula4a.model.entities.Circle;
import Aula4a.model.entities.Rectangle;
import Aula4a.model.interfaces.Shape;

public class App {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Double> doubleList = Arrays.asList(3.14, 6.28);
        List<Object> objList = new ArrayList<Object>();

        copy(intList, objList);
        printList(objList);
        copy(doubleList, objList);
        printList(objList);
    }

    private static void copy(List<? extends Number> source, List<? super Number> destination) {
        for (Number number : source) {
            destination.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
