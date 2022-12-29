package ru.gb.jseminar;

//import ru.gb.jseminar.data.Notebook;
import ru.gb.jseminar.Notebook;

import java.util.List;
import java.util.Map;

import java.util.*;
import java.util.logging.Logger;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {

        Homework hw = new Homework();

        Map<String, String> result = new HashMap<>();
        result.put("OS".toLowerCase(), "windows");

        hw.printNotebookList(hw.filter(result, hw.initListNotebooks()));

    }

//    private void printNotebookList(List<Notebook> filter) {
//    }

    public List<Notebook> initListNotebooks(){

        Notebook notebook1 = new Notebook("Apple", "000", 1024, 16, "white", "Windows");
        Notebook notebook2 = new Notebook("Lenovo", "111", 1024, 32, "black", "Windows");
        Notebook notebook3 = new Notebook("HP", "222", 1024, 16, "blue", "Linux");
        Notebook notebook4 = new Notebook("Prestigio", "333", 2048, 8, "red", "IOS");

        List<Notebook> notebookList = new ArrayList<>();
        notebookList.add(notebook1);
        notebookList.add(notebook2);
        notebookList.add(notebook3);
        notebookList.add(notebook4);

        return notebookList;
    }



      public List<Notebook> filter(Map<String, String> params, List<Notebook> notebookList){
          List<Notebook> filteredList = new ArrayList<>();
          boolean flag = true;

          for (Notebook notebook: notebookList) {
              Map<String, String> specification = notebook.getSpecification();
              for (String item: params.keySet()) {
                  if (specification.containsKey(item)) {
                      if (!params.get(item).equals(specification.get(item))) {
                          flag = false;
                          break;
                      }
                  } else {
                      flag = false;
                      break;
                  }
              }
              if (flag) {
                  filteredList.add(notebook);
              }
          }

          return filteredList;
      }

    public void printNotebookList(List<Notebook> notebookList) {
        Logger log = Logger.getLogger(Homework.class.getName());

        for (Notebook item: notebookList) {
            log.info(item.toString());
        }
    }

}