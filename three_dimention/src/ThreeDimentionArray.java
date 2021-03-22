import java.util.ArrayList;
import java.util.List;

public class ThreeDimentionArray {
    ArrayList<Node> elements = new ArrayList<>();
    ArrayList<Integer> values = new ArrayList<>();
    List<ArrayList<Integer>> coords = new ArrayList<>();

    public ArrayList<Integer> getValues() {
        return values;
    }

    public List<ArrayList<Integer>> getCoords() {
        return coords;
    }

    public void set(Node node) {
        elements.add(node);
        values.add(node.getData());
        coords.add(node.getCoords());
    }

    public int get(ArrayList<Integer> coords) {
        for (Node element : elements) {
            if (element.getCoords().equals(coords)) {
                return element.getData();
            }
        }
        return 0;
    }

    private void sortCoords(List<ArrayList<Integer>> list) {
        boolean isSorted = false;
        ArrayList<Integer> buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).get(2) > list.get(i + 1).get(2)) {
                    isSorted = false;
                    buf = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, buf);
                } else if (list.get(i).get(2).equals(list.get(i + 1).get(2))) {
                    for (int j = 0; j < list.size() - 1; j++) {
                        if (list.get(j).get(1) > list.get(j + 1).get(1)) {
                            isSorted = false;
                            buf = list.get(j);
                            list.set(j, list.get(j + 1));
                            list.set(j + 1, buf);
                        } else if (list.get(i).get(1).equals(list.get(j + 1).get(1))) {
                            for (int k = 0; k < list.size() - 1; k++) {
                                if (list.get(k).get(0) > list.get(k + 1).get(0)) {
                                    isSorted = false;
                                    buf = list.get(k);
                                    list.set(k, list.get(k + 1));
                                    list.set(k + 1, buf);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void sortValues(ArrayList<Integer> vals) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vals.size() - 1; i++) {
                if (vals.get(i) > vals.get(i + 1)) {
                    isSorted = false;

                    buf = vals.get(i);
                    vals.set(i, vals.get(i + 1));
                    vals.set(i + 1, buf);
                }
            }
        }
    }

    public void sort() {
        this.sortCoords(coords);
        this.sortValues(values);

    }

    public void print() {
        for (int i = 0; i < values.size(); i++) {
            System.out.println("value " + values.get(i) + " coords: " + coords.get(i));

        }
    }

}
