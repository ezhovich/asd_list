import java.util.ArrayList;

public class Node {
    private int data;
    private ArrayList<Integer> coords;

    public Node(int data, ArrayList<Integer> coords) {
        this.data = data;
        this.coords = coords;
    }

    public int getData(){
        return data;
    }

    public void setData(int nodeData){
        data = nodeData;
    }

    public ArrayList<Integer> getCoords() {
        return coords;
    }

    public void setCoords(ArrayList<Integer> coords) {
        this.coords = coords;
    }

    public void printNode(){
        System.out.println(data);
        System.out.println(coords);
    }
}


