package com.bloc.collections;

import java.util.*;

/**
 * Follow the Interface declaration (http://docs.oracle.com/javase/7/docs/api/java/util/List.html)
 * to fill in the methods where indicated
 */
public class MyArrayList<E> extends Object implements List<E> {

	// Use this object array as your backing data storage
	private Object[] mList;

	public MyArrayList() {
		mList = new Object[0];
	}

	@Override
	public boolean add(E e) {
		 Object[] temp = new Object[mList.length + 1];
		 for (int i = 0; i < mList.length; ++i){
			 temp[i] = mList[i]; // signify that temp is has the same info in mList
		 }
		 temp[mList.length] = e;  // we added e to the array
		 mList = temp; // the stored memory is in mList and we have to call it and say its in temp now.
		 return true;// YOUR WORK HERE
	}

	@Override
	public void add(int index, E element) {
		// YOUR WORK HERE
		if (index < 0 || index >= mList.length){   
			throw new IndexOutOfBoundsException();  // check if index is ok.
		}
		Object[] temp = new Object[mList.length + 1];  // create the new array into temp.
		for (int i = 0, j = 0; j < temp.length; ++i, ++j){  // loop into the array by comparing the first array to the second array's index i&j
			if ( i == index ) {  // check if i is valid
				temp[index] = element;  // insert element into the array
				--i; // decrement original array to cancel out j temp array
			} else {
				temp[j] = mList[i]; // 
			}
		}
		mList = temp;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return false;
	}

	@Override
	public void clear() {
		mList = new Object[0];// YOUR WORK HERE create list size of 0.
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < mList.length; ++i){ // loop around the index
			if (mList[i].equals(o)){ // if found o return true
				return true;  // YOUR WORK HERE
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean equals(Object o) {
		return false;
	}

	@Override
	public E get(int index) {
		for (int i = 0; i < mList.length; ++i)// YOUR WORK HERE
		return (E)mList[index]; // just returning index
		return null;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < mList.length; ++i){ // loop around the index 
			if (mList[i].equals (o)){
				return i;// YOUR WORK HERE
			}
		}
		return -1; // since -1 is less than array which is not possible
	}

	@Override
	public boolean isEmpty() {
		if (mList.length <= 0 ){
			return true;// YOUR WORK HERE
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return null;
	}

	@Override
	public E remove(int index) {
		Object[] temp = new Object[mList.length + 1];  // create the new array into temp.
		for (int i = 0, j = 0; j < temp.length; --i, --j){  // loop into the array by comparing the first array to the second array's index i&j
			if ( i == index ) {  // check if i is valid
				++i; // increment original array to cancel out j temp array
			} else {
				temp[j] = mList[i]; // 
			}
		}
		mList = temp;
		return null;
	}

	@Override
	public boolean remove(Object o) {
		 // YOUR WORK HERE
		for (int i = 0; i < mList.length; ++i){ // loop around the index
			if (mList[i].equals(o)){ // if found o return true

			}
		} // YOUR WORK HERE  two variables i and j
		return true;
	}
	

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public E set(int index, E element) {
		// YOUR WORK HERE
		return null;
	}

	@Override
	public int size() {
		for (int i = 0; i < mList.length; ++i){
			mList[i] = size();// YOUR WORK HERE
		}
			return size();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}
}