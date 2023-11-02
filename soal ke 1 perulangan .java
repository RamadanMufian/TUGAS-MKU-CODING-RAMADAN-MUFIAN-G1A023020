public class Main {
    public static void main(String[] args) {
        int count = 1;
        int digit = 1;
        String name = "(RAMADAN)";

        while (count <= 100) {
            if (digit == 1) {
                System.out.print(count + "\n");
                digit++;
            } else if (digit <= 9) {
                System.out.print(digit);
                digit++;
            } else {
                System.out.println(name);
                digit = 1;
                count++;
            }
        }
    }
}