package ar.fiuba.tdd.template;

/**
 * Created by matiaskamien on 31/08/16.
 */
public class NullNode<T> extends AbstractNode<T> {

    public NullNode() {
        this.data = null;
    }

    public void setNextNode(AbstractNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public AbstractNode<T> getNextNode() {
        return this.nextNode;
    }

    public T getValue() throws AssertionError {
        throw new AssertionError();
    }

    public void removeFrom(Queue<T> queue) throws AssertionError {
        throw new AssertionError();
    }

    public void addNode(Queue<T> queue, T item) {
        queue.setFirstNode(new Node<T>(item));
    }

    public int getSize() {
        return 0;
    }
}
