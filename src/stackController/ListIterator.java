package stackController;

import java.util.Iterator;
import java.util.NoSuchElementException;

import stackController.StackController.Node;

/**
 * Version 0.1
 * @author htha9587
 * 5-3-16
 */


public class ListIterator implements Iterator<Item>
{
	
		private Node first;
		private Node Current = first;
		public boolean hasNext()
		{
			return Current != null;
		}
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
		public Item item()
		{
			if (!hasNext()) throw new NoSuchElementException();
			Item item = (Item) Current.item;
			Current = Current.next;
			return item;
		}
		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return null;
		}
	}


