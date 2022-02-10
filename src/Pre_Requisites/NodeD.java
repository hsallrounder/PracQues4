package Pre_Requisites;

public class NodeD {
    int data;
    NodeD next;
    NodeD prev;

    public NodeD(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public NodeD getNext() {
        return next;
    }

    public NodeD getPrev() {
        return prev;
    }
}
