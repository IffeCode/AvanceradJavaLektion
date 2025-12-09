import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        System.out.println("""
                1. Insertion Sort
                2.
                Välj demo: """);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            i = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Ogiltig inmatning");
            return;
        }

        switch (i) {
            case 1:
                InsertionSortDemo.Demo();
                break;
            default:
                System.out.println("Ogiltigt val!");
        }
    }
}
