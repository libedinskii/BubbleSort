public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Получаем длину массива
        for (int i = 0; i < n - 1; i++) { // Внешний цикл для проходов по массиву
            for (int j = 0; j < n - i - 1; j++) { // Внутренний цикл для сравнения и обмена элементов
                if (arr[j] > arr[j + 1]) { // Если текущий элемент больше следующего элемента
                    // Swap elements
                    int temp = arr[j]; // Сохраняем текущий элемент во временной переменной
                    arr[j] = arr[j + 1]; // Заменяем текущий элемент следующим элементом
                    arr[j + 1] = temp; // Заменяем следующий элемент сохраненным значением
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2}; // Исходный массив
        System.out.print("Исходный массив: ");
        for (int num : array) {
            System.out.print(num + " "); // Выводим элементы исходного массива
        }
        System.out.println();

        bubbleSort(array); // Вызываем метод сортировки пузырьком

        System.out.print("Отсортированный массив: ");
        for (int num : array) {
            System.out.print(num + " "); // Выводим элементы отсортированного массива
        }
        System.out.println();
    }
}
