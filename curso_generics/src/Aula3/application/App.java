package Aula3.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(5, 2, 10);
    printList(numbers);

  }  

  public static void printList(List<?> list){
    for (Object obj : list) {
        System.out.println(obj);
    }
  }
}
