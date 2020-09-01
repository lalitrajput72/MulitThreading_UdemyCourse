package com.java.puzzle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RSystem {

	
	public static void main(String[] args) {
		
		List<Item> list=new ArrayList<>();
		
		list.add(new Item(1,0,1));
		list.add(new Item(2,1,1));
		list.add(new Item(3,0,2));
		list.add(new Item(4,1,7));
		list.add(new Item(5,4,5));
		
		out(list);
	}
	
	public static void out(List<Item> items){
		
		
		Map<Integer,Integer> map=new HashMap<>();
		for(Item i : items){
			int totalCount=0;
			int id=i.getId();
			for(int j=0;j<items.size();j++){
				if(items.get(j).getParentId() == id){
				  totalCount=totalCount+items.get(j).getCount();
				}
			}
		map.put(id,totalCount+i.getCount());
		}
		
		for(Map.Entry<Integer,Integer> m : map.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		
	}

}

class Item{
	
	int id;
	int parentId;
	int count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Item(int id, int parentId, int count) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.count = count;
	}
	
	
}