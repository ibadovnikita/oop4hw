package Task2;

// Задача 2. Напишите обобщенный метод printArray, 
// который принимает массив любого типа и выводит его элементы на консоль.
// // В этом примере мы объявляем обобщенный метод printArray, 
// который принимает массив типа T. Затем мы используем цикл for-each, 
// чтобы пройти по всем элементам массива и вывести их на консоль.

// // В методе main мы создаем массивы типов Integer и String 
// и вызываем printArray для каждого из них. 
// В результате мы получаем вывод на консоль элементов каждого массива.

public class Task2 {
  public static void main(String[] args) {
    
    Integer[] nums = {1, 54, 4345, 65, 64, 3};
    String [] names = {"Alic", "Mike", "Turner", "Mathew"};

    printArray(nums);
    printArray (names);


  }


  public static <T> void printArray (T[] items) {
      for (T item : items) {
        System.out.println(item);
      }
    }


}
