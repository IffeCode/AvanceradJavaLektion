import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.println("""
                1. Start Thread By Inheritance
                2. Start Thread By Interface
                3. Start Thread By Lambda
                4. Race Condition Demo
                5. Synchronized Demo
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
                StartThreadsByInheritanceDemo.Demo();
                break;
            case 2:
                StartThreadByInterfaceDemo.Demo();
                break;
            case 3:
                StartThreadByLambdaDemo.Demo();
                break;
            case 4:
                break;
                case 5:
                    SynchronizedDemo.Demo();
                    break;
            default:
                System.out.println("Ogiltigt val!");
        }
    }
}
