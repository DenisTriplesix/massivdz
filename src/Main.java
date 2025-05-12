public class Main {
    public static void main(String[] args) {
//        int [][] array  = new int[50][2];
//        int number = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = number++;
//                System.out.print(number + " ");
//
//            }
//            {
//            }
//        }


                int rows = 5; // Количество строк в треугольнике
                int[][] triangle = new int[rows][];

                // Заполнение треугольного массива
                for (int i = 0; i < rows; i++) {
                    triangle[i] = new int[i + 1]; // Создаем строку с i + 1 элементами
                    for (int j = 0; j <= i; j++) {
                        triangle[i][j] = j + 1; // Заполняем элементы
                    }
                }

                // Вывод треугольного массива
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < triangle[i].length; j++) {
                        System.out.print(triangle[i][j] + " ");
                    }
                    System.out.println(); // Переход на новую строку после каждой строки треугольника
                }
            }
        }


























    





