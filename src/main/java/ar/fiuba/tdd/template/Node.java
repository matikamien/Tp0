package ar.fiuba.tdd.template;

/**
 * Created by matiaskamien on 30/08/16.
 */
public class Node<T> {

    private T data;
    private Node<T> nextNode;

    public Node(T data){
        this.data = data;
    }

}
