import java.util.LinkedList;

public class LinkedListDemo {

    public static void Demo(){

        //Skapa en ny tom lista
        LinkedList<String> top10MetalBands = new LinkedList<>();
        //Linkedlist har de flesta metoderna som Arraylist har:
        // .add(), .get(), .size(), .clear()
        // .remove() - tar bort ett fält
        // .clear() - tömmer listan

        top10MetalBands.add("Metallica");
        top10MetalBands.add("Iron Maiden");

        System.out.println(top10MetalBands);

        top10MetalBands.addFirst("Within Temptation");
        top10MetalBands.addLast("Lorde");
        System.out.println(top10MetalBands);

        top10MetalBands.removeFirst(); //ta bort första fältet
        top10MetalBands.remove(top10MetalBands.size()/2); //ta bort från mitten!
        top10MetalBands.add(1, "Halestorm"); //addera i specifikt fält

        System.out.println(top10MetalBands);

    }
}
