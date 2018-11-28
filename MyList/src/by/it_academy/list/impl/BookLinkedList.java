package by.it_academy.list.impl;
import java.util.NoSuchElementException;

import by.it_academy.list.deque.MyDeque;

public class BookLinkedList<E> implements MyDeque<E> {
	private int size = 0;
	private Node<E> first;
	private Node<E> last;

	private static class Node<E> {
		E element;
		Node<E> next;
		Node<E> prev;

		Node(Node<E> prev, E element, Node<E> next) {
			this.element = element;
			this.next = next;
			this.prev = prev;
		}
	}

	@Override
	public boolean isEmpty() {
		if(first == null)return true;
		else return false;
	}

	@Override
	public Object[] toArray() {
		Object[] arr = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            arr[i++] = x.element;
        return arr;
	}

	@Override
	public void clear() {
		for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.element = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
	}

	@Override
	public void addFirst(E e) {
		Node<E> f = first;
        Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
	}

	@Override
	public void addLast(E e) {
		Node<E> l = last;
        Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
	}

	@Override
	public E removeFirst() {
		Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
		E element = f.element;
        Node<E> next = f.next;
        f.element = null;
        f.next = null; 
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        return element;
	}

	@Override
	public E removeLast() {
		Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
		E element = l.element;
        Node<E> prev = l.prev;
        l.element= null;
        l.prev = null; 
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        return element;
	}

	@Override
	public E getFirst() {
		final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.element;
	}

	@Override
	public E getLast() {
		final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.element;
	}

	@Override
	public boolean contains(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.element == null)
                    return true;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.element))
                    return true;;
            }
        }
        return false;
	}

	@Override
	public int size() {
		return size;
	}
}
