package ar.fiuba.tdd.template;

import org.junit.Test;
import org.w3c.dom.views.AbstractView;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    @Test
    public void queueShouldBeCreatedWithSizeZero() {
        Queue<AbstractNode> queue = new Queue<AbstractNode>();
        assertEquals(queue.size(),0);
    }

    @Test
    public void queueShouldHaveOneNode() {
        Queue<String> queue = new Queue<String>();
        queue.add("Hola");
        assertEquals(queue.size(),1);
    }

    @Test
    public void queueShouldHaveTwoNodes() {
        Queue<String> queue = new Queue<String>();
        queue.add("Hola");
        queue.add("Chau");
        assertEquals(queue.size(),2);
    }

    @Test
    public void topShouldReturnCorrectValue() {
        Queue<String> queue = new Queue<String>();
        queue.add("Hola");
        assertEquals(queue.top(),"Hola");
    }

    @Test
    public void itShouldRemoveANode() {
        Queue<String> queue = new Queue<String>();
        queue.add("Hola");
        queue.remove();
        assertEquals(queue.size(),0);
    }

    @Test
    public void itShouldRemoveANode2() {
        Queue<String> queue = new Queue<String>();
        queue.add("Hola");
        queue.add("Chau");
        queue.remove();
        assertEquals(queue.size(),1);
    }
}