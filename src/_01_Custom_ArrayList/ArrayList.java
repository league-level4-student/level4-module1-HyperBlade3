package _01_Custom_ArrayList;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	
	T[] arr;
	
	public ArrayList() {
		arr = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		
		if (loc >= 0 && loc < arr.length) {
			return arr[loc];
		}
		
		return null;
		

	}

	public void add(T val) {
		
		T[] newArr  = (T[]) new Object[arr.length+1];
		
		
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1] = val;
		arr = newArr;
		
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 && loc >= arr.length) {
			
			throw new IndexOutOfBoundsException();
		}
		T[] newArr = (T[]) new Object[arr.length+1];
		
		int count = 0;
		
		for (int i = 0; i < newArr.length; i++) {
			if (i == loc) {
				newArr[i] = val;
			}
			else {
				
				newArr[i] = arr[count];
				count++;
			}
		}
		
		arr = newArr;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 && loc >= arr.length) {
			
			throw new IndexOutOfBoundsException();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == loc) {
				arr[i] = val;
				break;
			}
		}
		
	}
	public void remove(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 && loc >= arr.length) {
			
			throw new IndexOutOfBoundsException();
		}
		
		T[] newArray = (T[]) new Object[arr.length-1];
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!(i == loc)) {
				newArray[count++] = arr[i];
			}
		}
		
		arr = newArray;
		
		
		

	}

	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(val)) {
				return true;
			}
		}
		return false;

	}
	
	public int size() {
		return arr.length;
		
		
	}
}