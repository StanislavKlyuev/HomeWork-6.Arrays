public class Main {
    public static void main(String[] args) {

        /*
        Задача 1
        Объявите три массива:
        1 - Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new
        2- Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        Массив сразу заполните значениями.
        3- Произвольный массив. Тип и количество данных определите сами.
        Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.*/
        System.out.println("Task 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] array = {1.57, 7.654, 9.986};
        int[] arrays = new int[10];
        for (int i = 0; i < 10; i++)
            arrays[i] = (i + 1) * 2;
        System.out.println();


        /*Задача 2
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.*/
        System.out.println("Task 2");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < arrays.length; i++) {
            if (i == arrays.length - 1) {
                System.out.println(arrays[i]);
                break;
            }
            System.out.print(arrays[i] + ", ");
        }
        System.out.println();


        /*Задача 3
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        Если в задаче 2 в консоль у вас вывелся результат:
        1, 2, 3
        1.57, 7.654, 9.986 (Произвольные элементы третьего массива)
        то в этой задаче результат должен быть таким:
        3, 2, 1
        9.986, 7.654, 1.57 (Произвольные элементы третьего массива в обратном порядке)*/
        System.out.println("Task 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        for (int i = arrays.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arrays[i] + ", ");
        }
        System.out.println();


        /*Задача 4
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.*/
        System.out.println("Task 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i]++;
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }


    }
}









