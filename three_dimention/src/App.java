import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ThreeDimentionArray arr = new ThreeDimentionArray();
        ArrayList<Integer> coords1 = new ArrayList<>();
        coords1.add(2);
        coords1.add(2);
        coords1.add(3);
        Node element1 = new Node(1,coords1);
        arr.set(element1);
        ArrayList<Integer> coords2 = new ArrayList<>();
        coords2.add(1);
        coords2.add(2);
        coords2.add(3);
        Node element2 = new Node(2,coords2);
        arr.set(element2);
        ArrayList<Integer> testcoords = new ArrayList<>();
        testcoords.add(1);
        testcoords.add(2);
        testcoords.add(3);
        System.out.println(arr.get(testcoords));
        arr.print();
        arr.sort();
        arr.print();
    }
}
