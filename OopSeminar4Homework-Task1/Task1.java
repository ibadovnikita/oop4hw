package Task1;

/**
 Задача 1 : Напишите обобщенный метод printElement, 
 который принимает один параметр типа T и выводит его на консоль.

В этом примере мы объявляем обобщенный метод printElement, 
который принимает один параметр типа T. Мы просто выводим этот элемент на консоль 
с помощью метода System.out.println().

В методе main мы вызываем printElement с различными типами данных: 
целое число (Integer), строку (String) и число с плавающей запятой (Double). 
Компилятор автоматически выводит тип параметра T на основе переданных аргументов.

 */
public class Task1 {

  public static void main(String[] args) {
    Element<Integer> e1 = new Element<Integer>(8);
    Element<String> e2 = new Element<String>("e2");
    Element<Double> e3 = new Element<Double>(367.8);

    e1.printElement();
    e2.printElement();
    e3.printElement();

  }

  
}