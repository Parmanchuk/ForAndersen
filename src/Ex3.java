public class Ex3 {
    public static void main(String[] args) {

        int size = (int) (Math.random() * 30 + 1);
        System.out.println("Размер массива: " + size);

        System.out.print("Получившийся массив: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.print("\nЭлементы массива кратные 3: ");
        for (int digit : array) {
            if (digit % 3 == 0) {
                System.out.print(digit + " ");
            }
        }
    }
}
