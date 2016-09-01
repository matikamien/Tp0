package ar.fiuba.tdd.template;

/**
 * Created by matiaskamien on 30/08/16.
 */
public class Node<T> extends AbstractNode<T> {

    public Node(T data) {
        this.data = data;
        this.nextNode = new NullNode<T>();
    }

    public void setNextNode(AbstractNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public AbstractNode<T> getNextNode() {
        return this.nextNode;
    }

    public T getValue() {
        return this.data;
    }

    public void removeFrom(Queue<T> queue) {
        queue.setFirstNode(this.nextNode);
    }

    public void addNode(Queue<T> queue, T item) {
        this.nextNode = new Node<T>(item);
    }

    public int getSize() {
        return (1 + this.nextNode.getSize());
    }

}
