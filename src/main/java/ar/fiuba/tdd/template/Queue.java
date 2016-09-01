package ar.fiuba.tdd.template;

/**
 * Created by matiaskamien on 30/08/16.
 */
public class Queue<T> implements QueueInterface<T> {

    private AbstractNode<T> firstNode = null;

    public Queue() {
        this.firstNode = new NullNode<T>();
    }

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public void add(T item) {
        this.firstNode.addNode(this, item);
    }

    public T top() {
        return this.firstNode.getValue();
    }

    public void remove() {
        this.firstNode.removeFrom(this);
    }

    public void setFirstNode(AbstractNode<T> node) {
        this.firstNode = node;
    }

    public int size() {
        return this.firstNode.getSize();
    }

}