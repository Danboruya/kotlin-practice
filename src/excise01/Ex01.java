package excise01;

public class Ex01 {
    public static void main(String[] args) {
        int[] array = parceToOctal(15);
        System.out.print("Octal: ");
        for (int e : array) {
            System.out.print(e);
        }
    }

    public static int[] parceToOctal(int decimal) {
        int[] octal = {0, 0, 0, 0};
        int index = 0;
        while (decimal > 0) {
            octal[octal.length - 1 - index] = decimal % 8;
            decimal /= 8;
            index++;
        }
        return octal;
    }
}
