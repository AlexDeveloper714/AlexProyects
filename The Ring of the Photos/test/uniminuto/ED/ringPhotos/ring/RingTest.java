/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uniminuto.ED.ringPhotos.ring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jrbustosm
 */
public class RingTest {

    public RingTest(){
        
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRing() {
        Ring<Integer> r = new Ring<Integer>();
        System.out.println("\n**********************");
        System.out.println("Test: Ring");
        System.out.println("**********************");
        assertTrue(r.isEmpty());
        assertEquals(0, r.getSize());
        assertNull(r.getFirst());
        assertNull(r.getLast());
        assertNull(r.getActual());
        System.out.println(r);
        System.out.println("OK");
    }

    @Test
    public void testGetActual() {

        System.out.println("\n**********************");
        System.out.println("Test: getActual");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);
        Node<Integer> n4 = new Node<Integer>(75);
        Node<Integer> n5 = new Node<Integer>(67);
        Node<Integer> n6 = new Node<Integer>(16);
        System.out.println(r);
        assertNull(r.getActual());
        r.addEnd(n1);
        System.out.println(r);
        assertEquals(n1, r.getActual());
        r.add(n2);
        System.out.println(r);
        assertEquals(n1, r.getActual());
        r.next();
        System.out.println(r);
        assertEquals(n2, r.getActual());
        r.addEnd(n3);
        System.out.println(r);
        assertEquals(n2, r.getActual());
        r.addEnd(n4);
        r.addEnd(n5);
        r.addEnd(n6);
        r.prev();
        System.out.println(r);
        assertEquals(n1, r.getActual());
        r.addBegin(n0);
        System.out.println(r);
        assertEquals(n1, r.getActual());
        r.prev();
        System.out.println(r);
        assertEquals(n0, r.getActual());
        r.prev();
        System.out.println(r);
        assertEquals(n6, r.getActual());
        r.next();
        System.out.println(r);
        assertEquals(n0, r.getActual());
        r.del();
        System.out.println(r);
        assertEquals(n1, r.getActual());
        r.delBegin();
        System.out.println(r);
        assertEquals(n2, r.getActual());
        r.prev();
        r.delEnd();
        assertEquals(n2, r.getActual());
        System.out.println("OK");
    }

    @Test
    public void testGetFirst() {

        System.out.println("\n**********************");
        System.out.println("Test: getFirst");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        assertNull(r.getFirst());
        r.add(n1);
        System.out.println(r);
        assertEquals(n1, r.getFirst());
        r.addBegin(n0);
        System.out.println(r);
        assertEquals(n0, r.getFirst());
        r.add(n2);
        System.out.println(r);
        assertEquals(n0, r.getFirst());
        r.delBegin();
        System.out.println(r);
        assertEquals(n1, r.getFirst());
        System.out.println("OK");
    }

    @Test
    public void testGetLast() {

        System.out.println("\n**********************");
        System.out.println("Test: getLast");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);
        assertNull(r.getLast());
        r.add(n1);
        System.out.println(r);
        assertEquals(n1, r.getLast());
        r.addBegin(n0);
        System.out.println(r);
        assertEquals(n1, r.getLast());
        r.add(n2);
        System.out.println(r);
        assertEquals(n2, r.getLast());
        r.addEnd(n3);
        System.out.println(r);
        assertEquals(n3, r.getLast());
        r.delEnd();
        System.out.println(r);
        assertEquals(n2, r.getLast());
        System.out.println("OK");
    }

    @Test
    public void testGetSize() {

        System.out.println("\n**********************");
        System.out.println("Test: getSize");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        System.out.println(r);
        assertEquals(0, r.getSize());

        r.add(n1);
        System.out.println(r);
        assertEquals(1, r.getSize());

        r.addBegin(n0);
        System.out.println(r);
        assertEquals(2, r.getSize());

        r.addEnd(n2);
        System.out.println(r);
        assertEquals(3, r.getSize());

        r.add(n3);
        System.out.println(r);
        assertEquals(4, r.getSize());

        r.del();
        System.out.println(r);
        assertEquals(3, r.getSize());

        r.delBegin();
        System.out.println(r);
        assertEquals(2, r.getSize());

        r.delEnd();
        System.out.println(r);
        assertEquals(1, r.getSize());

        r.del();
        System.out.println(r);
        assertEquals(0, r.getSize());

        r.addBegin(n0);
        r.add(n1);
        System.out.println(r);
        assertEquals(2, r.getSize());

        r.clear();
        System.out.println(r);
        assertEquals(0, r.getSize());
        System.out.println("OK");
    }

    @Test
    public void testGetNode() {

        System.out.println("\n**********************");
        System.out.println("Test: getNode");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        r.addEnd(n0);
        r.addEnd(n1);
        r.addEnd(n2);
        r.addEnd(n3);
        System.out.println(r);

        assertEquals(n0, r.getNode(0));
        assertEquals(n1, r.getNode(1));
        assertEquals(n2, r.getNode(2));
        assertEquals(n3, r.getNode(3));
        assertNull(r.getNode(4));
        assertNull(r.getNode(-1));
        System.out.println("OK");
    }

    @Test
    public void testAdd() {

        System.out.println("\n**********************");
        System.out.println("Test: Add");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        r.add(n0);
        r.add(n1);
        r.add(n2);
        r.add(99);
        r.add(n3);
        r.add(31);
        System.out.println(r);

        assertEquals(n0, r.getFirst());
        assertEquals(n0, r.getActual());
        assertEquals(n1, r.getLast());
        assertEquals(6, r.getSize());
        System.out.println("OK");
    }

    @Test
    public void testAddBegin() {

        System.out.println("\n**********************");
        System.out.println("Test: AddBegin");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        r.addBegin(n0);
        r.addBegin(n1);
        r.addBegin(n2);
        r.addBegin(99);
        r.addBegin(31);
        r.addBegin(n3);
        System.out.println(r);

        assertEquals(n3, r.getFirst());
        assertEquals(n0, r.getFirst().getPrev());
        assertEquals(n0, r.getActual());
        assertEquals(n0, r.getLast());
        assertEquals(n3, r.getLast().getNext());
        assertEquals(6, r.getSize());
        System.out.println("OK");
    }

    @Test
    public void testAddEnd() {

        System.out.println("\n**********************");
        System.out.println("Test: AddEnd");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        r.addEnd(n0);
        r.addEnd(n1);
        r.addEnd(n2);
        r.addEnd(99);
        r.addEnd(31);
        r.addEnd(n3);
        System.out.println(r);

        assertEquals(n0, r.getFirst());
        assertEquals(n3, r.getFirst().getPrev());
        assertEquals(n0, r.getActual());
        assertEquals(n3, r.getLast());
        assertEquals(n0, r.getLast().getNext());
        assertEquals(6, r.getSize());
        System.out.println("OK");
    }

    @Test
    public void testClear() {

        System.out.println("\n**********************");
        System.out.println("Test: Clear");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        r.add(n0);
        r.add(n1);
        r.add(n2);
        r.add(31);
        r.add(n3);
        System.out.println(r);

        r.clear();

        assertTrue(r.isEmpty());
        assertEquals(0, r.getSize());
        assertNull(r.getFirst());
        assertNull(r.getLast());
        assertNull(r.getActual());
        System.out.println(r);
        System.out.println("OK");
    }

    @Test
    public void testIsEmpty() {

        System.out.println("\n**********************");
        System.out.println("Test: IsEmpty");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        assertTrue(r.isEmpty());
        r.add(n0);
        r.add(n1);
        r.add(n2);
        r.add(31);
        r.add(n3);
        System.out.println(r);
        assertFalse(r.isEmpty());
        r.clear();
        assertTrue(r.isEmpty());
        r.add(n0);
        r.del();
        assertTrue(r.isEmpty());
        System.out.println("OK");
    }

    @Test
    public void testDel() {

        System.out.println("\n**********************");
        System.out.println("Test: Del");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        assertTrue(r.isEmpty());
        r.add(n0);
        r.add(n1);
        r.add(n2);
        r.add(31);
        r.add(n3);
        System.out.println(r);
        assertEquals(n0, r.getFirst());
        assertEquals(n0, r.getActual());
        assertEquals(n1, r.getLast());

        Node<Integer> nd;

        nd = r.del();
        System.out.println(r);
        assertEquals(n3, r.getFirst());
        assertEquals(n3, r.getActual());
        assertEquals(n1, r.getLast());
        assertEquals(n0, nd);
        nd = r.del();
        assertEquals(n3, nd);
        nd = r.del();
        nd = r.del(n2);
        assertEquals(n2, nd);
        System.out.println(r);
        assertEquals(n1, r.getFirst());
        assertEquals(n1, r.getActual());
        assertEquals(n1, r.getLast());
        assertEquals(n1, r.getFirst().getNext());
        assertEquals(n1, r.getFirst().getPrev());
        nd = r.del();
        assertEquals(n1, nd);
        assertNull(r.getFirst());
        assertNull(r.getActual());
        assertNull(r.getLast());
        nd = r.del();
        assertNull(r.getFirst());
        assertNull(r.getActual());
        assertNull(r.getLast());
        assertNull(nd);
        System.out.println("OK");
    }

    @Test
    public void testDelBegin() {

        System.out.println("\n**********************");
        System.out.println("Test: DelBegin");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        assertTrue(r.isEmpty());
        r.addEnd(n0);
        r.addEnd(n1);
        r.addEnd(n2);
        r.addEnd(31);
        r.addEnd(n3);
        System.out.println(r);
        assertEquals(n0, r.getFirst());
        assertEquals(n0, r.getActual());
        assertEquals(n3, r.getLast());

        Node<Integer> nd;

        nd = r.delBegin();
        System.out.println(r);
        assertEquals(n0, nd);
        assertEquals(n1, r.getFirst());
        assertEquals(n1, r.getActual());
        assertEquals(n3, r.getLast());
        nd = r.delBegin();
        assertEquals(n1, nd);
        nd = r.delBegin();
        assertEquals(n2, nd);
        nd = r.delBegin();
        System.out.println(r);
        assertEquals(n3, r.getFirst());
        assertEquals(n3, r.getActual());
        assertEquals(n3, r.getLast());
        assertEquals(n3, r.getFirst().getNext());
        assertEquals(n3, r.getFirst().getPrev());
        nd = r.delBegin();
        assertNull(r.getFirst());
        assertNull(r.getActual());
        assertNull(r.getLast());
        assertEquals(n3, nd);
        nd = r.delBegin();
        assertNull(r.getFirst());
        assertNull(r.getActual());
        assertNull(r.getLast());
        assertNull(nd);
    }

    @Test
    public void testDelEnd() {

        System.out.println("\n**********************");
        System.out.println("Test: DelEnd");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        assertTrue(r.isEmpty());
        r.addBegin(n0);
        r.addBegin(n1);
        r.addBegin(n2);
        r.addBegin(31);
        r.addBegin(n3);
        System.out.println(r);

        assertEquals(n3, r.getFirst());
        assertEquals(n0, r.getActual());
        assertEquals(n0, r.getLast());

        Node<Integer> nd;

        nd = r.delEnd();
        System.out.println(r);
        assertEquals(n3, r.getFirst());
        assertEquals(n3, r.getActual());
        assertEquals(n1, r.getLast());
        assertEquals(n0, nd);
        nd = r.delEnd();
        assertEquals(n1, nd);
        nd = r.delEnd();
        assertEquals(n2, nd);
        nd = r.delEnd();
        System.out.println(r);
        assertEquals(n3, r.getFirst());
        assertEquals(n3, r.getActual());
        assertEquals(n3, r.getLast());
        assertEquals(n3, r.getFirst().getNext());
        assertEquals(n3, r.getFirst().getPrev());
        nd = r.delEnd();
        assertNull(r.getFirst());
        assertNull(r.getActual());
        assertNull(r.getLast());
        assertEquals(n3, nd);
        nd = r.delEnd();
        assertNull(r.getFirst());
        assertNull(r.getActual());
        assertNull(r.getLast());
        assertNull(nd);
    }

    @Test
    public void testNext() {

        System.out.println("\n**********************");
        System.out.println("Test: Next");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        assertTrue(r.isEmpty());
        r.addEnd(n0);
        r.addEnd(n1);
        r.addEnd(n2);
        r.addEnd(31);
        r.addEnd(n3);
        System.out.println(r);
        assertEquals(n0, r.getActual());
        r.next();
        System.out.println(r);
        assertEquals(n1, r.getActual());
        r.next();
        System.out.println(r);
        assertEquals(n2, r.getActual());
        r.next();
        r.next();
        System.out.println(r);
        assertEquals(n3, r.getActual());
        Node<Integer> n = r.next();
        System.out.println(r);
        assertEquals(n0, r.getActual());
        assertEquals(n0, n);
    }

    @Test
    public void testPrev() {

        System.out.println("\n**********************");
        System.out.println("Test: Prev");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);
        Node<Integer> n3 = new Node<Integer>(1);

        assertTrue(r.isEmpty());
        r.addEnd(n0);
        r.addEnd(n1);
        r.addEnd(n2);
        r.addEnd(31);
        r.addEnd(n3);
        System.out.println(r);
        assertEquals(n0, r.getActual());
        r.prev();
        System.out.println(r);
        assertEquals(n3, r.getActual());
        r.prev();
        r.prev();
        System.out.println(r);
        assertEquals(n2, r.getActual());
        r.prev();
        System.out.println(r);
        assertEquals(n1, r.getActual());
        Node<Integer> n = r.prev();
        System.out.println(r);
        assertEquals(n0, r.getActual());
        assertEquals(n0, n);
    }

    @Test
    public void testFirst() {
        System.out.println("\n**********************");
        System.out.println("Test: First");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);

        assertNull(r.first());

        r.add(n0);
        System.out.println(r);
        assertEquals(r.first(), r.getActual());
        assertEquals(r.first(), r.getFirst());

        r.addEnd(n1);
        System.out.println(r);
        assertEquals(r.first(), r.getActual());
        assertEquals(r.first(), r.getFirst());
        assertEquals(r.first(), n0);

        r.addBegin(n2);
        System.out.println(r);
        assertEquals(r.first(), r.getActual());
        assertEquals(r.first(), r.getFirst());
        assertEquals(r.first(), n2);

        System.out.println(r);
    }

    @Test
    public void testLast() {
        System.out.println("\n**********************");
        System.out.println("Test: Last");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();
        Node<Integer> n0 = new Node<Integer>(15);
        Node<Integer> n1 = new Node<Integer>(23);
        Node<Integer> n2 = new Node<Integer>(35);

        assertNull(r.last());

        r.add(n0);
        System.out.println(r);
        assertEquals(r.last(), r.getActual());
        assertEquals(r.last(), r.getLast());

        r.addBegin(n1);
        System.out.println(r);
        assertEquals(r.last(), r.getActual());
        assertEquals(r.last(), r.getLast());
        assertEquals(r.last(), n0);

        r.addEnd(n2);
        System.out.println(r);
        assertEquals(r.last(), r.getActual());
        assertEquals(r.last(), r.getLast());
        assertEquals(r.last(), n2);

        System.out.println(r);
    }

    @Test
    public void testSort() {

        System.out.println("\n**********************");
        System.out.println("Test: Sort");
        System.out.println("**********************");

        Ring<Integer> r = new Ring<Integer>();

        for (int i = 0; i < 10; ++i) {
            r.addEnd(new Node<Integer>(10 - i));
        }
        System.out.println(r);
        Integer nact = r.getActual().getVal();
        r.sort();
        System.out.println(r);
        Node<Integer> n = r.getFirst();
        for (int i = 1; i <= 10; ++i) {
            assertEquals(0, n.getVal().compareTo(i));
            n = n.getNext();
        }
        assertEquals(r.getActual().getVal(), nact);
    }
    
}