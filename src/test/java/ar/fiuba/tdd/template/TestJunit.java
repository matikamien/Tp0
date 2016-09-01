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
}