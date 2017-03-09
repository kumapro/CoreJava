package com.learnjavabyexample.core.customimplementation.hashmap;

public class CustomHashMap<K, V> {

	private Entry<K, V>[] table;
	private int capacity = 4;
	private int size;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

	}

	@SuppressWarnings("unchecked")
	public CustomHashMap() {
		this.table = new Entry[capacity];
	}
	
	@SuppressWarnings("unchecked")
	public CustomHashMap(int initialCapacity) {
		this.capacity = initialCapacity;
		this.table = new Entry[initialCapacity];
	}

	private int hash(K key) {
		return (key == null) ? 0 : Math.abs(key.hashCode()) % capacity;
	}
	
	public int size() {
		return size;
	}

	public void put(K key, V value) {
		if (key == null) {
			return;
		}
		int hash = hash(key);
		Entry<K, V> entry = new Entry<K, V>(key, value);
		if (table[hash] == null) {
			table[hash] = entry;
			size++;
		} else {
			Entry<K, V> prev = null;
			Entry<K, V> e = table[hash];
			while (e != null) {
				if (key.equals(e.key)) {
					e.value = value;
//					System.out.println("stored key = " + key + " value = " + value + " at index " + hash + " with hash " + key.hashCode());
					return;
				}
				prev = e;
				e = e.next;
			}
			prev.next = entry;
			size++;
		}
//		System.out.println("stored key = " + key + " value = " + value + " at index " + hash + " with hash " + key.hashCode());
	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		}
		for (Entry<K, V> temp = table[hash]; temp != null; temp = temp.next) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
		}
		return null;
	}

	public boolean remove(K key){
		int hash = hash(key);
		if(table[hash] == null){
			return false;
		}
		Entry<K, V> prev = null;
		Entry<K, V> temp = table[hash];
		
		while (temp != null) {
			if(temp.key.equals(key)){
				if(prev == null){
					table[hash] = temp.next;
					size--;
					return true;
				}else{
					prev.next = temp.next;
					size--;
					return true;
				}
			}
			prev = temp;
			temp = temp.next;
		}
		
		return false;
	}
	
	public void printHashMap(){
		for (int i = 0; i < table.length; i++) {
			if(table[i] != null){
				Entry<K, V> entry = table[i];
				while(entry != null){
					System.out.println("data is " + entry.key + " , " + entry.value);
					entry = entry.next;
				}
			}
			
		}
	}
	
}
