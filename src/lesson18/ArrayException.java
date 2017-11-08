package lesson18;

public class ArrayException {

    public static void main(String[] args) {
        int[] array = { 1, 5, 0 };

        // v try pomeshaem potencial'no opasnyj kod ( indexa 3 zdes' net)
        try {
            System.out.println(array[3]);

        } catch (Exception e) {
            System.err.println("element was not found");
        }

        System.out.println("Cool...");

        System.out.println("Cool2...");
    }

}
