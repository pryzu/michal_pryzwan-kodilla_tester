import java.util.Scanner;
public class Colors {
    public static String getColors(){
        Scanner scanner = new Scanner((System.in));
        while (true) {
            System.out.println("Select first colors letter (R, M, B, G):");
            String colors = scanner.nextLine().trim().toUpperCase();
            if (colors.equals("R")) {
                return "red";
            } else if (colors.equals("M")) {
                return "magenta";
            } else if (colors.equals("B")) {
                return "blue";
            } else if (colors.equals("G")) {
                return "green";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getColors());
    }
}
