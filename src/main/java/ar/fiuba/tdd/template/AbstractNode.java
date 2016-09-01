package ar.fiuba.tdd.template;

/**
 * Created by matiaskamien on 31/08/16.
 */
public abstract class AbstractNode<T> {

    protected T data;
    protected AbstractNode<T> nextNode = null;

    public abstract void setNextNode(AbstractNode<T> nextNode);

    public abstract void removeFrom(Queue<T> queue);

    public abstract AbstractNode<T> getNextNode();

    public abstract void addNode(Queue<T> queue, T item);

    public abstract T getValue();

    public abstract int getSize();

}
