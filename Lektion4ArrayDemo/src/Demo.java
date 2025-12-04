
import java.util.Scanner;

public class Demo {

    static void main(String[] args) {

        System.out.println("""
                1. Arraylist
                2. Linkedlist
                3. HashSet
                4. HashMap
                5. Iterator
                Välj demo: """);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Ogiltig inmatning");
            return;
        }

        switch(choice) {
            case 1:
                ArrayListDemo.Demo();
                break;
            case 2:
                LinkedListDemo.Demo();
                break;
            case 3:
                HashSetDemo.Demo();
                break;
            case 4:
                HashMapDemo.Demo();
                break;
            case 5:
                IteratorDemo.Demo();
                break;
            default:
                System.out.println("Ogiltigt val!");
        }

    }
}
